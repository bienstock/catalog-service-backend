package eu.nimble.services.catalog.identity.exception;

public class LookupException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public LookupException(String message) {
		super(message);
	}
	public LookupException(String message, Throwable t) {
		super(message,t);
	}

}
