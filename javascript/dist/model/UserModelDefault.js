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
/**
 * The UserModelDefault model module.
 * @module model/UserModelDefault
 * @version 0.0.26
 */

class UserModelDefault {
  /**
   * Constructs a new <code>UserModelDefault</code>.
   * @alias module:model/UserModelDefault
   * @param objectType {String} 
   */
  constructor(objectType) {
    UserModelDefault.initialize(this, objectType);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj, objectType) {
    obj['objectType'] = objectType;
  }
  /**
   * Constructs a <code>UserModelDefault</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/UserModelDefault} obj Optional instance to populate.
   * @return {module:model/UserModelDefault} The populated <code>UserModelDefault</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new UserModelDefault();

      if (data.hasOwnProperty('objectType')) {
        obj['objectType'] = ApiClient.convertToType(data['objectType'], 'String');
      }
    }

    return obj;
  }

}
/**
 * @member {String} objectType
 */


UserModelDefault.prototype['objectType'] = undefined;
export default UserModelDefault;