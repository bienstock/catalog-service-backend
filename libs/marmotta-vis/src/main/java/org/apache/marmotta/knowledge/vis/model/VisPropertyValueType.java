package org.apache.marmotta.knowledge.vis.model;

import java.util.Set;

import org.apache.marmotta.knowledge.vis.ns.VIS;
import org.openrdf.annotations.Iri;

//@subClassOf(VIS.Resource)
@Iri(VIS.PropertyValueType)
public interface VisPropertyValueType extends VisResource {
	/**
	 * Properties where this particular value is used
	 * @return
	 */
	@Iri(VIS.isPropertyValueOf)
	Set<VisPropertyType> getPropertyTypes();
	@Iri(VIS.isPropertyValueOf)
	public void setPropertyTypes(Set<VisPropertyType> visTypes);


	/**
	 * rdf:type for the target node
	 * @return
	 */
	@Iri(VIS.property)
	public String getProperty();
	@Iri(VIS.property)
	public void setProperty(String property);

}
