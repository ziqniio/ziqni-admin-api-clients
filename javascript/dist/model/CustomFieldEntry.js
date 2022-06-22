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
 * The CustomFieldEntry model module.
 * @module model/CustomFieldEntry
 * @version 0.0.26
 */

class CustomFieldEntry {
  /**
   * Constructs a new <code>CustomFieldEntry</code>.
   * The base type for custom field entries
   * @alias module:model/CustomFieldEntry
   * @param fieldType {String} The data type stored in this generic object ( string, number, string[], number[])
   */
  constructor(fieldType) {
    CustomFieldEntry.initialize(this, fieldType);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj, fieldType) {
    obj['fieldType'] = fieldType;
  }
  /**
   * Constructs a <code>CustomFieldEntry</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CustomFieldEntry} obj Optional instance to populate.
   * @return {module:model/CustomFieldEntry} The populated <code>CustomFieldEntry</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CustomFieldEntry();

      if (data.hasOwnProperty('fieldType')) {
        obj['fieldType'] = ApiClient.convertToType(data['fieldType'], 'String');
      }
    }

    return obj;
  }

}
/**
 * The data type stored in this generic object ( string, number, string[], number[])
 * @member {String} fieldType
 */


CustomFieldEntry.prototype['fieldType'] = undefined;
export default CustomFieldEntry;