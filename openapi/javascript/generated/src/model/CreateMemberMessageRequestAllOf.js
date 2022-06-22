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
import EventRefType from './EventRefType';
import MessageStatus from './MessageStatus';
import MessageType from './MessageType';
import Translation from './Translation';

/**
 * The CreateMemberMessageRequestAllOf model module.
 * @module model/CreateMemberMessageRequestAllOf
 * @version 0.0.26
 */
class CreateMemberMessageRequestAllOf {
    /**
     * Constructs a new <code>CreateMemberMessageRequestAllOf</code>.
     * @alias module:model/CreateMemberMessageRequestAllOf
     * @param eventRefType {module:model/EventRefType} 
     * @param messageType {module:model/MessageType} 
     * @param subject {String} The title of the message
     * @param body {String} The context of the message
     * @param prize {String} Unique system identifier of an Award
     * @param status {module:model/MessageStatus} 
     * @param expiry {Date} The time that the message will disappear after. ISO8601 timestamp
     * @param memberId {Array.<String>} The reference ID of the event object
     */
    constructor(eventRefType, messageType, subject, body, prize, status, expiry, memberId) { 
        
        CreateMemberMessageRequestAllOf.initialize(this, eventRefType, messageType, subject, body, prize, status, expiry, memberId);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, eventRefType, messageType, subject, body, prize, status, expiry, memberId) { 
        obj['eventRefType'] = eventRefType;
        obj['messageType'] = messageType;
        obj['subject'] = subject;
        obj['body'] = body;
        obj['prize'] = prize;
        obj['status'] = status;
        obj['expiry'] = expiry;
        obj['memberId'] = memberId;
    }

    /**
     * Constructs a <code>CreateMemberMessageRequestAllOf</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateMemberMessageRequestAllOf} obj Optional instance to populate.
     * @return {module:model/CreateMemberMessageRequestAllOf} The populated <code>CreateMemberMessageRequestAllOf</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateMemberMessageRequestAllOf();

            if (data.hasOwnProperty('eventRefType')) {
                obj['eventRefType'] = EventRefType.constructFromObject(data['eventRefType']);
            }
            if (data.hasOwnProperty('eventRefId')) {
                obj['eventRefId'] = ApiClient.convertToType(data['eventRefId'], 'String');
            }
            if (data.hasOwnProperty('messageType')) {
                obj['messageType'] = MessageType.constructFromObject(data['messageType']);
            }
            if (data.hasOwnProperty('subject')) {
                obj['subject'] = ApiClient.convertToType(data['subject'], 'String');
            }
            if (data.hasOwnProperty('body')) {
                obj['body'] = ApiClient.convertToType(data['body'], 'String');
            }
            if (data.hasOwnProperty('prize')) {
                obj['prize'] = ApiClient.convertToType(data['prize'], 'String');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = MessageStatus.constructFromObject(data['status']);
            }
            if (data.hasOwnProperty('expiry')) {
                obj['expiry'] = ApiClient.convertToType(data['expiry'], 'Date');
            }
            if (data.hasOwnProperty('memberId')) {
                obj['memberId'] = ApiClient.convertToType(data['memberId'], ['String']);
            }
            if (data.hasOwnProperty('translations')) {
                obj['translations'] = ApiClient.convertToType(data['translations'], [Translation]);
            }
            if (data.hasOwnProperty('translatableFields')) {
                obj['translatableFields'] = ApiClient.convertToType(data['translatableFields'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/EventRefType} eventRefType
 */
CreateMemberMessageRequestAllOf.prototype['eventRefType'] = undefined;

/**
 * The reference ID of the event object
 * @member {String} eventRefId
 */
CreateMemberMessageRequestAllOf.prototype['eventRefId'] = undefined;

/**
 * @member {module:model/MessageType} messageType
 */
CreateMemberMessageRequestAllOf.prototype['messageType'] = undefined;

/**
 * The title of the message
 * @member {String} subject
 */
CreateMemberMessageRequestAllOf.prototype['subject'] = undefined;

/**
 * The context of the message
 * @member {String} body
 */
CreateMemberMessageRequestAllOf.prototype['body'] = undefined;

/**
 * Unique system identifier of an Award
 * @member {String} prize
 */
CreateMemberMessageRequestAllOf.prototype['prize'] = undefined;

/**
 * @member {module:model/MessageStatus} status
 */
CreateMemberMessageRequestAllOf.prototype['status'] = undefined;

/**
 * The time that the message will disappear after. ISO8601 timestamp
 * @member {Date} expiry
 */
CreateMemberMessageRequestAllOf.prototype['expiry'] = undefined;

/**
 * The reference ID of the event object
 * @member {Array.<String>} memberId
 */
CreateMemberMessageRequestAllOf.prototype['memberId'] = undefined;

/**
 * @member {Array.<module:model/Translation>} translations
 */
CreateMemberMessageRequestAllOf.prototype['translations'] = undefined;

/**
 * Message translatable fields
 * @member {Array.<String>} translatableFields
 */
CreateMemberMessageRequestAllOf.prototype['translatableFields'] = undefined;






export default CreateMemberMessageRequestAllOf;

