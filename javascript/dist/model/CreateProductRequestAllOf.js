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
import ActionTypeAdjustmentFactor from './ActionTypeAdjustmentFactor';
import Translation from './Translation';
/**
 * The CreateProductRequestAllOf model module.
 * @module model/CreateProductRequestAllOf
 * @version 0.0.26
 */

class CreateProductRequestAllOf {
  /**
   * Constructs a new <code>CreateProductRequestAllOf</code>.
   * @alias module:model/CreateProductRequestAllOf
   * @param name {String} The name of the product
   * @param adjustmentFactor {Number} The multiplier to apply to source values received for this product events
   * @param productRefId {String} The reference to this product in your system. The reference identifier can not be changed after the product has been created
   */
  constructor(name, adjustmentFactor, productRefId) {
    CreateProductRequestAllOf.initialize(this, name, adjustmentFactor, productRefId);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj, name, adjustmentFactor, productRefId) {
    obj['name'] = name;
    obj['adjustmentFactor'] = adjustmentFactor;
    obj['productRefId'] = productRefId;
  }
  /**
   * Constructs a <code>CreateProductRequestAllOf</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CreateProductRequestAllOf} obj Optional instance to populate.
   * @return {module:model/CreateProductRequestAllOf} The populated <code>CreateProductRequestAllOf</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CreateProductRequestAllOf();

      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }

      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }

      if (data.hasOwnProperty('adjustmentFactor')) {
        obj['adjustmentFactor'] = ApiClient.convertToType(data['adjustmentFactor'], 'Number');
      }

      if (data.hasOwnProperty('productRefId')) {
        obj['productRefId'] = ApiClient.convertToType(data['productRefId'], 'String');
      }

      if (data.hasOwnProperty('actionTypeAdjustmentFactors')) {
        obj['actionTypeAdjustmentFactors'] = ApiClient.convertToType(data['actionTypeAdjustmentFactors'], [ActionTypeAdjustmentFactor]);
      }

      if (data.hasOwnProperty('translations')) {
        obj['translations'] = ApiClient.convertToType(data['translations'], [Translation]);
      }
    }

    return obj;
  }

}
/**
 * The name of the product
 * @member {String} name
 */


CreateProductRequestAllOf.prototype['name'] = undefined;
/**
 * The description of the product for your reference
 * @member {String} description
 */

CreateProductRequestAllOf.prototype['description'] = undefined;
/**
 * The multiplier to apply to source values received for this product events
 * @member {Number} adjustmentFactor
 */

CreateProductRequestAllOf.prototype['adjustmentFactor'] = undefined;
/**
 * The reference to this product in your system. The reference identifier can not be changed after the product has been created
 * @member {String} productRefId
 */

CreateProductRequestAllOf.prototype['productRefId'] = undefined;
/**
 * @member {Array.<module:model/ActionTypeAdjustmentFactor>} actionTypeAdjustmentFactors
 */

CreateProductRequestAllOf.prototype['actionTypeAdjustmentFactors'] = undefined;
/**
 * @member {Array.<module:model/Translation>} translations
 */

CreateProductRequestAllOf.prototype['translations'] = undefined;
export default CreateProductRequestAllOf;