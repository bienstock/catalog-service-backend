package org.apache.marmotta.knowledge.vis.dao;

public class EdgeItem extends BaseItem {
	private String from;
	private String to;
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
	public String getId() {
		int hash = String.format("%s:%s:%s", from, getType(), to ).hashCode();
		return Integer.toString(hash);
	}
	public String getGraph() {
		return super.getNamedGraph();
	}


}
