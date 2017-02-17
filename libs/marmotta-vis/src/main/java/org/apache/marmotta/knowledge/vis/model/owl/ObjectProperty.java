package org.apache.marmotta.knowledge.vis.model.owl;

import org.apache.marmotta.knowledge.vis.model.rdf.RDFProperty;
import org.apache.marmotta.knowledge.vis.ns.OWL;
import org.openrdf.annotations.Iri;

@Iri(OWL.ObjectProperty)
public interface ObjectProperty extends RDFProperty {

	@Iri(OWL.inverseOf)
	ObjectProperty getInverseOf();
	@Iri(OWL.inverseOf)
	void setInverseOf(ObjectProperty objectProperty); 

}
