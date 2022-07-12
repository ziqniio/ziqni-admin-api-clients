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
import AppliesTo from './AppliesTo';
import FieldType from './FieldType';
/**
 * The UpdateCustomFieldRequestAllOf model module.
 * @module model/UpdateCustomFieldRequestAllOf
 * @version 0.0.26
 */

class UpdateCustomFieldRequestAllOf {
  /**
   * Constructs a new <code>UpdateCustomFieldRequestAllOf</code>.
   * @alias module:model/UpdateCustomFieldRequestAllOf
   */
  constructor() {
    UpdateCustomFieldRequestAllOf.initialize(this);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj) {}
  /**
   * Constructs a <code>UpdateCustomFieldRequestAllOf</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/UpdateCustomFieldRequestAllOf} obj Optional instance to populate.
   * @return {module:model/UpdateCustomFieldRequestAllOf} The populated <code>UpdateCustomFieldRequestAllOf</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new UpdateCustomFieldRequestAllOf();

      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }

      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }

      if (data.hasOwnProperty('fieldType')) {
        obj['fieldType'] = FieldType.constructFromObject(data['fieldType']);
      }

      if (data.hasOwnProperty('appliesTo')) {
        obj['appliesTo'] = AppliesTo.constructFromObject(data['appliesTo']);
      }
    }

    return obj;
  }

}
/**
 * The name of a Custom field
 * @member {String} name
 */


UpdateCustomFieldRequestAllOf.prototype['name'] = undefined;
/**
 * The description of a Custom field
 * @member {String} description
 */

UpdateCustomFieldRequestAllOf.prototype['description'] = undefined;
/**
 * @member {module:model/FieldType} fieldType
 */

UpdateCustomFieldRequestAllOf.prototype['fieldType'] = undefined;
/**
 * @member {module:model/AppliesTo} appliesTo
 */

UpdateCustomFieldRequestAllOf.prototype['appliesTo'] = undefined;
export default UpdateCustomFieldRequestAllOf;