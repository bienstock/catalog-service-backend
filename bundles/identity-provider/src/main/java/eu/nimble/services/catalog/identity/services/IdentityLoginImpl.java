package eu.nimble.services.catalog.identity.services;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

import eu.nimble.services.catalog.identity.api.IdentityLogin;
import eu.nimble.services.catalog.identity.api.IdentityLookup;
import eu.nimble.services.catalog.identity.exception.IdentityException;
import eu.nimble.services.catalog.identity.model.IdentityProfile;
import eu.nimble.services.catalog.identity.model.impl.Identity;
import eu.nimble.services.catalog.identity.model.impl.LoginResult;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.UUID;

@Named
@RequestScoped
public class IdentityLoginImpl implements IdentityLogin{

	@Inject
	private Subject subject;
	@Inject
	private IdentityLookup lookup;
	
	@Override
	public LoginResult login(String username, String password, boolean rememberMe) {
		if (! subject.isAuthenticated()) {
			subject.login(new UsernamePasswordToken(username, password));
		}
		if ( subject.isAuthenticated() ) {
			LoginResult result = new LoginResult();
			final String psmssId = UUID.randomUUID().toString();
			if (subject.getPrincipal() instanceof Identity) {
				result.setPsmssId(psmssId);
				result.setSessionId(subject.getSession().getId());
				return result;
			}
			// usually not needed
			try {
				IdentityProfile profile = lookup.getIdentityProfile(username);
				// store the owner id 
				subject.getSession().setAttribute("ownerId", profile.getOwnerId());
				subject.getSession().setAttribute("psmssId", psmssId);
				subject.getSession().setAttribute("user", username);
	    		result.setSessionId(subject.getSession().getId());
	    		return result;
			}
			catch ( IdentityException e) {
				throw new AuthenticationException(e.getLocalizedMessage());
			}
		}
		throw new AuthenticationException("No valid session");
	}

	@Override
	public boolean logout() {
		if ( subject.isAuthenticated()) {
			subject.logout();
			return true;
		}
		throw new AuthenticationException("Subject not authenticated - Logout not successful!");
	}
	
}
