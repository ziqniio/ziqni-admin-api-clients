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
import ActionTypeAdjustmentFactor from './ActionTypeAdjustmentFactor';
/**
 * The ProductAllOf model module.
 * @module model/ProductAllOf
 * @version 0.0.26
 */

class ProductAllOf {
  /**
   * Constructs a new <code>ProductAllOf</code>.
   * @alias module:model/ProductAllOf
   * @param name {String} The name of the product
   * @param adjustmentFactor {Number} The multiplier to apply to source values received for this product events
   * @param productRefId {String} The reference to this product in your system. The reference identifier can not be changed after the product has been created
   */
  constructor(name, adjustmentFactor, productRefId) {
    ProductAllOf.initialize(this, name, adjustmentFactor, productRefId);
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
   * Constructs a <code>ProductAllOf</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ProductAllOf} obj Optional instance to populate.
   * @return {module:model/ProductAllOf} The populated <code>ProductAllOf</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new ProductAllOf();

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
    }

    return obj;
  }

}
/**
 * The name of the product
 * @member {String} name
 */


ProductAllOf.prototype['name'] = undefined;
/**
 * The description of the product for your reference
 * @member {String} description
 */

ProductAllOf.prototype['description'] = undefined;
/**
 * The multiplier to apply to source values received for this product events
 * @member {Number} adjustmentFactor
 */

ProductAllOf.prototype['adjustmentFactor'] = undefined;
/**
 * The reference to this product in your system. The reference identifier can not be changed after the product has been created
 * @member {String} productRefId
 */

ProductAllOf.prototype['productRefId'] = undefined;
/**
 * @member {Array.<module:model/ActionTypeAdjustmentFactor>} actionTypeAdjustmentFactors
 */

ProductAllOf.prototype['actionTypeAdjustmentFactors'] = undefined;
export default ProductAllOf;