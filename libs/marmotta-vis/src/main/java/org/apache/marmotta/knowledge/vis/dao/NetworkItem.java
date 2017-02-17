package org.apache.marmotta.knowledge.vis.dao;

public class NetworkItem extends BaseItem {
	
	public Integer getNodeCount() {
		return getCount();
	}
	public String getGraph() {
		return super.getNamedGraph();
	}
	
}
