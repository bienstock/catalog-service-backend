package org.apache.marmotta.knowledge.vis.dao;

import java.util.Locale;

public class ListItem {

	private final transient Base instance;
	public ListItem(Base base) {
		this.instance = base;
	}
	
	public String getId() {
		return instance.getId();
	}
	public Locale getLocale() {
		return instance.getLocale();
	}
	public String getLabel() {
		return instance.getLabel();

	}
	public String getComment() {
		return instance.getComment();

	}
	public boolean isEditable() {
		return instance.isEditable();
	}
	protected Base getInstance() {
		return instance;
	}
	
}
