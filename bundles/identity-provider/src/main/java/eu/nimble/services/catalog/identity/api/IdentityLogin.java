package eu.nimble.services.catalog.identity.api;

import eu.nimble.services.catalog.identity.model.impl.LoginResult;

public interface IdentityLogin {
	public LoginResult login(String username, String password, boolean rememberMe);
	public boolean logout();
}
