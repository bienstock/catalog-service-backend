package eu.nimble.services.catalog.identity.security;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.subject.Subject;

import eu.nimble.services.catalog.identity.model.IdentityProfile;
import eu.nimble.services.catalog.identity.model.impl.Identity;

@SessionScoped
public class SecurityHelper implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 122119629978534059L;

	/**
	 * Convenience method to obtain the {@link Identity} object
	 * for the currently logged in user
	 * @return
	 */
	@RequiresAuthentication
	public static IdentityProfile getCurrentUser() {
		Subject s = SecurityUtils.getSubject();
		Object o = s.getPrincipal();
		if ( o instanceof IdentityProfile) {
			return (IdentityProfile) o;
		}
		return null;
	}
	/**
	 * Convenience method to retrieve the owner-id for the currently logged in user
	 * 
	 * @return
	 */
	@RequiresAuthentication
	public static String getCurrentOwnerId() {
		IdentityProfile i = getCurrentUser();
		if (i != null) {
			String s = i.getOwnerId();
			if (s !=null) {
				return s;
			}
			throw new IllegalStateException(String.format("OwnerID for user %s not set!", i.getLoginName()));
		}
		throw new IllegalStateException("Subject for current user not available!");

	}
}
