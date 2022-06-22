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
import Webhook from './Webhook';
/**
 * The WebhookResponse model module.
 * @module model/WebhookResponse
 * @version 0.0.26
 */

class WebhookResponse {
  /**
   * Constructs a new <code>WebhookResponse</code>.
   * @alias module:model/WebhookResponse
   * @param meta {module:model/MetaExtended} 
   */
  constructor(meta) {
    WebhookResponse.initialize(this, meta);
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
   * Constructs a <code>WebhookResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/WebhookResponse} obj Optional instance to populate.
   * @return {module:model/WebhookResponse} The populated <code>WebhookResponse</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new WebhookResponse();

      if (data.hasOwnProperty('meta')) {
        obj['meta'] = MetaExtended.constructFromObject(data['meta']);
      }

      if (data.hasOwnProperty('results')) {
        obj['results'] = ApiClient.convertToType(data['results'], [Webhook]);
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


WebhookResponse.prototype['meta'] = undefined;
/**
 * @member {Array.<module:model/Webhook>} results
 */

WebhookResponse.prototype['results'] = undefined;
/**
 * @member {Array.<module:model/Error>} errors
 */

WebhookResponse.prototype['errors'] = undefined;
export default WebhookResponse;