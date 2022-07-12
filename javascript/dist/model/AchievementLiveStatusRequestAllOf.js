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
import AchievementLiveStatus from './AchievementLiveStatus';
/**
 * The AchievementLiveStatusRequestAllOf model module.
 * @module model/AchievementLiveStatusRequestAllOf
 * @version 0.0.26
 */

class AchievementLiveStatusRequestAllOf {
  /**
   * Constructs a new <code>AchievementLiveStatusRequestAllOf</code>.
   * @alias module:model/AchievementLiveStatusRequestAllOf
   * @param status {module:model/AchievementLiveStatus} 
   */
  constructor(status) {
    AchievementLiveStatusRequestAllOf.initialize(this, status);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj, status) {
    obj['status'] = status;
  }
  /**
   * Constructs a <code>AchievementLiveStatusRequestAllOf</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AchievementLiveStatusRequestAllOf} obj Optional instance to populate.
   * @return {module:model/AchievementLiveStatusRequestAllOf} The populated <code>AchievementLiveStatusRequestAllOf</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AchievementLiveStatusRequestAllOf();

      if (data.hasOwnProperty('status')) {
        obj['status'] = AchievementLiveStatus.constructFromObject(data['status']);
      }
    }

    return obj;
  }

}
/**
 * @member {module:model/AchievementLiveStatus} status
 */


AchievementLiveStatusRequestAllOf.prototype['status'] = undefined;
export default AchievementLiveStatusRequestAllOf;