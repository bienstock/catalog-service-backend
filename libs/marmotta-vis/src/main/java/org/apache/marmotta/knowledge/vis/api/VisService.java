package org.apache.marmotta.knowledge.vis.api;

import java.util.Collection;
import java.util.Locale;
import java.util.Set;

import org.apache.marmotta.knowledge.vis.dao.BaseItem;
import org.apache.marmotta.knowledge.vis.dao.Edge;
import org.apache.marmotta.knowledge.vis.dao.EdgeType;
import org.apache.marmotta.knowledge.vis.dao.Graph;
import org.apache.marmotta.knowledge.vis.dao.GraphItem;
import org.apache.marmotta.knowledge.vis.dao.InstanceWithData;
import org.apache.marmotta.knowledge.vis.dao.InstanceWithProperties;
import org.apache.marmotta.knowledge.vis.dao.NetworkItem;
import org.apache.marmotta.knowledge.vis.dao.NetworkType;
import org.apache.marmotta.knowledge.vis.dao.NodeType;
import org.apache.marmotta.knowledge.vis.dao.Property;
import org.apache.marmotta.knowledge.vis.dao.PropertyType;

public interface VisService {

	/**
	 * Retrieve a list of all project definitions which may be used by the 
	 * user interface
	 * @param locale The (default) language to use
	 * @return
	 */
	Set<BaseItem> getNetworkTypes(Locale locale);
	/**
	 * Retrieve the project definition for the project with id
	 * @param project
	 * @param locale
	 * @return
	 */
	NetworkType getNetworkType(String project, Locale locale);
	/**
	 * Load the distinct types for the project
	 * @param project The project to load the type definitions
	 * @return
	 */
	Collection<NodeType> getNodeTypes(String project, Locale locale);
	/**
	 * Get a single node type
	 * @param project
	 * @param nodeTypeInstance
	 * @param locale
	 * @return
	 */
	NodeType getNodeType(String project, String nodeTypeInstance, Locale locale);

	/**
	 * Load the distinct edge-types for the project
	 * @param project
	 * @return
	 */
	Collection<EdgeType> getEdgeTypes(String project, Locale locale);
	Collection<PropertyType> getPropertyTypes(String type, Locale locale);
	/**
	 * Get a single edge type
	 * @param project
	 * @param edgeType
	 * @param locale
	 * @return
	 */
	EdgeType getEdgeType(String project, String edgeType, Locale locale);

	/** 
	 * Load the network instances based on the project definition
	 * @param configuration The project definition
	 * @param locale The desired language
	 * @return
	 */
	Set<NetworkItem> getNetworks(String configuration, String graph, Locale locale, boolean countAll);
	/**
	 * Get a single network definition
	 * @param forProject The configuration the network is following
	 * @param network The network instance
	 * @param locale The language of the labels
	 * @return
	 */
	InstanceWithProperties getNetwork(String forProject, String network, Locale locale, boolean countAll);
	/**
	 * Obtain the node instance along with the defined properties and values
	 * @param config the network type uri
	 * @param network The network (or vocabulary) uri
	 * @param nodeTypeUri The nodeType uri
	 * @param nodeInstance The subject uri (node instance uri)
	 * @param locale The language
	 * @param complete include connected nodes and connecting edges
	 * @return
	 */
	InstanceWithProperties getNode(String config, String nodeTypeUri, String nodeInstance, Locale locale, boolean complete);
	/**
	 * Find the named graphs holding networks of the requested project type
	 * @param forProject
	 * @param locale
	 * @return
	 */
	Set<GraphItem> getGraphs(String forProject, Locale locale);
	/**
	 * Obtain the named graph 
	 * @param forProject The network type uri
	 * @param graph The context or named graph uri
	 * @param locale The language
	 * @return
	 */
	Graph getGraph(String graph, Locale locale);
	/**
	 * Obtain the named graph
	 * @param forProject The network type uri
	 * @param graph The context or named graph uri
	 * @param locale The language
	 * @param countAll when <code>true</code> count all nodes, otherwise only networks and directly connected nodes are counted
	 * @return
	 */
	InstanceWithData getGraphData(String forProject, String graph, Locale locale, boolean countAll);
	/**
	 * Insert or update a new network based on the provided configuration
	 * @param configuration The configuration providing the environment of the network
	 * @param network The network object
	 * @param locale The locale
	 * @return the updated network
	 */
	InstanceWithProperties setNetwork(String forProject, InstanceWithProperties network);
	Graph setGraph(Graph graph, Locale locale);
	/**
	 * Create or update a node with the network
	 * @param config The networkType for the request
	 * @param nodeType The nodeType for the node to create
	 * @param node The node itself
	 * @return
	 */
	InstanceWithProperties setNode(String config, String nodeType, String graph, String network, InstanceWithProperties node);
	/**
	 * Add a new edge 
	 * @param edgeType
	 * @param newEdge
	 * @return
	 */
	boolean addEdge(String networkType, String edgeType, Edge newEdge);
	/**
	 * Retrieve an empty template to fill in when creating a new node of the requested type 
	 * @param networkType
	 * @param network
	 * @param nodeTypeUri
	 * @param locale
	 * @return
	 */
	InstanceWithProperties getNodeTemplate(String networkType, String nodeTypeUri, Locale locale);
	/**
	 * Remove a node (Graph, Network, Node) from the network
	 * @param node
	 * @return
	 */
	boolean deleteNode(String networkType, String nodeType, String node);
	/**
	 * Remove a property from a node
	 * @param instance
	 * @param property
	 * @return
	 */
	boolean deleteProperty(String networkType, String nodeType, String instance, Property property);
	Property updateProperty(String networkType, String nodeType,  String instance, Property property);
	/**
	 * Remove an existing edge from the network
	 * @param newEdge
	 * @return
	 */
	boolean removeEdge(String networkType, String edgeType, Edge newEdge);
	
	boolean deleteNetwork(String networkType, String network);
	boolean deleteGraph(String uri);
	/**
	 * Retrieve a set of properties for the given node instance
	 * @param networkType The networkType to use
	 * @param nodeType The nodeType to use
	 * @param node The node instance
	 * @param locale The locale for filtering, when provided, only the properties with no language setting or the given
	 * locale are returned
	 * @return
	 */
	Set<Property> getProperties(String networkType, String nodeType, String node, Locale locale);
	
	
}
