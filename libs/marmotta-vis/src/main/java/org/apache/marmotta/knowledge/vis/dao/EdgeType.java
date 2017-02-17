package org.apache.marmotta.knowledge.vis.dao;

import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlTransient;

public class EdgeType extends Type {
	private String color;
//	private Set<String> sourceTypes = new HashSet<>();
	private transient Set<NodeType> sourceNodeTypes = new HashSet<>();
	//private Set<String> targetTypes = new HashSet<>();
	private transient Set<NodeType> targetNodeTypes = new HashSet<>();
	private transient boolean symmetric;
	private transient String inverseOf;

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the sourceTypes
	 */
	public Set<String> getSourceTypes() {
		Set<String> st = new HashSet<>();
		for ( NodeType nt : sourceNodeTypes ) {
			st.add(nt.getId());
		}
		return st;
	}
	@XmlTransient
	public boolean hasSourceType(String target) {
		for ( NodeType nt : sourceNodeTypes ) {
			if (nt.getType().equals(target)) {
				return true;
			}
		}
		return false;
	}


	/**
	 * @return the targetTypes
	 */
	public Set<String> getTargetTypes() {
		Set<String> st = new HashSet<>();
		for ( NodeType nt : targetNodeTypes ) {
			st.add(nt.getId());
		}
		return st;
	}
	@XmlTransient
	public boolean hasTargetType(String target) {
		for ( NodeType nt : targetNodeTypes ) {
			if (nt.getType().equals(target)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @return the symmetric
	 */
	@XmlTransient
	public boolean isSymmetric() {
		return symmetric;
	}

	/**
	 * @param symmetric the symmetric to set
	 */
	public void setSymmetric(boolean symmetric) {
		this.symmetric = symmetric;
	}

	/**
	 * @return the inverseOf
	 */
	@XmlTransient
	public String getInverseOf() {
		return inverseOf;
	}

	/**
	 * @param inverseOf the inverseOf to set
	 */
	public void setInverseOf(String inverseOf) {
		this.inverseOf = inverseOf;
	}
	public void addSourceNodeType(NodeType nt) {
		sourceNodeTypes.add(nt);
	}
	public void addTargetNodeType(NodeType nt) {
		targetNodeTypes.add(nt);
	}

}
