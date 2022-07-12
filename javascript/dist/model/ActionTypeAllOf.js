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
import UnitOfMeasureType from './UnitOfMeasureType';
/**
 * The ActionTypeAllOf model module.
 * @module model/ActionTypeAllOf
 * @version 0.0.26
 */

class ActionTypeAllOf {
  /**
   * Constructs a new <code>ActionTypeAllOf</code>.
   * @alias module:model/ActionTypeAllOf
   * @param name {String} The name of the Action Helper
   * @param key {String} A unique key that represents an action helper
   * @param unitOfMeasureType {module:model/UnitOfMeasureType} 
   * @param constraints {Array.<String>} Additional constraints
   */
  constructor(name, key, unitOfMeasureType, constraints) {
    ActionTypeAllOf.initialize(this, name, key, unitOfMeasureType, constraints);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj, name, key, unitOfMeasureType, constraints) {
    obj['name'] = name;
    obj['key'] = key;
    obj['unitOfMeasureType'] = unitOfMeasureType;
    obj['constraints'] = constraints;
  }
  /**
   * Constructs a <code>ActionTypeAllOf</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ActionTypeAllOf} obj Optional instance to populate.
   * @return {module:model/ActionTypeAllOf} The populated <code>ActionTypeAllOf</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new ActionTypeAllOf();

      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }

      if (data.hasOwnProperty('key')) {
        obj['key'] = ApiClient.convertToType(data['key'], 'String');
      }

      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }

      if (data.hasOwnProperty('unitOfMeasureType')) {
        obj['unitOfMeasureType'] = UnitOfMeasureType.constructFromObject(data['unitOfMeasureType']);
      }

      if (data.hasOwnProperty('constraints')) {
        obj['constraints'] = ApiClient.convertToType(data['constraints'], ['String']);
      }
    }

    return obj;
  }

}
/**
 * The name of the Action Helper
 * @member {String} name
 */


ActionTypeAllOf.prototype['name'] = undefined;
/**
 * A unique key that represents an action helper
 * @member {String} key
 */

ActionTypeAllOf.prototype['key'] = undefined;
/**
 * The description of the rule action helper for your reference
 * @member {String} description
 */

ActionTypeAllOf.prototype['description'] = undefined;
/**
 * @member {module:model/UnitOfMeasureType} unitOfMeasureType
 */

ActionTypeAllOf.prototype['unitOfMeasureType'] = undefined;
/**
 * Additional constraints
 * @member {Array.<String>} constraints
 */

ActionTypeAllOf.prototype['constraints'] = undefined;
export default ActionTypeAllOf;