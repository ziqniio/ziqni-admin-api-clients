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
import MessageStatus from './MessageStatus';
import MessageType from './MessageType';
import Scheduling from './Scheduling';
import Translation from './Translation';
/**
 * The CreateNotificationRequestAllOf model module.
 * @module model/CreateNotificationRequestAllOf
 * @version 0.0.26
 */

class CreateNotificationRequestAllOf {
  /**
   * Constructs a new <code>CreateNotificationRequestAllOf</code>.
   * @alias module:model/CreateNotificationRequestAllOf
   * @param messageType {module:model/MessageType} 
   * @param subject {String} The title of the message
   * @param body {String} The context of the message
   * @param status {module:model/MessageStatus} 
   * @param memberId {Array.<String>} The reference ID of the event object
   * @param scheduling {module:model/Scheduling} 
   * @param constraints {Array.<String>} Additional constraints
   */
  constructor(messageType, subject, body, status, memberId, scheduling, constraints) {
    CreateNotificationRequestAllOf.initialize(this, messageType, subject, body, status, memberId, scheduling, constraints);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj, messageType, subject, body, status, memberId, scheduling, constraints) {
    obj['messageType'] = messageType;
    obj['subject'] = subject;
    obj['body'] = body;
    obj['status'] = status;
    obj['memberId'] = memberId;
    obj['scheduling'] = scheduling;
    obj['constraints'] = constraints;
  }
  /**
   * Constructs a <code>CreateNotificationRequestAllOf</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CreateNotificationRequestAllOf} obj Optional instance to populate.
   * @return {module:model/CreateNotificationRequestAllOf} The populated <code>CreateNotificationRequestAllOf</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CreateNotificationRequestAllOf();

      if (data.hasOwnProperty('messageType')) {
        obj['messageType'] = MessageType.constructFromObject(data['messageType']);
      }

      if (data.hasOwnProperty('subject')) {
        obj['subject'] = ApiClient.convertToType(data['subject'], 'String');
      }

      if (data.hasOwnProperty('body')) {
        obj['body'] = ApiClient.convertToType(data['body'], 'String');
      }

      if (data.hasOwnProperty('status')) {
        obj['status'] = MessageStatus.constructFromObject(data['status']);
      }

      if (data.hasOwnProperty('translations')) {
        obj['translations'] = ApiClient.convertToType(data['translations'], [Translation]);
      }

      if (data.hasOwnProperty('memberGroup')) {
        obj['memberGroup'] = ApiClient.convertToType(data['memberGroup'], ['String']);
      }

      if (data.hasOwnProperty('memberId')) {
        obj['memberId'] = ApiClient.convertToType(data['memberId'], ['String']);
      }

      if (data.hasOwnProperty('scheduling')) {
        obj['scheduling'] = Scheduling.constructFromObject(data['scheduling']);
      }

      if (data.hasOwnProperty('constraints')) {
        obj['constraints'] = ApiClient.convertToType(data['constraints'], ['String']);
      }
    }

    return obj;
  }

}
/**
 * @member {module:model/MessageType} messageType
 */


CreateNotificationRequestAllOf.prototype['messageType'] = undefined;
/**
 * The title of the message
 * @member {String} subject
 */

CreateNotificationRequestAllOf.prototype['subject'] = undefined;
/**
 * The context of the message
 * @member {String} body
 */

CreateNotificationRequestAllOf.prototype['body'] = undefined;
/**
 * @member {module:model/MessageStatus} status
 */

CreateNotificationRequestAllOf.prototype['status'] = undefined;
/**
 * @member {Array.<module:model/Translation>} translations
 */

CreateNotificationRequestAllOf.prototype['translations'] = undefined;
/**
 * The reference ID of the event object
 * @member {Array.<String>} memberGroup
 */

CreateNotificationRequestAllOf.prototype['memberGroup'] = undefined;
/**
 * The reference ID of the event object
 * @member {Array.<String>} memberId
 */

CreateNotificationRequestAllOf.prototype['memberId'] = undefined;
/**
 * @member {module:model/Scheduling} scheduling
 */

CreateNotificationRequestAllOf.prototype['scheduling'] = undefined;
/**
 * Additional constraints
 * @member {Array.<String>} constraints
 */

CreateNotificationRequestAllOf.prototype['constraints'] = undefined;
export default CreateNotificationRequestAllOf;