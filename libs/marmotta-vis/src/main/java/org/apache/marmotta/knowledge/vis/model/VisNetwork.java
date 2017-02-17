package org.apache.marmotta.knowledge.vis.model;

import java.util.Set;

import org.apache.marmotta.knowledge.vis.ns.VIS;
import org.openrdf.annotations.Iri;

//@subClassOf(VIS.Resource)
@Iri(VIS.Network)
public interface VisNetwork extends VisResource {
	/**
	 * The set of available node types for this project
	 * @return
	 */
	@Iri(VIS.hasType)
	Set<VisNodeType> getVisTypes();
	@Iri(VIS.hasType)
	public void setVisTypes(Set<VisNodeType> visTypes);
	/**
	 * The list of available edge types for this project
	 * 
	 * @return
	 */
	@Iri(VIS.hasEdge)
	Set<VisEdgeType> getVisEdges();
	@Iri(VIS.hasEdge)
	public void setVisEdges(Set<VisEdgeType> visTypes);
	/**
	 * rdf:property denoting the link of the nodes to the 
	 * containing project
	 * @return
	 */
	@Iri(VIS.inNetwork)
	String getToNetworkProperty();
	/**
	 * Specify the link from a node to the network
	 * @param fromNodeToNetwork
	 */
	@Iri(VIS.inNetwork)
	public void setToNetworkProperty(String fromNodeToNetwork);

	/**
	 * rdf:property denoting the direct link of a node
	 * to the containing network
	 * @return
	 */
	@Iri(VIS.toChildren)
	Set<Object> getToChildren();
	/**
	 * Specify the rdf:property to use for denoting a 
	 * direct, top-level relationship between a node and
	 * a network
	 * @param fromNodeToNetwork
	 */
	@Iri(VIS.toChildren)
	public void setToChildren(Set<Object> toChildren);
	

}


