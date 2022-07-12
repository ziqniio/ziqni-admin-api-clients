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
import RewardEntityType from './RewardEntityType';
import Translation from './Translation';
/**
 * The UpdateEntityRewardRequestAllOf model module.
 * @module model/UpdateEntityRewardRequestAllOf
 * @version 0.0.26
 */

class UpdateEntityRewardRequestAllOf {
  /**
   * Constructs a new <code>UpdateEntityRewardRequestAllOf</code>.
   * @alias module:model/UpdateEntityRewardRequestAllOf
   */
  constructor() {
    UpdateEntityRewardRequestAllOf.initialize(this);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj) {}
  /**
   * Constructs a <code>UpdateEntityRewardRequestAllOf</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/UpdateEntityRewardRequestAllOf} obj Optional instance to populate.
   * @return {module:model/UpdateEntityRewardRequestAllOf} The populated <code>UpdateEntityRewardRequestAllOf</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new UpdateEntityRewardRequestAllOf();

      if (data.hasOwnProperty('entityType')) {
        obj['entityType'] = RewardEntityType.constructFromObject(data['entityType']);
      }

      if (data.hasOwnProperty('entityId')) {
        obj['entityId'] = ApiClient.convertToType(data['entityId'], 'String');
      }

      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }

      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }

      if (data.hasOwnProperty('rewardRank')) {
        obj['rewardRank'] = ApiClient.convertToType(data['rewardRank'], 'String');
      }

      if (data.hasOwnProperty('rewardValue')) {
        obj['rewardValue'] = ApiClient.convertToType(data['rewardValue'], 'Number');
      }

      if (data.hasOwnProperty('icon')) {
        obj['icon'] = ApiClient.convertToType(data['icon'], 'String');
      }

      if (data.hasOwnProperty('issueLimit')) {
        obj['issueLimit'] = ApiClient.convertToType(data['issueLimit'], 'Number');
      }

      if (data.hasOwnProperty('delay')) {
        obj['delay'] = ApiClient.convertToType(data['delay'], 'Number');
      }

      if (data.hasOwnProperty('pointInTime')) {
        obj['pointInTime'] = ApiClient.convertToType(data['pointInTime'], 'Date');
      }

      if (data.hasOwnProperty('period')) {
        obj['period'] = ApiClient.convertToType(data['period'], 'Number');
      }

      if (data.hasOwnProperty('translations')) {
        obj['translations'] = ApiClient.convertToType(data['translations'], [Translation]);
      }

      if (data.hasOwnProperty('addConstraints')) {
        obj['addConstraints'] = ApiClient.convertToType(data['addConstraints'], ['String']);
      }

      if (data.hasOwnProperty('removeConstraints')) {
        obj['removeConstraints'] = ApiClient.convertToType(data['removeConstraints'], ['String']);
      }

      if (data.hasOwnProperty('rewardTypeId')) {
        obj['rewardTypeId'] = ApiClient.convertToType(data['rewardTypeId'], 'String');
      }
    }

    return obj;
  }

}
/**
 * @member {module:model/RewardEntityType} entityType
 */


UpdateEntityRewardRequestAllOf.prototype['entityType'] = undefined;
/**
 * A unique identifier of an achievement or contest. Dependant on entityType
 * @member {String} entityId
 */

UpdateEntityRewardRequestAllOf.prototype['entityId'] = undefined;
/**
 * The name of a reward
 * @member {String} name
 */

UpdateEntityRewardRequestAllOf.prototype['name'] = undefined;
/**
 * The description of a Reward
 * @member {String} description
 */

UpdateEntityRewardRequestAllOf.prototype['description'] = undefined;
/**
 * If used in the context of contest this will associate with the rank of the leaderboard
 * @member {String} rewardRank
 */

UpdateEntityRewardRequestAllOf.prototype['rewardRank'] = undefined;
/**
 * Numerical value of the reward that will be issued based on the reward type
 * @member {Number} rewardValue
 */

UpdateEntityRewardRequestAllOf.prototype['rewardValue'] = undefined;
/**
 * An Icon id that has been pre uploaded to the system to display for reward
 * @member {String} icon
 */

UpdateEntityRewardRequestAllOf.prototype['icon'] = undefined;
/**
 * how many of thsese rewards are
 * @member {Number} issueLimit
 */

UpdateEntityRewardRequestAllOf.prototype['issueLimit'] = undefined;
/**
 * Delay of issuing a reward in minutes
 * @member {Number} delay
 */

UpdateEntityRewardRequestAllOf.prototype['delay'] = undefined;
/**
 * ISO8601 timestamp for when a Reward is available until a specific point in time. All records are stored in UTC time zone
 * @member {Date} pointInTime
 */

UpdateEntityRewardRequestAllOf.prototype['pointInTime'] = undefined;
/**
 * Reward available for a period of time from issuing in minutes
 * @member {Number} period
 */

UpdateEntityRewardRequestAllOf.prototype['period'] = undefined;
/**
 * @member {Array.<module:model/Translation>} translations
 */

UpdateEntityRewardRequestAllOf.prototype['translations'] = undefined;
/**
 * Additional constraints
 * @member {Array.<String>} addConstraints
 */

UpdateEntityRewardRequestAllOf.prototype['addConstraints'] = undefined;
/**
 * Additional constraints
 * @member {Array.<String>} removeConstraints
 */

UpdateEntityRewardRequestAllOf.prototype['removeConstraints'] = undefined;
/**
 * A unique id of the Reward Type
 * @member {String} rewardTypeId
 */

UpdateEntityRewardRequestAllOf.prototype['rewardTypeId'] = undefined;
export default UpdateEntityRewardRequestAllOf;