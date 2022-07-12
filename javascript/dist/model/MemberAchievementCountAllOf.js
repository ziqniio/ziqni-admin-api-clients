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
/**
 * The MemberAchievementCountAllOf model module.
 * @module model/MemberAchievementCountAllOf
 * @version 0.0.26
 */

class MemberAchievementCountAllOf {
  /**
   * Constructs a new <code>MemberAchievementCountAllOf</code>.
   * @alias module:model/MemberAchievementCountAllOf
   * @param name {String} A the name of the member
   * @param memberId {String} A unique identifier of a Member
   * @param memberRefId {String} The reference to this member in your system
   * @param latestIssuedTimestamp {Date} ISO8601 timestamp for when a Model was created. All records are stored in UTC time zone
   */
  constructor(name, memberId, memberRefId, latestIssuedTimestamp) {
    MemberAchievementCountAllOf.initialize(this, name, memberId, memberRefId, latestIssuedTimestamp);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj, name, memberId, memberRefId, latestIssuedTimestamp) {
    obj['name'] = name;
    obj['memberId'] = memberId;
    obj['memberRefId'] = memberRefId;
    obj['latestIssuedTimestamp'] = latestIssuedTimestamp;
  }
  /**
   * Constructs a <code>MemberAchievementCountAllOf</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MemberAchievementCountAllOf} obj Optional instance to populate.
   * @return {module:model/MemberAchievementCountAllOf} The populated <code>MemberAchievementCountAllOf</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new MemberAchievementCountAllOf();

      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }

      if (data.hasOwnProperty('memberId')) {
        obj['memberId'] = ApiClient.convertToType(data['memberId'], 'String');
      }

      if (data.hasOwnProperty('memberRefId')) {
        obj['memberRefId'] = ApiClient.convertToType(data['memberRefId'], 'String');
      }

      if (data.hasOwnProperty('latestIssuedTimestamp')) {
        obj['latestIssuedTimestamp'] = ApiClient.convertToType(data['latestIssuedTimestamp'], 'Date');
      }
    }

    return obj;
  }

}
/**
 * A the name of the member
 * @member {String} name
 */


MemberAchievementCountAllOf.prototype['name'] = undefined;
/**
 * A unique identifier of a Member
 * @member {String} memberId
 */

MemberAchievementCountAllOf.prototype['memberId'] = undefined;
/**
 * The reference to this member in your system
 * @member {String} memberRefId
 */

MemberAchievementCountAllOf.prototype['memberRefId'] = undefined;
/**
 * ISO8601 timestamp for when a Model was created. All records are stored in UTC time zone
 * @member {Date} latestIssuedTimestamp
 */

MemberAchievementCountAllOf.prototype['latestIssuedTimestamp'] = undefined;
export default MemberAchievementCountAllOf;