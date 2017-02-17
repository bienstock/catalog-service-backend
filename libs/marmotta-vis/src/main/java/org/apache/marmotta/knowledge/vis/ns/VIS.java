package org.apache.marmotta.knowledge.vis.ns;

import org.openrdf.model.URI;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.ValueFactoryImpl;

/**
 * Namespace VIS.
 * Prefix: {@code <http://www.salzburgresearch.at/vis#>}
 */
public class VIS {

	/** {@code http://www.salzburgresearch.at/vis#} **/
	public static final String NAMESPACE = "http://www.salzburgresearch.at/vis#";

	/** {@code vis} **/
	public static final String PREFIX = "vis";

	/**
	 * Checkbox Property
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#CheckboxPropertyType}.
	 * <p>
	 * Used to provide editing helpers
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#CheckboxPropertyType">CheckboxPropertyType</a>
	 */
	public static final String CheckboxPropertyType = VIS.NAMESPACE + "CheckboxPropertyType";

	/**
	 * Color
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#color}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#color">color</a>
	 */
	public static final String color = VIS.NAMESPACE + "color";

	/**
	 * Data Type
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#dataType}.
	 * <p>
	 * The rdf:type(s) to be used when creating the real instance.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#dataType">dataType</a>
	 */
	public static final String dataType = VIS.NAMESPACE + "dataType";

	/**
	 * Data Type
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#DataType}.
	 * <p>
	 * Specifies Data
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#DataType">DataType</a>
	 */
	public static final String DataType = VIS.NAMESPACE + "DataType";

	/**
	 * Date Property
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#DatePropertyType}.
	 * <p>
	 * Used to provide editing helpers
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#DatePropertyType">DatePropertyType</a>
	 */
	public static final String DatePropertyType = VIS.NAMESPACE + "DatePropertyType";

	/**
	 * Description property type
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#descriptionProperty}.
	 * <p>
	 * Property specifying the property type for the description
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#descriptionProperty">descriptionProperty</a>
	 */
	public static final String descriptionProperty = VIS.NAMESPACE + "descriptionProperty";

	/**
	 * Data domain of properties (for editing)
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#domain}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#domain">domain</a>
	 */
	public static final String domain = VIS.NAMESPACE + "domain";

	/**
	 * Vis edge Instance
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#EdgeType}.
	 * <p>
	 * Instances of this property are listed when adding a connection between
	 * elements
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#EdgeType">EdgeType</a>
	 */
	public static final String EdgeType = VIS.NAMESPACE + "EdgeType";

	/**
	 * Edge Type
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#edgeType}.
	 * <p>
	 * The rdf:property(s) to be used when creating the real instance.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#edgeType">edgeType</a>
	 */
	public static final String edgeType = VIS.NAMESPACE + "edgeType";

	/**
	 * Editable
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#editable}.
	 * <p>
	 * Is the vis object editable or view-only?
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#editable">editable</a>
	 */
	public static final String editable = VIS.NAMESPACE + "editable";

	/**
	 * Graph containing Networks
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#Graph}.
	 * <p>
	 * Container for various networks
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#Graph">Graph</a>
	 */
	public static final String Graph = VIS.NAMESPACE + "Graph";

	/**
	 * Edges in Project
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#hasEdge}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#hasEdge">hasEdge</a>
	 */
	public static final String hasEdge = VIS.NAMESPACE + "hasEdge";

	/**
	 * Language in Network
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#hasLanguage}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#hasLanguage">hasLanguage</a>
	 */
	public static final String hasLanguage = VIS.NAMESPACE + "hasLanguage";

	/**
	 * Properties for a type
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#hasProperty}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#hasProperty">hasProperty</a>
	 */
	public static final String hasProperty = VIS.NAMESPACE + "hasProperty";

	/**
	 * Properties for a type
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#hasPropertyValue}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#hasPropertyValue">hasPropertyValue</a>
	 */
	public static final String hasPropertyValue = VIS.NAMESPACE + "hasPropertyValue";

	/**
	 * Types in Project
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#hasType}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#hasType">hasType</a>
	 */
	public static final String hasType = VIS.NAMESPACE + "hasType";

	/**
	 * Image
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#image}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#image">image</a>
	 */
	public static final String image = VIS.NAMESPACE + "image";

	/**
	 * Link to container
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#inNetwork}.
	 * <p>
	 * property used to associate a node type instance with it's network
	 * container (e.g. skos:inScheme for skos:Concept in SKOS Vocabularies)
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#inNetwork">inNetwork</a>
	 */
	public static final String inNetwork = VIS.NAMESPACE + "inNetwork";

	/**
	 * HTML input type
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#inputFormat}.
	 * <p>
	 * Helper property for controlling HTML input fields
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#inputFormat">inputFormat</a>
	 */
	public static final String inputFormat = VIS.NAMESPACE + "inputFormat";

	/**
	 * Inverse Of
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#inverseOfEdge}.
	 * <p>
	 * attribute pointing to the inverse edge
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#inverseOfEdge">inverseOfEdge</a>
	 */
	public static final String inverseOfEdge = VIS.NAMESPACE + "inverseOfEdge";

	/**
	 * Network using this edge
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#isEdgeOf}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#isEdgeOf">isEdgeOf</a>
	 */
	public static final String isEdgeOf = VIS.NAMESPACE + "isEdgeOf";

	/**
	 * NodeType using this property
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#isPropertyOf}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#isPropertyOf">isPropertyOf</a>
	 */
	public static final String isPropertyOf = VIS.NAMESPACE + "isPropertyOf";

	/**
	 * NodeType using this property
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#isPropertyValueOf}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#isPropertyValueOf">isPropertyValueOf</a>
	 */
	public static final String isPropertyValueOf = VIS.NAMESPACE + "isPropertyValueOf";

	/**
	 * Project using this type
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#isTypeOf}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#isTypeOf">isTypeOf</a>
	 */
	public static final String isTypeOf = VIS.NAMESPACE + "isTypeOf";

	/**
	 * Label property type
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#labelProperty}.
	 * <p>
	 * Property specifying the data type for the label
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#labelProperty">labelProperty</a>
	 */
	public static final String labelProperty = VIS.NAMESPACE + "labelProperty";

	/**
	 * Default Language
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#language}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#language">language</a>
	 */
	public static final String language = VIS.NAMESPACE + "language";

	/**
	 * Multi-Language
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#multiLingual}.
	 * <p>
	 * Specify, whether multiple languages of a particular property are
	 * maintained
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#multiLingual">multiLingual</a>
	 */
	public static final String multiLingual = VIS.NAMESPACE + "multiLingual";

	/**
	 * Multiple Values
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#multiValue}.
	 * <p>
	 * Specify, whether multiple values of a particular property are allowed
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#multiValue">multiValue</a>
	 */
	public static final String multiValue = VIS.NAMESPACE + "multiValue";

	/**
	 * Network type Instance
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#Network}.
	 * <p>
	 * Provides configurable environment for building networks
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#Network">Network</a>
	 */
	public static final String Network = VIS.NAMESPACE + "Network";

	/**
	 * Link from a (top-level) node to the container outlining a start point for a hierarchy
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#networkAssigned}.
	 * <p>
	 * property used by the network to name the initial set of contained
	 * nodes (e.g. skos:topConceptOf for SKOS Concepts)
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#networkAssigned">networkAssigned</a>
	 */
	public static final String networkAssigned = VIS.NAMESPACE + "networkAssigned";

	/**
	 * Required 'missing, non existing' link(s) for a node to be qualified as 'unassigned, free' in the network 
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#networkUnassigned}.
	 * <p>
	 * Any of the relations MUST not exist for a node to be considered
	 * 'unassigned' in the network
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#networkUnassigned">networkUnassigned</a>
	 */
	public static final String networkUnassigned = VIS.NAMESPACE + "networkUnassigned";

	/**
	 * Vis type Instance
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#NodeType}.
	 * <p>
	 * Instances of this type are listed when adding new elements!
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#NodeType">NodeType</a>
	 */
	public static final String NodeType = VIS.NAMESPACE + "NodeType";

	/**
	 * Hint to be displayed for editing
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#placeholder}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#placeholder">placeholder</a>
	 */
	public static final String placeholder = VIS.NAMESPACE + "placeholder";

	/**
	 * Value Property
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#property}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#property">property</a>
	 */
	public static final String property = VIS.NAMESPACE + "property";

	/**
	 * Vis Property
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#PropertyType}.
	 * <p>
	 * Used to provide editing helpers
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#PropertyType">PropertyType</a>
	 */
	public static final String PropertyType = VIS.NAMESPACE + "PropertyType";

	/**
	 * Vis Property Value
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#PropertyValueType}.
	 * <p>
	 * Used to provide editing helpers
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#PropertyValueType">PropertyValueType</a>
	 */
	public static final String PropertyValueType = VIS.NAMESPACE + "PropertyValueType";

	/**
	 * Radio Property
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#RadioPropertyType}.
	 * <p>
	 * Used to provide editing helpers
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#RadioPropertyType">RadioPropertyType</a>
	 */
	public static final String RadioPropertyType = VIS.NAMESPACE + "RadioPropertyType";

	/**
	 * Type
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#rdfType}.
	 * <p>
	 * The rdf:type(s) to be used when creating the real instance.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#rdfType">rdfType</a>
	 */
	public static final String rdfType = VIS.NAMESPACE + "rdfType";

	/**
	 * Required
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#required}.
	 * <p>
	 * Is the property required or optional?
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#required">required</a>
	 */
	public static final String required = VIS.NAMESPACE + "required";

	/**
	 * Resource in the VIS context
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#Resource}.
	 * <p>
	 * (Abstract) super class for VisProject, VisType etc.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#Resource">Resource</a>
	 */
	public static final String Resource = VIS.NAMESPACE + "Resource";

	/**
	 * Select Box Property
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#SelectPropertyType}.
	 * <p>
	 * Used to provide editing helpers
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#SelectPropertyType">SelectPropertyType</a>
	 */
	public static final String SelectPropertyType = VIS.NAMESPACE + "SelectPropertyType";

	/**
	 * RDF Type of the source node element
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#sourceNodeType}.
	 * <p>
	 * The rdf:type of the source node, for which the edge is applicable
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#sourceNodeType">sourceNodeType</a>
	 */
	public static final String sourceNodeType = VIS.NAMESPACE + "sourceNodeType";

	/**
	 * String Property
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#StringPropertyType}.
	 * <p>
	 * Used to provide editing helpers
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#StringPropertyType">StringPropertyType</a>
	 */
	public static final String StringPropertyType = VIS.NAMESPACE + "StringPropertyType";

	/**
	 * RDF Type of the source node element
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#targetNodeType}.
	 * <p>
	 * The rdf:type of the source node, for which the edge is applicable
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#targetNodeType">targetNodeType</a>
	 */
	public static final String targetNodeType = VIS.NAMESPACE + "targetNodeType";

	/**
	 * Textarea Property
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#TextPropertyType}.
	 * <p>
	 * Used to provide editing helpers
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#TextPropertyType">TextPropertyType</a>
	 */
	public static final String TextPropertyType = VIS.NAMESPACE + "TextPropertyType";

	/**
	 * Property to express a top-down hierarchy in a network
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#toChildren}.
	 * <p>
	 * Property used for building hierarchical networks.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#toChildren">toChildren</a>
	 */
	public static final String toChildren = VIS.NAMESPACE + "toChildren";

	/**
	 * Hint to be displayed on mouse over
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#tooltip}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#tooltip">tooltip</a>
	 */
	public static final String tooltip = VIS.NAMESPACE + "tooltip";

	/**
	 * Property to express a bottom-up hierarchy in a network
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#toParent}.
	 * <p>
	 * Property used for building hierarchical networks.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#toParent">toParent</a>
	 */
	public static final String toParent = VIS.NAMESPACE + "toParent";

	/**
	 * Vis Property Value
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#VisPropertyValue}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#VisPropertyValue">VisPropertyValue</a>
	 */
	public static final String VisPropertyValue = VIS.NAMESPACE + "VisPropertyValue";

	/**
	 * Type
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#visType}.
	 * <p>
	 * The rdf:type to use when working with instances.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#visType">visType</a>
	 */
	public static final String visType = VIS.NAMESPACE + "visType";

	/**
	 * Checkbox Property
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#CheckboxPropertyType}.
	 * <p>
	 * Used to provide editing helpers
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#CheckboxPropertyType">CheckboxPropertyType</a>
	 */
	public static final URI CheckboxPropertyType_URI;

	/**
	 * Color
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#color}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#color">color</a>
	 */
	public static final URI color_URI;

	/**
	 * Data Type
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#dataType}.
	 * <p>
	 * The rdf:type(s) to be used when creating the real instance.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#dataType">dataType</a>
	 */
	public static final URI dataType_URI;

	/**
	 * Data Type
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#DataType}.
	 * <p>
	 * Specifies Data
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#DataType">DataType</a>
	 */
	public static final URI DataType_URI;

	/**
	 * Date Property
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#DatePropertyType}.
	 * <p>
	 * Used to provide editing helpers
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#DatePropertyType">DatePropertyType</a>
	 */
	public static final URI DatePropertyType_URI;

	/**
	 * Description property type
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#descriptionProperty}.
	 * <p>
	 * Property specifying the property type for the description
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#descriptionProperty">descriptionProperty</a>
	 */
	public static final URI descriptionProperty_URI;

	/**
	 * Data domain of properties (for editing)
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#domain}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#domain">domain</a>
	 */
	public static final URI domain_URI;

	/**
	 * Vis edge Instance
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#EdgeType}.
	 * <p>
	 * Instances of this property are listed when adding a connection between
	 * elements
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#EdgeType">EdgeType</a>
	 */
	public static final URI EdgeType_URI;

	/**
	 * Edge Type
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#edgeType}.
	 * <p>
	 * The rdf:property(s) to be used when creating the real instance.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#edgeType">edgeType</a>
	 */
	public static final URI edgeType_URI;

	/**
	 * Editable
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#editable}.
	 * <p>
	 * Is the vis object editable or view-only?
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#editable">editable</a>
	 */
	public static final URI editable_URI;

	/**
	 * Graph containing Networks
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#Graph}.
	 * <p>
	 * Container for various networks
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#Graph">Graph</a>
	 */
	public static final URI Graph_URI;

	/**
	 * Edges in Project
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#hasEdge}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#hasEdge">hasEdge</a>
	 */
	public static final URI hasEdge_URI;

	/**
	 * Language in Network
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#hasLanguage}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#hasLanguage">hasLanguage</a>
	 */
	public static final URI hasLanguage_URI;

	/**
	 * Properties for a type
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#hasProperty}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#hasProperty">hasProperty</a>
	 */
	public static final URI hasProperty_URI;

	/**
	 * Properties for a type
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#hasPropertyValue}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#hasPropertyValue">hasPropertyValue</a>
	 */
	public static final URI hasPropertyValue_URI;

	/**
	 * Types in Project
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#hasType}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#hasType">hasType</a>
	 */
	public static final URI hasType_URI;

	/**
	 * Image
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#image}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#image">image</a>
	 */
	public static final URI image_URI;

	/**
	 * Link to container
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#inNetwork}.
	 * <p>
	 * property used to associate a node type instance with it's network
	 * container (e.g. skos:inScheme for skos:Concept in SKOS Vocabularies)
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#inNetwork">inNetwork</a>
	 */
	public static final URI inNetwork_URI;

	/**
	 * HTML input type
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#inputFormat}.
	 * <p>
	 * Helper property for controlling HTML input fields
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#inputFormat">inputFormat</a>
	 */
	public static final URI inputFormat_URI;

	/**
	 * Inverse Of
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#inverseOfEdge}.
	 * <p>
	 * attribute pointing to the inverse edge
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#inverseOfEdge">inverseOfEdge</a>
	 */
	public static final URI inverseOfEdge_URI;

	/**
	 * Network using this edge
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#isEdgeOf}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#isEdgeOf">isEdgeOf</a>
	 */
	public static final URI isEdgeOf_URI;

	/**
	 * NodeType using this property
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#isPropertyOf}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#isPropertyOf">isPropertyOf</a>
	 */
	public static final URI isPropertyOf_URI;

	/**
	 * NodeType using this property
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#isPropertyValueOf}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#isPropertyValueOf">isPropertyValueOf</a>
	 */
	public static final URI isPropertyValueOf_URI;

	/**
	 * Project using this type
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#isTypeOf}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#isTypeOf">isTypeOf</a>
	 */
	public static final URI isTypeOf_URI;

	/**
	 * Label property type
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#labelProperty}.
	 * <p>
	 * Property specifying the data type for the label
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#labelProperty">labelProperty</a>
	 */
	public static final URI labelProperty_URI;

	/**
	 * Default Language
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#language}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#language">language</a>
	 */
	public static final URI language_URI;

	/**
	 * Multi-Language
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#multiLingual}.
	 * <p>
	 * Specify, whether multiple languages of a particular property are
	 * maintained
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#multiLingual">multiLingual</a>
	 */
	public static final URI multiLingual_URI;

	/**
	 * Multiple Values
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#multiValue}.
	 * <p>
	 * Specify, whether multiple values of a particular property are allowed
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#multiValue">multiValue</a>
	 */
	public static final URI multiValue_URI;

	/**
	 * Network type Instance
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#Network}.
	 * <p>
	 * Provides configurable environment for building networks
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#Network">Network</a>
	 */
	public static final URI Network_URI;

	/**
	 * Link from a (top-level) node to the container outlining a start point for a hierarchy
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#networkAssigned}.
	 * <p>
	 * property used by the network to name the initial set of contained
	 * nodes (e.g. skos:topConceptOf for SKOS Concepts)
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#networkAssigned">networkAssigned</a>
	 */
	public static final URI networkAssigned_URI;

	/**
	 * Required 'missing, non existing' link(s) for a node to be qualified as 'unassigned, free' in the network 
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#networkUnassigned}.
	 * <p>
	 * Any of the relations MUST not exist for a node to be considered
	 * 'unassigned' in the network
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#networkUnassigned">networkUnassigned</a>
	 */
	public static final URI networkUnassigned_URI;

	/**
	 * Vis type Instance
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#NodeType}.
	 * <p>
	 * Instances of this type are listed when adding new elements!
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#NodeType">NodeType</a>
	 */
	public static final URI NodeType_URI;

	/**
	 * Hint to be displayed for editing
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#placeholder}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#placeholder">placeholder</a>
	 */
	public static final URI placeholder_URI;

	/**
	 * Value Property
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#property}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#property">property</a>
	 */
	public static final URI property_URI;

	/**
	 * Vis Property
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#PropertyType}.
	 * <p>
	 * Used to provide editing helpers
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#PropertyType">PropertyType</a>
	 */
	public static final URI PropertyType_URI;

	/**
	 * Vis Property Value
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#PropertyValueType}.
	 * <p>
	 * Used to provide editing helpers
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#PropertyValueType">PropertyValueType</a>
	 */
	public static final URI PropertyValueType_URI;

	/**
	 * Radio Property
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#RadioPropertyType}.
	 * <p>
	 * Used to provide editing helpers
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#RadioPropertyType">RadioPropertyType</a>
	 */
	public static final URI RadioPropertyType_URI;

	/**
	 * Type
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#rdfType}.
	 * <p>
	 * The rdf:type(s) to be used when creating the real instance.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#rdfType">rdfType</a>
	 */
	public static final URI rdfType_URI;

	/**
	 * Required
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#required}.
	 * <p>
	 * Is the property required or optional?
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#required">required</a>
	 */
	public static final URI required_URI;

	/**
	 * Resource in the VIS context
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#Resource}.
	 * <p>
	 * (Abstract) super class for VisProject, VisType etc.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#Resource">Resource</a>
	 */
	public static final URI Resource_URI;

	/**
	 * Select Box Property
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#SelectPropertyType}.
	 * <p>
	 * Used to provide editing helpers
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#SelectPropertyType">SelectPropertyType</a>
	 */
	public static final URI SelectPropertyType_URI;

	/**
	 * RDF Type of the source node element
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#sourceNodeType}.
	 * <p>
	 * The rdf:type of the source node, for which the edge is applicable
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#sourceNodeType">sourceNodeType</a>
	 */
	public static final URI sourceNodeType_URI;

	/**
	 * String Property
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#StringPropertyType}.
	 * <p>
	 * Used to provide editing helpers
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#StringPropertyType">StringPropertyType</a>
	 */
	public static final URI StringPropertyType_URI;

	/**
	 * RDF Type of the source node element
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#targetNodeType}.
	 * <p>
	 * The rdf:type of the source node, for which the edge is applicable
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#targetNodeType">targetNodeType</a>
	 */
	public static final URI targetNodeType_URI;

	/**
	 * Textarea Property
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#TextPropertyType}.
	 * <p>
	 * Used to provide editing helpers
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#TextPropertyType">TextPropertyType</a>
	 */
	public static final URI TextPropertyType_URI;

	/**
	 * Property to express a top-down hierarchy in a network
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#toChildren}.
	 * <p>
	 * Property used for building hierarchical networks.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#toChildren">toChildren</a>
	 */
	public static final URI toChildren_URI;

	/**
	 * Hint to be displayed on mouse over
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#tooltip}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#tooltip">tooltip</a>
	 */
	public static final URI tooltip_URI;

	/**
	 * Property to express a bottom-up hierarchy in a network
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#toParent}.
	 * <p>
	 * Property used for building hierarchical networks.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#toParent">toParent</a>
	 */
	public static final URI toParent_URI;

	/**
	 * Vis Property Value
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#VisPropertyValue}.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#VisPropertyValue">VisPropertyValue</a>
	 */
	public static final URI VisPropertyValue_URI;

	/**
	 * Type
	 * <p>
	 * {@code http://www.salzburgresearch.at/vis#visType}.
	 * <p>
	 * The rdf:type to use when working with instances.
	 *
	 * @see <a href="http://www.salzburgresearch.at/vis#visType">visType</a>
	 */
	public static final URI visType_URI;

	static {
		ValueFactory factory = ValueFactoryImpl.getInstance();

		CheckboxPropertyType_URI = factory.createURI(VIS.NAMESPACE, "CheckboxPropertyType");
		color_URI = factory.createURI(VIS.NAMESPACE, "color");
		dataType_URI = factory.createURI(VIS.NAMESPACE, "dataType");
		DataType_URI = factory.createURI(VIS.NAMESPACE, "DataType");
		DatePropertyType_URI = factory.createURI(VIS.NAMESPACE, "DatePropertyType");
		descriptionProperty_URI = factory.createURI(VIS.NAMESPACE, "descriptionProperty");
		domain_URI = factory.createURI(VIS.NAMESPACE, "domain");
		EdgeType_URI = factory.createURI(VIS.NAMESPACE, "EdgeType");
		edgeType_URI = factory.createURI(VIS.NAMESPACE, "edgeType");
		editable_URI = factory.createURI(VIS.NAMESPACE, "editable");
		Graph_URI = factory.createURI(VIS.NAMESPACE, "Graph");
		hasEdge_URI = factory.createURI(VIS.NAMESPACE, "hasEdge");
		hasLanguage_URI = factory.createURI(VIS.NAMESPACE, "hasLanguage");
		hasProperty_URI = factory.createURI(VIS.NAMESPACE, "hasProperty");
		hasPropertyValue_URI = factory.createURI(VIS.NAMESPACE, "hasPropertyValue");
		hasType_URI = factory.createURI(VIS.NAMESPACE, "hasType");
		image_URI = factory.createURI(VIS.NAMESPACE, "image");
		inNetwork_URI = factory.createURI(VIS.NAMESPACE, "inNetwork");
		inputFormat_URI = factory.createURI(VIS.NAMESPACE, "inputFormat");
		inverseOfEdge_URI = factory.createURI(VIS.NAMESPACE, "inverseOfEdge");
		isEdgeOf_URI = factory.createURI(VIS.NAMESPACE, "isEdgeOf");
		isPropertyOf_URI = factory.createURI(VIS.NAMESPACE, "isPropertyOf");
		isPropertyValueOf_URI = factory.createURI(VIS.NAMESPACE, "isPropertyValueOf");
		isTypeOf_URI = factory.createURI(VIS.NAMESPACE, "isTypeOf");
		labelProperty_URI = factory.createURI(VIS.NAMESPACE, "labelProperty");
		language_URI = factory.createURI(VIS.NAMESPACE, "language");
		multiLingual_URI = factory.createURI(VIS.NAMESPACE, "multiLingual");
		multiValue_URI = factory.createURI(VIS.NAMESPACE, "multiValue");
		Network_URI = factory.createURI(VIS.NAMESPACE, "Network");
		networkAssigned_URI = factory.createURI(VIS.NAMESPACE, "networkAssigned");
		networkUnassigned_URI = factory.createURI(VIS.NAMESPACE, "networkUnassigned");
		NodeType_URI = factory.createURI(VIS.NAMESPACE, "NodeType");
		placeholder_URI = factory.createURI(VIS.NAMESPACE, "placeholder");
		property_URI = factory.createURI(VIS.NAMESPACE, "property");
		PropertyType_URI = factory.createURI(VIS.NAMESPACE, "PropertyType");
		PropertyValueType_URI = factory.createURI(VIS.NAMESPACE, "PropertyValueType");
		RadioPropertyType_URI = factory.createURI(VIS.NAMESPACE, "RadioPropertyType");
		rdfType_URI = factory.createURI(VIS.NAMESPACE, "rdfType");
		required_URI = factory.createURI(VIS.NAMESPACE, "required");
		Resource_URI = factory.createURI(VIS.NAMESPACE, "Resource");
		SelectPropertyType_URI = factory.createURI(VIS.NAMESPACE, "SelectPropertyType");
		sourceNodeType_URI = factory.createURI(VIS.NAMESPACE, "sourceNodeType");
		StringPropertyType_URI = factory.createURI(VIS.NAMESPACE, "StringPropertyType");
		targetNodeType_URI = factory.createURI(VIS.NAMESPACE, "targetNodeType");
		TextPropertyType_URI = factory.createURI(VIS.NAMESPACE, "TextPropertyType");
		toChildren_URI = factory.createURI(VIS.NAMESPACE, "toChildren");
		tooltip_URI = factory.createURI(VIS.NAMESPACE, "tooltip");
		toParent_URI = factory.createURI(VIS.NAMESPACE, "toParent");
		VisPropertyValue_URI = factory.createURI(VIS.NAMESPACE, "VisPropertyValue");
		visType_URI = factory.createURI(VIS.NAMESPACE, "visType");
	}

	private VIS() {
		//static access only
	}

}
