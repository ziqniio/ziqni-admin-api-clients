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
 * The SpaceAllOf model module.
 * @module model/SpaceAllOf
 * @version 0.0.26
 */

class SpaceAllOf {
  /**
   * Constructs a new <code>SpaceAllOf</code>.
   * @alias module:model/SpaceAllOf
   * @param accountType {String} Type of account; personal or company or vendor
   */
  constructor(accountType) {
    SpaceAllOf.initialize(this, accountType);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj, accountType) {
    obj['accountType'] = accountType;
  }
  /**
   * Constructs a <code>SpaceAllOf</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SpaceAllOf} obj Optional instance to populate.
   * @return {module:model/SpaceAllOf} The populated <code>SpaceAllOf</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SpaceAllOf();

      if (data.hasOwnProperty('accountType')) {
        obj['accountType'] = ApiClient.convertToType(data['accountType'], 'String');
      }

      if (data.hasOwnProperty('masterSpace')) {
        obj['masterSpace'] = ApiClient.convertToType(data['masterSpace'], 'String');
      }
    }

    return obj;
  }

}
/**
 * Type of account; personal or company or vendor
 * @member {String} accountType
 */


SpaceAllOf.prototype['accountType'] = undefined;
/**
 * The master account for this account
 * @member {String} masterSpace
 */

SpaceAllOf.prototype['masterSpace'] = undefined;
export default SpaceAllOf;