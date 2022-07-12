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
 * The OptParamModels model module.
 * @module model/OptParamModels
 * @version 0.0.26
 */

class OptParamModels {
  /**
   * Constructs a new <code>OptParamModels</code>.
   * @alias module:model/OptParamModels
   */
  constructor() {
    OptParamModels.initialize(this);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj) {}
  /**
   * Constructs a <code>OptParamModels</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OptParamModels} obj Optional instance to populate.
   * @return {module:model/OptParamModels} The populated <code>OptParamModels</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OptParamModels();

      if (data.hasOwnProperty('customFields')) {
        obj['customFields'] = ApiClient.convertToType(data['customFields'], {
          'String': Object
        });
      }

      if (data.hasOwnProperty('tags')) {
        obj['tags'] = ApiClient.convertToType(data['tags'], ['String']);
      }

      if (data.hasOwnProperty('metadata')) {
        obj['metadata'] = ApiClient.convertToType(data['metadata'], {
          'String': 'String'
        });
      }
    }

    return obj;
  }

}
/**
 * @member {Object.<String, Object>} customFields
 */


OptParamModels.prototype['customFields'] = undefined;
/**
 * A list of id's used to tag models
 * @member {Array.<String>} tags
 */

OptParamModels.prototype['tags'] = undefined;
/**
 * @member {Object.<String, String>} metadata
 */

OptParamModels.prototype['metadata'] = undefined;
export default OptParamModels;