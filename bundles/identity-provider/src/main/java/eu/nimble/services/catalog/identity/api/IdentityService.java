package eu.nimble.services.catalog.identity.api;

import java.io.Serializable;
import java.net.URI;

import eu.nimble.services.catalog.identity.exception.IdentityException;
import eu.nimble.services.catalog.identity.model.IdentityProfile;

public interface IdentityService {
	
	public IdentityProfile getProfile(String username) throws IdentityException;
	
	//public IdentityProfile addProfile(String username, String password, String email, String gender);
	
	public IdentityProfile addProfile(IdentityProfile profile) throws IdentityException;

	public IdentityProfile getProfileByEMail(String email) throws IdentityException;

	public URI getLoginRedirect();

	public Serializable getSessionId();

}
