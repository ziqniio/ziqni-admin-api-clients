/**
 * Ziqni Admin Api
 * Ziqni Application Services are used to manage and configure spaces.
 *
 * The version of the OpenAPI document: 3.0.1
 * Contact: support@ziqni.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */
import ApiClient from '../ApiClient';
import CompetitionStatus from './CompetitionStatus';
import CompetitionType from './CompetitionType';
import DependantOn from './DependantOn';
import ProductReduced from './ProductReduced';
/**
 * The CompetitionAllOf model module.
 * @module model/CompetitionAllOf
 * @version 0.0.26
 */

class CompetitionAllOf {
  /**
   * Constructs a new <code>CompetitionAllOf</code>.
   * @alias module:model/CompetitionAllOf
   * @param competitionType {module:model/CompetitionType} 
   * @param numberOfRounds {Number} Number of rounds to be played in a competition
   * @param name {String} A name or a name of a competition. Can be translated
   * @param minNumberOfEntrants {Number} Maximum number of partiipants allowed in a competition
   * @param scheduledStartDate {Date} ISO8601 timestamp for when a Competition should start. All records are stored in UTC time zone
   * @param scheduledEndDate {Date} ISO8601 timestamp for when a Competition should end. All records are stored in UTC time zone
   * @param status {module:model/CompetitionStatus} 
   * @param constraints {Array.<String>} Additional constraints
   * @param products {Array.<module:model/ProductReduced>} 
   */
  constructor(competitionType, numberOfRounds, name, minNumberOfEntrants, scheduledStartDate, scheduledEndDate, status, constraints, products) {
    CompetitionAllOf.initialize(this, competitionType, numberOfRounds, name, minNumberOfEntrants, scheduledStartDate, scheduledEndDate, status, constraints, products);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj, competitionType, numberOfRounds, name, minNumberOfEntrants, scheduledStartDate, scheduledEndDate, status, constraints, products) {
    obj['competitionType'] = competitionType;
    obj['numberOfRounds'] = numberOfRounds;
    obj['name'] = name;
    obj['minNumberOfEntrants'] = minNumberOfEntrants;
    obj['scheduledStartDate'] = scheduledStartDate;
    obj['scheduledEndDate'] = scheduledEndDate;
    obj['status'] = status;
    obj['constraints'] = constraints;
    obj['products'] = products;
  }
  /**
   * Constructs a <code>CompetitionAllOf</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CompetitionAllOf} obj Optional instance to populate.
   * @return {module:model/CompetitionAllOf} The populated <code>CompetitionAllOf</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CompetitionAllOf();

      if (data.hasOwnProperty('competitionType')) {
        obj['competitionType'] = CompetitionType.constructFromObject(data['competitionType']);
      }

      if (data.hasOwnProperty('numberOfRounds')) {
        obj['numberOfRounds'] = ApiClient.convertToType(data['numberOfRounds'], 'Number');
      }

      if (data.hasOwnProperty('numberOfGroupStages')) {
        obj['numberOfGroupStages'] = ApiClient.convertToType(data['numberOfGroupStages'], 'Number');
      }

      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }

      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }

      if (data.hasOwnProperty('termsAndConditions')) {
        obj['termsAndConditions'] = ApiClient.convertToType(data['termsAndConditions'], 'String');
      }

      if (data.hasOwnProperty('maxNumberOfEntrants')) {
        obj['maxNumberOfEntrants'] = ApiClient.convertToType(data['maxNumberOfEntrants'], 'Number');
      }

      if (data.hasOwnProperty('minNumberOfEntrants')) {
        obj['minNumberOfEntrants'] = ApiClient.convertToType(data['minNumberOfEntrants'], 'Number');
      }

      if (data.hasOwnProperty('entrantMemberType')) {
        obj['entrantMemberType'] = ApiClient.convertToType(data['entrantMemberType'], 'String');
      }

      if (data.hasOwnProperty('scheduledStartDate')) {
        obj['scheduledStartDate'] = ApiClient.convertToType(data['scheduledStartDate'], 'Date');
      }

      if (data.hasOwnProperty('scheduledEndDate')) {
        obj['scheduledEndDate'] = ApiClient.convertToType(data['scheduledEndDate'], 'Date');
      }

      if (data.hasOwnProperty('actualStartDate')) {
        obj['actualStartDate'] = ApiClient.convertToType(data['actualStartDate'], 'Date');
      }

      if (data.hasOwnProperty('actualEndDate')) {
        obj['actualEndDate'] = ApiClient.convertToType(data['actualEndDate'], 'Date');
      }

      if (data.hasOwnProperty('status')) {
        obj['status'] = CompetitionStatus.constructFromObject(data['status']);
      }

      if (data.hasOwnProperty('statusCode')) {
        obj['statusCode'] = ApiClient.convertToType(data['statusCode'], 'Number');
      }

      if (data.hasOwnProperty('constraints')) {
        obj['constraints'] = ApiClient.convertToType(data['constraints'], ['String']);
      }

      if (data.hasOwnProperty('products')) {
        obj['products'] = ApiClient.convertToType(data['products'], [ProductReduced]);
      }

      if (data.hasOwnProperty('entrantMemberTagsFilter')) {
        obj['entrantMemberTagsFilter'] = DependantOn.constructFromObject(data['entrantMemberTagsFilter']);
      }

      if (data.hasOwnProperty('productTagsFilter')) {
        obj['productTagsFilter'] = DependantOn.constructFromObject(data['productTagsFilter']);
      }
    }

    return obj;
  }

}
/**
 * @member {module:model/CompetitionType} competitionType
 */


CompetitionAllOf.prototype['competitionType'] = undefined;
/**
 * Number of rounds to be played in a competition
 * @member {Number} numberOfRounds
 */

CompetitionAllOf.prototype['numberOfRounds'] = undefined;
/**
 * Number of group stages
 * @member {Number} numberOfGroupStages
 */

CompetitionAllOf.prototype['numberOfGroupStages'] = undefined;
/**
 * A name or a name of a competition. Can be translated
 * @member {String} name
 */

CompetitionAllOf.prototype['name'] = undefined;
/**
 * Description of the competition. Can be translated
 * @member {String} description
 */

CompetitionAllOf.prototype['description'] = undefined;
/**
 * Terms and conditions of a competition. Can be translated
 * @member {String} termsAndConditions
 */

CompetitionAllOf.prototype['termsAndConditions'] = undefined;
/**
 * Maximum number of partiipants allowed in a competition
 * @member {Number} maxNumberOfEntrants
 */

CompetitionAllOf.prototype['maxNumberOfEntrants'] = undefined;
/**
 * Maximum number of partiipants allowed in a competition
 * @member {Number} minNumberOfEntrants
 */

CompetitionAllOf.prototype['minNumberOfEntrants'] = undefined;
/**
 * @member {String} entrantMemberType
 */

CompetitionAllOf.prototype['entrantMemberType'] = undefined;
/**
 * ISO8601 timestamp for when a Competition should start. All records are stored in UTC time zone
 * @member {Date} scheduledStartDate
 */

CompetitionAllOf.prototype['scheduledStartDate'] = undefined;
/**
 * ISO8601 timestamp for when a Competition should end. All records are stored in UTC time zone
 * @member {Date} scheduledEndDate
 */

CompetitionAllOf.prototype['scheduledEndDate'] = undefined;
/**
 * ISO8601 timestamp for when a Competition started. All records are stored in UTC time zone
 * @member {Date} actualStartDate
 */

CompetitionAllOf.prototype['actualStartDate'] = undefined;
/**
 * ISO8601 timestamp for when a Competition ended. All records are stored in UTC time zone
 * @member {Date} actualEndDate
 */

CompetitionAllOf.prototype['actualEndDate'] = undefined;
/**
 * @member {module:model/CompetitionStatus} status
 */

CompetitionAllOf.prototype['status'] = undefined;
/**
 * The code of the competition
 * @member {Number} statusCode
 */

CompetitionAllOf.prototype['statusCode'] = undefined;
/**
 * Additional constraints
 * @member {Array.<String>} constraints
 */

CompetitionAllOf.prototype['constraints'] = undefined;
/**
 * 
 * @member {Array.<module:model/ProductReduced>} products
 */

CompetitionAllOf.prototype['products'] = undefined;
/**
 * @member {module:model/DependantOn} entrantMemberTagsFilter
 */

CompetitionAllOf.prototype['entrantMemberTagsFilter'] = undefined;
/**
 * @member {module:model/DependantOn} productTagsFilter
 */

CompetitionAllOf.prototype['productTagsFilter'] = undefined;
export default CompetitionAllOf;