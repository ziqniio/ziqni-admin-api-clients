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
 * The QueryMultiple model module.
 * @module model/QueryMultiple
 * @version 0.0.26
 */

class QueryMultiple {
  /**
   * Constructs a new <code>QueryMultiple</code>.
   * @alias module:model/QueryMultiple
   * @param queryField {String} The key of the parameter that is being searched
   * @param queryValues {Array.<String>} Multiple values for parameter that is being searched
   */
  constructor(queryField, queryValues) {
    QueryMultiple.initialize(this, queryField, queryValues);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj, queryField, queryValues) {
    obj['queryField'] = queryField;
    obj['queryValues'] = queryValues;
  }
  /**
   * Constructs a <code>QueryMultiple</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/QueryMultiple} obj Optional instance to populate.
   * @return {module:model/QueryMultiple} The populated <code>QueryMultiple</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new QueryMultiple();

      if (data.hasOwnProperty('queryField')) {
        obj['queryField'] = ApiClient.convertToType(data['queryField'], 'String');
      }

      if (data.hasOwnProperty('queryValues')) {
        obj['queryValues'] = ApiClient.convertToType(data['queryValues'], ['String']);
      }
    }

    return obj;
  }

}
/**
 * The key of the parameter that is being searched
 * @member {String} queryField
 */


QueryMultiple.prototype['queryField'] = undefined;
/**
 * Multiple values for parameter that is being searched
 * @member {Array.<String>} queryValues
 */

QueryMultiple.prototype['queryValues'] = undefined;
export default QueryMultiple;