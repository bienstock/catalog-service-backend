package org.apache.marmotta.knowledge.vis.ns;

import org.openrdf.model.URI;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.ValueFactoryImpl;

/**
 * Namespace OWL.
 * Prefix: {@code <http://www.w3.org/2002/07/owl#>}
 */
public class OWL {

	/** {@code http://www.w3.org/2002/07/owl#} **/
	public static final String NAMESPACE = "http://www.w3.org/2002/07/owl#";

	/** {@code owl} **/
	public static final String PREFIX = "owl";

	/**
	 * AllDifferent
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#AllDifferent}.
	 * <p>
	 * The class of collections of pairwise different individuals.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#AllDifferent">AllDifferent</a>
	 */
	public static final String AllDifferent = OWL.NAMESPACE + "AllDifferent";

	/**
	 * AllDisjointClasses
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#AllDisjointClasses}.
	 * <p>
	 * The class of collections of pairwise disjoint classes.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#AllDisjointClasses">AllDisjointClasses</a>
	 */
	public static final String AllDisjointClasses = OWL.NAMESPACE + "AllDisjointClasses";

	/**
	 * AllDisjointProperties
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#AllDisjointProperties}.
	 * <p>
	 * The class of collections of pairwise disjoint properties.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#AllDisjointProperties">AllDisjointProperties</a>
	 */
	public static final String AllDisjointProperties = OWL.NAMESPACE + "AllDisjointProperties";

	/**
	 * allValuesFrom
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#allValuesFrom}.
	 * <p>
	 * The property that determines the class that a universal property
	 * restriction refers to.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#allValuesFrom">allValuesFrom</a>
	 */
	public static final String allValuesFrom = OWL.NAMESPACE + "allValuesFrom";

	/**
	 * annotatedProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#annotatedProperty}.
	 * <p>
	 * The property that determines the predicate of an annotated axiom or
	 * annotated annotation.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#annotatedProperty">annotatedProperty</a>
	 */
	public static final String annotatedProperty = OWL.NAMESPACE + "annotatedProperty";

	/**
	 * annotatedSource
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#annotatedSource}.
	 * <p>
	 * The property that determines the subject of an annotated axiom or
	 * annotated annotation.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#annotatedSource">annotatedSource</a>
	 */
	public static final String annotatedSource = OWL.NAMESPACE + "annotatedSource";

	/**
	 * annotatedTarget
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#annotatedTarget}.
	 * <p>
	 * The property that determines the object of an annotated axiom or
	 * annotated annotation.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#annotatedTarget">annotatedTarget</a>
	 */
	public static final String annotatedTarget = OWL.NAMESPACE + "annotatedTarget";

	/**
	 * Annotation
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#Annotation}.
	 * <p>
	 * The class of annotated annotations for which the RDF serialization
	 * consists of an annotated subject, predicate and object.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#Annotation">Annotation</a>
	 */
	public static final String Annotation = OWL.NAMESPACE + "Annotation";

	/**
	 * AnnotationProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#AnnotationProperty}.
	 * <p>
	 * The class of annotation properties.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#AnnotationProperty">AnnotationProperty</a>
	 */
	public static final String AnnotationProperty = OWL.NAMESPACE + "AnnotationProperty";

	/**
	 * assertionProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#assertionProperty}.
	 * <p>
	 * The property that determines the predicate of a negative property
	 * assertion.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#assertionProperty">assertionProperty</a>
	 */
	public static final String assertionProperty = OWL.NAMESPACE + "assertionProperty";

	/**
	 * AsymmetricProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#AsymmetricProperty}.
	 * <p>
	 * The class of asymmetric properties.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#AsymmetricProperty">AsymmetricProperty</a>
	 */
	public static final String AsymmetricProperty = OWL.NAMESPACE + "AsymmetricProperty";

	/**
	 * Axiom
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#Axiom}.
	 * <p>
	 * The class of annotated axioms for which the RDF serialization consists
	 * of an annotated subject, predicate and object.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#Axiom">Axiom</a>
	 */
	public static final String Axiom = OWL.NAMESPACE + "Axiom";

	/**
	 * backwardCompatibleWith
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#backwardCompatibleWith}.
	 * <p>
	 * The annotation property that indicates that a given ontology is
	 * backward compatible with another ontology.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#backwardCompatibleWith">backwardCompatibleWith</a>
	 */
	public static final String backwardCompatibleWith = OWL.NAMESPACE + "backwardCompatibleWith";

	/**
	 * bottomDataProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#bottomDataProperty}.
	 * <p>
	 * The data property that does not relate any individual to any data
	 * value.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#bottomDataProperty">bottomDataProperty</a>
	 */
	public static final String bottomDataProperty = OWL.NAMESPACE + "bottomDataProperty";

	/**
	 * bottomObjectProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#bottomObjectProperty}.
	 * <p>
	 * The object property that does not relate any two individuals.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#bottomObjectProperty">bottomObjectProperty</a>
	 */
	public static final String bottomObjectProperty = OWL.NAMESPACE + "bottomObjectProperty";

	/**
	 * cardinality
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#cardinality}.
	 * <p>
	 * The property that determines the cardinality of an exact cardinality
	 * restriction.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#cardinality">cardinality</a>
	 */
	public static final String cardinality = OWL.NAMESPACE + "cardinality";

	/**
	 * Class
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#Class}.
	 * <p>
	 * The class of OWL classes.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#Class">Class</a>
	 */
	public static final String Class = OWL.NAMESPACE + "Class";

	/**
	 * complementOf
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#complementOf}.
	 * <p>
	 * The property that determines that a given class is the complement of
	 * another class.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#complementOf">complementOf</a>
	 */
	public static final String complementOf = OWL.NAMESPACE + "complementOf";

	/**
	 * DataRange
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#DataRange}.
	 * <p>
	 * The class of OWL data ranges, which are special kinds of datatypes.
	 * Note: The use of the IRI owl:DataRange has been deprecated as of OWL
	 * 2. The IRI rdfs:Datatype SHOULD be used instead.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#DataRange">DataRange</a>
	 */
	public static final String DataRange = OWL.NAMESPACE + "DataRange";

	/**
	 * datatypeComplementOf
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#datatypeComplementOf}.
	 * <p>
	 * The property that determines that a given data range is the complement
	 * of another data range with respect to the data domain.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#datatypeComplementOf">datatypeComplementOf</a>
	 */
	public static final String datatypeComplementOf = OWL.NAMESPACE + "datatypeComplementOf";

	/**
	 * DatatypeProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#DatatypeProperty}.
	 * <p>
	 * The class of data properties.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#DatatypeProperty">DatatypeProperty</a>
	 */
	public static final String DatatypeProperty = OWL.NAMESPACE + "DatatypeProperty";

	/**
	 * deprecated
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#deprecated}.
	 * <p>
	 * The annotation property that indicates that a given entity has been
	 * deprecated.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#deprecated">deprecated</a>
	 */
	public static final String deprecated = OWL.NAMESPACE + "deprecated";

	/**
	 * DeprecatedClass
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#DeprecatedClass}.
	 * <p>
	 * The class of deprecated classes.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#DeprecatedClass">DeprecatedClass</a>
	 */
	public static final String DeprecatedClass = OWL.NAMESPACE + "DeprecatedClass";

	/**
	 * DeprecatedProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#DeprecatedProperty}.
	 * <p>
	 * The class of deprecated properties.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#DeprecatedProperty">DeprecatedProperty</a>
	 */
	public static final String DeprecatedProperty = OWL.NAMESPACE + "DeprecatedProperty";

	/**
	 * differentFrom
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#differentFrom}.
	 * <p>
	 * The property that determines that two given individuals are different.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#differentFrom">differentFrom</a>
	 */
	public static final String differentFrom = OWL.NAMESPACE + "differentFrom";

	/**
	 * disjointUnionOf
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#disjointUnionOf}.
	 * <p>
	 * The property that determines that a given class is equivalent to the
	 * disjoint union of a collection of other classes.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#disjointUnionOf">disjointUnionOf</a>
	 */
	public static final String disjointUnionOf = OWL.NAMESPACE + "disjointUnionOf";

	/**
	 * disjointWith
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#disjointWith}.
	 * <p>
	 * The property that determines that two given classes are disjoint.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#disjointWith">disjointWith</a>
	 */
	public static final String disjointWith = OWL.NAMESPACE + "disjointWith";

	/**
	 * distinctMembers
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#distinctMembers}.
	 * <p>
	 * The property that determines the collection of pairwise different
	 * individuals in a owl:AllDifferent axiom.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#distinctMembers">distinctMembers</a>
	 */
	public static final String distinctMembers = OWL.NAMESPACE + "distinctMembers";

	/**
	 * equivalentClass
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#equivalentClass}.
	 * <p>
	 * The property that determines that two given classes are equivalent,
	 * and that is used to specify datatype definitions.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#equivalentClass">equivalentClass</a>
	 */
	public static final String equivalentClass = OWL.NAMESPACE + "equivalentClass";

	/**
	 * equivalentProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#equivalentProperty}.
	 * <p>
	 * The property that determines that two given properties are equivalent.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#equivalentProperty">equivalentProperty</a>
	 */
	public static final String equivalentProperty = OWL.NAMESPACE + "equivalentProperty";

	/**
	 * FunctionalProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#FunctionalProperty}.
	 * <p>
	 * The class of functional properties.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#FunctionalProperty">FunctionalProperty</a>
	 */
	public static final String FunctionalProperty = OWL.NAMESPACE + "FunctionalProperty";

	/**
	 * hasKey
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#hasKey}.
	 * <p>
	 * The property that determines the collection of properties that jointly
	 * build a key.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#hasKey">hasKey</a>
	 */
	public static final String hasKey = OWL.NAMESPACE + "hasKey";

	/**
	 * hasSelf
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#hasSelf}.
	 * <p>
	 * The property that determines the property that a self restriction
	 * refers to.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#hasSelf">hasSelf</a>
	 */
	public static final String hasSelf = OWL.NAMESPACE + "hasSelf";

	/**
	 * hasValue
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#hasValue}.
	 * <p>
	 * The property that determines the individual that a has-value
	 * restriction refers to.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#hasValue">hasValue</a>
	 */
	public static final String hasValue = OWL.NAMESPACE + "hasValue";

	/**
	 * imports
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#imports}.
	 * <p>
	 * The property that is used for importing other ontologies into a given
	 * ontology.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#imports">imports</a>
	 */
	public static final String imports = OWL.NAMESPACE + "imports";

	/**
	 * incompatibleWith
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#incompatibleWith}.
	 * <p>
	 * The annotation property that indicates that a given ontology is
	 * incompatible with another ontology.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#incompatibleWith">incompatibleWith</a>
	 */
	public static final String incompatibleWith = OWL.NAMESPACE + "incompatibleWith";

	/**
	 * intersectionOf
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#intersectionOf}.
	 * <p>
	 * The property that determines the collection of classes or data ranges
	 * that build an intersection.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#intersectionOf">intersectionOf</a>
	 */
	public static final String intersectionOf = OWL.NAMESPACE + "intersectionOf";

	/**
	 * InverseFunctionalProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#InverseFunctionalProperty}.
	 * <p>
	 * The class of inverse-functional properties.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#InverseFunctionalProperty">InverseFunctionalProperty</a>
	 */
	public static final String InverseFunctionalProperty = OWL.NAMESPACE + "InverseFunctionalProperty";

	/**
	 * inverseOf
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#inverseOf}.
	 * <p>
	 * The property that determines that two given properties are inverse.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#inverseOf">inverseOf</a>
	 */
	public static final String inverseOf = OWL.NAMESPACE + "inverseOf";

	/**
	 * IrreflexiveProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#IrreflexiveProperty}.
	 * <p>
	 * The class of irreflexive properties.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#IrreflexiveProperty">IrreflexiveProperty</a>
	 */
	public static final String IrreflexiveProperty = OWL.NAMESPACE + "IrreflexiveProperty";

	/**
	 * maxCardinality
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#maxCardinality}.
	 * <p>
	 * The property that determines the cardinality of a maximum cardinality
	 * restriction.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#maxCardinality">maxCardinality</a>
	 */
	public static final String maxCardinality = OWL.NAMESPACE + "maxCardinality";

	/**
	 * maxQualifiedCardinality
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#maxQualifiedCardinality}.
	 * <p>
	 * The property that determines the cardinality of a maximum qualified
	 * cardinality restriction.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#maxQualifiedCardinality">maxQualifiedCardinality</a>
	 */
	public static final String maxQualifiedCardinality = OWL.NAMESPACE + "maxQualifiedCardinality";

	/**
	 * members
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#members}.
	 * <p>
	 * The property that determines the collection of members in either a
	 * owl:AllDifferent, owl:AllDisjointClasses or owl:AllDisjointProperties
	 * axiom.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#members">members</a>
	 */
	public static final String members = OWL.NAMESPACE + "members";

	/**
	 * minCardinality
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#minCardinality}.
	 * <p>
	 * The property that determines the cardinality of a minimum cardinality
	 * restriction.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#minCardinality">minCardinality</a>
	 */
	public static final String minCardinality = OWL.NAMESPACE + "minCardinality";

	/**
	 * minQualifiedCardinality
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#minQualifiedCardinality}.
	 * <p>
	 * The property that determines the cardinality of a minimum qualified
	 * cardinality restriction.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#minQualifiedCardinality">minQualifiedCardinality</a>
	 */
	public static final String minQualifiedCardinality = OWL.NAMESPACE + "minQualifiedCardinality";

	/**
	 * NamedIndividual
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#NamedIndividual}.
	 * <p>
	 * The class of named individuals.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#NamedIndividual">NamedIndividual</a>
	 */
	public static final String NamedIndividual = OWL.NAMESPACE + "NamedIndividual";

	/**
	 * NegativePropertyAssertion
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#NegativePropertyAssertion}.
	 * <p>
	 * The class of negative property assertions.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#NegativePropertyAssertion">NegativePropertyAssertion</a>
	 */
	public static final String NegativePropertyAssertion = OWL.NAMESPACE + "NegativePropertyAssertion";

	/**
	 * Nothing
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#Nothing}.
	 * <p>
	 * This is the empty class.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#Nothing">Nothing</a>
	 */
	public static final String Nothing = OWL.NAMESPACE + "Nothing";

	/**
	 * ObjectProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#ObjectProperty}.
	 * <p>
	 * The class of object properties.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#ObjectProperty">ObjectProperty</a>
	 */
	public static final String ObjectProperty = OWL.NAMESPACE + "ObjectProperty";

	/**
	 * onClass
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#onClass}.
	 * <p>
	 * The property that determines the class that a qualified object
	 * cardinality restriction refers to.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#onClass">onClass</a>
	 */
	public static final String onClass = OWL.NAMESPACE + "onClass";

	/**
	 * onDataRange
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#onDataRange}.
	 * <p>
	 * The property that determines the data range that a qualified data
	 * cardinality restriction refers to.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#onDataRange">onDataRange</a>
	 */
	public static final String onDataRange = OWL.NAMESPACE + "onDataRange";

	/**
	 * onDatatype
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#onDatatype}.
	 * <p>
	 * The property that determines the datatype that a datatype restriction
	 * refers to.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#onDatatype">onDatatype</a>
	 */
	public static final String onDatatype = OWL.NAMESPACE + "onDatatype";

	/**
	 * oneOf
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#oneOf}.
	 * <p>
	 * The property that determines the collection of individuals or data
	 * values that build an enumeration.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#oneOf">oneOf</a>
	 */
	public static final String oneOf = OWL.NAMESPACE + "oneOf";

	/**
	 * onProperties
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#onProperties}.
	 * <p>
	 * The property that determines the n-tuple of properties that a property
	 * restriction on an n-ary data range refers to.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#onProperties">onProperties</a>
	 */
	public static final String onProperties = OWL.NAMESPACE + "onProperties";

	/**
	 * onProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#onProperty}.
	 * <p>
	 * The property that determines the property that a property restriction
	 * refers to.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#onProperty">onProperty</a>
	 */
	public static final String onProperty = OWL.NAMESPACE + "onProperty";

	/**
	 * Ontology
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#Ontology}.
	 * <p>
	 * The class of ontologies.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#Ontology">Ontology</a>
	 */
	public static final String Ontology = OWL.NAMESPACE + "Ontology";

	/**
	 * OntologyProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#OntologyProperty}.
	 * <p>
	 * The class of ontology properties.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#OntologyProperty">OntologyProperty</a>
	 */
	public static final String OntologyProperty = OWL.NAMESPACE + "OntologyProperty";

	/**
	 * priorVersion
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#priorVersion}.
	 * <p>
	 * The annotation property that indicates the predecessor ontology of a
	 * given ontology.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#priorVersion">priorVersion</a>
	 */
	public static final String priorVersion = OWL.NAMESPACE + "priorVersion";

	/**
	 * propertyChainAxiom
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#propertyChainAxiom}.
	 * <p>
	 * The property that determines the n-tuple of properties that build a
	 * sub property chain of a given property.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#propertyChainAxiom">propertyChainAxiom</a>
	 */
	public static final String propertyChainAxiom = OWL.NAMESPACE + "propertyChainAxiom";

	/**
	 * propertyDisjointWith
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#propertyDisjointWith}.
	 * <p>
	 * The property that determines that two given properties are disjoint.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#propertyDisjointWith">propertyDisjointWith</a>
	 */
	public static final String propertyDisjointWith = OWL.NAMESPACE + "propertyDisjointWith";

	/**
	 * qualifiedCardinality
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#qualifiedCardinality}.
	 * <p>
	 * The property that determines the cardinality of an exact qualified
	 * cardinality restriction.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#qualifiedCardinality">qualifiedCardinality</a>
	 */
	public static final String qualifiedCardinality = OWL.NAMESPACE + "qualifiedCardinality";

	/**
	 * ReflexiveProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#ReflexiveProperty}.
	 * <p>
	 * The class of reflexive properties.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#ReflexiveProperty">ReflexiveProperty</a>
	 */
	public static final String ReflexiveProperty = OWL.NAMESPACE + "ReflexiveProperty";

	/**
	 * Restriction
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#Restriction}.
	 * <p>
	 * The class of property restrictions.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#Restriction">Restriction</a>
	 */
	public static final String Restriction = OWL.NAMESPACE + "Restriction";

	/**
	 * sameAs
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#sameAs}.
	 * <p>
	 * The property that determines that two given individuals are equal.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#sameAs">sameAs</a>
	 */
	public static final String sameAs = OWL.NAMESPACE + "sameAs";

	/**
	 * someValuesFrom
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#someValuesFrom}.
	 * <p>
	 * The property that determines the class that an existential property
	 * restriction refers to.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#someValuesFrom">someValuesFrom</a>
	 */
	public static final String someValuesFrom = OWL.NAMESPACE + "someValuesFrom";

	/**
	 * sourceIndividual
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#sourceIndividual}.
	 * <p>
	 * The property that determines the subject of a negative property
	 * assertion.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#sourceIndividual">sourceIndividual</a>
	 */
	public static final String sourceIndividual = OWL.NAMESPACE + "sourceIndividual";

	/**
	 * SymmetricProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#SymmetricProperty}.
	 * <p>
	 * The class of symmetric properties.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#SymmetricProperty">SymmetricProperty</a>
	 */
	public static final String SymmetricProperty = OWL.NAMESPACE + "SymmetricProperty";

	/**
	 * targetIndividual
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#targetIndividual}.
	 * <p>
	 * The property that determines the object of a negative object property
	 * assertion.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#targetIndividual">targetIndividual</a>
	 */
	public static final String targetIndividual = OWL.NAMESPACE + "targetIndividual";

	/**
	 * targetValue
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#targetValue}.
	 * <p>
	 * The property that determines the value of a negative data property
	 * assertion.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#targetValue">targetValue</a>
	 */
	public static final String targetValue = OWL.NAMESPACE + "targetValue";

	/**
	 * Thing
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#Thing}.
	 * <p>
	 * The class of OWL individuals.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#Thing">Thing</a>
	 */
	public static final String Thing = OWL.NAMESPACE + "Thing";

	/**
	 * topDataProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#topDataProperty}.
	 * <p>
	 * The data property that relates every individual to every data value.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#topDataProperty">topDataProperty</a>
	 */
	public static final String topDataProperty = OWL.NAMESPACE + "topDataProperty";

	/**
	 * topObjectProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#topObjectProperty}.
	 * <p>
	 * The object property that relates every two individuals.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#topObjectProperty">topObjectProperty</a>
	 */
	public static final String topObjectProperty = OWL.NAMESPACE + "topObjectProperty";

	/**
	 * TransitiveProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#TransitiveProperty}.
	 * <p>
	 * The class of transitive properties.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#TransitiveProperty">TransitiveProperty</a>
	 */
	public static final String TransitiveProperty = OWL.NAMESPACE + "TransitiveProperty";

	/**
	 * unionOf
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#unionOf}.
	 * <p>
	 * The property that determines the collection of classes or data ranges
	 * that build a union.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#unionOf">unionOf</a>
	 */
	public static final String unionOf = OWL.NAMESPACE + "unionOf";

	/**
	 * versionInfo
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#versionInfo}.
	 * <p>
	 * The annotation property that provides version information for an
	 * ontology or another OWL construct.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#versionInfo">versionInfo</a>
	 */
	public static final String versionInfo = OWL.NAMESPACE + "versionInfo";

	/**
	 * versionIRI
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#versionIRI}.
	 * <p>
	 * The property that identifies the version IRI of an ontology.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#versionIRI">versionIRI</a>
	 */
	public static final String versionIRI = OWL.NAMESPACE + "versionIRI";

	/**
	 * withRestrictions
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#withRestrictions}.
	 * <p>
	 * The property that determines the collection of facet-value pairs that
	 * define a datatype restriction.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#withRestrictions">withRestrictions</a>
	 */
	public static final String withRestrictions = OWL.NAMESPACE + "withRestrictions";

	/**
	 * AllDifferent
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#AllDifferent}.
	 * <p>
	 * The class of collections of pairwise different individuals.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#AllDifferent">AllDifferent</a>
	 */
	public static final URI AllDifferent_URI;

	/**
	 * AllDisjointClasses
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#AllDisjointClasses}.
	 * <p>
	 * The class of collections of pairwise disjoint classes.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#AllDisjointClasses">AllDisjointClasses</a>
	 */
	public static final URI AllDisjointClasses_URI;

	/**
	 * AllDisjointProperties
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#AllDisjointProperties}.
	 * <p>
	 * The class of collections of pairwise disjoint properties.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#AllDisjointProperties">AllDisjointProperties</a>
	 */
	public static final URI AllDisjointProperties_URI;

	/**
	 * allValuesFrom
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#allValuesFrom}.
	 * <p>
	 * The property that determines the class that a universal property
	 * restriction refers to.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#allValuesFrom">allValuesFrom</a>
	 */
	public static final URI allValuesFrom_URI;

	/**
	 * annotatedProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#annotatedProperty}.
	 * <p>
	 * The property that determines the predicate of an annotated axiom or
	 * annotated annotation.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#annotatedProperty">annotatedProperty</a>
	 */
	public static final URI annotatedProperty_URI;

	/**
	 * annotatedSource
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#annotatedSource}.
	 * <p>
	 * The property that determines the subject of an annotated axiom or
	 * annotated annotation.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#annotatedSource">annotatedSource</a>
	 */
	public static final URI annotatedSource_URI;

	/**
	 * annotatedTarget
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#annotatedTarget}.
	 * <p>
	 * The property that determines the object of an annotated axiom or
	 * annotated annotation.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#annotatedTarget">annotatedTarget</a>
	 */
	public static final URI annotatedTarget_URI;

	/**
	 * Annotation
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#Annotation}.
	 * <p>
	 * The class of annotated annotations for which the RDF serialization
	 * consists of an annotated subject, predicate and object.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#Annotation">Annotation</a>
	 */
	public static final URI Annotation_URI;

	/**
	 * AnnotationProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#AnnotationProperty}.
	 * <p>
	 * The class of annotation properties.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#AnnotationProperty">AnnotationProperty</a>
	 */
	public static final URI AnnotationProperty_URI;

	/**
	 * assertionProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#assertionProperty}.
	 * <p>
	 * The property that determines the predicate of a negative property
	 * assertion.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#assertionProperty">assertionProperty</a>
	 */
	public static final URI assertionProperty_URI;

	/**
	 * AsymmetricProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#AsymmetricProperty}.
	 * <p>
	 * The class of asymmetric properties.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#AsymmetricProperty">AsymmetricProperty</a>
	 */
	public static final URI AsymmetricProperty_URI;

	/**
	 * Axiom
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#Axiom}.
	 * <p>
	 * The class of annotated axioms for which the RDF serialization consists
	 * of an annotated subject, predicate and object.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#Axiom">Axiom</a>
	 */
	public static final URI Axiom_URI;

	/**
	 * backwardCompatibleWith
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#backwardCompatibleWith}.
	 * <p>
	 * The annotation property that indicates that a given ontology is
	 * backward compatible with another ontology.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#backwardCompatibleWith">backwardCompatibleWith</a>
	 */
	public static final URI backwardCompatibleWith_URI;

	/**
	 * bottomDataProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#bottomDataProperty}.
	 * <p>
	 * The data property that does not relate any individual to any data
	 * value.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#bottomDataProperty">bottomDataProperty</a>
	 */
	public static final URI bottomDataProperty_URI;

	/**
	 * bottomObjectProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#bottomObjectProperty}.
	 * <p>
	 * The object property that does not relate any two individuals.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#bottomObjectProperty">bottomObjectProperty</a>
	 */
	public static final URI bottomObjectProperty_URI;

	/**
	 * cardinality
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#cardinality}.
	 * <p>
	 * The property that determines the cardinality of an exact cardinality
	 * restriction.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#cardinality">cardinality</a>
	 */
	public static final URI cardinality_URI;

	/**
	 * Class
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#Class}.
	 * <p>
	 * The class of OWL classes.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#Class">Class</a>
	 */
	public static final URI Class_URI;

	/**
	 * complementOf
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#complementOf}.
	 * <p>
	 * The property that determines that a given class is the complement of
	 * another class.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#complementOf">complementOf</a>
	 */
	public static final URI complementOf_URI;

	/**
	 * DataRange
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#DataRange}.
	 * <p>
	 * The class of OWL data ranges, which are special kinds of datatypes.
	 * Note: The use of the IRI owl:DataRange has been deprecated as of OWL
	 * 2. The IRI rdfs:Datatype SHOULD be used instead.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#DataRange">DataRange</a>
	 */
	public static final URI DataRange_URI;

	/**
	 * datatypeComplementOf
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#datatypeComplementOf}.
	 * <p>
	 * The property that determines that a given data range is the complement
	 * of another data range with respect to the data domain.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#datatypeComplementOf">datatypeComplementOf</a>
	 */
	public static final URI datatypeComplementOf_URI;

	/**
	 * DatatypeProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#DatatypeProperty}.
	 * <p>
	 * The class of data properties.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#DatatypeProperty">DatatypeProperty</a>
	 */
	public static final URI DatatypeProperty_URI;

	/**
	 * deprecated
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#deprecated}.
	 * <p>
	 * The annotation property that indicates that a given entity has been
	 * deprecated.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#deprecated">deprecated</a>
	 */
	public static final URI deprecated_URI;

	/**
	 * DeprecatedClass
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#DeprecatedClass}.
	 * <p>
	 * The class of deprecated classes.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#DeprecatedClass">DeprecatedClass</a>
	 */
	public static final URI DeprecatedClass_URI;

	/**
	 * DeprecatedProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#DeprecatedProperty}.
	 * <p>
	 * The class of deprecated properties.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#DeprecatedProperty">DeprecatedProperty</a>
	 */
	public static final URI DeprecatedProperty_URI;

	/**
	 * differentFrom
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#differentFrom}.
	 * <p>
	 * The property that determines that two given individuals are different.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#differentFrom">differentFrom</a>
	 */
	public static final URI differentFrom_URI;

	/**
	 * disjointUnionOf
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#disjointUnionOf}.
	 * <p>
	 * The property that determines that a given class is equivalent to the
	 * disjoint union of a collection of other classes.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#disjointUnionOf">disjointUnionOf</a>
	 */
	public static final URI disjointUnionOf_URI;

	/**
	 * disjointWith
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#disjointWith}.
	 * <p>
	 * The property that determines that two given classes are disjoint.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#disjointWith">disjointWith</a>
	 */
	public static final URI disjointWith_URI;

	/**
	 * distinctMembers
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#distinctMembers}.
	 * <p>
	 * The property that determines the collection of pairwise different
	 * individuals in a owl:AllDifferent axiom.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#distinctMembers">distinctMembers</a>
	 */
	public static final URI distinctMembers_URI;

	/**
	 * equivalentClass
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#equivalentClass}.
	 * <p>
	 * The property that determines that two given classes are equivalent,
	 * and that is used to specify datatype definitions.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#equivalentClass">equivalentClass</a>
	 */
	public static final URI equivalentClass_URI;

	/**
	 * equivalentProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#equivalentProperty}.
	 * <p>
	 * The property that determines that two given properties are equivalent.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#equivalentProperty">equivalentProperty</a>
	 */
	public static final URI equivalentProperty_URI;

	/**
	 * FunctionalProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#FunctionalProperty}.
	 * <p>
	 * The class of functional properties.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#FunctionalProperty">FunctionalProperty</a>
	 */
	public static final URI FunctionalProperty_URI;

	/**
	 * hasKey
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#hasKey}.
	 * <p>
	 * The property that determines the collection of properties that jointly
	 * build a key.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#hasKey">hasKey</a>
	 */
	public static final URI hasKey_URI;

	/**
	 * hasSelf
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#hasSelf}.
	 * <p>
	 * The property that determines the property that a self restriction
	 * refers to.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#hasSelf">hasSelf</a>
	 */
	public static final URI hasSelf_URI;

	/**
	 * hasValue
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#hasValue}.
	 * <p>
	 * The property that determines the individual that a has-value
	 * restriction refers to.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#hasValue">hasValue</a>
	 */
	public static final URI hasValue_URI;

	/**
	 * imports
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#imports}.
	 * <p>
	 * The property that is used for importing other ontologies into a given
	 * ontology.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#imports">imports</a>
	 */
	public static final URI imports_URI;

	/**
	 * incompatibleWith
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#incompatibleWith}.
	 * <p>
	 * The annotation property that indicates that a given ontology is
	 * incompatible with another ontology.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#incompatibleWith">incompatibleWith</a>
	 */
	public static final URI incompatibleWith_URI;

	/**
	 * intersectionOf
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#intersectionOf}.
	 * <p>
	 * The property that determines the collection of classes or data ranges
	 * that build an intersection.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#intersectionOf">intersectionOf</a>
	 */
	public static final URI intersectionOf_URI;

	/**
	 * InverseFunctionalProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#InverseFunctionalProperty}.
	 * <p>
	 * The class of inverse-functional properties.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#InverseFunctionalProperty">InverseFunctionalProperty</a>
	 */
	public static final URI InverseFunctionalProperty_URI;

	/**
	 * inverseOf
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#inverseOf}.
	 * <p>
	 * The property that determines that two given properties are inverse.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#inverseOf">inverseOf</a>
	 */
	public static final URI inverseOf_URI;

	/**
	 * IrreflexiveProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#IrreflexiveProperty}.
	 * <p>
	 * The class of irreflexive properties.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#IrreflexiveProperty">IrreflexiveProperty</a>
	 */
	public static final URI IrreflexiveProperty_URI;

	/**
	 * maxCardinality
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#maxCardinality}.
	 * <p>
	 * The property that determines the cardinality of a maximum cardinality
	 * restriction.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#maxCardinality">maxCardinality</a>
	 */
	public static final URI maxCardinality_URI;

	/**
	 * maxQualifiedCardinality
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#maxQualifiedCardinality}.
	 * <p>
	 * The property that determines the cardinality of a maximum qualified
	 * cardinality restriction.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#maxQualifiedCardinality">maxQualifiedCardinality</a>
	 */
	public static final URI maxQualifiedCardinality_URI;

	/**
	 * members
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#members}.
	 * <p>
	 * The property that determines the collection of members in either a
	 * owl:AllDifferent, owl:AllDisjointClasses or owl:AllDisjointProperties
	 * axiom.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#members">members</a>
	 */
	public static final URI members_URI;

	/**
	 * minCardinality
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#minCardinality}.
	 * <p>
	 * The property that determines the cardinality of a minimum cardinality
	 * restriction.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#minCardinality">minCardinality</a>
	 */
	public static final URI minCardinality_URI;

	/**
	 * minQualifiedCardinality
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#minQualifiedCardinality}.
	 * <p>
	 * The property that determines the cardinality of a minimum qualified
	 * cardinality restriction.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#minQualifiedCardinality">minQualifiedCardinality</a>
	 */
	public static final URI minQualifiedCardinality_URI;

	/**
	 * NamedIndividual
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#NamedIndividual}.
	 * <p>
	 * The class of named individuals.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#NamedIndividual">NamedIndividual</a>
	 */
	public static final URI NamedIndividual_URI;

	/**
	 * NegativePropertyAssertion
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#NegativePropertyAssertion}.
	 * <p>
	 * The class of negative property assertions.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#NegativePropertyAssertion">NegativePropertyAssertion</a>
	 */
	public static final URI NegativePropertyAssertion_URI;

	/**
	 * Nothing
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#Nothing}.
	 * <p>
	 * This is the empty class.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#Nothing">Nothing</a>
	 */
	public static final URI Nothing_URI;

	/**
	 * ObjectProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#ObjectProperty}.
	 * <p>
	 * The class of object properties.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#ObjectProperty">ObjectProperty</a>
	 */
	public static final URI ObjectProperty_URI;

	/**
	 * onClass
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#onClass}.
	 * <p>
	 * The property that determines the class that a qualified object
	 * cardinality restriction refers to.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#onClass">onClass</a>
	 */
	public static final URI onClass_URI;

	/**
	 * onDataRange
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#onDataRange}.
	 * <p>
	 * The property that determines the data range that a qualified data
	 * cardinality restriction refers to.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#onDataRange">onDataRange</a>
	 */
	public static final URI onDataRange_URI;

	/**
	 * onDatatype
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#onDatatype}.
	 * <p>
	 * The property that determines the datatype that a datatype restriction
	 * refers to.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#onDatatype">onDatatype</a>
	 */
	public static final URI onDatatype_URI;

	/**
	 * oneOf
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#oneOf}.
	 * <p>
	 * The property that determines the collection of individuals or data
	 * values that build an enumeration.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#oneOf">oneOf</a>
	 */
	public static final URI oneOf_URI;

	/**
	 * onProperties
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#onProperties}.
	 * <p>
	 * The property that determines the n-tuple of properties that a property
	 * restriction on an n-ary data range refers to.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#onProperties">onProperties</a>
	 */
	public static final URI onProperties_URI;

	/**
	 * onProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#onProperty}.
	 * <p>
	 * The property that determines the property that a property restriction
	 * refers to.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#onProperty">onProperty</a>
	 */
	public static final URI onProperty_URI;

	/**
	 * Ontology
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#Ontology}.
	 * <p>
	 * The class of ontologies.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#Ontology">Ontology</a>
	 */
	public static final URI Ontology_URI;

	/**
	 * OntologyProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#OntologyProperty}.
	 * <p>
	 * The class of ontology properties.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#OntologyProperty">OntologyProperty</a>
	 */
	public static final URI OntologyProperty_URI;

	/**
	 * priorVersion
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#priorVersion}.
	 * <p>
	 * The annotation property that indicates the predecessor ontology of a
	 * given ontology.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#priorVersion">priorVersion</a>
	 */
	public static final URI priorVersion_URI;

	/**
	 * propertyChainAxiom
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#propertyChainAxiom}.
	 * <p>
	 * The property that determines the n-tuple of properties that build a
	 * sub property chain of a given property.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#propertyChainAxiom">propertyChainAxiom</a>
	 */
	public static final URI propertyChainAxiom_URI;

	/**
	 * propertyDisjointWith
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#propertyDisjointWith}.
	 * <p>
	 * The property that determines that two given properties are disjoint.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#propertyDisjointWith">propertyDisjointWith</a>
	 */
	public static final URI propertyDisjointWith_URI;

	/**
	 * qualifiedCardinality
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#qualifiedCardinality}.
	 * <p>
	 * The property that determines the cardinality of an exact qualified
	 * cardinality restriction.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#qualifiedCardinality">qualifiedCardinality</a>
	 */
	public static final URI qualifiedCardinality_URI;

	/**
	 * ReflexiveProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#ReflexiveProperty}.
	 * <p>
	 * The class of reflexive properties.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#ReflexiveProperty">ReflexiveProperty</a>
	 */
	public static final URI ReflexiveProperty_URI;

	/**
	 * Restriction
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#Restriction}.
	 * <p>
	 * The class of property restrictions.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#Restriction">Restriction</a>
	 */
	public static final URI Restriction_URI;

	/**
	 * sameAs
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#sameAs}.
	 * <p>
	 * The property that determines that two given individuals are equal.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#sameAs">sameAs</a>
	 */
	public static final URI sameAs_URI;

	/**
	 * someValuesFrom
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#someValuesFrom}.
	 * <p>
	 * The property that determines the class that an existential property
	 * restriction refers to.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#someValuesFrom">someValuesFrom</a>
	 */
	public static final URI someValuesFrom_URI;

	/**
	 * sourceIndividual
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#sourceIndividual}.
	 * <p>
	 * The property that determines the subject of a negative property
	 * assertion.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#sourceIndividual">sourceIndividual</a>
	 */
	public static final URI sourceIndividual_URI;

	/**
	 * SymmetricProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#SymmetricProperty}.
	 * <p>
	 * The class of symmetric properties.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#SymmetricProperty">SymmetricProperty</a>
	 */
	public static final URI SymmetricProperty_URI;

	/**
	 * targetIndividual
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#targetIndividual}.
	 * <p>
	 * The property that determines the object of a negative object property
	 * assertion.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#targetIndividual">targetIndividual</a>
	 */
	public static final URI targetIndividual_URI;

	/**
	 * targetValue
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#targetValue}.
	 * <p>
	 * The property that determines the value of a negative data property
	 * assertion.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#targetValue">targetValue</a>
	 */
	public static final URI targetValue_URI;

	/**
	 * Thing
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#Thing}.
	 * <p>
	 * The class of OWL individuals.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#Thing">Thing</a>
	 */
	public static final URI Thing_URI;

	/**
	 * topDataProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#topDataProperty}.
	 * <p>
	 * The data property that relates every individual to every data value.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#topDataProperty">topDataProperty</a>
	 */
	public static final URI topDataProperty_URI;

	/**
	 * topObjectProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#topObjectProperty}.
	 * <p>
	 * The object property that relates every two individuals.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#topObjectProperty">topObjectProperty</a>
	 */
	public static final URI topObjectProperty_URI;

	/**
	 * TransitiveProperty
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#TransitiveProperty}.
	 * <p>
	 * The class of transitive properties.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#TransitiveProperty">TransitiveProperty</a>
	 */
	public static final URI TransitiveProperty_URI;

	/**
	 * unionOf
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#unionOf}.
	 * <p>
	 * The property that determines the collection of classes or data ranges
	 * that build a union.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#unionOf">unionOf</a>
	 */
	public static final URI unionOf_URI;

	/**
	 * versionInfo
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#versionInfo}.
	 * <p>
	 * The annotation property that provides version information for an
	 * ontology or another OWL construct.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#versionInfo">versionInfo</a>
	 */
	public static final URI versionInfo_URI;

	/**
	 * versionIRI
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#versionIRI}.
	 * <p>
	 * The property that identifies the version IRI of an ontology.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#versionIRI">versionIRI</a>
	 */
	public static final URI versionIRI_URI;

	/**
	 * withRestrictions
	 * <p>
	 * {@code http://www.w3.org/2002/07/owl#withRestrictions}.
	 * <p>
	 * The property that determines the collection of facet-value pairs that
	 * define a datatype restriction.
	 *
	 * @see <a href="http://www.w3.org/2002/07/owl#withRestrictions">withRestrictions</a>
	 */
	public static final URI withRestrictions_URI;

	static {
		ValueFactory factory = ValueFactoryImpl.getInstance();

		AllDifferent_URI = factory.createURI(OWL.NAMESPACE, "AllDifferent");
		AllDisjointClasses_URI = factory.createURI(OWL.NAMESPACE, "AllDisjointClasses");
		AllDisjointProperties_URI = factory.createURI(OWL.NAMESPACE, "AllDisjointProperties");
		allValuesFrom_URI = factory.createURI(OWL.NAMESPACE, "allValuesFrom");
		annotatedProperty_URI = factory.createURI(OWL.NAMESPACE, "annotatedProperty");
		annotatedSource_URI = factory.createURI(OWL.NAMESPACE, "annotatedSource");
		annotatedTarget_URI = factory.createURI(OWL.NAMESPACE, "annotatedTarget");
		Annotation_URI = factory.createURI(OWL.NAMESPACE, "Annotation");
		AnnotationProperty_URI = factory.createURI(OWL.NAMESPACE, "AnnotationProperty");
		assertionProperty_URI = factory.createURI(OWL.NAMESPACE, "assertionProperty");
		AsymmetricProperty_URI = factory.createURI(OWL.NAMESPACE, "AsymmetricProperty");
		Axiom_URI = factory.createURI(OWL.NAMESPACE, "Axiom");
		backwardCompatibleWith_URI = factory.createURI(OWL.NAMESPACE, "backwardCompatibleWith");
		bottomDataProperty_URI = factory.createURI(OWL.NAMESPACE, "bottomDataProperty");
		bottomObjectProperty_URI = factory.createURI(OWL.NAMESPACE, "bottomObjectProperty");
		cardinality_URI = factory.createURI(OWL.NAMESPACE, "cardinality");
		Class_URI = factory.createURI(OWL.NAMESPACE, "Class");
		complementOf_URI = factory.createURI(OWL.NAMESPACE, "complementOf");
		DataRange_URI = factory.createURI(OWL.NAMESPACE, "DataRange");
		datatypeComplementOf_URI = factory.createURI(OWL.NAMESPACE, "datatypeComplementOf");
		DatatypeProperty_URI = factory.createURI(OWL.NAMESPACE, "DatatypeProperty");
		deprecated_URI = factory.createURI(OWL.NAMESPACE, "deprecated");
		DeprecatedClass_URI = factory.createURI(OWL.NAMESPACE, "DeprecatedClass");
		DeprecatedProperty_URI = factory.createURI(OWL.NAMESPACE, "DeprecatedProperty");
		differentFrom_URI = factory.createURI(OWL.NAMESPACE, "differentFrom");
		disjointUnionOf_URI = factory.createURI(OWL.NAMESPACE, "disjointUnionOf");
		disjointWith_URI = factory.createURI(OWL.NAMESPACE, "disjointWith");
		distinctMembers_URI = factory.createURI(OWL.NAMESPACE, "distinctMembers");
		equivalentClass_URI = factory.createURI(OWL.NAMESPACE, "equivalentClass");
		equivalentProperty_URI = factory.createURI(OWL.NAMESPACE, "equivalentProperty");
		FunctionalProperty_URI = factory.createURI(OWL.NAMESPACE, "FunctionalProperty");
		hasKey_URI = factory.createURI(OWL.NAMESPACE, "hasKey");
		hasSelf_URI = factory.createURI(OWL.NAMESPACE, "hasSelf");
		hasValue_URI = factory.createURI(OWL.NAMESPACE, "hasValue");
		imports_URI = factory.createURI(OWL.NAMESPACE, "imports");
		incompatibleWith_URI = factory.createURI(OWL.NAMESPACE, "incompatibleWith");
		intersectionOf_URI = factory.createURI(OWL.NAMESPACE, "intersectionOf");
		InverseFunctionalProperty_URI = factory.createURI(OWL.NAMESPACE, "InverseFunctionalProperty");
		inverseOf_URI = factory.createURI(OWL.NAMESPACE, "inverseOf");
		IrreflexiveProperty_URI = factory.createURI(OWL.NAMESPACE, "IrreflexiveProperty");
		maxCardinality_URI = factory.createURI(OWL.NAMESPACE, "maxCardinality");
		maxQualifiedCardinality_URI = factory.createURI(OWL.NAMESPACE, "maxQualifiedCardinality");
		members_URI = factory.createURI(OWL.NAMESPACE, "members");
		minCardinality_URI = factory.createURI(OWL.NAMESPACE, "minCardinality");
		minQualifiedCardinality_URI = factory.createURI(OWL.NAMESPACE, "minQualifiedCardinality");
		NamedIndividual_URI = factory.createURI(OWL.NAMESPACE, "NamedIndividual");
		NegativePropertyAssertion_URI = factory.createURI(OWL.NAMESPACE, "NegativePropertyAssertion");
		Nothing_URI = factory.createURI(OWL.NAMESPACE, "Nothing");
		ObjectProperty_URI = factory.createURI(OWL.NAMESPACE, "ObjectProperty");
		onClass_URI = factory.createURI(OWL.NAMESPACE, "onClass");
		onDataRange_URI = factory.createURI(OWL.NAMESPACE, "onDataRange");
		onDatatype_URI = factory.createURI(OWL.NAMESPACE, "onDatatype");
		oneOf_URI = factory.createURI(OWL.NAMESPACE, "oneOf");
		onProperties_URI = factory.createURI(OWL.NAMESPACE, "onProperties");
		onProperty_URI = factory.createURI(OWL.NAMESPACE, "onProperty");
		Ontology_URI = factory.createURI(OWL.NAMESPACE, "Ontology");
		OntologyProperty_URI = factory.createURI(OWL.NAMESPACE, "OntologyProperty");
		priorVersion_URI = factory.createURI(OWL.NAMESPACE, "priorVersion");
		propertyChainAxiom_URI = factory.createURI(OWL.NAMESPACE, "propertyChainAxiom");
		propertyDisjointWith_URI = factory.createURI(OWL.NAMESPACE, "propertyDisjointWith");
		qualifiedCardinality_URI = factory.createURI(OWL.NAMESPACE, "qualifiedCardinality");
		ReflexiveProperty_URI = factory.createURI(OWL.NAMESPACE, "ReflexiveProperty");
		Restriction_URI = factory.createURI(OWL.NAMESPACE, "Restriction");
		sameAs_URI = factory.createURI(OWL.NAMESPACE, "sameAs");
		someValuesFrom_URI = factory.createURI(OWL.NAMESPACE, "someValuesFrom");
		sourceIndividual_URI = factory.createURI(OWL.NAMESPACE, "sourceIndividual");
		SymmetricProperty_URI = factory.createURI(OWL.NAMESPACE, "SymmetricProperty");
		targetIndividual_URI = factory.createURI(OWL.NAMESPACE, "targetIndividual");
		targetValue_URI = factory.createURI(OWL.NAMESPACE, "targetValue");
		Thing_URI = factory.createURI(OWL.NAMESPACE, "Thing");
		topDataProperty_URI = factory.createURI(OWL.NAMESPACE, "topDataProperty");
		topObjectProperty_URI = factory.createURI(OWL.NAMESPACE, "topObjectProperty");
		TransitiveProperty_URI = factory.createURI(OWL.NAMESPACE, "TransitiveProperty");
		unionOf_URI = factory.createURI(OWL.NAMESPACE, "unionOf");
		versionInfo_URI = factory.createURI(OWL.NAMESPACE, "versionInfo");
		versionIRI_URI = factory.createURI(OWL.NAMESPACE, "versionIRI");
		withRestrictions_URI = factory.createURI(OWL.NAMESPACE, "withRestrictions");
	}

	private OWL() {
		//static access only
	}

}
