package eu.nimble.services.catalog.identity.model;

import org.joda.time.DateTime;

public interface IdentityProfile {
	public String getLoginName();
	public String getTitle();
	public String getFirstName();
	public String getLastName();
	public String getStreet();
	public String getPostalCode();
	public String getCity();
	public String getCountry();
	public String getPhone();
	public String getEMail();
	public DateTime getBirthDate();
	public String getOwnerId();
	public boolean isActive();
	public boolean isConsented();
	public GenderType getGender();
	public String getPassword();
}
