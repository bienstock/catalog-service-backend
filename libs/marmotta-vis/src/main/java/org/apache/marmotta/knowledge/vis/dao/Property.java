package org.apache.marmotta.knowledge.vis.dao;

import javax.xml.bind.annotation.XmlTransient;

public class Property extends Instance<PropertyType> {
//	private String nodeType;
	private String dataType;
	private String value;
	private String oldValue;

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the newValue
	 */
	public String getOldValue() {
		return oldValue;
	}

	/**
	 * @param newValue the newValue to set
	 */
	public void setOldValue(String newValue) {
		this.oldValue = newValue;
	}

	/**
	 * @return the valueType
	 */
	public String getDataType() {
		return dataType;
	}

	/**
	 * @param valueType the valueType to set
	 */
	public void setDataType(String valueType) {
		this.dataType = valueType;
	}

//	/**
//	 * @return the nodeType
//	 */
//	public String getNodeType() {
//		return nodeType;
//	}
//
//	/**
//	 * @param nodeType the nodeType to set
//	 */
//	public void setNodeType(String nodeType) {
//		this.nodeType = nodeType;
//	}

	@XmlTransient
	public String getComment() {
		return super.getComment();
	}
	/**
	 * be sure to have a unique id for each property
	 */
//	public String getId() {
//		int hash = getType().hashCode();
//		return String.format("%s:%s:%s", super.getId(), hash, getLocale().getLanguage());
//	}

}
