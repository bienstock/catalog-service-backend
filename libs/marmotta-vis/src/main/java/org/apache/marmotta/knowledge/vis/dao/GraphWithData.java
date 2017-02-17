package org.apache.marmotta.knowledge.vis.dao;

import java.util.Locale;
import java.util.Set;

public class GraphWithData extends InstanceWithData {
	private Set<Locale> languages;

	/**
	 * @return the languages
	 */
	public Set<Locale> getLanguages() {
		return languages;
	}

	/**
	 * @param languages the languages to set
	 */
	public void setLanguages(Set<Locale> languages) {
		this.languages = languages;
	}

}
 