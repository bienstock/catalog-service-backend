package eu.nimble.services.catalog.identity.api;

import eu.nimble.services.catalog.identity.exception.IdentityException;
import eu.nimble.services.catalog.identity.model.IdentityProfile;
import eu.nimble.services.catalog.identity.model.impl.Identity;

/**
 * @author dglachs
 */
public interface IdentityLookup {
    /**
     * Helper method supporting the authentication process
     *
     * @param login    The user name provided
     * @param password The password provided
     * @return
     * @throws IdentityException
     */
    public Identity authenticate(String login, String password) throws IdentityException;

    public IdentityProfile getIdentityProfile(String login) throws IdentityException;

    public IdentityProfile getIdentityProfileByEMail(String email) throws IdentityException;

    public IdentityProfile createProfile(IdentityProfile profile) throws IdentityException;
}
