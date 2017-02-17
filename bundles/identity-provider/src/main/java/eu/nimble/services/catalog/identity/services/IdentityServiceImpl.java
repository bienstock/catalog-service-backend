package eu.nimble.services.catalog.identity.services;

import org.apache.commons.lang3.StringUtils;
import org.apache.marmotta.platform.core.api.config.ConfigurationService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;

import eu.nimble.services.catalog.identity.api.IdentityLookup;
import eu.nimble.services.catalog.identity.api.IdentityService;
import eu.nimble.services.catalog.identity.exception.IdentityException;
import eu.nimble.services.catalog.identity.model.IdentityProfile;
import eu.nimble.services.catalog.identity.model.impl.Identity;
import eu.nimble.services.catalog.identity.security.Secured;
import eu.nimble.services.catalog.identity.security.SecuredIdentifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;

@ApplicationScoped
public class IdentityServiceImpl implements IdentityService {
	private static final String LOOKUP_PROTOCOL = "identity.login.protocol";
	private static final String LOOKUP_HOST = "identity.login.host";
	private static final String LOOKUP_PORT = "identity.login.port";
	private static final String LOOKUP_SERVICE = "identity.login.service";
	@Inject
	private IdentityLookup lookup;
	@Inject
	private ConfigurationService configurationService;
	
//	@Inject
//	private Subject subject;


	@Secured
	@Override
	public IdentityProfile getProfile(@SecuredIdentifier String username) throws IdentityException {
//		Object ownerId = subject.getSession().getAttribute("ownerId");
//		if (username.equals(ownerId)) {
//			return getProfileByOwnerId(username);
//		}
		Subject subject = SecurityUtils.getSubject();
		if (subject.getPrincipal() instanceof Identity) {
			return (Identity) subject.getPrincipal();
		}

		return lookup.getIdentityProfile(username);
	}

	@Secured
	@RequiresRoles(value="sinovo")
	@Override
	public IdentityProfile getProfileByEMail(String eMail) throws IdentityException {
		return lookup.getIdentityProfileByEMail(eMail);
	}
	@Override
	public URI getLoginRedirect() {
		String protocol = configurationService.getStringConfiguration(LOOKUP_PROTOCOL, "http");
		String host = configurationService.getStringConfiguration(LOOKUP_HOST, "localhost");
		int port = configurationService.getIntConfiguration(LOOKUP_PORT, 80);
		String service = configurationService.getStringConfiguration(LOOKUP_SERVICE,
				"/demo/login.html");
		try {
			return createServiceURI(protocol, host, port, service);
		} catch (URISyntaxException e) {
			return null;
		}
	}

	private URI createServiceURI(String protocol, String host, int port, String service) throws URISyntaxException {
		
		String baseUri = configurationService.getBaseUri();
		if ( baseUri.endsWith("/")) {
			baseUri = baseUri.substring(0, baseUri.length()-1);
		}
		// be sure the service name starts with a slash
		if (!StringUtils.startsWith(service, "/")) {
			service = "/" + service;
		}
		return new URI(protocol+"://"+host+":"+port+service);
	}

	@Override
	public IdentityProfile addProfile(IdentityProfile profile) {
		try {
			return lookup.createProfile(profile);
		} catch (Exception e) {
			return null;
		}
	}


	@Override
	public Serializable getSessionId() {
//		return subject.getSession().getId();
		return null;
	}



	
	
}
