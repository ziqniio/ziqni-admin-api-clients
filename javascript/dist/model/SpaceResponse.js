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
import Error from './Error';
import MetaExtended from './MetaExtended';
import Space from './Space';
/**
 * The SpaceResponse model module.
 * @module model/SpaceResponse
 * @version 0.0.26
 */

class SpaceResponse {
  /**
   * Constructs a new <code>SpaceResponse</code>.
   * @alias module:model/SpaceResponse
   * @param meta {module:model/MetaExtended} 
   */
  constructor(meta) {
    SpaceResponse.initialize(this, meta);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj, meta) {
    obj['meta'] = meta;
  }
  /**
   * Constructs a <code>SpaceResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SpaceResponse} obj Optional instance to populate.
   * @return {module:model/SpaceResponse} The populated <code>SpaceResponse</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SpaceResponse();

      if (data.hasOwnProperty('meta')) {
        obj['meta'] = MetaExtended.constructFromObject(data['meta']);
      }

      if (data.hasOwnProperty('results')) {
        obj['results'] = ApiClient.convertToType(data['results'], [Space]);
      }

      if (data.hasOwnProperty('errors')) {
        obj['errors'] = ApiClient.convertToType(data['errors'], [Error]);
      }
    }

    return obj;
  }

}
/**
 * @member {module:model/MetaExtended} meta
 */


SpaceResponse.prototype['meta'] = undefined;
/**
 * @member {Array.<module:model/Space>} results
 */

SpaceResponse.prototype['results'] = undefined;
/**
 * @member {Array.<module:model/Error>} errors
 */

SpaceResponse.prototype['errors'] = undefined;
export default SpaceResponse;