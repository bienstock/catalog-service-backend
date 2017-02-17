package org.apache.marmotta.knowledge.vis.dao;

import java.util.Set;

public interface WithData {
	public Set<NodeItem> getNodes();
	public Set<EdgeItem> getEdges();

}
