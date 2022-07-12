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
 * The UpdateWebhookRequestAllOf model module.
 * @module model/UpdateWebhookRequestAllOf
 * @version 0.0.26
 */

class UpdateWebhookRequestAllOf {
  /**
   * Constructs a new <code>UpdateWebhookRequestAllOf</code>.
   * @alias module:model/UpdateWebhookRequestAllOf
   */
  constructor() {
    UpdateWebhookRequestAllOf.initialize(this);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj) {}
  /**
   * Constructs a <code>UpdateWebhookRequestAllOf</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/UpdateWebhookRequestAllOf} obj Optional instance to populate.
   * @return {module:model/UpdateWebhookRequestAllOf} The populated <code>UpdateWebhookRequestAllOf</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new UpdateWebhookRequestAllOf();

      if (data.hasOwnProperty('postToUrl')) {
        obj['postToUrl'] = ApiClient.convertToType(data['postToUrl'], 'String');
      }

      if (data.hasOwnProperty('triggers')) {
        obj['triggers'] = ApiClient.convertToType(data['triggers'], ['String']);
      }

      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }

      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }

      if (data.hasOwnProperty('headers')) {
        obj['headers'] = ApiClient.convertToType(data['headers'], {
          'String': 'String'
        });
      }
    }

    return obj;
  }

}
/**
 * A URL to post the webhook to
 * @member {String} postToUrl
 */


UpdateWebhookRequestAllOf.prototype['postToUrl'] = undefined;
/**
 * A list of event triggers
 * @member {Array.<String>} triggers
 */

UpdateWebhookRequestAllOf.prototype['triggers'] = undefined;
/**
 * The description of a Webhook
 * @member {String} description
 */

UpdateWebhookRequestAllOf.prototype['description'] = undefined;
/**
 * The name of a Webhook
 * @member {String} name
 */

UpdateWebhookRequestAllOf.prototype['name'] = undefined;
/**
 * @member {Object.<String, String>} headers
 */

UpdateWebhookRequestAllOf.prototype['headers'] = undefined;
export default UpdateWebhookRequestAllOf;