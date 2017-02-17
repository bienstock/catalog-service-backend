package org.apache.marmotta.knowledge.vis.model;

import java.util.Set;

import org.apache.marmotta.knowledge.vis.ns.VIS;
import org.openrdf.annotations.Iri;

//@subClassOf(VIS.Resource)
@Iri(VIS.PropertyType)
public interface VisPropertyType extends VisResource {
//	@Iri("http://www.salzburgresearch.at/vis/subPropertyOf")
//	public Set<VisPropertyType> getSuperProperties();
//	@Iri("http://www.salzburgresearch.at/vis/subPropertyOf")
//	public void setSuperProperties(Set<VisPropertyType> property);

	/**
	 * Projects where the edge is used
	 * @return
	 */
	@Iri(VIS.isPropertyOf)
	Set<VisNodeType> getNodeTypes();
	@Iri(VIS.isPropertyOf)
	public void setNodeTypes(Set<VisNodeType> visTypes);

	@Iri(VIS.hasPropertyValue)
	Set<VisPropertyValueType> getPropertyValues();
	@Iri(VIS.hasPropertyValue)
	public void setPropertyValues(Set<VisPropertyValueType> valueTypes);

	/**
	 * rdf:type for the target node
	 * @return
	 */
	@Iri(VIS.dataType)
	public String getDataType();
	@Iri(VIS.dataType)
	public void setDataType(String property);

	/**
	 * is the property multivalued (e.g. a list)
	 * @return
	 */
	@Iri(VIS.multiValue)
	public boolean getMultiValue();
	@Iri(VIS.multiValue)
	public void setMultiValue(boolean property);
	/**
	 * is the property multivalued (e.g. a list)
	 * @return
	 */
	@Iri(VIS.required)
	public boolean getRequired();
	@Iri(VIS.multiValue)
	public void setRequired(boolean property);
	/**
	 * Instances of the property type are multi-lingual
	 * @return <code>true</code> if multilingual, <code>false</code> otherwise 
	 */
	@Iri(VIS.multiLingual)
	public boolean getMultiLingual();
	/**
	 * Specify whether instances of the property type are multi-lingual
	 * @param property <code>true</code> if multi-lingual, <code>false</code>
	 *  when no language is applicable 
	 */
	@Iri(VIS.multiLingual)
	public void setMultiLingual(boolean property);

}
