package eu.nimble.services.catalog.identity.security;

import org.apache.commons.lang3.StringUtils;
import org.apache.marmotta.platform.core.api.config.ConfigurationService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.mgt.RealmSecurityManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.nimble.services.catalog.identity.api.IdentityLookup;
import eu.nimble.services.catalog.identity.security.config.ShiroConfig;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.xml.ws.WebServiceException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class SecurityFacade {
	private static final String LOOKUP_PROTOCOL = "identity.lookup.protocol";
	private static final String LOOKUP_HOST = "identity.lookup.host";
	private static final String LOOKUP_PORT = "identity.lookup.port";
	private static final String LOOKUP_SERVICE = "identity.lookup.service";
	@Inject
	private ConfigurationService configurationService;
	
//	@Inject
//	private at.srfg.ehealth.identity.api.IdentityLookup lookup;

	Logger logger = LoggerFactory.getLogger(SecurityFacade.class);
	
	private SecurityManager securityManager;

	@PostConstruct
	public void init() {
		final String iniFile = "classpath:shiro.ini";
		logger.info("Initializing Shiro INI SecurityManager using " + iniFile);
		// creating the realm & security manager
		// keep securit manager
		securityManager = SecurityUtils.getSecurityManager();
		if ( securityManager instanceof RealmSecurityManager) {
			SecurityRealm realm = new SecurityRealm(getService());
			((RealmSecurityManager) securityManager).setRealm(realm);
		}
	}

	@Produces @ShiroConfig
	public List<Realm> getSecurityRealm() {
		SecurityRealm realm = new SecurityRealm(getService());
		List<Realm> realms = new ArrayList<Realm>();
		realms.add(realm);
		return realms;
	}
//	
	@Produces
	@Named("securityManager")
	public SecurityManager getSecurityManager() {
		return securityManager;
	}

	@Produces @Named("subject")
	public Subject getSubject() {
		return SecurityUtils.getSubject();
	}
	
	@Produces @Named("session")
	public Session getSession() {
		return SecurityUtils.getSubject().getSession();
	}

	/**
	 * convenience method creating the service on demand
	 * 
	 * @return
	 */
	private IdentityLookup getService() {
		return new IdentityLookupHelper();
	}

	public URL getServiceURL() throws WebServiceException {
		String protocol = configurationService.getStringConfiguration(LOOKUP_PROTOCOL, "http");
		String host = configurationService.getStringConfiguration(LOOKUP_HOST, "localhost");
		int port = configurationService.getIntConfiguration(LOOKUP_PORT, 7777);
		String service = configurationService.getStringConfiguration(LOOKUP_SERVICE,
				"/identity/webservices/IdentityLookupService");
		try {
			if (!StringUtils.startsWith(service, "/")) {
				service = "/" + service;
			}
			// be sure the service ends with the "?wsdl" extension
			if (!StringUtils.endsWithIgnoreCase(service, "?wsdl")) {
				service += "?wsdl";
			}
			return new URL(protocol, host, port, service);
		} catch (MalformedURLException e) {
			throw new WebServiceException("Configured WebService URL is not correct");
		}
	}
}
