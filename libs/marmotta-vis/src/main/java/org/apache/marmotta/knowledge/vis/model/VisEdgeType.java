package org.apache.marmotta.knowledge.vis.model;

import java.util.Set;

import org.apache.marmotta.knowledge.vis.ns.VIS;
import org.openrdf.annotations.Iri;

//@subClassOf(VIS.Resource)
@Iri(VIS.EdgeType)
public interface VisEdgeType extends VisResource {
	/**
	 * Projects where the edge is used (or part of)
	 * @return
	 */
	@Iri(VIS.isEdgeOf)
	public Set<VisNetwork> getVisProjects();
	@Iri(VIS.isEdgeOf)
	public void setVisProjects(Set<VisNetwork> projects);

	/**
	 * rdf:types for the source node
	 * @return
	 */
	@Iri(VIS.sourceNodeType)
	public Set<VisNodeType> getSourceTypes();
	@Iri(VIS.sourceNodeType)
	public void setSourceTypes(Set<VisNodeType> nodeTypes);
	/**
	 * rdf:type for the target node
	 * @return
	 */
	@Iri(VIS.targetNodeType)
	public Set<VisNodeType> getTargetTypes();
	@Iri(VIS.targetNodeType)
	public void setTargetTypes(Set<VisNodeType> targetType);
	/**
	 * Pointer to the inverse relationship (if any)
	 * @return
	 */
	@Deprecated
	@Iri(VIS.inverseOfEdge)
	public VisEdgeType getInverseOf();
	@Deprecated
	@Iri(VIS.inverseOfEdge)
	public void setInverseOf(VisEdgeType inverseEdge);

	/**
	 * Image outlining the visual shape 
	 * @return
	 */
	@Iri(VIS.image)
	String getImage();
	/**
	 * Set the image outlining the visual shape 
	 * @param fromNodeToNetwork
	 */
	@Iri(VIS.image)
	public void setImage(String image);
	/**
	 * Color of the visual shape 
	 * @return
	 */
	@Iri(VIS.color)
	String getColor();
	/**
	 * Set the color of  the visual shape 
	 * @param fromNodeToNetwork
	 */
	@Iri(VIS.color)
	public void setColor(String color);
}
