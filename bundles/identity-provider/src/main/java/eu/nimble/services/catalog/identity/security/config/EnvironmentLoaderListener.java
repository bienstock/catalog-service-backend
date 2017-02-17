package eu.nimble.services.catalog.identity.security.config;

import org.apache.shiro.mgt.RealmSecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.web.env.DefaultWebEnvironment;
import org.apache.shiro.web.env.WebEnvironment;

import eu.nimble.services.catalog.identity.api.IdentityLookup;
import eu.nimble.services.catalog.identity.security.IdentityLookupHelper;
import eu.nimble.services.catalog.identity.security.SecurityRealm;

import javax.inject.Inject;
import javax.servlet.ServletContext;
import java.util.ArrayList;
import java.util.List;

public class EnvironmentLoaderListener extends org.apache.shiro.web.env.EnvironmentLoaderListener {

    @Inject
    @ShiroConfig
    List<Realm> realms = new ArrayList<>();

    @Override
    protected WebEnvironment createEnvironment(ServletContext pServletContext) {
        DefaultWebEnvironment environment = (DefaultWebEnvironment) super.createEnvironment(pServletContext);
        RealmSecurityManager securityManager = (RealmSecurityManager) environment.getSecurityManager();
        if (realms.size() == 0) {
            realms.add(new SecurityRealm(getService()));
        }
        securityManager.setRealms(realms);
        environment.setSecurityManager(securityManager);
        //SecurityUtils.setSecurityManager(securityManager);
        return environment;
    }

    /**
     * convenience method creating the service on demand
     *
     * @return
     */
    private IdentityLookup getService() {
        return new IdentityLookupHelper();
    }
}

