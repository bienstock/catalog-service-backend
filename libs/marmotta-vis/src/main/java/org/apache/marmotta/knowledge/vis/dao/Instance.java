package org.apache.marmotta.knowledge.vis.dao;

import javax.xml.bind.annotation.XmlTransient;

public abstract class Instance<T extends Type> extends Base {
	private String type;
	
	private transient T instanceType;
	/**
	 * @return the type
	 */
	@XmlTransient
	public T getInstanceType() {
		if ( instanceType == null ) {
			throw new IllegalStateException("Instance not initialized with it's type!");
		}
		return instanceType;
	}
	/**
	 * @param type the type to set
	 */
	public void setInstanceType(T type) {
		this.instanceType = type;
	}
	public String toString() {
		return getLabel() + " (" + getInstanceType() +")";
		 
	}
	/**
	 * @return the type
	 */
	public String getType() {
		if ( instanceType != null ) {
			return instanceType.getId();
		}
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
