package eu.nimble.services.catalog.identity.security;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import eu.nimble.services.catalog.identity.api.IdentityLookup;
import eu.nimble.services.catalog.identity.exception.IdentityException;
import eu.nimble.services.catalog.identity.model.GenderType;
import eu.nimble.services.catalog.identity.model.IdentityProfile;
import eu.nimble.services.catalog.identity.model.IdentityType;
import eu.nimble.services.catalog.identity.model.impl.Identity;

public class IdentityLookupHelper implements IdentityLookup {
	private List<Identity> identities;
	
	public IdentityLookupHelper() {
		identities = new ArrayList<>();
		identities.add(createIdentity("patient1", "pass123", "owner_id1", IdentityType.PATIENT, "sinovo"));
		identities.add(createIdentity("patient2", "pass123", "owner_id2", IdentityType.PATIENT, "sinovo"));
		identities.add(createIdentity("dg_patient", "pass123", "615de849-f2f6-4ecb-abf5-c62b03a577b2", IdentityType.PATIENT, "patient"));

		identities.add(createIdentity("patient_demo", "demo", "c42390ac-f75a-4b19-a6bf-a9544541bf84", IdentityType.PATIENT, "sinovo"));
		identities.add(createIdentity("hugo", "boss", "lagerfeld", IdentityType.CARE_PROVIDER, "sinovo"));
	}
	private Identity createIdentity(String username, String password, String ownerId, IdentityType type, String organisation) {
		Identity i1 = new Identity();
		i1.setActive(Boolean.TRUE);
		i1.setCity("Nowhere");
		i1.setConsented(Boolean.TRUE);
		i1.setCountry("Somewhere");
		i1.setEMail("hugo@boss.com");
		i1.setFirstName(username);
		i1.setGender(GenderType.MALE);
		i1.setLastName(username.toUpperCase());
		i1.setOwnerId(ownerId);
		i1.setLoginName(username);
		i1.setOrganization(organisation);
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(0);
		cal.set(Calendar.YEAR, 1988);
		cal.set(Calendar.MONTH, 1);
		cal.set(Calendar.DAY_OF_MONTH,20);
		i1.setDateOfBirth(cal);
		i1.setIdentityType(type);
		i1.setPassword(password);
		return i1;
	}
	@Override
	public Identity authenticate(String username, String pass) {
		for (Identity i : identities) {
			if ( i.getLoginName().equalsIgnoreCase(username)) {
				return i;
			}
		}
		return null;
	}

	@Override
	public IdentityProfile getIdentityProfile(String login) {
		for ( Identity i : identities ) {
			if ( i.getLoginName().equals(login)) {
				return i;
			}
		}
		return null;
	}

	@Override
	public IdentityProfile getIdentityProfileByEMail(String email) throws IdentityException {
		for ( Identity i : identities ) {
			if ( i.getEMail().equals(email)) {
				return i;
			}
		}
		return null;
	}

	@Override
	public IdentityProfile createProfile(IdentityProfile profile) throws IdentityException {
		return null;
	}

}
