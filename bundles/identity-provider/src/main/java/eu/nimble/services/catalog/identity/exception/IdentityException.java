package eu.nimble.services.catalog.identity.exception;

public class IdentityException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public IdentityException(String message) {
		super(message);
	}
	public IdentityException(String message, Throwable t) {
		super(message, t);
	}

}
