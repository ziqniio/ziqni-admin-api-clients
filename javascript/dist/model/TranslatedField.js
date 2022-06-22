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
 * The TranslatedField model module.
 * @module model/TranslatedField
 * @version 0.0.26
 */

class TranslatedField {
  /**
   * Constructs a new <code>TranslatedField</code>.
   * @alias module:model/TranslatedField
   * @param fieldName {String} The name of the translatable field of the model. Reference to translatableFields
   * @param text {String} The text of the selected language
   */
  constructor(fieldName, text) {
    TranslatedField.initialize(this, fieldName, text);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj, fieldName, text) {
    obj['fieldName'] = fieldName;
    obj['text'] = text;
  }
  /**
   * Constructs a <code>TranslatedField</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/TranslatedField} obj Optional instance to populate.
   * @return {module:model/TranslatedField} The populated <code>TranslatedField</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new TranslatedField();

      if (data.hasOwnProperty('fieldName')) {
        obj['fieldName'] = ApiClient.convertToType(data['fieldName'], 'String');
      }

      if (data.hasOwnProperty('text')) {
        obj['text'] = ApiClient.convertToType(data['text'], 'String');
      }
    }

    return obj;
  }

}
/**
 * The name of the translatable field of the model. Reference to translatableFields
 * @member {String} fieldName
 */


TranslatedField.prototype['fieldName'] = undefined;
/**
 * The text of the selected language
 * @member {String} text
 */

TranslatedField.prototype['text'] = undefined;
export default TranslatedField;