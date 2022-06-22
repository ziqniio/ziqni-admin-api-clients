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
import EntityType from './EntityType';
import RewardTypeReduced from './RewardTypeReduced';
/**
 * The RewardAllOf model module.
 * @module model/RewardAllOf
 * @version 0.0.26
 */

class RewardAllOf {
  /**
   * Constructs a new <code>RewardAllOf</code>.
   * @alias module:model/RewardAllOf
   * @param rewardRank {String} If used in the context of contest this will associate with the rank of the leaderboard
   * @param rewardValue {Number} Numerical value of the reward that will be issued based on the reward type
   * @param rewardType {module:model/RewardTypeReduced} 
   * @param constraints {Array.<String>} Additional constraints
   */
  constructor(rewardRank, rewardValue, rewardType, constraints) {
    RewardAllOf.initialize(this, rewardRank, rewardValue, rewardType, constraints);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj, rewardRank, rewardValue, rewardType, constraints) {
    obj['rewardRank'] = rewardRank;
    obj['rewardValue'] = rewardValue;
    obj['rewardType'] = rewardType;
    obj['constraints'] = constraints;
  }
  /**
   * Constructs a <code>RewardAllOf</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/RewardAllOf} obj Optional instance to populate.
   * @return {module:model/RewardAllOf} The populated <code>RewardAllOf</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new RewardAllOf();

      if (data.hasOwnProperty('entityType')) {
        obj['entityType'] = EntityType.constructFromObject(data['entityType']);
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

      if (data.hasOwnProperty('rewardType')) {
        obj['rewardType'] = RewardTypeReduced.constructFromObject(data['rewardType']);
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

      if (data.hasOwnProperty('constraints')) {
        obj['constraints'] = ApiClient.convertToType(data['constraints'], ['String']);
      }
    }

    return obj;
  }

}
/**
 * @member {module:model/EntityType} entityType
 */


RewardAllOf.prototype['entityType'] = undefined;
/**
 * A unique identifier of an achievement or contest. Dependant on entityType
 * @member {String} entityId
 */

RewardAllOf.prototype['entityId'] = undefined;
/**
 * The name of a reward
 * @member {String} name
 */

RewardAllOf.prototype['name'] = undefined;
/**
 * The description of a Reward
 * @member {String} description
 */

RewardAllOf.prototype['description'] = undefined;
/**
 * If used in the context of contest this will associate with the rank of the leaderboard
 * @member {String} rewardRank
 */

RewardAllOf.prototype['rewardRank'] = undefined;
/**
 * Numerical value of the reward that will be issued based on the reward type
 * @member {Number} rewardValue
 */

RewardAllOf.prototype['rewardValue'] = undefined;
/**
 * @member {module:model/RewardTypeReduced} rewardType
 */

RewardAllOf.prototype['rewardType'] = undefined;
/**
 * An Icon id that has been pre uploaded to the system to display for reward
 * @member {String} icon
 */

RewardAllOf.prototype['icon'] = undefined;
/**
 * how many of thsese rewards are
 * @member {Number} issueLimit
 */

RewardAllOf.prototype['issueLimit'] = undefined;
/**
 * Delay of issuing a reward in minutes
 * @member {Number} delay
 */

RewardAllOf.prototype['delay'] = undefined;
/**
 * ISO8601 timestamp for when a Reward is available until a specific point in time. All records are stored in UTC time zone
 * @member {Date} pointInTime
 */

RewardAllOf.prototype['pointInTime'] = undefined;
/**
 * Reward available for a period of time from issuing in minutes
 * @member {Number} period
 */

RewardAllOf.prototype['period'] = undefined;
/**
 * Additional constraints
 * @member {Array.<String>} constraints
 */

RewardAllOf.prototype['constraints'] = undefined;
export default RewardAllOf;