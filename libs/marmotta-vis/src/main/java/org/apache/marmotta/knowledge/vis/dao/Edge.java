package org.apache.marmotta.knowledge.vis.dao;

public class Edge extends Instance<EdgeType> {
	private String from;
	private String to;
//	private String edgeType;
	/** 
	 * An Edge does not have an own id - so generate it here!
	 */
	public String getId() {
		int hash = String.format("%s:%s:%s", from, getType(), to ).hashCode();
		return Integer.toString(hash);
	}
	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}
	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}
	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}
	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}
//	public String getEdgeType() {
//		try {
//			return getInstanceType().getId();
//		}
//		catch (Exception e) {
//			return edgeType;
//		}
//	}
//	/**
//	 * @param edgeType the edgeType to set
//	 */
//	public void setEdgeType(String edgeType) {
//		this.edgeType = edgeType;
//	}
}
