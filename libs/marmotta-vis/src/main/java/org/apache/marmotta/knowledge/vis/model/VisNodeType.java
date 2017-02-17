package org.apache.marmotta.knowledge.vis.model;

import java.util.Set;

import org.apache.marmotta.knowledge.vis.ns.VIS;
import org.openrdf.annotations.Iri;

//@subClassOf(VIS.Resource)
@Iri(VIS.NodeType)
public interface VisNodeType extends VisResource {
	/**
	 * Retrieve the list of networks where this 
	 * particular type is used.
	 * @return
	 */
	@Iri(VIS.isTypeOf)
	Set<VisNetwork> getNetworks();
	@Iri(VIS.isTypeOf)
	public void setNetworks(Set<VisNetwork> projects);
	/**
	 * Retrieve the list of properties
	 * @return
	 */
	@Iri(VIS.hasProperty)
	Set<VisPropertyType> getPropertyTypes();
	@Iri(VIS.hasProperty)
	public void setPropertyTypes(Set<VisPropertyType> properties);

//	/**
//	 * rdfTypes to apply when creating an instance
//	 * of the VisType
//	 * @return
//	 */
//	@Iri(VIS.rdfType)
//	Set<String> getRdfTypes();
//	@Iri(VIS.rdfType)
//	public void getRdfTypes(Set<String> projects);
	
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
