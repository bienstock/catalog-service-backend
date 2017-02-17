/**
 * Copyright EAGLE Consortium, 2015.
 * All rights reserved. If you wish to use this code for any purpose,
 * please contact the author.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
 * ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.apache.marmotta.alibaba.services;


import java.util.Locale;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import org.apache.marmotta.alibaba.api.ObjectService;
import org.apache.marmotta.platform.core.api.config.ConfigurationService;
import org.apache.marmotta.platform.core.api.triplestore.SesameService;
import org.apache.marmotta.platform.core.events.ConfigurationChangedEvent;
import org.apache.marmotta.platform.core.events.SesameStartupEvent;
import org.openrdf.repository.RepositoryException;
import org.openrdf.repository.config.RepositoryConfigException;
import org.openrdf.repository.object.ObjectConnection;
import org.openrdf.repository.object.ObjectRepository;
import org.openrdf.repository.object.config.ObjectRepositoryFactory;
import org.slf4j.Logger;

/**
 * Service providing access to the ObjectConnection
 * 
 * @author dglachs
 * @since [major].[minor]
 * @version [major].[minor].[micro]
 */
@ApplicationScoped
public class ObjectServiceImpl implements ObjectService {
    private static final String CONFIGURATION_DEFAULT_LANGUAGE = "storage.language";
	@Inject
	private Logger log;
	
    @Inject
    private SesameService sesame;
    @Inject
    private ConfigurationService configuration;
    
    private ObjectRepository repository;
    private String defaultLanguage = null;
    protected void onConfigurationChange(@Observes ConfigurationChangedEvent event) {
        for (String changedKey : event.getKeys()) {
            if (changedKey.equals(CONFIGURATION_DEFAULT_LANGUAGE)) {
                defaultLanguage = configuration.getStringConfiguration(CONFIGURATION_DEFAULT_LANGUAGE);
            }
        }
    }
    /** 
     * Listen for the SesameStartupEvent from Marmotta
     * @param event
     */
    protected void onSesameInitialize(@Observes SesameStartupEvent event) {
        repository = createObjectRepository();
    }
    /**
     * Helper method to create the repository on startup
     * @return
     */
    private ObjectRepository createObjectRepository() {
        try {
            return new ObjectRepositoryFactory().createRepository(sesame.getRepository());
        } catch (RepositoryConfigException | RepositoryException e) {
            throw new IllegalStateException("Object Repository not initialized");
        }
    }

    
    /** {@inheritDoc} */
    @Override
    public ObjectConnection getConnection() throws RepositoryException {
        if ( repository == null ) {
            repository = createObjectRepository();
        }
        if ( defaultLanguage == null ) {
            defaultLanguage = configuration.getStringConfiguration(CONFIGURATION_DEFAULT_LANGUAGE, Locale.getDefault().getLanguage());
        }
        ObjectConnection connection = repository.getConnection();
        connection.setLanguage(defaultLanguage);
        return connection;
    }

    @Produces @RequestScoped
    ObjectConnection produceConnection() throws RepositoryException {
        if ( repository == null ) {
            repository = createObjectRepository();
        }
        if ( defaultLanguage == null ) {
            defaultLanguage = configuration.getStringConfiguration(CONFIGURATION_DEFAULT_LANGUAGE, Locale.getDefault().getLanguage());
        }
        ObjectConnection connection = repository.getConnection();
        connection.setLanguage(defaultLanguage);
        connection.begin();
        return connection;
    }
    
    void disposeConnection(@Disposes ObjectConnection connection) {
    	try {
			if (connection.isOpen()) {
				if ( connection.isActive() ) {
					connection.commit();
				}
			}
			connection.close();
		} catch (RepositoryException e) {
			log.error("Repository Exception while closing connection", e);
		}
    }
}
