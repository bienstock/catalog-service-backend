package org.apache.marmotta.knowledge.vis.dao;

import java.util.HashSet;
import java.util.Set;

public class InstanceWithData extends InstanceWithProperties {

	private Set<NodeItem> nodes = new HashSet<>();
	private Set<EdgeItem> edges = new HashSet<>();
	/**
	 * @return the nodes
	 */
	/**
	 * @return the nodes
	 */
	public Set<NodeItem> getNodes() {
		return nodes;
	}
	/**
	 * @param nodes the nodes to set
	 */
	public void setNodes(Set<NodeItem> nodes) {
		this.nodes = nodes;
	}
	/**
	 * @return the edges
	 */
	public Set<EdgeItem> getEdges() {
		return edges;
	}
	/**
	 * @param edges the edges to set
	 */
	public void setEdges(Set<EdgeItem> edges) {
		this.edges = edges;
	}
}
