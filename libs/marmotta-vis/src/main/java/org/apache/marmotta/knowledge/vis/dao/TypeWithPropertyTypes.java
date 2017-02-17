package org.apache.marmotta.knowledge.vis.dao;

import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlTransient;

import org.apache.marmotta.knowledge.vis.ns.DCTERMS;
import org.apache.marmotta.knowledge.vis.ns.RDFS;

public abstract class TypeWithPropertyTypes extends Type {
	private Set<PropertyType> propertyTypes = new HashSet<>();
	private transient String labelUri;
	private transient String commentUri;

	/**
	 * @return the properties
	 */
	public Set<PropertyType> getPropertyTypes() {
		return propertyTypes;
	}
	/**
	 * @param properties the properties to set
	 */
	public void setPropertyTypes(Set<PropertyType> properties) {
		this.propertyTypes = properties;
	}
	@XmlTransient
	public Set<String> getPropertyTypesFormatted() {
		Set<String> targets = new HashSet<>();
		for ( PropertyType nt : propertyTypes ) {
			targets.add(String.format("<%s>", nt.getType()));
		}
		return targets;
	}
	@XmlTransient
	public PropertyType getPropertyType(String property) {
		return getPropertyType(property, null);
	}
	@XmlTransient
	public PropertyType getPropertyType(String property, String fallback) {
		for (PropertyType nt : propertyTypes) {
			if ( nt.getType().equals(property)) {
				return nt;
			}
		}
		if ( fallback != null ) {
			for (PropertyType nt : propertyTypes) {
				if ( nt.getType().equals(fallback)) {
					return nt;
				}
			}
			PropertyType pt = new PropertyType();
			pt.setDisplayType(DisplayTypeEnum.STRING);
			pt.setEditable(true);
			pt.setMultiLingual(true);
			pt.setMultiValue(false);
			pt.setRequired(true);
			pt.setLocale(getLocale());
			pt.setId(fallback);
			
			switch (fallback) {
			case RDFS.label:
				pt.setLabel("RDFS Label");
				pt.setComment("RDFS Label");
				pt.setType(fallback);
				return pt;
			case DCTERMS.title:
				pt.setLabel("DCTERMS Title");
				pt.setComment("DCTERMS Title");
				pt.setType(fallback);
				return pt;
			case RDFS.comment:
				pt.setLabel("RDFS Comment");
				pt.setComment("RDFS Comment");
				pt.setType(fallback);
				return pt;
			case DCTERMS.description:
				pt.setLabel("DCTERMS Description");
				pt.setComment("DCTERMS Description");
				pt.setType(fallback);
				return pt;

			default:
				break;
			}
		}
		throw new IllegalStateException(String.format("Property for target <%s> not found!", property));
	}
	@XmlTransient
	public PropertyType getPropertyTypeById(String id) {
		for (PropertyType nt : propertyTypes) {
			if ( nt.getId().equals(id)) {
				return nt;
			}
		}
		throw new IllegalStateException(String.format("Property with ID <%s> not found!", id));
	}
	/**
	 * @return the labelUri
	 */
	@XmlTransient
	public String getLabelProperty() {
		if ( labelUri == null ) {
			return RDFS.label;
		}
		return labelUri;
	}
	/**
	 * @param labelUri the labelUri to set
	 */
	public void setLabelProperty(String labelUri) {
		this.labelUri = labelUri;
	}
	/**
	 * @return the commentUri
	 */
	@XmlTransient
	public String getCommentProperty() {
		if ( commentUri == null ){
			return RDFS.comment;
		}
		return commentUri;
	}
	/**
	 * @param commentUri the commentUri to set
	 */
	public void setCommentProperty(String commentUri) {
		this.commentUri = commentUri;
	}
	@XmlTransient
	public String getLabelUriFormatted() {
		return String.format("<%s>", getLabelProperty());
	}
	@XmlTransient
	public String getCommentUriFormatted() {
		return String.format("<%s>", getCommentProperty());
	}

}
