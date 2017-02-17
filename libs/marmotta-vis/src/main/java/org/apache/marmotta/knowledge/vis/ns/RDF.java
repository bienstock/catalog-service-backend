package org.apache.marmotta.knowledge.vis.ns;

import org.openrdf.model.URI;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.ValueFactoryImpl;

/**
 * The RDF Concepts Vocabulary (RDF).
 * <p>
 * This is the RDF Schema for the RDF vocabulary terms in the RDF
 * Namespace, defined in RDF 1.1 Concepts..
 * <p>
 * Namespace RDF.
 * Prefix: {@code <http://www.w3.org/1999/02/22-rdf-syntax-ns#>}
 */
public class RDF {

	/** {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#} **/
	public static final String NAMESPACE = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";

	/** {@code rdf} **/
	public static final String PREFIX = "rdf";

	/**
	 * Alt
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#Alt}.
	 * <p>
	 * The class of containers of alternatives.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#Alt">Alt</a>
	 */
	public static final String Alt = RDF.NAMESPACE + "Alt";

	/**
	 * Bag
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#Bag}.
	 * <p>
	 * The class of unordered containers.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#Bag">Bag</a>
	 */
	public static final String Bag = RDF.NAMESPACE + "Bag";

	/**
	 * first
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#first}.
	 * <p>
	 * The first item in the subject RDF list.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#first">first</a>
	 */
	public static final String first = RDF.NAMESPACE + "first";

	/**
	 * HTML
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#HTML}.
	 * <p>
	 * The datatype of RDF literals storing fragments of HTML content
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#HTML">HTML</a>
	 */
	public static final String HTML = RDF.NAMESPACE + "HTML";

	/**
	 * langString
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#langString}.
	 * <p>
	 * The datatype of language-tagged string values
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#langString">langString</a>
	 */
	public static final String langString = RDF.NAMESPACE + "langString";

	/**
	 * List
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#List}.
	 * <p>
	 * The class of RDF Lists.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#List">List</a>
	 */
	public static final String List = RDF.NAMESPACE + "List";

	/**
	 * nil
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#nil}.
	 * <p>
	 * The empty list, with no items in it. If the rest of a list is nil then
	 * the list has no more items in it.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#nil">nil</a>
	 */
	public static final String nil = RDF.NAMESPACE + "nil";

	/**
	 * object
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#object}.
	 * <p>
	 * The object of the subject RDF statement.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#object">object</a>
	 */
	public static final String object = RDF.NAMESPACE + "object";

	/**
	 * PlainLiteral
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#PlainLiteral}.
	 * <p>
	 * The class of plain (i.e. untyped) literal values, as used in RIF and
	 * OWL 2
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#PlainLiteral">PlainLiteral</a>
	 */
	public static final String PlainLiteral = RDF.NAMESPACE + "PlainLiteral";

	/**
	 * predicate
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#predicate}.
	 * <p>
	 * The predicate of the subject RDF statement.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#predicate">predicate</a>
	 */
	public static final String predicate = RDF.NAMESPACE + "predicate";

	/**
	 * Property
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#Property}.
	 * <p>
	 * The class of RDF properties.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property">Property</a>
	 */
	public static final String Property = RDF.NAMESPACE + "Property";

	/**
	 * rest
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#rest}.
	 * <p>
	 * The rest of the subject RDF list after the first item.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#rest">rest</a>
	 */
	public static final String rest = RDF.NAMESPACE + "rest";

	/**
	 * Seq
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#Seq}.
	 * <p>
	 * The class of ordered containers.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#Seq">Seq</a>
	 */
	public static final String Seq = RDF.NAMESPACE + "Seq";

	/**
	 * Statement
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#Statement}.
	 * <p>
	 * The class of RDF statements.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#Statement">Statement</a>
	 */
	public static final String Statement = RDF.NAMESPACE + "Statement";

	/**
	 * subject
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#subject}.
	 * <p>
	 * The subject of the subject RDF statement.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#subject">subject</a>
	 */
	public static final String subject = RDF.NAMESPACE + "subject";

	/**
	 * type
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#type}.
	 * <p>
	 * The subject is an instance of a class.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#type">type</a>
	 */
	public static final String type = RDF.NAMESPACE + "type";

	/**
	 * value
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#value}.
	 * <p>
	 * Idiomatic property used for structured values.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#value">value</a>
	 */
	public static final String value = RDF.NAMESPACE + "value";

	/**
	 * XMLLiteral
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#XMLLiteral}.
	 * <p>
	 * The datatype of XML literal values.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#XMLLiteral">XMLLiteral</a>
	 */
	public static final String XMLLiteral = RDF.NAMESPACE + "XMLLiteral";

	/**
	 * Alt
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#Alt}.
	 * <p>
	 * The class of containers of alternatives.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#Alt">Alt</a>
	 */
	public static final URI Alt_URI;

	/**
	 * Bag
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#Bag}.
	 * <p>
	 * The class of unordered containers.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#Bag">Bag</a>
	 */
	public static final URI Bag_URI;

	/**
	 * first
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#first}.
	 * <p>
	 * The first item in the subject RDF list.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#first">first</a>
	 */
	public static final URI first_URI;

	/**
	 * HTML
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#HTML}.
	 * <p>
	 * The datatype of RDF literals storing fragments of HTML content
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#HTML">HTML</a>
	 */
	public static final URI HTML_URI;

	/**
	 * langString
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#langString}.
	 * <p>
	 * The datatype of language-tagged string values
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#langString">langString</a>
	 */
	public static final URI langString_URI;

	/**
	 * List
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#List}.
	 * <p>
	 * The class of RDF Lists.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#List">List</a>
	 */
	public static final URI List_URI;

	/**
	 * nil
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#nil}.
	 * <p>
	 * The empty list, with no items in it. If the rest of a list is nil then
	 * the list has no more items in it.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#nil">nil</a>
	 */
	public static final URI nil_URI;

	/**
	 * object
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#object}.
	 * <p>
	 * The object of the subject RDF statement.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#object">object</a>
	 */
	public static final URI object_URI;

	/**
	 * PlainLiteral
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#PlainLiteral}.
	 * <p>
	 * The class of plain (i.e. untyped) literal values, as used in RIF and
	 * OWL 2
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#PlainLiteral">PlainLiteral</a>
	 */
	public static final URI PlainLiteral_URI;

	/**
	 * predicate
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#predicate}.
	 * <p>
	 * The predicate of the subject RDF statement.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#predicate">predicate</a>
	 */
	public static final URI predicate_URI;

	/**
	 * Property
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#Property}.
	 * <p>
	 * The class of RDF properties.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property">Property</a>
	 */
	public static final URI Property_URI;

	/**
	 * rest
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#rest}.
	 * <p>
	 * The rest of the subject RDF list after the first item.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#rest">rest</a>
	 */
	public static final URI rest_URI;

	/**
	 * Seq
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#Seq}.
	 * <p>
	 * The class of ordered containers.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#Seq">Seq</a>
	 */
	public static final URI Seq_URI;

	/**
	 * Statement
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#Statement}.
	 * <p>
	 * The class of RDF statements.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#Statement">Statement</a>
	 */
	public static final URI Statement_URI;

	/**
	 * subject
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#subject}.
	 * <p>
	 * The subject of the subject RDF statement.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#subject">subject</a>
	 */
	public static final URI subject_URI;

	/**
	 * type
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#type}.
	 * <p>
	 * The subject is an instance of a class.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#type">type</a>
	 */
	public static final URI type_URI;

	/**
	 * value
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#value}.
	 * <p>
	 * Idiomatic property used for structured values.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#value">value</a>
	 */
	public static final URI value_URI;

	/**
	 * XMLLiteral
	 * <p>
	 * {@code http://www.w3.org/1999/02/22-rdf-syntax-ns#XMLLiteral}.
	 * <p>
	 * The datatype of XML literal values.
	 *
	 * @see <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#XMLLiteral">XMLLiteral</a>
	 */
	public static final URI XMLLiteral_URI;

	static {
		ValueFactory factory = ValueFactoryImpl.getInstance();

		Alt_URI = factory.createURI(RDF.NAMESPACE, "Alt");
		Bag_URI = factory.createURI(RDF.NAMESPACE, "Bag");
		first_URI = factory.createURI(RDF.NAMESPACE, "first");
		HTML_URI = factory.createURI(RDF.NAMESPACE, "HTML");
		langString_URI = factory.createURI(RDF.NAMESPACE, "langString");
		List_URI = factory.createURI(RDF.NAMESPACE, "List");
		nil_URI = factory.createURI(RDF.NAMESPACE, "nil");
		object_URI = factory.createURI(RDF.NAMESPACE, "object");
		PlainLiteral_URI = factory.createURI(RDF.NAMESPACE, "PlainLiteral");
		predicate_URI = factory.createURI(RDF.NAMESPACE, "predicate");
		Property_URI = factory.createURI(RDF.NAMESPACE, "Property");
		rest_URI = factory.createURI(RDF.NAMESPACE, "rest");
		Seq_URI = factory.createURI(RDF.NAMESPACE, "Seq");
		Statement_URI = factory.createURI(RDF.NAMESPACE, "Statement");
		subject_URI = factory.createURI(RDF.NAMESPACE, "subject");
		type_URI = factory.createURI(RDF.NAMESPACE, "type");
		value_URI = factory.createURI(RDF.NAMESPACE, "value");
		XMLLiteral_URI = factory.createURI(RDF.NAMESPACE, "XMLLiteral");
	}

	private RDF() {
		//static access only
	}

}
