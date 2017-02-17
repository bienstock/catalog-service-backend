package eu.nimble.services.catalog.identity.model.impl;

import java.io.Serializable;

public class LoginResult implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Serializable sessionId;
	private String psmssId;
	public Serializable getSessionId() {
		return sessionId;
	}
	public void setSessionId(Serializable sessionId) {
		this.sessionId = sessionId;
	}
	public String getPsmssId() {
		return psmssId;
	}
	public void setPsmssId(String psmssId) {
		this.psmssId = psmssId;
	}

}
