package eu.nimble.services.catalog.identity.model.impl;

import org.joda.time.DateTime;

import eu.nimble.services.catalog.identity.model.GenderType;
import eu.nimble.services.catalog.identity.model.IdentityProfile;
import eu.nimble.services.catalog.identity.model.IdentityType;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Calendar;

@XmlRootElement
public class Identity implements IdentityProfile {
	private String loginName;
	private String title;
	private String firstName;
	private String lastName;
	private String street;
	private String postalCode;
	private String city;
	private String country;
	private String phone;
	private String eMail;
	private Calendar dateOfBirth;
	private String psmssId;
	private String ownerId;
	private String organization;
	private boolean active;
	private boolean consented;
	private GenderType gender;
	private IdentityType identityType;
	private String password;

	@Override
	public String getLoginName() {
		return loginName;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public String getStreet() {
		return street;
	}

	@Override
	public String getPostalCode() {
		return postalCode;
	}

	@Override
	public String getCity() {
		return city;
	}

	@Override
	public String getPhone() {
		return phone;
	}

	@Override
	public String getEMail() {
		return eMail;
	}

	@Override
	public DateTime getBirthDate() {
		return toDateTime(dateOfBirth);
	}

	@Override
	public boolean isActive() {
		return active;
	}

	@Override
	public boolean isConsented() {
		return consented;
	}

	@Override
	public GenderType getGender() {
		return gender;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEMail(String eMail) {
		this.eMail = eMail;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public void setConsented(boolean consented) {
		this.consented = consented;
	}

	public void setGender(GenderType gender) {
		this.gender = gender;
	}

	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Calendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	private static DateTime toDateTime(Calendar date) {
		try {
			if ( date != null ) {
				return new DateTime(date.getTime());
			}
			return null;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	//@XmlTransient
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public IdentityType getIdentityType() {
		return identityType;
	}

	public void setIdentityType(IdentityType identityType) {
		this.identityType = identityType;
	}

	@Override
	public String toString() {
		return "Identity{" +
				"loginName='" + loginName + '\'' +
				", psmssId='" + psmssId + '\'' +
				", ownerId='" + ownerId + '\'' +
				", identityType=" + identityType +
				'}';
	}
}
