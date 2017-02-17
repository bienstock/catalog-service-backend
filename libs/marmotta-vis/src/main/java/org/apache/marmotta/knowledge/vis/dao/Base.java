package org.apache.marmotta.knowledge.vis.dao;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import javax.xml.bind.annotation.XmlTransient;

public abstract class Base {
	protected static transient final long serialVersionUID = 1L;
	private String id;
	private Locale locale;
	private String label;
	private String comment;
	private boolean editable;
	private transient String namedGraph;
	private transient Integer count;
	private transient Set<BaseItem> items;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the locale
	 */
	public Locale getLocale() {
//		if ( locale == null ) {
//			locale = Locale.forLanguageTag(Locale.getDefault().getLanguage());
//		}
		return locale;
	}
	/**
	 * @param locale the locale to set
	 */
	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}
	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	/**
	 * @return the editable
	 */
	public boolean isEditable() {
		return editable;
	}
	/**
	 * @param editable the editable to set
	 */
	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	@XmlTransient
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		if ( this.id == null ) {
			return "".hashCode();
		}
		return this.id.hashCode();
	}
	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Base)) {
			return false;
		}
		Base other = (Base) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}
	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	/**
	 * @return the items
	 */
	@XmlTransient
	public Set<BaseItem> getItems() {
		if ( items == null ) {
			items = new HashSet<>();
		}
		return items;
	}
	/**
	 * @param items the items to set
	 */
	public void setItems(Set<BaseItem> items) {
		this.items = items;
	}
	/**
	 * @return the graph
	 */
	@XmlTransient
	public String getNamedGraph() {
		return namedGraph;
	}
	/**
	 * @param graph the graph to set
	 */
	public void setNamedGraph(String graph) {
		this.namedGraph = graph;
	}

}
