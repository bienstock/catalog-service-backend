package org.apache.marmotta.knowledge.vis.dao;

import java.util.Locale;
import java.util.Set;

public class Graph extends Instance<GraphType> {
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
//	/**
//	 * 
//	 * @return
//	 */
//	
//	public Set<BaseItem> getNetworks() {
//		return getItems();
//	}
	
}
