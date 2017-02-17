package org.apache.marmotta.knowledge.vis.api;

import java.util.Locale;
import java.util.Set;

import org.apache.marmotta.knowledge.vis.dao.Base;
import org.apache.marmotta.knowledge.vis.dao.Edge;
import org.apache.marmotta.knowledge.vis.dao.EdgeItem;
import org.apache.marmotta.knowledge.vis.dao.Graph;
import org.apache.marmotta.knowledge.vis.dao.GraphItem;
import org.apache.marmotta.knowledge.vis.dao.InstanceWithData;
import org.apache.marmotta.knowledge.vis.dao.InstanceWithProperties;
import org.apache.marmotta.knowledge.vis.dao.NetworkItem;
import org.apache.marmotta.knowledge.vis.dao.NetworkType;
import org.apache.marmotta.knowledge.vis.dao.NodeItem;
import org.apache.marmotta.knowledge.vis.dao.Property;
import org.openrdf.model.Resource;
import org.openrdf.repository.RepositoryConnection;
import org.openrdf.repository.RepositoryException;

public interface InstanceService {
	
	Set<GraphItem> getGraphs(String networkType, Locale locale) throws RepositoryException;

	Set<NetworkItem> getNetworks(String networkType, String graph, Locale locale, boolean countAll) throws RepositoryException;

	InstanceWithData getGraphData(String networkType, String graph, Locale locale, boolean countAll) throws RepositoryException;

	Graph setGraph(Graph network, Locale locale) throws RepositoryException;
	Graph getGraph(String graph, Locale locale) throws RepositoryException;

	InstanceWithProperties getNetwork(String networkType, String network, Locale locale, boolean complete) throws RepositoryException;
	
	InstanceWithProperties setNetwork(String networkType, InstanceWithProperties network) throws RepositoryException;
	
	InstanceWithProperties getNode(String networkType, String nodeTypeUri, String nodeInstance, Locale locale, boolean complete) throws RepositoryException;
	/**
	 * Get the label property for a provided resource
	 * @param conn The repository connection to use
	 * @param instance The subject resource
	 * @param locale The locale to check for the label 
	 * @param resources The resource denoting node type, network type etc. Used to determine the label property to use
	 * @return The label in the requested language, <code>null</code> if no label set
	 * @throws RepositoryException
	 */
	String getLabel(RepositoryConnection conn, Resource instance, Locale locale, Resource... resources)
			throws RepositoryException;

	String getComment(RepositoryConnection conn, Resource instance, Locale locale, Resource... resources)
			throws RepositoryException;

	Set<NodeItem> getNodes(RepositoryConnection conn, NetworkType networkType, Base graph,
			InstanceWithProperties instance, Locale locale, boolean complete) throws RepositoryException;

	Set<EdgeItem> getEdges(RepositoryConnection conn, NetworkType networkType, Base graph,
			InstanceWithProperties instance, Locale locale, boolean complete) throws RepositoryException;

	boolean setEdge(String networkType, String edgeType, Edge edge, boolean delete) throws RepositoryException;
	/**
	 * Delete a single network including all connections of nodes to the network. The nodes are not deleted!
	 * @param nt
	 * @param network
	 * @param locale
	 * @return
	 * @throws RepositoryException
	 */
	boolean deleteNetwork(String nt, String network, Locale locale) throws RepositoryException;

	boolean deleteGraph(String graph, Locale locale) throws RepositoryException;

	boolean deleteNode(String networkTypeId, String nodeTypeId, String node, Locale locale) throws RepositoryException;
	/**
	 * Set or update a property
	 * @param nodeInstance
	 * @param property
	 * @return
	 * @throws RepositoryException
	 */
	Property setProperty(String networkType, String nodeType, String nodeInstance, Property property) throws RepositoryException;

	InstanceWithProperties setNode(String networkType,String graph, String network,InstanceWithProperties node) throws RepositoryException;

	Set<Property> getProperties(String networkType, String nodeType, String node, Locale locale) throws RepositoryException;

	boolean deleteProperty(String networkType, String nodeType, String instance, Property property)
			throws RepositoryException;


	
	//InstanceWithProperties newInstance(NetworkType net, NodeType node);
}
