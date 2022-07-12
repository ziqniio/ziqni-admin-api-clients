/**
 * ZIQNI Admin API
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
import CreateRewardRequest from './CreateRewardRequest';
import RoundType from './RoundType';
import Rule from './Rule';
import Strategy from './Strategy';
import Translation from './Translation';
/**
 * The CreateContestRequestAllOf model module.
 * @module model/CreateContestRequestAllOf
 * @version 0.0.26
 */

class CreateContestRequestAllOf {
  /**
   * Constructs a new <code>CreateContestRequestAllOf</code>.
   * @alias module:model/CreateContestRequestAllOf
   * @param name {String} A name for the Contest. Can be translated
   * @param roundType {module:model/RoundType} 
   * @param minNumberOfEntrants {Number} Minimum number of entrants for the contest
   * @param scheduledStartDate {Date} ISO8601 timestamp for when a Contest should start. All records are stored in UTC time zone
   * @param scheduledEndDate {Date} ISO8601 timestamp for when a Contest should end. All records are stored in UTC time zone
   * @param strategies {module:model/Strategy} 
   * @param constraints {Array.<String>} Additional constraints
   */
  constructor(name, roundType, minNumberOfEntrants, scheduledStartDate, scheduledEndDate, strategies, constraints) {
    CreateContestRequestAllOf.initialize(this, name, roundType, minNumberOfEntrants, scheduledStartDate, scheduledEndDate, strategies, constraints);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj, name, roundType, minNumberOfEntrants, scheduledStartDate, scheduledEndDate, strategies, constraints) {
    obj['name'] = name;
    obj['roundType'] = roundType;
    obj['minNumberOfEntrants'] = minNumberOfEntrants;
    obj['scheduledStartDate'] = scheduledStartDate;
    obj['scheduledEndDate'] = scheduledEndDate;
    obj['strategies'] = strategies;
    obj['constraints'] = constraints;
  }
  /**
   * Constructs a <code>CreateContestRequestAllOf</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CreateContestRequestAllOf} obj Optional instance to populate.
   * @return {module:model/CreateContestRequestAllOf} The populated <code>CreateContestRequestAllOf</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CreateContestRequestAllOf();

      if (data.hasOwnProperty('row')) {
        obj['row'] = ApiClient.convertToType(data['row'], 'Number');
      }

      if (data.hasOwnProperty('round')) {
        obj['round'] = ApiClient.convertToType(data['round'], 'Number');
      }

      if (data.hasOwnProperty('groupStage')) {
        obj['groupStage'] = ApiClient.convertToType(data['groupStage'], 'Number');
      }

      if (data.hasOwnProperty('groupStageLabel')) {
        obj['groupStageLabel'] = ApiClient.convertToType(data['groupStageLabel'], 'String');
      }

      if (data.hasOwnProperty('entrantsFromContest')) {
        obj['entrantsFromContest'] = ApiClient.convertToType(data['entrantsFromContest'], ['String']);
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

      if (data.hasOwnProperty('roundType')) {
        obj['roundType'] = RoundType.constructFromObject(data['roundType']);
      }

      if (data.hasOwnProperty('maxNumberOfEntrants')) {
        obj['maxNumberOfEntrants'] = ApiClient.convertToType(data['maxNumberOfEntrants'], 'Number');
      }

      if (data.hasOwnProperty('minNumberOfEntrants')) {
        obj['minNumberOfEntrants'] = ApiClient.convertToType(data['minNumberOfEntrants'], 'Number');
      }

      if (data.hasOwnProperty('rules')) {
        obj['rules'] = ApiClient.convertToType(data['rules'], [Rule]);
      }

      if (data.hasOwnProperty('scheduledStartDate')) {
        obj['scheduledStartDate'] = ApiClient.convertToType(data['scheduledStartDate'], 'Date');
      }

      if (data.hasOwnProperty('scheduledEndDate')) {
        obj['scheduledEndDate'] = ApiClient.convertToType(data['scheduledEndDate'], 'Date');
      }

      if (data.hasOwnProperty('strategies')) {
        obj['strategies'] = Strategy.constructFromObject(data['strategies']);
      }

      if (data.hasOwnProperty('constraints')) {
        obj['constraints'] = ApiClient.convertToType(data['constraints'], ['String']);
      }

      if (data.hasOwnProperty('addConstraints')) {
        obj['addConstraints'] = ApiClient.convertToType(data['addConstraints'], ['String']);
      }

      if (data.hasOwnProperty('translations')) {
        obj['translations'] = ApiClient.convertToType(data['translations'], [Translation]);
      }

      if (data.hasOwnProperty('rewards')) {
        obj['rewards'] = ApiClient.convertToType(data['rewards'], [CreateRewardRequest]);
      }
    }

    return obj;
  }

}
/**
 * The row number for displaying the Contest in a table
 * @member {Number} row
 */


CreateContestRequestAllOf.prototype['row'] = undefined;
/**
 * To what round does the contest belong
 * @member {Number} round
 */

CreateContestRequestAllOf.prototype['round'] = undefined;
/**
 * Is used for more complex Competitions e.g. multi round competitions where round 1 group stage matched round 2
 * @member {Number} groupStage
 */

CreateContestRequestAllOf.prototype['groupStage'] = undefined;
/**
 * The name of the group stages
 * @member {String} groupStageLabel
 */

CreateContestRequestAllOf.prototype['groupStageLabel'] = undefined;
/**
 * A list of Ziqni contest identifiers to allow contests chaining. When a Progression competition is active and you have a 2 round competition the first round has to reference the second round then this parameter becomes mandatory instead of Optional.
 * @member {Array.<String>} entrantsFromContest
 */

CreateContestRequestAllOf.prototype['entrantsFromContest'] = undefined;
/**
 * A name for the Contest. Can be translated
 * @member {String} name
 */

CreateContestRequestAllOf.prototype['name'] = undefined;
/**
 * A name for the Contest. Can be translated
 * @member {String} description
 */

CreateContestRequestAllOf.prototype['description'] = undefined;
/**
 * A name for the Contest. Can be translated
 * @member {String} termsAndConditions
 */

CreateContestRequestAllOf.prototype['termsAndConditions'] = undefined;
/**
 * @member {module:model/RoundType} roundType
 */

CreateContestRequestAllOf.prototype['roundType'] = undefined;
/**
 * Maximum number of entrants for the contest
 * @member {Number} maxNumberOfEntrants
 */

CreateContestRequestAllOf.prototype['maxNumberOfEntrants'] = undefined;
/**
 * Minimum number of entrants for the contest
 * @member {Number} minNumberOfEntrants
 */

CreateContestRequestAllOf.prototype['minNumberOfEntrants'] = undefined;
/**
 * @member {Array.<module:model/Rule>} rules
 */

CreateContestRequestAllOf.prototype['rules'] = undefined;
/**
 * ISO8601 timestamp for when a Contest should start. All records are stored in UTC time zone
 * @member {Date} scheduledStartDate
 */

CreateContestRequestAllOf.prototype['scheduledStartDate'] = undefined;
/**
 * ISO8601 timestamp for when a Contest should end. All records are stored in UTC time zone
 * @member {Date} scheduledEndDate
 */

CreateContestRequestAllOf.prototype['scheduledEndDate'] = undefined;
/**
 * @member {module:model/Strategy} strategies
 */

CreateContestRequestAllOf.prototype['strategies'] = undefined;
/**
 * Additional constraints
 * @member {Array.<String>} constraints
 */

CreateContestRequestAllOf.prototype['constraints'] = undefined;
/**
 * Additional constraints
 * @member {Array.<String>} addConstraints
 */

CreateContestRequestAllOf.prototype['addConstraints'] = undefined;
/**
 * @member {Array.<module:model/Translation>} translations
 */

CreateContestRequestAllOf.prototype['translations'] = undefined;
/**
 * @member {Array.<module:model/CreateRewardRequest>} rewards
 */

CreateContestRequestAllOf.prototype['rewards'] = undefined;
export default CreateContestRequestAllOf;