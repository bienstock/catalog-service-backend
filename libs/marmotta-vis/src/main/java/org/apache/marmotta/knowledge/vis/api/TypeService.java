package org.apache.marmotta.knowledge.vis.api;

import java.util.Locale;
import java.util.Set;

import org.apache.marmotta.knowledge.vis.dao.BaseItem;
import org.apache.marmotta.knowledge.vis.dao.EdgeType;
import org.apache.marmotta.knowledge.vis.dao.NetworkType;
import org.apache.marmotta.knowledge.vis.dao.NodeType;
import org.apache.marmotta.knowledge.vis.dao.PropertyType;
import org.apache.marmotta.knowledge.vis.dao.Type;
import org.openrdf.model.Resource;
import org.openrdf.repository.RepositoryConnection;
import org.openrdf.repository.RepositoryException;
import org.openrdf.repository.object.ObjectConnection;

/**
 * Service providing details for {@link Type} objects.
 * Type objects are 
 * <ul>
 * <li>NetworkType
 * <li>NodeType
 * <li>EdgeType
 * <li>PropertyType
 * </ul>
 *  
 * @author dglachs
 *
 */
public interface TypeService {
	Resource getType(RepositoryConnection conn, String resourceInstance) throws RepositoryException;
	Resource getType(RepositoryConnection conn, Resource resource) throws RepositoryException;
	Resource getLabelProperty(RepositoryConnection conn, Resource ...resources) throws RepositoryException;
	Resource getCommentProperty(RepositoryConnection conn, Resource... resources) throws RepositoryException;
	boolean isEditable(RepositoryConnection conn, Resource ... resources) throws RepositoryException;
	Resource getInNetworkProperty(RepositoryConnection conn, Resource networkType) throws RepositoryException;

	/**
	 * Retrieve a list of available network types. The labels are
	 * returned in the requested language.
	 * @param locale
	 * @return
	 * @throws RepositoryException
	 */
	Set<BaseItem> getNetworkTypes(Locale locale) throws RepositoryException;
	Set<BaseItem> getNetworkTypes(RepositoryConnection conn, Locale locale) throws RepositoryException;
	/**
	 * Retrieve a {@link NetworkType} based on the URI. The labels
	 * of enclosed {@link NodeType}, {@link EdgeType} and {@link PropertyType}
	 * objects are returned in the requested language.
	 * @param uri The URI of the network type.
	 * @param locale The language for the returned labels
	 * @return The {@link NetworkType} 
	 * @throws RepositoryException in case the object is not found.
	 */
	NetworkType getNetworkType(String uri, Locale locale) throws RepositoryException;
	NetworkType getNetworkType(ObjectConnection conn, String uri, Locale locale) throws RepositoryException;
	NodeType getNodeType(ObjectConnection conn, String networkType, String uri, Locale locale) throws RepositoryException;
	EdgeType getEdgeType(ObjectConnection conn,String uri) throws RepositoryException;
	EdgeType getEdgeType(ObjectConnection conn, NetworkType networkType, NodeType sourceNode) throws RepositoryException;
	PropertyType getPropertyType(ObjectConnection conn, String uri) throws RepositoryException;
	NodeType getNodeType(String networkType, String uri, Locale locale) throws RepositoryException;
	EdgeType getEdgeType(String networkType, String uri, Locale locale) throws RepositoryException;
	PropertyType getPropertyType(String networkType, String nodeType, String uri, Locale locale) throws RepositoryException;


}
