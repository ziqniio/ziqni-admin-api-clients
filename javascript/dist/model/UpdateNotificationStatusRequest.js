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
import NotificationStatus from './NotificationStatus';
import UpdateModelDefault from './UpdateModelDefault';
import UpdateNotificationStatusRequestAllOf from './UpdateNotificationStatusRequestAllOf';
/**
 * The UpdateNotificationStatusRequest model module.
 * @module model/UpdateNotificationStatusRequest
 * @version 0.0.26
 */

class UpdateNotificationStatusRequest {
  /**
   * Constructs a new <code>UpdateNotificationStatusRequest</code>.
   * @alias module:model/UpdateNotificationStatusRequest
   * @implements module:model/UpdateModelDefault
   * @implements module:model/UpdateNotificationStatusRequestAllOf
   * @param id {String} A unique system generated identifier
   */
  constructor(id) {
    UpdateModelDefault.initialize(this, id);
    UpdateNotificationStatusRequestAllOf.initialize(this);
    UpdateNotificationStatusRequest.initialize(this, id);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj, id) {
    obj['id'] = id;
  }
  /**
   * Constructs a <code>UpdateNotificationStatusRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/UpdateNotificationStatusRequest} obj Optional instance to populate.
   * @return {module:model/UpdateNotificationStatusRequest} The populated <code>UpdateNotificationStatusRequest</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new UpdateNotificationStatusRequest();
      UpdateModelDefault.constructFromObject(data, obj);
      UpdateNotificationStatusRequestAllOf.constructFromObject(data, obj);

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }

      if (data.hasOwnProperty('status')) {
        obj['status'] = NotificationStatus.constructFromObject(data['status']);
      }
    }

    return obj;
  }

}
/**
 * A unique system generated identifier
 * @member {String} id
 */


UpdateNotificationStatusRequest.prototype['id'] = undefined;
/**
 * @member {module:model/NotificationStatus} status
 */

UpdateNotificationStatusRequest.prototype['status'] = undefined; // Implement UpdateModelDefault interface:

/**
 * A unique system generated identifier
 * @member {String} id
 */

UpdateModelDefault.prototype['id'] = undefined; // Implement UpdateNotificationStatusRequestAllOf interface:

/**
 * @member {module:model/NotificationStatus} status
 */

UpdateNotificationStatusRequestAllOf.prototype['status'] = undefined;
export default UpdateNotificationStatusRequest;