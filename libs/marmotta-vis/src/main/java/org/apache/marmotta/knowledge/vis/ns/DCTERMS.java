package org.apache.marmotta.knowledge.vis.ns;

import org.openrdf.model.URI;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.ValueFactoryImpl;

/**
 * DCMI Metadata Terms - other.
 * <p>
 * Namespace DCTERMS.
 * Prefix: {@code <http://purl.org/dc/terms/>}
 */
public class DCTERMS {

	/** {@code http://purl.org/dc/terms/} **/
	public static final String NAMESPACE = "http://purl.org/dc/terms/";

	/** {@code dcterms} **/
	public static final String PREFIX = "dcterms";

	/**
	 * Abstract
	 * <p>
	 * {@code http://purl.org/dc/terms/abstract}.
	 * <p>
	 * A summary of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/abstract">abstract</a>
	 */
	public static final String _abstract = DCTERMS.NAMESPACE + "abstract";

	/**
	 * Access Rights
	 * <p>
	 * {@code http://purl.org/dc/terms/accessRights}.
	 * <p>
	 * Information about who can access the resource or an indication of its
	 * security status.
	 *
	 * @see <a href="http://purl.org/dc/terms/accessRights">accessRights</a>
	 */
	public static final String accessRights = DCTERMS.NAMESPACE + "accessRights";

	/**
	 * Accrual Method
	 * <p>
	 * {@code http://purl.org/dc/terms/accrualMethod}.
	 * <p>
	 * The method by which items are added to a collection.
	 *
	 * @see <a href="http://purl.org/dc/terms/accrualMethod">accrualMethod</a>
	 */
	public static final String accrualMethod = DCTERMS.NAMESPACE + "accrualMethod";

	/**
	 * Accrual Periodicity
	 * <p>
	 * {@code http://purl.org/dc/terms/accrualPeriodicity}.
	 * <p>
	 * The frequency with which items are added to a collection.
	 *
	 * @see <a href="http://purl.org/dc/terms/accrualPeriodicity">accrualPeriodicity</a>
	 */
	public static final String accrualPeriodicity = DCTERMS.NAMESPACE + "accrualPeriodicity";

	/**
	 * Accrual Policy
	 * <p>
	 * {@code http://purl.org/dc/terms/accrualPolicy}.
	 * <p>
	 * The policy governing the addition of items to a collection.
	 *
	 * @see <a href="http://purl.org/dc/terms/accrualPolicy">accrualPolicy</a>
	 */
	public static final String accrualPolicy = DCTERMS.NAMESPACE + "accrualPolicy";

	/**
	 * Agent
	 * <p>
	 * {@code http://purl.org/dc/terms/Agent}.
	 * <p>
	 * A resource that acts or has the power to act.
	 *
	 * @see <a href="http://purl.org/dc/terms/Agent">Agent</a>
	 */
	public static final String Agent = DCTERMS.NAMESPACE + "Agent";

	/**
	 * Agent Class
	 * <p>
	 * {@code http://purl.org/dc/terms/AgentClass}.
	 * <p>
	 * A group of agents.
	 *
	 * @see <a href="http://purl.org/dc/terms/AgentClass">AgentClass</a>
	 */
	public static final String AgentClass = DCTERMS.NAMESPACE + "AgentClass";

	/**
	 * Alternative Title
	 * <p>
	 * {@code http://purl.org/dc/terms/alternative}.
	 * <p>
	 * An alternative name for the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/alternative">alternative</a>
	 */
	public static final String alternative = DCTERMS.NAMESPACE + "alternative";

	/**
	 * Audience
	 * <p>
	 * {@code http://purl.org/dc/terms/audience}.
	 * <p>
	 * A class of entity for whom the resource is intended or useful.
	 *
	 * @see <a href="http://purl.org/dc/terms/audience">audience</a>
	 */
	public static final String audience = DCTERMS.NAMESPACE + "audience";

	/**
	 * Date Available
	 * <p>
	 * {@code http://purl.org/dc/terms/available}.
	 * <p>
	 * Date (often a range) that the resource became or will become
	 * available.
	 *
	 * @see <a href="http://purl.org/dc/terms/available">available</a>
	 */
	public static final String available = DCTERMS.NAMESPACE + "available";

	/**
	 * Bibliographic Citation
	 * <p>
	 * {@code http://purl.org/dc/terms/bibliographicCitation}.
	 * <p>
	 * A bibliographic reference for the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/bibliographicCitation">bibliographicCitation</a>
	 */
	public static final String bibliographicCitation = DCTERMS.NAMESPACE + "bibliographicCitation";

	/**
	 * Bibliographic Resource
	 * <p>
	 * {@code http://purl.org/dc/terms/BibliographicResource}.
	 * <p>
	 * A book, article, or other documentary resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/BibliographicResource">BibliographicResource</a>
	 */
	public static final String BibliographicResource = DCTERMS.NAMESPACE + "BibliographicResource";

	/**
	 * DCMI Box
	 * <p>
	 * {@code http://purl.org/dc/terms/Box}.
	 * <p>
	 * The set of regions in space defined by their geographic coordinates
	 * according to the DCMI Box Encoding Scheme.
	 *
	 * @see <a href="http://purl.org/dc/terms/Box">Box</a>
	 */
	public static final String Box = DCTERMS.NAMESPACE + "Box";

	/**
	 * Conforms To
	 * <p>
	 * {@code http://purl.org/dc/terms/conformsTo}.
	 * <p>
	 * An established standard to which the described resource conforms.
	 *
	 * @see <a href="http://purl.org/dc/terms/conformsTo">conformsTo</a>
	 */
	public static final String conformsTo = DCTERMS.NAMESPACE + "conformsTo";

	/**
	 * Contributor
	 * <p>
	 * {@code http://purl.org/dc/terms/contributor}.
	 * <p>
	 * An entity responsible for making contributions to the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/contributor">contributor</a>
	 */
	public static final String contributor = DCTERMS.NAMESPACE + "contributor";

	/**
	 * Coverage
	 * <p>
	 * {@code http://purl.org/dc/terms/coverage}.
	 * <p>
	 * The spatial or temporal topic of the resource, the spatial
	 * applicability of the resource, or the jurisdiction under which the
	 * resource is relevant.
	 *
	 * @see <a href="http://purl.org/dc/terms/coverage">coverage</a>
	 */
	public static final String coverage = DCTERMS.NAMESPACE + "coverage";

	/**
	 * Date Created
	 * <p>
	 * {@code http://purl.org/dc/terms/created}.
	 * <p>
	 * Date of creation of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/created">created</a>
	 */
	public static final String created = DCTERMS.NAMESPACE + "created";

	/**
	 * Creator
	 * <p>
	 * {@code http://purl.org/dc/terms/creator}.
	 * <p>
	 * An entity primarily responsible for making the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/creator">creator</a>
	 */
	public static final String creator = DCTERMS.NAMESPACE + "creator";

	/**
	 * Date
	 * <p>
	 * {@code http://purl.org/dc/terms/date}.
	 * <p>
	 * A point or period of time associated with an event in the lifecycle of
	 * the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/date">date</a>
	 */
	public static final String date = DCTERMS.NAMESPACE + "date";

	/**
	 * Date Accepted
	 * <p>
	 * {@code http://purl.org/dc/terms/dateAccepted}.
	 * <p>
	 * Date of acceptance of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/dateAccepted">dateAccepted</a>
	 */
	public static final String dateAccepted = DCTERMS.NAMESPACE + "dateAccepted";

	/**
	 * Date Copyrighted
	 * <p>
	 * {@code http://purl.org/dc/terms/dateCopyrighted}.
	 * <p>
	 * Date of copyright.
	 *
	 * @see <a href="http://purl.org/dc/terms/dateCopyrighted">dateCopyrighted</a>
	 */
	public static final String dateCopyrighted = DCTERMS.NAMESPACE + "dateCopyrighted";

	/**
	 * Date Submitted
	 * <p>
	 * {@code http://purl.org/dc/terms/dateSubmitted}.
	 * <p>
	 * Date of submission of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/dateSubmitted">dateSubmitted</a>
	 */
	public static final String dateSubmitted = DCTERMS.NAMESPACE + "dateSubmitted";

	/**
	 * DCMI Type Vocabulary
	 * <p>
	 * {@code http://purl.org/dc/terms/DCMIType}.
	 * <p>
	 * The set of classes specified by the DCMI Type Vocabulary, used to
	 * categorize the nature or genre of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/DCMIType">DCMIType</a>
	 */
	public static final String DCMIType = DCTERMS.NAMESPACE + "DCMIType";

	/**
	 * DDC
	 * <p>
	 * {@code http://purl.org/dc/terms/DDC}.
	 * <p>
	 * The set of conceptual resources specified by the Dewey Decimal
	 * Classification.
	 *
	 * @see <a href="http://purl.org/dc/terms/DDC">DDC</a>
	 */
	public static final String DDC = DCTERMS.NAMESPACE + "DDC";

	/**
	 * Description
	 * <p>
	 * {@code http://purl.org/dc/terms/description}.
	 * <p>
	 * An account of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/description">description</a>
	 */
	public static final String description = DCTERMS.NAMESPACE + "description";

	/**
	 * Audience Education Level
	 * <p>
	 * {@code http://purl.org/dc/terms/educationLevel}.
	 * <p>
	 * A class of entity, defined in terms of progression through an
	 * educational or training context, for which the described resource is
	 * intended.
	 *
	 * @see <a href="http://purl.org/dc/terms/educationLevel">educationLevel</a>
	 */
	public static final String educationLevel = DCTERMS.NAMESPACE + "educationLevel";

	/**
	 * Extent
	 * <p>
	 * {@code http://purl.org/dc/terms/extent}.
	 * <p>
	 * The size or duration of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/extent">extent</a>
	 */
	public static final String extent = DCTERMS.NAMESPACE + "extent";

	/**
	 * File Format
	 * <p>
	 * {@code http://purl.org/dc/terms/FileFormat}.
	 * <p>
	 * A digital resource format.
	 *
	 * @see <a href="http://purl.org/dc/terms/FileFormat">FileFormat</a>
	 */
	public static final String FileFormat = DCTERMS.NAMESPACE + "FileFormat";

	/**
	 * Format
	 * <p>
	 * {@code http://purl.org/dc/terms/format}.
	 * <p>
	 * The file format, physical medium, or dimensions of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/format">format</a>
	 */
	public static final String format = DCTERMS.NAMESPACE + "format";

	/**
	 * Frequency
	 * <p>
	 * {@code http://purl.org/dc/terms/Frequency}.
	 * <p>
	 * A rate at which something recurs.
	 *
	 * @see <a href="http://purl.org/dc/terms/Frequency">Frequency</a>
	 */
	public static final String Frequency = DCTERMS.NAMESPACE + "Frequency";

	/**
	 * Has Format
	 * <p>
	 * {@code http://purl.org/dc/terms/hasFormat}.
	 * <p>
	 * A related resource that is substantially the same as the pre-existing
	 * described resource, but in another format.
	 *
	 * @see <a href="http://purl.org/dc/terms/hasFormat">hasFormat</a>
	 */
	public static final String hasFormat = DCTERMS.NAMESPACE + "hasFormat";

	/**
	 * Has Part
	 * <p>
	 * {@code http://purl.org/dc/terms/hasPart}.
	 * <p>
	 * A related resource that is included either physically or logically in
	 * the described resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/hasPart">hasPart</a>
	 */
	public static final String hasPart = DCTERMS.NAMESPACE + "hasPart";

	/**
	 * Has Version
	 * <p>
	 * {@code http://purl.org/dc/terms/hasVersion}.
	 * <p>
	 * A related resource that is a version, edition, or adaptation of the
	 * described resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/hasVersion">hasVersion</a>
	 */
	public static final String hasVersion = DCTERMS.NAMESPACE + "hasVersion";

	/**
	 * Identifier
	 * <p>
	 * {@code http://purl.org/dc/terms/identifier}.
	 * <p>
	 * An unambiguous reference to the resource within a given context.
	 *
	 * @see <a href="http://purl.org/dc/terms/identifier">identifier</a>
	 */
	public static final String identifier = DCTERMS.NAMESPACE + "identifier";

	/**
	 * IMT
	 * <p>
	 * {@code http://purl.org/dc/terms/IMT}.
	 * <p>
	 * The set of media types specified by the Internet Assigned Numbers
	 * Authority.
	 *
	 * @see <a href="http://purl.org/dc/terms/IMT">IMT</a>
	 */
	public static final String IMT = DCTERMS.NAMESPACE + "IMT";

	/**
	 * Instructional Method
	 * <p>
	 * {@code http://purl.org/dc/terms/instructionalMethod}.
	 * <p>
	 * A process, used to engender knowledge, attitudes and skills, that the
	 * described resource is designed to support.
	 *
	 * @see <a href="http://purl.org/dc/terms/instructionalMethod">instructionalMethod</a>
	 */
	public static final String instructionalMethod = DCTERMS.NAMESPACE + "instructionalMethod";

	/**
	 * Is Format Of
	 * <p>
	 * {@code http://purl.org/dc/terms/isFormatOf}.
	 * <p>
	 * A related resource that is substantially the same as the described
	 * resource, but in another format.
	 *
	 * @see <a href="http://purl.org/dc/terms/isFormatOf">isFormatOf</a>
	 */
	public static final String isFormatOf = DCTERMS.NAMESPACE + "isFormatOf";

	/**
	 * ISO 3166
	 * <p>
	 * {@code http://purl.org/dc/terms/ISO3166}.
	 * <p>
	 * The set of codes listed in ISO 3166-1 for the representation of names
	 * of countries.
	 *
	 * @see <a href="http://purl.org/dc/terms/ISO3166">ISO3166</a>
	 */
	public static final String ISO3166 = DCTERMS.NAMESPACE + "ISO3166";

	/**
	 * ISO 639-2
	 * <p>
	 * {@code http://purl.org/dc/terms/ISO639-2}.
	 * <p>
	 * The three-letter alphabetic codes listed in ISO639-2 for the
	 * representation of names of languages.
	 *
	 * @see <a href="http://purl.org/dc/terms/ISO639-2">ISO639-2</a>
	 */
	public static final String ISO639_2 = DCTERMS.NAMESPACE + "ISO639-2";

	/**
	 * ISO 639-3
	 * <p>
	 * {@code http://purl.org/dc/terms/ISO639-3}.
	 * <p>
	 * The set of three-letter codes listed in ISO 639-3 for the
	 * representation of names of languages.
	 *
	 * @see <a href="http://purl.org/dc/terms/ISO639-3">ISO639-3</a>
	 */
	public static final String ISO639_3 = DCTERMS.NAMESPACE + "ISO639-3";

	/**
	 * Is Part Of
	 * <p>
	 * {@code http://purl.org/dc/terms/isPartOf}.
	 * <p>
	 * A related resource in which the described resource is physically or
	 * logically included.
	 *
	 * @see <a href="http://purl.org/dc/terms/isPartOf">isPartOf</a>
	 */
	public static final String isPartOf = DCTERMS.NAMESPACE + "isPartOf";

	/**
	 * Is Referenced By
	 * <p>
	 * {@code http://purl.org/dc/terms/isReferencedBy}.
	 * <p>
	 * A related resource that references, cites, or otherwise points to the
	 * described resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/isReferencedBy">isReferencedBy</a>
	 */
	public static final String isReferencedBy = DCTERMS.NAMESPACE + "isReferencedBy";

	/**
	 * Is Replaced By
	 * <p>
	 * {@code http://purl.org/dc/terms/isReplacedBy}.
	 * <p>
	 * A related resource that supplants, displaces, or supersedes the
	 * described resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/isReplacedBy">isReplacedBy</a>
	 */
	public static final String isReplacedBy = DCTERMS.NAMESPACE + "isReplacedBy";

	/**
	 * Is Required By
	 * <p>
	 * {@code http://purl.org/dc/terms/isRequiredBy}.
	 * <p>
	 * A related resource that requires the described resource to support its
	 * function, delivery, or coherence.
	 *
	 * @see <a href="http://purl.org/dc/terms/isRequiredBy">isRequiredBy</a>
	 */
	public static final String isRequiredBy = DCTERMS.NAMESPACE + "isRequiredBy";

	/**
	 * Date Issued
	 * <p>
	 * {@code http://purl.org/dc/terms/issued}.
	 * <p>
	 * Date of formal issuance (e.g., publication) of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/issued">issued</a>
	 */
	public static final String issued = DCTERMS.NAMESPACE + "issued";

	/**
	 * Is Version Of
	 * <p>
	 * {@code http://purl.org/dc/terms/isVersionOf}.
	 * <p>
	 * A related resource of which the described resource is a version,
	 * edition, or adaptation.
	 *
	 * @see <a href="http://purl.org/dc/terms/isVersionOf">isVersionOf</a>
	 */
	public static final String isVersionOf = DCTERMS.NAMESPACE + "isVersionOf";

	/**
	 * Jurisdiction
	 * <p>
	 * {@code http://purl.org/dc/terms/Jurisdiction}.
	 * <p>
	 * The extent or range of judicial, law enforcement, or other authority.
	 *
	 * @see <a href="http://purl.org/dc/terms/Jurisdiction">Jurisdiction</a>
	 */
	public static final String Jurisdiction = DCTERMS.NAMESPACE + "Jurisdiction";

	/**
	 * Language
	 * <p>
	 * {@code http://purl.org/dc/terms/language}.
	 * <p>
	 * A language of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/language">language</a>
	 */
	public static final String language = DCTERMS.NAMESPACE + "language";

	/**
	 * LCC
	 * <p>
	 * {@code http://purl.org/dc/terms/LCC}.
	 * <p>
	 * The set of conceptual resources specified by the Library of Congress
	 * Classification.
	 *
	 * @see <a href="http://purl.org/dc/terms/LCC">LCC</a>
	 */
	public static final String LCC = DCTERMS.NAMESPACE + "LCC";

	/**
	 * LCSH
	 * <p>
	 * {@code http://purl.org/dc/terms/LCSH}.
	 * <p>
	 * The set of labeled concepts specified by the Library of Congress
	 * Subject Headings.
	 *
	 * @see <a href="http://purl.org/dc/terms/LCSH">LCSH</a>
	 */
	public static final String LCSH = DCTERMS.NAMESPACE + "LCSH";

	/**
	 * License
	 * <p>
	 * {@code http://purl.org/dc/terms/license}.
	 * <p>
	 * A legal document giving official permission to do something with the
	 * resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/license">license</a>
	 */
	public static final String license = DCTERMS.NAMESPACE + "license";

	/**
	 * License Document
	 * <p>
	 * {@code http://purl.org/dc/terms/LicenseDocument}.
	 * <p>
	 * A legal document giving official permission to do something with a
	 * Resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/LicenseDocument">LicenseDocument</a>
	 */
	public static final String LicenseDocument = DCTERMS.NAMESPACE + "LicenseDocument";

	/**
	 * Linguistic System
	 * <p>
	 * {@code http://purl.org/dc/terms/LinguisticSystem}.
	 * <p>
	 * A system of signs, symbols, sounds, gestures, or rules used in
	 * communication.
	 *
	 * @see <a href="http://purl.org/dc/terms/LinguisticSystem">LinguisticSystem</a>
	 */
	public static final String LinguisticSystem = DCTERMS.NAMESPACE + "LinguisticSystem";

	/**
	 * Location
	 * <p>
	 * {@code http://purl.org/dc/terms/Location}.
	 * <p>
	 * A spatial region or named place.
	 *
	 * @see <a href="http://purl.org/dc/terms/Location">Location</a>
	 */
	public static final String Location = DCTERMS.NAMESPACE + "Location";

	/**
	 * Location, Period, or Jurisdiction
	 * <p>
	 * {@code http://purl.org/dc/terms/LocationPeriodOrJurisdiction}.
	 * <p>
	 * A location, period of time, or jurisdiction.
	 *
	 * @see <a href="http://purl.org/dc/terms/LocationPeriodOrJurisdiction">LocationPeriodOrJurisdiction</a>
	 */
	public static final String LocationPeriodOrJurisdiction = DCTERMS.NAMESPACE + "LocationPeriodOrJurisdiction";

	/**
	 * Mediator
	 * <p>
	 * {@code http://purl.org/dc/terms/mediator}.
	 * <p>
	 * An entity that mediates access to the resource and for whom the
	 * resource is intended or useful.
	 *
	 * @see <a href="http://purl.org/dc/terms/mediator">mediator</a>
	 */
	public static final String mediator = DCTERMS.NAMESPACE + "mediator";

	/**
	 * Media Type
	 * <p>
	 * {@code http://purl.org/dc/terms/MediaType}.
	 * <p>
	 * A file format or physical medium.
	 *
	 * @see <a href="http://purl.org/dc/terms/MediaType">MediaType</a>
	 */
	public static final String MediaType = DCTERMS.NAMESPACE + "MediaType";

	/**
	 * Media Type or Extent
	 * <p>
	 * {@code http://purl.org/dc/terms/MediaTypeOrExtent}.
	 * <p>
	 * A media type or extent.
	 *
	 * @see <a href="http://purl.org/dc/terms/MediaTypeOrExtent">MediaTypeOrExtent</a>
	 */
	public static final String MediaTypeOrExtent = DCTERMS.NAMESPACE + "MediaTypeOrExtent";

	/**
	 * Medium
	 * <p>
	 * {@code http://purl.org/dc/terms/medium}.
	 * <p>
	 * The material or physical carrier of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/medium">medium</a>
	 */
	public static final String medium = DCTERMS.NAMESPACE + "medium";

	/**
	 * MeSH
	 * <p>
	 * {@code http://purl.org/dc/terms/MESH}.
	 * <p>
	 * The set of labeled concepts specified by the Medical Subject Headings.
	 *
	 * @see <a href="http://purl.org/dc/terms/MESH">MESH</a>
	 */
	public static final String MESH = DCTERMS.NAMESPACE + "MESH";

	/**
	 * Method of Accrual
	 * <p>
	 * {@code http://purl.org/dc/terms/MethodOfAccrual}.
	 * <p>
	 * A method by which resources are added to a collection.
	 *
	 * @see <a href="http://purl.org/dc/terms/MethodOfAccrual">MethodOfAccrual</a>
	 */
	public static final String MethodOfAccrual = DCTERMS.NAMESPACE + "MethodOfAccrual";

	/**
	 * Method of Instruction
	 * <p>
	 * {@code http://purl.org/dc/terms/MethodOfInstruction}.
	 * <p>
	 * A process that is used to engender knowledge, attitudes, and skills.
	 *
	 * @see <a href="http://purl.org/dc/terms/MethodOfInstruction">MethodOfInstruction</a>
	 */
	public static final String MethodOfInstruction = DCTERMS.NAMESPACE + "MethodOfInstruction";

	/**
	 * Date Modified
	 * <p>
	 * {@code http://purl.org/dc/terms/modified}.
	 * <p>
	 * Date on which the resource was changed.
	 *
	 * @see <a href="http://purl.org/dc/terms/modified">modified</a>
	 */
	public static final String modified = DCTERMS.NAMESPACE + "modified";

	/**
	 * NLM
	 * <p>
	 * {@code http://purl.org/dc/terms/NLM}.
	 * <p>
	 * The set of conceptual resources specified by the National Library of
	 * Medicine Classification.
	 *
	 * @see <a href="http://purl.org/dc/terms/NLM">NLM</a>
	 */
	public static final String NLM = DCTERMS.NAMESPACE + "NLM";

	/**
	 * DCMI Period
	 * <p>
	 * {@code http://purl.org/dc/terms/Period}.
	 * <p>
	 * The set of time intervals defined by their limits according to the
	 * DCMI Period Encoding Scheme.
	 *
	 * @see <a href="http://purl.org/dc/terms/Period">Period</a>
	 */
	public static final String Period = DCTERMS.NAMESPACE + "Period";

	/**
	 * Period of Time
	 * <p>
	 * {@code http://purl.org/dc/terms/PeriodOfTime}.
	 * <p>
	 * An interval of time that is named or defined by its start and end
	 * dates.
	 *
	 * @see <a href="http://purl.org/dc/terms/PeriodOfTime">PeriodOfTime</a>
	 */
	public static final String PeriodOfTime = DCTERMS.NAMESPACE + "PeriodOfTime";

	/**
	 * Physical Medium
	 * <p>
	 * {@code http://purl.org/dc/terms/PhysicalMedium}.
	 * <p>
	 * A physical material or carrier.
	 *
	 * @see <a href="http://purl.org/dc/terms/PhysicalMedium">PhysicalMedium</a>
	 */
	public static final String PhysicalMedium = DCTERMS.NAMESPACE + "PhysicalMedium";

	/**
	 * Physical Resource
	 * <p>
	 * {@code http://purl.org/dc/terms/PhysicalResource}.
	 * <p>
	 * A material thing.
	 *
	 * @see <a href="http://purl.org/dc/terms/PhysicalResource">PhysicalResource</a>
	 */
	public static final String PhysicalResource = DCTERMS.NAMESPACE + "PhysicalResource";

	/**
	 * DCMI Point
	 * <p>
	 * {@code http://purl.org/dc/terms/Point}.
	 * <p>
	 * The set of points in space defined by their geographic coordinates
	 * according to the DCMI Point Encoding Scheme.
	 *
	 * @see <a href="http://purl.org/dc/terms/Point">Point</a>
	 */
	public static final String Point = DCTERMS.NAMESPACE + "Point";

	/**
	 * Policy
	 * <p>
	 * {@code http://purl.org/dc/terms/Policy}.
	 * <p>
	 * A plan or course of action by an authority, intended to influence and
	 * determine decisions, actions, and other matters.
	 *
	 * @see <a href="http://purl.org/dc/terms/Policy">Policy</a>
	 */
	public static final String Policy = DCTERMS.NAMESPACE + "Policy";

	/**
	 * Provenance
	 * <p>
	 * {@code http://purl.org/dc/terms/provenance}.
	 * <p>
	 * A statement of any changes in ownership and custody of the resource
	 * since its creation that are significant for its authenticity,
	 * integrity, and interpretation.
	 *
	 * @see <a href="http://purl.org/dc/terms/provenance">provenance</a>
	 */
	public static final String provenance = DCTERMS.NAMESPACE + "provenance";

	/**
	 * Provenance Statement
	 * <p>
	 * {@code http://purl.org/dc/terms/ProvenanceStatement}.
	 * <p>
	 * A statement of any changes in ownership and custody of a resource
	 * since its creation that are significant for its authenticity,
	 * integrity, and interpretation.
	 *
	 * @see <a href="http://purl.org/dc/terms/ProvenanceStatement">ProvenanceStatement</a>
	 */
	public static final String ProvenanceStatement = DCTERMS.NAMESPACE + "ProvenanceStatement";

	/**
	 * Publisher
	 * <p>
	 * {@code http://purl.org/dc/terms/publisher}.
	 * <p>
	 * An entity responsible for making the resource available.
	 *
	 * @see <a href="http://purl.org/dc/terms/publisher">publisher</a>
	 */
	public static final String publisher = DCTERMS.NAMESPACE + "publisher";

	/**
	 * References
	 * <p>
	 * {@code http://purl.org/dc/terms/references}.
	 * <p>
	 * A related resource that is referenced, cited, or otherwise pointed to
	 * by the described resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/references">references</a>
	 */
	public static final String references = DCTERMS.NAMESPACE + "references";

	/**
	 * Relation
	 * <p>
	 * {@code http://purl.org/dc/terms/relation}.
	 * <p>
	 * A related resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/relation">relation</a>
	 */
	public static final String relation = DCTERMS.NAMESPACE + "relation";

	/**
	 * Replaces
	 * <p>
	 * {@code http://purl.org/dc/terms/replaces}.
	 * <p>
	 * A related resource that is supplanted, displaced, or superseded by the
	 * described resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/replaces">replaces</a>
	 */
	public static final String replaces = DCTERMS.NAMESPACE + "replaces";

	/**
	 * Requires
	 * <p>
	 * {@code http://purl.org/dc/terms/requires}.
	 * <p>
	 * A related resource that is required by the described resource to
	 * support its function, delivery, or coherence.
	 *
	 * @see <a href="http://purl.org/dc/terms/requires">requires</a>
	 */
	public static final String requires = DCTERMS.NAMESPACE + "requires";

	/**
	 * RFC 1766
	 * <p>
	 * {@code http://purl.org/dc/terms/RFC1766}.
	 * <p>
	 * The set of tags, constructed according to RFC 1766, for the
	 * identification of languages.
	 *
	 * @see <a href="http://purl.org/dc/terms/RFC1766">RFC1766</a>
	 */
	public static final String RFC1766 = DCTERMS.NAMESPACE + "RFC1766";

	/**
	 * RFC 3066
	 * <p>
	 * {@code http://purl.org/dc/terms/RFC3066}.
	 * <p>
	 * The set of tags constructed according to RFC 3066 for the
	 * identification of languages.
	 *
	 * @see <a href="http://purl.org/dc/terms/RFC3066">RFC3066</a>
	 */
	public static final String RFC3066 = DCTERMS.NAMESPACE + "RFC3066";

	/**
	 * RFC 4646
	 * <p>
	 * {@code http://purl.org/dc/terms/RFC4646}.
	 * <p>
	 * The set of tags constructed according to RFC 4646 for the
	 * identification of languages.
	 *
	 * @see <a href="http://purl.org/dc/terms/RFC4646">RFC4646</a>
	 */
	public static final String RFC4646 = DCTERMS.NAMESPACE + "RFC4646";

	/**
	 * RFC 5646
	 * <p>
	 * {@code http://purl.org/dc/terms/RFC5646}.
	 * <p>
	 * The set of tags constructed according to RFC 5646 for the
	 * identification of languages.
	 *
	 * @see <a href="http://purl.org/dc/terms/RFC5646">RFC5646</a>
	 */
	public static final String RFC5646 = DCTERMS.NAMESPACE + "RFC5646";

	/**
	 * Rights
	 * <p>
	 * {@code http://purl.org/dc/terms/rights}.
	 * <p>
	 * Information about rights held in and over the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/rights">rights</a>
	 */
	public static final String rights = DCTERMS.NAMESPACE + "rights";

	/**
	 * Rights Holder
	 * <p>
	 * {@code http://purl.org/dc/terms/rightsHolder}.
	 * <p>
	 * A person or organization owning or managing rights over the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/rightsHolder">rightsHolder</a>
	 */
	public static final String rightsHolder = DCTERMS.NAMESPACE + "rightsHolder";

	/**
	 * Rights Statement
	 * <p>
	 * {@code http://purl.org/dc/terms/RightsStatement}.
	 * <p>
	 * A statement about the intellectual property rights (IPR) held in or
	 * over a Resource, a legal document giving official permission to do
	 * something with a resource, or a statement about access rights.
	 *
	 * @see <a href="http://purl.org/dc/terms/RightsStatement">RightsStatement</a>
	 */
	public static final String RightsStatement = DCTERMS.NAMESPACE + "RightsStatement";

	/**
	 * Size or Duration
	 * <p>
	 * {@code http://purl.org/dc/terms/SizeOrDuration}.
	 * <p>
	 * A dimension or extent, or a time taken to play or execute.
	 *
	 * @see <a href="http://purl.org/dc/terms/SizeOrDuration">SizeOrDuration</a>
	 */
	public static final String SizeOrDuration = DCTERMS.NAMESPACE + "SizeOrDuration";

	/**
	 * Source
	 * <p>
	 * {@code http://purl.org/dc/terms/source}.
	 * <p>
	 * A related resource from which the described resource is derived.
	 *
	 * @see <a href="http://purl.org/dc/terms/source">source</a>
	 */
	public static final String source = DCTERMS.NAMESPACE + "source";

	/**
	 * Spatial Coverage
	 * <p>
	 * {@code http://purl.org/dc/terms/spatial}.
	 * <p>
	 * Spatial characteristics of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/spatial">spatial</a>
	 */
	public static final String spatial = DCTERMS.NAMESPACE + "spatial";

	/**
	 * Standard
	 * <p>
	 * {@code http://purl.org/dc/terms/Standard}.
	 * <p>
	 * A basis for comparison; a reference point against which other things
	 * can be evaluated.
	 *
	 * @see <a href="http://purl.org/dc/terms/Standard">Standard</a>
	 */
	public static final String Standard = DCTERMS.NAMESPACE + "Standard";

	/**
	 * Subject
	 * <p>
	 * {@code http://purl.org/dc/terms/subject}.
	 * <p>
	 * The topic of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/subject">subject</a>
	 */
	public static final String subject = DCTERMS.NAMESPACE + "subject";

	/**
	 * Table Of Contents
	 * <p>
	 * {@code http://purl.org/dc/terms/tableOfContents}.
	 * <p>
	 * A list of subunits of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/tableOfContents">tableOfContents</a>
	 */
	public static final String tableOfContents = DCTERMS.NAMESPACE + "tableOfContents";

	/**
	 * Temporal Coverage
	 * <p>
	 * {@code http://purl.org/dc/terms/temporal}.
	 * <p>
	 * Temporal characteristics of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/temporal">temporal</a>
	 */
	public static final String temporal = DCTERMS.NAMESPACE + "temporal";

	/**
	 * TGN
	 * <p>
	 * {@code http://purl.org/dc/terms/TGN}.
	 * <p>
	 * The set of places specified by the Getty Thesaurus of Geographic
	 * Names.
	 *
	 * @see <a href="http://purl.org/dc/terms/TGN">TGN</a>
	 */
	public static final String TGN = DCTERMS.NAMESPACE + "TGN";

	/**
	 * Title
	 * <p>
	 * {@code http://purl.org/dc/terms/title}.
	 * <p>
	 * A name given to the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/title">title</a>
	 */
	public static final String title = DCTERMS.NAMESPACE + "title";

	/**
	 * Type
	 * <p>
	 * {@code http://purl.org/dc/terms/type}.
	 * <p>
	 * The nature or genre of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/type">type</a>
	 */
	public static final String type = DCTERMS.NAMESPACE + "type";

	/**
	 * UDC
	 * <p>
	 * {@code http://purl.org/dc/terms/UDC}.
	 * <p>
	 * The set of conceptual resources specified by the Universal Decimal
	 * Classification.
	 *
	 * @see <a href="http://purl.org/dc/terms/UDC">UDC</a>
	 */
	public static final String UDC = DCTERMS.NAMESPACE + "UDC";

	/**
	 * URI
	 * <p>
	 * {@code http://purl.org/dc/terms/URI}.
	 * <p>
	 * The set of identifiers constructed according to the generic syntax for
	 * Uniform Resource Identifiers as specified by the Internet Engineering
	 * Task Force.
	 *
	 * @see <a href="http://purl.org/dc/terms/URI">URI</a>
	 */
	public static final String URI = DCTERMS.NAMESPACE + "URI";

	/**
	 * Date Valid
	 * <p>
	 * {@code http://purl.org/dc/terms/valid}.
	 * <p>
	 * Date (often a range) of validity of a resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/valid">valid</a>
	 */
	public static final String valid = DCTERMS.NAMESPACE + "valid";

	/**
	 * W3C-DTF
	 * <p>
	 * {@code http://purl.org/dc/terms/W3CDTF}.
	 * <p>
	 * The set of dates and times constructed according to the W3C Date and
	 * Time Formats Specification.
	 *
	 * @see <a href="http://purl.org/dc/terms/W3CDTF">W3CDTF</a>
	 */
	public static final String W3CDTF = DCTERMS.NAMESPACE + "W3CDTF";

	/**
	 * Abstract
	 * <p>
	 * {@code http://purl.org/dc/terms/abstract}.
	 * <p>
	 * A summary of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/abstract">abstract</a>
	 */
	public static final URI abstract_URI;

	/**
	 * Access Rights
	 * <p>
	 * {@code http://purl.org/dc/terms/accessRights}.
	 * <p>
	 * Information about who can access the resource or an indication of its
	 * security status.
	 *
	 * @see <a href="http://purl.org/dc/terms/accessRights">accessRights</a>
	 */
	public static final URI accessRights_URI;

	/**
	 * Accrual Method
	 * <p>
	 * {@code http://purl.org/dc/terms/accrualMethod}.
	 * <p>
	 * The method by which items are added to a collection.
	 *
	 * @see <a href="http://purl.org/dc/terms/accrualMethod">accrualMethod</a>
	 */
	public static final URI accrualMethod_URI;

	/**
	 * Accrual Periodicity
	 * <p>
	 * {@code http://purl.org/dc/terms/accrualPeriodicity}.
	 * <p>
	 * The frequency with which items are added to a collection.
	 *
	 * @see <a href="http://purl.org/dc/terms/accrualPeriodicity">accrualPeriodicity</a>
	 */
	public static final URI accrualPeriodicity_URI;

	/**
	 * Accrual Policy
	 * <p>
	 * {@code http://purl.org/dc/terms/accrualPolicy}.
	 * <p>
	 * The policy governing the addition of items to a collection.
	 *
	 * @see <a href="http://purl.org/dc/terms/accrualPolicy">accrualPolicy</a>
	 */
	public static final URI accrualPolicy_URI;

	/**
	 * Agent
	 * <p>
	 * {@code http://purl.org/dc/terms/Agent}.
	 * <p>
	 * A resource that acts or has the power to act.
	 *
	 * @see <a href="http://purl.org/dc/terms/Agent">Agent</a>
	 */
	public static final URI Agent_URI;

	/**
	 * Agent Class
	 * <p>
	 * {@code http://purl.org/dc/terms/AgentClass}.
	 * <p>
	 * A group of agents.
	 *
	 * @see <a href="http://purl.org/dc/terms/AgentClass">AgentClass</a>
	 */
	public static final URI AgentClass_URI;

	/**
	 * Alternative Title
	 * <p>
	 * {@code http://purl.org/dc/terms/alternative}.
	 * <p>
	 * An alternative name for the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/alternative">alternative</a>
	 */
	public static final URI alternative_URI;

	/**
	 * Audience
	 * <p>
	 * {@code http://purl.org/dc/terms/audience}.
	 * <p>
	 * A class of entity for whom the resource is intended or useful.
	 *
	 * @see <a href="http://purl.org/dc/terms/audience">audience</a>
	 */
	public static final URI audience_URI;

	/**
	 * Date Available
	 * <p>
	 * {@code http://purl.org/dc/terms/available}.
	 * <p>
	 * Date (often a range) that the resource became or will become
	 * available.
	 *
	 * @see <a href="http://purl.org/dc/terms/available">available</a>
	 */
	public static final URI available_URI;

	/**
	 * Bibliographic Citation
	 * <p>
	 * {@code http://purl.org/dc/terms/bibliographicCitation}.
	 * <p>
	 * A bibliographic reference for the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/bibliographicCitation">bibliographicCitation</a>
	 */
	public static final URI bibliographicCitation_URI;

	/**
	 * Bibliographic Resource
	 * <p>
	 * {@code http://purl.org/dc/terms/BibliographicResource}.
	 * <p>
	 * A book, article, or other documentary resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/BibliographicResource">BibliographicResource</a>
	 */
	public static final URI BibliographicResource_URI;

	/**
	 * DCMI Box
	 * <p>
	 * {@code http://purl.org/dc/terms/Box}.
	 * <p>
	 * The set of regions in space defined by their geographic coordinates
	 * according to the DCMI Box Encoding Scheme.
	 *
	 * @see <a href="http://purl.org/dc/terms/Box">Box</a>
	 */
	public static final URI Box_URI;

	/**
	 * Conforms To
	 * <p>
	 * {@code http://purl.org/dc/terms/conformsTo}.
	 * <p>
	 * An established standard to which the described resource conforms.
	 *
	 * @see <a href="http://purl.org/dc/terms/conformsTo">conformsTo</a>
	 */
	public static final URI conformsTo_URI;

	/**
	 * Contributor
	 * <p>
	 * {@code http://purl.org/dc/terms/contributor}.
	 * <p>
	 * An entity responsible for making contributions to the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/contributor">contributor</a>
	 */
	public static final URI contributor_URI;

	/**
	 * Coverage
	 * <p>
	 * {@code http://purl.org/dc/terms/coverage}.
	 * <p>
	 * The spatial or temporal topic of the resource, the spatial
	 * applicability of the resource, or the jurisdiction under which the
	 * resource is relevant.
	 *
	 * @see <a href="http://purl.org/dc/terms/coverage">coverage</a>
	 */
	public static final URI coverage_URI;

	/**
	 * Date Created
	 * <p>
	 * {@code http://purl.org/dc/terms/created}.
	 * <p>
	 * Date of creation of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/created">created</a>
	 */
	public static final URI created_URI;

	/**
	 * Creator
	 * <p>
	 * {@code http://purl.org/dc/terms/creator}.
	 * <p>
	 * An entity primarily responsible for making the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/creator">creator</a>
	 */
	public static final URI creator_URI;

	/**
	 * Date
	 * <p>
	 * {@code http://purl.org/dc/terms/date}.
	 * <p>
	 * A point or period of time associated with an event in the lifecycle of
	 * the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/date">date</a>
	 */
	public static final URI date_URI;

	/**
	 * Date Accepted
	 * <p>
	 * {@code http://purl.org/dc/terms/dateAccepted}.
	 * <p>
	 * Date of acceptance of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/dateAccepted">dateAccepted</a>
	 */
	public static final URI dateAccepted_URI;

	/**
	 * Date Copyrighted
	 * <p>
	 * {@code http://purl.org/dc/terms/dateCopyrighted}.
	 * <p>
	 * Date of copyright.
	 *
	 * @see <a href="http://purl.org/dc/terms/dateCopyrighted">dateCopyrighted</a>
	 */
	public static final URI dateCopyrighted_URI;

	/**
	 * Date Submitted
	 * <p>
	 * {@code http://purl.org/dc/terms/dateSubmitted}.
	 * <p>
	 * Date of submission of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/dateSubmitted">dateSubmitted</a>
	 */
	public static final URI dateSubmitted_URI;

	/**
	 * DCMI Type Vocabulary
	 * <p>
	 * {@code http://purl.org/dc/terms/DCMIType}.
	 * <p>
	 * The set of classes specified by the DCMI Type Vocabulary, used to
	 * categorize the nature or genre of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/DCMIType">DCMIType</a>
	 */
	public static final URI DCMIType_URI;

	/**
	 * DDC
	 * <p>
	 * {@code http://purl.org/dc/terms/DDC}.
	 * <p>
	 * The set of conceptual resources specified by the Dewey Decimal
	 * Classification.
	 *
	 * @see <a href="http://purl.org/dc/terms/DDC">DDC</a>
	 */
	public static final URI DDC_URI;

	/**
	 * Description
	 * <p>
	 * {@code http://purl.org/dc/terms/description}.
	 * <p>
	 * An account of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/description">description</a>
	 */
	public static final URI description_URI;

	/**
	 * Audience Education Level
	 * <p>
	 * {@code http://purl.org/dc/terms/educationLevel}.
	 * <p>
	 * A class of entity, defined in terms of progression through an
	 * educational or training context, for which the described resource is
	 * intended.
	 *
	 * @see <a href="http://purl.org/dc/terms/educationLevel">educationLevel</a>
	 */
	public static final URI educationLevel_URI;

	/**
	 * Extent
	 * <p>
	 * {@code http://purl.org/dc/terms/extent}.
	 * <p>
	 * The size or duration of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/extent">extent</a>
	 */
	public static final URI extent_URI;

	/**
	 * File Format
	 * <p>
	 * {@code http://purl.org/dc/terms/FileFormat}.
	 * <p>
	 * A digital resource format.
	 *
	 * @see <a href="http://purl.org/dc/terms/FileFormat">FileFormat</a>
	 */
	public static final URI FileFormat_URI;

	/**
	 * Format
	 * <p>
	 * {@code http://purl.org/dc/terms/format}.
	 * <p>
	 * The file format, physical medium, or dimensions of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/format">format</a>
	 */
	public static final URI format_URI;

	/**
	 * Frequency
	 * <p>
	 * {@code http://purl.org/dc/terms/Frequency}.
	 * <p>
	 * A rate at which something recurs.
	 *
	 * @see <a href="http://purl.org/dc/terms/Frequency">Frequency</a>
	 */
	public static final URI Frequency_URI;

	/**
	 * Has Format
	 * <p>
	 * {@code http://purl.org/dc/terms/hasFormat}.
	 * <p>
	 * A related resource that is substantially the same as the pre-existing
	 * described resource, but in another format.
	 *
	 * @see <a href="http://purl.org/dc/terms/hasFormat">hasFormat</a>
	 */
	public static final URI hasFormat_URI;

	/**
	 * Has Part
	 * <p>
	 * {@code http://purl.org/dc/terms/hasPart}.
	 * <p>
	 * A related resource that is included either physically or logically in
	 * the described resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/hasPart">hasPart</a>
	 */
	public static final URI hasPart_URI;

	/**
	 * Has Version
	 * <p>
	 * {@code http://purl.org/dc/terms/hasVersion}.
	 * <p>
	 * A related resource that is a version, edition, or adaptation of the
	 * described resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/hasVersion">hasVersion</a>
	 */
	public static final URI hasVersion_URI;

	/**
	 * Identifier
	 * <p>
	 * {@code http://purl.org/dc/terms/identifier}.
	 * <p>
	 * An unambiguous reference to the resource within a given context.
	 *
	 * @see <a href="http://purl.org/dc/terms/identifier">identifier</a>
	 */
	public static final URI identifier_URI;

	/**
	 * IMT
	 * <p>
	 * {@code http://purl.org/dc/terms/IMT}.
	 * <p>
	 * The set of media types specified by the Internet Assigned Numbers
	 * Authority.
	 *
	 * @see <a href="http://purl.org/dc/terms/IMT">IMT</a>
	 */
	public static final URI IMT_URI;

	/**
	 * Instructional Method
	 * <p>
	 * {@code http://purl.org/dc/terms/instructionalMethod}.
	 * <p>
	 * A process, used to engender knowledge, attitudes and skills, that the
	 * described resource is designed to support.
	 *
	 * @see <a href="http://purl.org/dc/terms/instructionalMethod">instructionalMethod</a>
	 */
	public static final URI instructionalMethod_URI;

	/**
	 * Is Format Of
	 * <p>
	 * {@code http://purl.org/dc/terms/isFormatOf}.
	 * <p>
	 * A related resource that is substantially the same as the described
	 * resource, but in another format.
	 *
	 * @see <a href="http://purl.org/dc/terms/isFormatOf">isFormatOf</a>
	 */
	public static final URI isFormatOf_URI;

	/**
	 * ISO 3166
	 * <p>
	 * {@code http://purl.org/dc/terms/ISO3166}.
	 * <p>
	 * The set of codes listed in ISO 3166-1 for the representation of names
	 * of countries.
	 *
	 * @see <a href="http://purl.org/dc/terms/ISO3166">ISO3166</a>
	 */
	public static final URI ISO3166_URI;

	/**
	 * ISO 639-2
	 * <p>
	 * {@code http://purl.org/dc/terms/ISO639-2}.
	 * <p>
	 * The three-letter alphabetic codes listed in ISO639-2 for the
	 * representation of names of languages.
	 *
	 * @see <a href="http://purl.org/dc/terms/ISO639-2">ISO639-2</a>
	 */
	public static final URI ISO639_2_URI;

	/**
	 * ISO 639-3
	 * <p>
	 * {@code http://purl.org/dc/terms/ISO639-3}.
	 * <p>
	 * The set of three-letter codes listed in ISO 639-3 for the
	 * representation of names of languages.
	 *
	 * @see <a href="http://purl.org/dc/terms/ISO639-3">ISO639-3</a>
	 */
	public static final URI ISO639_3_URI;

	/**
	 * Is Part Of
	 * <p>
	 * {@code http://purl.org/dc/terms/isPartOf}.
	 * <p>
	 * A related resource in which the described resource is physically or
	 * logically included.
	 *
	 * @see <a href="http://purl.org/dc/terms/isPartOf">isPartOf</a>
	 */
	public static final URI isPartOf_URI;

	/**
	 * Is Referenced By
	 * <p>
	 * {@code http://purl.org/dc/terms/isReferencedBy}.
	 * <p>
	 * A related resource that references, cites, or otherwise points to the
	 * described resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/isReferencedBy">isReferencedBy</a>
	 */
	public static final URI isReferencedBy_URI;

	/**
	 * Is Replaced By
	 * <p>
	 * {@code http://purl.org/dc/terms/isReplacedBy}.
	 * <p>
	 * A related resource that supplants, displaces, or supersedes the
	 * described resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/isReplacedBy">isReplacedBy</a>
	 */
	public static final URI isReplacedBy_URI;

	/**
	 * Is Required By
	 * <p>
	 * {@code http://purl.org/dc/terms/isRequiredBy}.
	 * <p>
	 * A related resource that requires the described resource to support its
	 * function, delivery, or coherence.
	 *
	 * @see <a href="http://purl.org/dc/terms/isRequiredBy">isRequiredBy</a>
	 */
	public static final URI isRequiredBy_URI;

	/**
	 * Date Issued
	 * <p>
	 * {@code http://purl.org/dc/terms/issued}.
	 * <p>
	 * Date of formal issuance (e.g., publication) of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/issued">issued</a>
	 */
	public static final URI issued_URI;

	/**
	 * Is Version Of
	 * <p>
	 * {@code http://purl.org/dc/terms/isVersionOf}.
	 * <p>
	 * A related resource of which the described resource is a version,
	 * edition, or adaptation.
	 *
	 * @see <a href="http://purl.org/dc/terms/isVersionOf">isVersionOf</a>
	 */
	public static final URI isVersionOf_URI;

	/**
	 * Jurisdiction
	 * <p>
	 * {@code http://purl.org/dc/terms/Jurisdiction}.
	 * <p>
	 * The extent or range of judicial, law enforcement, or other authority.
	 *
	 * @see <a href="http://purl.org/dc/terms/Jurisdiction">Jurisdiction</a>
	 */
	public static final URI Jurisdiction_URI;

	/**
	 * Language
	 * <p>
	 * {@code http://purl.org/dc/terms/language}.
	 * <p>
	 * A language of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/language">language</a>
	 */
	public static final URI language_URI;

	/**
	 * LCC
	 * <p>
	 * {@code http://purl.org/dc/terms/LCC}.
	 * <p>
	 * The set of conceptual resources specified by the Library of Congress
	 * Classification.
	 *
	 * @see <a href="http://purl.org/dc/terms/LCC">LCC</a>
	 */
	public static final URI LCC_URI;

	/**
	 * LCSH
	 * <p>
	 * {@code http://purl.org/dc/terms/LCSH}.
	 * <p>
	 * The set of labeled concepts specified by the Library of Congress
	 * Subject Headings.
	 *
	 * @see <a href="http://purl.org/dc/terms/LCSH">LCSH</a>
	 */
	public static final URI LCSH_URI;

	/**
	 * License
	 * <p>
	 * {@code http://purl.org/dc/terms/license}.
	 * <p>
	 * A legal document giving official permission to do something with the
	 * resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/license">license</a>
	 */
	public static final URI license_URI;

	/**
	 * License Document
	 * <p>
	 * {@code http://purl.org/dc/terms/LicenseDocument}.
	 * <p>
	 * A legal document giving official permission to do something with a
	 * Resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/LicenseDocument">LicenseDocument</a>
	 */
	public static final URI LicenseDocument_URI;

	/**
	 * Linguistic System
	 * <p>
	 * {@code http://purl.org/dc/terms/LinguisticSystem}.
	 * <p>
	 * A system of signs, symbols, sounds, gestures, or rules used in
	 * communication.
	 *
	 * @see <a href="http://purl.org/dc/terms/LinguisticSystem">LinguisticSystem</a>
	 */
	public static final URI LinguisticSystem_URI;

	/**
	 * Location
	 * <p>
	 * {@code http://purl.org/dc/terms/Location}.
	 * <p>
	 * A spatial region or named place.
	 *
	 * @see <a href="http://purl.org/dc/terms/Location">Location</a>
	 */
	public static final URI Location_URI;

	/**
	 * Location, Period, or Jurisdiction
	 * <p>
	 * {@code http://purl.org/dc/terms/LocationPeriodOrJurisdiction}.
	 * <p>
	 * A location, period of time, or jurisdiction.
	 *
	 * @see <a href="http://purl.org/dc/terms/LocationPeriodOrJurisdiction">LocationPeriodOrJurisdiction</a>
	 */
	public static final URI LocationPeriodOrJurisdiction_URI;

	/**
	 * Mediator
	 * <p>
	 * {@code http://purl.org/dc/terms/mediator}.
	 * <p>
	 * An entity that mediates access to the resource and for whom the
	 * resource is intended or useful.
	 *
	 * @see <a href="http://purl.org/dc/terms/mediator">mediator</a>
	 */
	public static final URI mediator_URI;

	/**
	 * Media Type
	 * <p>
	 * {@code http://purl.org/dc/terms/MediaType}.
	 * <p>
	 * A file format or physical medium.
	 *
	 * @see <a href="http://purl.org/dc/terms/MediaType">MediaType</a>
	 */
	public static final URI MediaType_URI;

	/**
	 * Media Type or Extent
	 * <p>
	 * {@code http://purl.org/dc/terms/MediaTypeOrExtent}.
	 * <p>
	 * A media type or extent.
	 *
	 * @see <a href="http://purl.org/dc/terms/MediaTypeOrExtent">MediaTypeOrExtent</a>
	 */
	public static final URI MediaTypeOrExtent_URI;

	/**
	 * Medium
	 * <p>
	 * {@code http://purl.org/dc/terms/medium}.
	 * <p>
	 * The material or physical carrier of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/medium">medium</a>
	 */
	public static final URI medium_URI;

	/**
	 * MeSH
	 * <p>
	 * {@code http://purl.org/dc/terms/MESH}.
	 * <p>
	 * The set of labeled concepts specified by the Medical Subject Headings.
	 *
	 * @see <a href="http://purl.org/dc/terms/MESH">MESH</a>
	 */
	public static final URI MESH_URI;

	/**
	 * Method of Accrual
	 * <p>
	 * {@code http://purl.org/dc/terms/MethodOfAccrual}.
	 * <p>
	 * A method by which resources are added to a collection.
	 *
	 * @see <a href="http://purl.org/dc/terms/MethodOfAccrual">MethodOfAccrual</a>
	 */
	public static final URI MethodOfAccrual_URI;

	/**
	 * Method of Instruction
	 * <p>
	 * {@code http://purl.org/dc/terms/MethodOfInstruction}.
	 * <p>
	 * A process that is used to engender knowledge, attitudes, and skills.
	 *
	 * @see <a href="http://purl.org/dc/terms/MethodOfInstruction">MethodOfInstruction</a>
	 */
	public static final URI MethodOfInstruction_URI;

	/**
	 * Date Modified
	 * <p>
	 * {@code http://purl.org/dc/terms/modified}.
	 * <p>
	 * Date on which the resource was changed.
	 *
	 * @see <a href="http://purl.org/dc/terms/modified">modified</a>
	 */
	public static final URI modified_URI;

	/**
	 * NLM
	 * <p>
	 * {@code http://purl.org/dc/terms/NLM}.
	 * <p>
	 * The set of conceptual resources specified by the National Library of
	 * Medicine Classification.
	 *
	 * @see <a href="http://purl.org/dc/terms/NLM">NLM</a>
	 */
	public static final URI NLM_URI;

	/**
	 * DCMI Period
	 * <p>
	 * {@code http://purl.org/dc/terms/Period}.
	 * <p>
	 * The set of time intervals defined by their limits according to the
	 * DCMI Period Encoding Scheme.
	 *
	 * @see <a href="http://purl.org/dc/terms/Period">Period</a>
	 */
	public static final URI Period_URI;

	/**
	 * Period of Time
	 * <p>
	 * {@code http://purl.org/dc/terms/PeriodOfTime}.
	 * <p>
	 * An interval of time that is named or defined by its start and end
	 * dates.
	 *
	 * @see <a href="http://purl.org/dc/terms/PeriodOfTime">PeriodOfTime</a>
	 */
	public static final URI PeriodOfTime_URI;

	/**
	 * Physical Medium
	 * <p>
	 * {@code http://purl.org/dc/terms/PhysicalMedium}.
	 * <p>
	 * A physical material or carrier.
	 *
	 * @see <a href="http://purl.org/dc/terms/PhysicalMedium">PhysicalMedium</a>
	 */
	public static final URI PhysicalMedium_URI;

	/**
	 * Physical Resource
	 * <p>
	 * {@code http://purl.org/dc/terms/PhysicalResource}.
	 * <p>
	 * A material thing.
	 *
	 * @see <a href="http://purl.org/dc/terms/PhysicalResource">PhysicalResource</a>
	 */
	public static final URI PhysicalResource_URI;

	/**
	 * DCMI Point
	 * <p>
	 * {@code http://purl.org/dc/terms/Point}.
	 * <p>
	 * The set of points in space defined by their geographic coordinates
	 * according to the DCMI Point Encoding Scheme.
	 *
	 * @see <a href="http://purl.org/dc/terms/Point">Point</a>
	 */
	public static final URI Point_URI;

	/**
	 * Policy
	 * <p>
	 * {@code http://purl.org/dc/terms/Policy}.
	 * <p>
	 * A plan or course of action by an authority, intended to influence and
	 * determine decisions, actions, and other matters.
	 *
	 * @see <a href="http://purl.org/dc/terms/Policy">Policy</a>
	 */
	public static final URI Policy_URI;

	/**
	 * Provenance
	 * <p>
	 * {@code http://purl.org/dc/terms/provenance}.
	 * <p>
	 * A statement of any changes in ownership and custody of the resource
	 * since its creation that are significant for its authenticity,
	 * integrity, and interpretation.
	 *
	 * @see <a href="http://purl.org/dc/terms/provenance">provenance</a>
	 */
	public static final URI provenance_URI;

	/**
	 * Provenance Statement
	 * <p>
	 * {@code http://purl.org/dc/terms/ProvenanceStatement}.
	 * <p>
	 * A statement of any changes in ownership and custody of a resource
	 * since its creation that are significant for its authenticity,
	 * integrity, and interpretation.
	 *
	 * @see <a href="http://purl.org/dc/terms/ProvenanceStatement">ProvenanceStatement</a>
	 */
	public static final URI ProvenanceStatement_URI;

	/**
	 * Publisher
	 * <p>
	 * {@code http://purl.org/dc/terms/publisher}.
	 * <p>
	 * An entity responsible for making the resource available.
	 *
	 * @see <a href="http://purl.org/dc/terms/publisher">publisher</a>
	 */
	public static final URI publisher_URI;

	/**
	 * References
	 * <p>
	 * {@code http://purl.org/dc/terms/references}.
	 * <p>
	 * A related resource that is referenced, cited, or otherwise pointed to
	 * by the described resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/references">references</a>
	 */
	public static final URI references_URI;

	/**
	 * Relation
	 * <p>
	 * {@code http://purl.org/dc/terms/relation}.
	 * <p>
	 * A related resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/relation">relation</a>
	 */
	public static final URI relation_URI;

	/**
	 * Replaces
	 * <p>
	 * {@code http://purl.org/dc/terms/replaces}.
	 * <p>
	 * A related resource that is supplanted, displaced, or superseded by the
	 * described resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/replaces">replaces</a>
	 */
	public static final URI replaces_URI;

	/**
	 * Requires
	 * <p>
	 * {@code http://purl.org/dc/terms/requires}.
	 * <p>
	 * A related resource that is required by the described resource to
	 * support its function, delivery, or coherence.
	 *
	 * @see <a href="http://purl.org/dc/terms/requires">requires</a>
	 */
	public static final URI requires_URI;

	/**
	 * RFC 1766
	 * <p>
	 * {@code http://purl.org/dc/terms/RFC1766}.
	 * <p>
	 * The set of tags, constructed according to RFC 1766, for the
	 * identification of languages.
	 *
	 * @see <a href="http://purl.org/dc/terms/RFC1766">RFC1766</a>
	 */
	public static final URI RFC1766_URI;

	/**
	 * RFC 3066
	 * <p>
	 * {@code http://purl.org/dc/terms/RFC3066}.
	 * <p>
	 * The set of tags constructed according to RFC 3066 for the
	 * identification of languages.
	 *
	 * @see <a href="http://purl.org/dc/terms/RFC3066">RFC3066</a>
	 */
	public static final URI RFC3066_URI;

	/**
	 * RFC 4646
	 * <p>
	 * {@code http://purl.org/dc/terms/RFC4646}.
	 * <p>
	 * The set of tags constructed according to RFC 4646 for the
	 * identification of languages.
	 *
	 * @see <a href="http://purl.org/dc/terms/RFC4646">RFC4646</a>
	 */
	public static final URI RFC4646_URI;

	/**
	 * RFC 5646
	 * <p>
	 * {@code http://purl.org/dc/terms/RFC5646}.
	 * <p>
	 * The set of tags constructed according to RFC 5646 for the
	 * identification of languages.
	 *
	 * @see <a href="http://purl.org/dc/terms/RFC5646">RFC5646</a>
	 */
	public static final URI RFC5646_URI;

	/**
	 * Rights
	 * <p>
	 * {@code http://purl.org/dc/terms/rights}.
	 * <p>
	 * Information about rights held in and over the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/rights">rights</a>
	 */
	public static final URI rights_URI;

	/**
	 * Rights Holder
	 * <p>
	 * {@code http://purl.org/dc/terms/rightsHolder}.
	 * <p>
	 * A person or organization owning or managing rights over the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/rightsHolder">rightsHolder</a>
	 */
	public static final URI rightsHolder_URI;

	/**
	 * Rights Statement
	 * <p>
	 * {@code http://purl.org/dc/terms/RightsStatement}.
	 * <p>
	 * A statement about the intellectual property rights (IPR) held in or
	 * over a Resource, a legal document giving official permission to do
	 * something with a resource, or a statement about access rights.
	 *
	 * @see <a href="http://purl.org/dc/terms/RightsStatement">RightsStatement</a>
	 */
	public static final URI RightsStatement_URI;

	/**
	 * Size or Duration
	 * <p>
	 * {@code http://purl.org/dc/terms/SizeOrDuration}.
	 * <p>
	 * A dimension or extent, or a time taken to play or execute.
	 *
	 * @see <a href="http://purl.org/dc/terms/SizeOrDuration">SizeOrDuration</a>
	 */
	public static final URI SizeOrDuration_URI;

	/**
	 * Source
	 * <p>
	 * {@code http://purl.org/dc/terms/source}.
	 * <p>
	 * A related resource from which the described resource is derived.
	 *
	 * @see <a href="http://purl.org/dc/terms/source">source</a>
	 */
	public static final URI source_URI;

	/**
	 * Spatial Coverage
	 * <p>
	 * {@code http://purl.org/dc/terms/spatial}.
	 * <p>
	 * Spatial characteristics of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/spatial">spatial</a>
	 */
	public static final URI spatial_URI;

	/**
	 * Standard
	 * <p>
	 * {@code http://purl.org/dc/terms/Standard}.
	 * <p>
	 * A basis for comparison; a reference point against which other things
	 * can be evaluated.
	 *
	 * @see <a href="http://purl.org/dc/terms/Standard">Standard</a>
	 */
	public static final URI Standard_URI;

	/**
	 * Subject
	 * <p>
	 * {@code http://purl.org/dc/terms/subject}.
	 * <p>
	 * The topic of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/subject">subject</a>
	 */
	public static final URI subject_URI;

	/**
	 * Table Of Contents
	 * <p>
	 * {@code http://purl.org/dc/terms/tableOfContents}.
	 * <p>
	 * A list of subunits of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/tableOfContents">tableOfContents</a>
	 */
	public static final URI tableOfContents_URI;

	/**
	 * Temporal Coverage
	 * <p>
	 * {@code http://purl.org/dc/terms/temporal}.
	 * <p>
	 * Temporal characteristics of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/temporal">temporal</a>
	 */
	public static final URI temporal_URI;

	/**
	 * TGN
	 * <p>
	 * {@code http://purl.org/dc/terms/TGN}.
	 * <p>
	 * The set of places specified by the Getty Thesaurus of Geographic
	 * Names.
	 *
	 * @see <a href="http://purl.org/dc/terms/TGN">TGN</a>
	 */
	public static final URI TGN_URI;

	/**
	 * Title
	 * <p>
	 * {@code http://purl.org/dc/terms/title}.
	 * <p>
	 * A name given to the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/title">title</a>
	 */
	public static final URI title_URI;

	/**
	 * Type
	 * <p>
	 * {@code http://purl.org/dc/terms/type}.
	 * <p>
	 * The nature or genre of the resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/type">type</a>
	 */
	public static final URI type_URI;

	/**
	 * UDC
	 * <p>
	 * {@code http://purl.org/dc/terms/UDC}.
	 * <p>
	 * The set of conceptual resources specified by the Universal Decimal
	 * Classification.
	 *
	 * @see <a href="http://purl.org/dc/terms/UDC">UDC</a>
	 */
	public static final URI UDC_URI;

	/**
	 * URI
	 * <p>
	 * {@code http://purl.org/dc/terms/URI}.
	 * <p>
	 * The set of identifiers constructed according to the generic syntax for
	 * Uniform Resource Identifiers as specified by the Internet Engineering
	 * Task Force.
	 *
	 * @see <a href="http://purl.org/dc/terms/URI">URI</a>
	 */
	public static final URI URI_URI;

	/**
	 * Date Valid
	 * <p>
	 * {@code http://purl.org/dc/terms/valid}.
	 * <p>
	 * Date (often a range) of validity of a resource.
	 *
	 * @see <a href="http://purl.org/dc/terms/valid">valid</a>
	 */
	public static final URI valid_URI;

	/**
	 * W3C-DTF
	 * <p>
	 * {@code http://purl.org/dc/terms/W3CDTF}.
	 * <p>
	 * The set of dates and times constructed according to the W3C Date and
	 * Time Formats Specification.
	 *
	 * @see <a href="http://purl.org/dc/terms/W3CDTF">W3CDTF</a>
	 */
	public static final URI W3CDTF_URI;

	static {
		ValueFactory factory = ValueFactoryImpl.getInstance();

		abstract_URI = factory.createURI(DCTERMS.NAMESPACE, "abstract");
		accessRights_URI = factory.createURI(DCTERMS.NAMESPACE, "accessRights");
		accrualMethod_URI = factory.createURI(DCTERMS.NAMESPACE, "accrualMethod");
		accrualPeriodicity_URI = factory.createURI(DCTERMS.NAMESPACE, "accrualPeriodicity");
		accrualPolicy_URI = factory.createURI(DCTERMS.NAMESPACE, "accrualPolicy");
		Agent_URI = factory.createURI(DCTERMS.NAMESPACE, "Agent");
		AgentClass_URI = factory.createURI(DCTERMS.NAMESPACE, "AgentClass");
		alternative_URI = factory.createURI(DCTERMS.NAMESPACE, "alternative");
		audience_URI = factory.createURI(DCTERMS.NAMESPACE, "audience");
		available_URI = factory.createURI(DCTERMS.NAMESPACE, "available");
		bibliographicCitation_URI = factory.createURI(DCTERMS.NAMESPACE, "bibliographicCitation");
		BibliographicResource_URI = factory.createURI(DCTERMS.NAMESPACE, "BibliographicResource");
		Box_URI = factory.createURI(DCTERMS.NAMESPACE, "Box");
		conformsTo_URI = factory.createURI(DCTERMS.NAMESPACE, "conformsTo");
		contributor_URI = factory.createURI(DCTERMS.NAMESPACE, "contributor");
		coverage_URI = factory.createURI(DCTERMS.NAMESPACE, "coverage");
		created_URI = factory.createURI(DCTERMS.NAMESPACE, "created");
		creator_URI = factory.createURI(DCTERMS.NAMESPACE, "creator");
		date_URI = factory.createURI(DCTERMS.NAMESPACE, "date");
		dateAccepted_URI = factory.createURI(DCTERMS.NAMESPACE, "dateAccepted");
		dateCopyrighted_URI = factory.createURI(DCTERMS.NAMESPACE, "dateCopyrighted");
		dateSubmitted_URI = factory.createURI(DCTERMS.NAMESPACE, "dateSubmitted");
		DCMIType_URI = factory.createURI(DCTERMS.NAMESPACE, "DCMIType");
		DDC_URI = factory.createURI(DCTERMS.NAMESPACE, "DDC");
		description_URI = factory.createURI(DCTERMS.NAMESPACE, "description");
		educationLevel_URI = factory.createURI(DCTERMS.NAMESPACE, "educationLevel");
		extent_URI = factory.createURI(DCTERMS.NAMESPACE, "extent");
		FileFormat_URI = factory.createURI(DCTERMS.NAMESPACE, "FileFormat");
		format_URI = factory.createURI(DCTERMS.NAMESPACE, "format");
		Frequency_URI = factory.createURI(DCTERMS.NAMESPACE, "Frequency");
		hasFormat_URI = factory.createURI(DCTERMS.NAMESPACE, "hasFormat");
		hasPart_URI = factory.createURI(DCTERMS.NAMESPACE, "hasPart");
		hasVersion_URI = factory.createURI(DCTERMS.NAMESPACE, "hasVersion");
		identifier_URI = factory.createURI(DCTERMS.NAMESPACE, "identifier");
		IMT_URI = factory.createURI(DCTERMS.NAMESPACE, "IMT");
		instructionalMethod_URI = factory.createURI(DCTERMS.NAMESPACE, "instructionalMethod");
		isFormatOf_URI = factory.createURI(DCTERMS.NAMESPACE, "isFormatOf");
		ISO3166_URI = factory.createURI(DCTERMS.NAMESPACE, "ISO3166");
		ISO639_2_URI = factory.createURI(DCTERMS.NAMESPACE, "ISO639-2");
		ISO639_3_URI = factory.createURI(DCTERMS.NAMESPACE, "ISO639-3");
		isPartOf_URI = factory.createURI(DCTERMS.NAMESPACE, "isPartOf");
		isReferencedBy_URI = factory.createURI(DCTERMS.NAMESPACE, "isReferencedBy");
		isReplacedBy_URI = factory.createURI(DCTERMS.NAMESPACE, "isReplacedBy");
		isRequiredBy_URI = factory.createURI(DCTERMS.NAMESPACE, "isRequiredBy");
		issued_URI = factory.createURI(DCTERMS.NAMESPACE, "issued");
		isVersionOf_URI = factory.createURI(DCTERMS.NAMESPACE, "isVersionOf");
		Jurisdiction_URI = factory.createURI(DCTERMS.NAMESPACE, "Jurisdiction");
		language_URI = factory.createURI(DCTERMS.NAMESPACE, "language");
		LCC_URI = factory.createURI(DCTERMS.NAMESPACE, "LCC");
		LCSH_URI = factory.createURI(DCTERMS.NAMESPACE, "LCSH");
		license_URI = factory.createURI(DCTERMS.NAMESPACE, "license");
		LicenseDocument_URI = factory.createURI(DCTERMS.NAMESPACE, "LicenseDocument");
		LinguisticSystem_URI = factory.createURI(DCTERMS.NAMESPACE, "LinguisticSystem");
		Location_URI = factory.createURI(DCTERMS.NAMESPACE, "Location");
		LocationPeriodOrJurisdiction_URI = factory.createURI(DCTERMS.NAMESPACE, "LocationPeriodOrJurisdiction");
		mediator_URI = factory.createURI(DCTERMS.NAMESPACE, "mediator");
		MediaType_URI = factory.createURI(DCTERMS.NAMESPACE, "MediaType");
		MediaTypeOrExtent_URI = factory.createURI(DCTERMS.NAMESPACE, "MediaTypeOrExtent");
		medium_URI = factory.createURI(DCTERMS.NAMESPACE, "medium");
		MESH_URI = factory.createURI(DCTERMS.NAMESPACE, "MESH");
		MethodOfAccrual_URI = factory.createURI(DCTERMS.NAMESPACE, "MethodOfAccrual");
		MethodOfInstruction_URI = factory.createURI(DCTERMS.NAMESPACE, "MethodOfInstruction");
		modified_URI = factory.createURI(DCTERMS.NAMESPACE, "modified");
		NLM_URI = factory.createURI(DCTERMS.NAMESPACE, "NLM");
		Period_URI = factory.createURI(DCTERMS.NAMESPACE, "Period");
		PeriodOfTime_URI = factory.createURI(DCTERMS.NAMESPACE, "PeriodOfTime");
		PhysicalMedium_URI = factory.createURI(DCTERMS.NAMESPACE, "PhysicalMedium");
		PhysicalResource_URI = factory.createURI(DCTERMS.NAMESPACE, "PhysicalResource");
		Point_URI = factory.createURI(DCTERMS.NAMESPACE, "Point");
		Policy_URI = factory.createURI(DCTERMS.NAMESPACE, "Policy");
		provenance_URI = factory.createURI(DCTERMS.NAMESPACE, "provenance");
		ProvenanceStatement_URI = factory.createURI(DCTERMS.NAMESPACE, "ProvenanceStatement");
		publisher_URI = factory.createURI(DCTERMS.NAMESPACE, "publisher");
		references_URI = factory.createURI(DCTERMS.NAMESPACE, "references");
		relation_URI = factory.createURI(DCTERMS.NAMESPACE, "relation");
		replaces_URI = factory.createURI(DCTERMS.NAMESPACE, "replaces");
		requires_URI = factory.createURI(DCTERMS.NAMESPACE, "requires");
		RFC1766_URI = factory.createURI(DCTERMS.NAMESPACE, "RFC1766");
		RFC3066_URI = factory.createURI(DCTERMS.NAMESPACE, "RFC3066");
		RFC4646_URI = factory.createURI(DCTERMS.NAMESPACE, "RFC4646");
		RFC5646_URI = factory.createURI(DCTERMS.NAMESPACE, "RFC5646");
		rights_URI = factory.createURI(DCTERMS.NAMESPACE, "rights");
		rightsHolder_URI = factory.createURI(DCTERMS.NAMESPACE, "rightsHolder");
		RightsStatement_URI = factory.createURI(DCTERMS.NAMESPACE, "RightsStatement");
		SizeOrDuration_URI = factory.createURI(DCTERMS.NAMESPACE, "SizeOrDuration");
		source_URI = factory.createURI(DCTERMS.NAMESPACE, "source");
		spatial_URI = factory.createURI(DCTERMS.NAMESPACE, "spatial");
		Standard_URI = factory.createURI(DCTERMS.NAMESPACE, "Standard");
		subject_URI = factory.createURI(DCTERMS.NAMESPACE, "subject");
		tableOfContents_URI = factory.createURI(DCTERMS.NAMESPACE, "tableOfContents");
		temporal_URI = factory.createURI(DCTERMS.NAMESPACE, "temporal");
		TGN_URI = factory.createURI(DCTERMS.NAMESPACE, "TGN");
		title_URI = factory.createURI(DCTERMS.NAMESPACE, "title");
		type_URI = factory.createURI(DCTERMS.NAMESPACE, "type");
		UDC_URI = factory.createURI(DCTERMS.NAMESPACE, "UDC");
		URI_URI = factory.createURI(DCTERMS.NAMESPACE, "URI");
		valid_URI = factory.createURI(DCTERMS.NAMESPACE, "valid");
		W3CDTF_URI = factory.createURI(DCTERMS.NAMESPACE, "W3CDTF");
	}

	private DCTERMS() {
		//static access only
	}

}
