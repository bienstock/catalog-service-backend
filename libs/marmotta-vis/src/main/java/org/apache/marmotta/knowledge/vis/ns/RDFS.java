package org.apache.marmotta.knowledge.vis.ns;

import org.openrdf.model.URI;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.ValueFactoryImpl;

/**
 * The RDF Schema vocabulary (RDFS).
 * <p>
 * Namespace RDFS.
 * Prefix: {@code <http://www.w3.org/2000/01/rdf-schema#>}
 *
 * @see <a href="http://www.w3.org/2000/01/rdf-schema-more">http://www.w3.org/2000/01/rdf-schema-more</a>
 */
public class RDFS {

	/** {@code http://www.w3.org/2000/01/rdf-schema#} **/
	public static final String NAMESPACE = "http://www.w3.org/2000/01/rdf-schema#";

	/** {@code rdfs} **/
	public static final String PREFIX = "rdfs";

	/**
	 * Class
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#Class}.
	 * <p>
	 * The class of classes.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#Class">Class</a>
	 */
	public static final String Class = RDFS.NAMESPACE + "Class";

	/**
	 * comment
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#comment}.
	 * <p>
	 * A description of the subject resource.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#comment">comment</a>
	 */
	public static final String comment = RDFS.NAMESPACE + "comment";

	/**
	 * Container
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#Container}.
	 * <p>
	 * The class of RDF containers.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#Container">Container</a>
	 */
	public static final String Container = RDFS.NAMESPACE + "Container";

	/**
	 * ContainerMembershipProperty
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#ContainerMembershipProperty}.
	 * <p>
	 * The class of container membership properties, rdf:_1, rdf:_2, ..., all
	 * of which are sub-properties of 'member'.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#ContainerMembershipProperty">ContainerMembershipProperty</a>
	 */
	public static final String ContainerMembershipProperty = RDFS.NAMESPACE + "ContainerMembershipProperty";

	/**
	 * Datatype
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#Datatype}.
	 * <p>
	 * The class of RDF datatypes.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#Datatype">Datatype</a>
	 */
	public static final String Datatype = RDFS.NAMESPACE + "Datatype";

	/**
	 * domain
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#domain}.
	 * <p>
	 * A domain of the subject property.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#domain">domain</a>
	 */
	public static final String domain = RDFS.NAMESPACE + "domain";

	/**
	 * isDefinedBy
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#isDefinedBy}.
	 * <p>
	 * The defininition of the subject resource.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#isDefinedBy">isDefinedBy</a>
	 */
	public static final String isDefinedBy = RDFS.NAMESPACE + "isDefinedBy";

	/**
	 * label
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#label}.
	 * <p>
	 * A human-readable name for the subject.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#label">label</a>
	 */
	public static final String label = RDFS.NAMESPACE + "label";

	/**
	 * Literal
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#Literal}.
	 * <p>
	 * The class of literal values, eg. textual strings and integers.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#Literal">Literal</a>
	 */
	public static final String Literal = RDFS.NAMESPACE + "Literal";

	/**
	 * member
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#member}.
	 * <p>
	 * A member of the subject resource.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#member">member</a>
	 */
	public static final String member = RDFS.NAMESPACE + "member";

	/**
	 * range
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#range}.
	 * <p>
	 * A range of the subject property.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#range">range</a>
	 */
	public static final String range = RDFS.NAMESPACE + "range";

	/**
	 * Resource
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#Resource}.
	 * <p>
	 * The class resource, everything.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#Resource">Resource</a>
	 */
	public static final String Resource = RDFS.NAMESPACE + "Resource";

	/**
	 * seeAlso
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#seeAlso}.
	 * <p>
	 * Further information about the subject resource.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#seeAlso">seeAlso</a>
	 */
	public static final String seeAlso = RDFS.NAMESPACE + "seeAlso";

	/**
	 * subClassOf
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#subClassOf}.
	 * <p>
	 * The subject is a subclass of a class.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#subClassOf">subClassOf</a>
	 */
	public static final String subClassOf = RDFS.NAMESPACE + "subClassOf";

	/**
	 * subPropertyOf
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#subPropertyOf}.
	 * <p>
	 * The subject is a subproperty of a property.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#subPropertyOf">subPropertyOf</a>
	 */
	public static final String subPropertyOf = RDFS.NAMESPACE + "subPropertyOf";

	/**
	 * Class
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#Class}.
	 * <p>
	 * The class of classes.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#Class">Class</a>
	 */
	public static final URI Class_URI;

	/**
	 * comment
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#comment}.
	 * <p>
	 * A description of the subject resource.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#comment">comment</a>
	 */
	public static final URI comment_URI;

	/**
	 * Container
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#Container}.
	 * <p>
	 * The class of RDF containers.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#Container">Container</a>
	 */
	public static final URI Container_URI;

	/**
	 * ContainerMembershipProperty
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#ContainerMembershipProperty}.
	 * <p>
	 * The class of container membership properties, rdf:_1, rdf:_2, ..., all
	 * of which are sub-properties of 'member'.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#ContainerMembershipProperty">ContainerMembershipProperty</a>
	 */
	public static final URI ContainerMembershipProperty_URI;

	/**
	 * Datatype
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#Datatype}.
	 * <p>
	 * The class of RDF datatypes.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#Datatype">Datatype</a>
	 */
	public static final URI Datatype_URI;

	/**
	 * domain
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#domain}.
	 * <p>
	 * A domain of the subject property.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#domain">domain</a>
	 */
	public static final URI domain_URI;

	/**
	 * isDefinedBy
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#isDefinedBy}.
	 * <p>
	 * The defininition of the subject resource.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#isDefinedBy">isDefinedBy</a>
	 */
	public static final URI isDefinedBy_URI;

	/**
	 * label
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#label}.
	 * <p>
	 * A human-readable name for the subject.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#label">label</a>
	 */
	public static final URI label_URI;

	/**
	 * Literal
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#Literal}.
	 * <p>
	 * The class of literal values, eg. textual strings and integers.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#Literal">Literal</a>
	 */
	public static final URI Literal_URI;

	/**
	 * member
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#member}.
	 * <p>
	 * A member of the subject resource.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#member">member</a>
	 */
	public static final URI member_URI;

	/**
	 * range
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#range}.
	 * <p>
	 * A range of the subject property.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#range">range</a>
	 */
	public static final URI range_URI;

	/**
	 * Resource
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#Resource}.
	 * <p>
	 * The class resource, everything.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#Resource">Resource</a>
	 */
	public static final URI Resource_URI;

	/**
	 * seeAlso
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#seeAlso}.
	 * <p>
	 * Further information about the subject resource.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#seeAlso">seeAlso</a>
	 */
	public static final URI seeAlso_URI;

	/**
	 * subClassOf
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#subClassOf}.
	 * <p>
	 * The subject is a subclass of a class.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#subClassOf">subClassOf</a>
	 */
	public static final URI subClassOf_URI;

	/**
	 * subPropertyOf
	 * <p>
	 * {@code http://www.w3.org/2000/01/rdf-schema#subPropertyOf}.
	 * <p>
	 * The subject is a subproperty of a property.
	 *
	 * @see <a href="http://www.w3.org/2000/01/rdf-schema#subPropertyOf">subPropertyOf</a>
	 */
	public static final URI subPropertyOf_URI;

	static {
		ValueFactory factory = ValueFactoryImpl.getInstance();

		Class_URI = factory.createURI(RDFS.NAMESPACE, "Class");
		comment_URI = factory.createURI(RDFS.NAMESPACE, "comment");
		Container_URI = factory.createURI(RDFS.NAMESPACE, "Container");
		ContainerMembershipProperty_URI = factory.createURI(RDFS.NAMESPACE, "ContainerMembershipProperty");
		Datatype_URI = factory.createURI(RDFS.NAMESPACE, "Datatype");
		domain_URI = factory.createURI(RDFS.NAMESPACE, "domain");
		isDefinedBy_URI = factory.createURI(RDFS.NAMESPACE, "isDefinedBy");
		label_URI = factory.createURI(RDFS.NAMESPACE, "label");
		Literal_URI = factory.createURI(RDFS.NAMESPACE, "Literal");
		member_URI = factory.createURI(RDFS.NAMESPACE, "member");
		range_URI = factory.createURI(RDFS.NAMESPACE, "range");
		Resource_URI = factory.createURI(RDFS.NAMESPACE, "Resource");
		seeAlso_URI = factory.createURI(RDFS.NAMESPACE, "seeAlso");
		subClassOf_URI = factory.createURI(RDFS.NAMESPACE, "subClassOf");
		subPropertyOf_URI = factory.createURI(RDFS.NAMESPACE, "subPropertyOf");
	}

	private RDFS() {
		//static access only
	}

}
