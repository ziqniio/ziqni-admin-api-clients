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
import EventAllOf from './EventAllOf';
import ModelDefault from './ModelDefault';

/**
 * The Event model module.
 * @module model/Event
 * @version 0.0.26
 */
class Event {
    /**
     * Constructs a new <code>Event</code>.
     * @alias module:model/Event
     * @implements module:model/ModelDefault
     * @implements module:model/EventAllOf
     * @param id {String} A unique system generated identifier
     * @param spaceName {String} This is the space name which is linked to the account
     * @param created {Date} ISO8601 timestamp for when a Model was created. All records are stored in UTC time zone
     * @param action {String} The identifier that describes the meaning of this event
     * @param sourceValue {Number} The actual numerical value related to the event
     * @param points {Number} A value derived from the source value field. In the context of Product additionally an adjustment factor will be applied
     * @param transactionTimestamp {Date} ISO8601 timestamp for when this event happened. All records are stored in UTC time zone
     */
    constructor(id, spaceName, created, action, sourceValue, points, transactionTimestamp) { 
        ModelDefault.initialize(this, id, spaceName, created);EventAllOf.initialize(this, action, sourceValue, points, transactionTimestamp);
        Event.initialize(this, id, spaceName, created, action, sourceValue, points, transactionTimestamp);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, spaceName, created, action, sourceValue, points, transactionTimestamp) { 
        obj['id'] = id;
        obj['spaceName'] = spaceName;
        obj['created'] = created;
        obj['action'] = action;
        obj['sourceValue'] = sourceValue;
        obj['points'] = points;
        obj['transactionTimestamp'] = transactionTimestamp;
    }

    /**
     * Constructs a <code>Event</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Event} obj Optional instance to populate.
     * @return {module:model/Event} The populated <code>Event</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Event();
            ModelDefault.constructFromObject(data, obj);
            EventAllOf.constructFromObject(data, obj);

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('spaceName')) {
                obj['spaceName'] = ApiClient.convertToType(data['spaceName'], 'String');
            }
            if (data.hasOwnProperty('created')) {
                obj['created'] = ApiClient.convertToType(data['created'], 'Date');
            }
            if (data.hasOwnProperty('memberId')) {
                obj['memberId'] = ApiClient.convertToType(data['memberId'], 'String');
            }
            if (data.hasOwnProperty('memberRefId')) {
                obj['memberRefId'] = ApiClient.convertToType(data['memberRefId'], 'String');
            }
            if (data.hasOwnProperty('action')) {
                obj['action'] = ApiClient.convertToType(data['action'], 'String');
            }
            if (data.hasOwnProperty('batchId')) {
                obj['batchId'] = ApiClient.convertToType(data['batchId'], 'String');
            }
            if (data.hasOwnProperty('entityId')) {
                obj['entityId'] = ApiClient.convertToType(data['entityId'], 'String');
            }
            if (data.hasOwnProperty('entityRefId')) {
                obj['entityRefId'] = ApiClient.convertToType(data['entityRefId'], 'String');
            }
            if (data.hasOwnProperty('sourceValue')) {
                obj['sourceValue'] = ApiClient.convertToType(data['sourceValue'], 'Number');
            }
            if (data.hasOwnProperty('points')) {
                obj['points'] = ApiClient.convertToType(data['points'], 'Number');
            }
            if (data.hasOwnProperty('transactionTimestamp')) {
                obj['transactionTimestamp'] = ApiClient.convertToType(data['transactionTimestamp'], 'Date');
            }
            if (data.hasOwnProperty('metadata')) {
                obj['metadata'] = ApiClient.convertToType(data['metadata'], {'String': Object});
            }
            if (data.hasOwnProperty('customFields')) {
                obj['customFields'] = ApiClient.convertToType(data['customFields'], {'String': Object});
            }
            if (data.hasOwnProperty('tags')) {
                obj['tags'] = ApiClient.convertToType(data['tags'], ['String']);
            }
            if (data.hasOwnProperty('relatesTo')) {
                obj['relatesTo'] = ApiClient.convertToType(data['relatesTo'], ['String']);
            }
            if (data.hasOwnProperty('relatesToExternal')) {
                obj['relatesToExternal'] = ApiClient.convertToType(data['relatesToExternal'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * A unique system generated identifier
 * @member {String} id
 */
Event.prototype['id'] = undefined;

/**
 * This is the space name which is linked to the account
 * @member {String} spaceName
 */
Event.prototype['spaceName'] = undefined;

/**
 * ISO8601 timestamp for when a Model was created. All records are stored in UTC time zone
 * @member {Date} created
 */
Event.prototype['created'] = undefined;

/**
 * Unique system identifier of a Member
 * @member {String} memberId
 */
Event.prototype['memberId'] = undefined;

/**
 * The reference to this member in external system
 * @member {String} memberRefId
 */
Event.prototype['memberRefId'] = undefined;

/**
 * The identifier that describes the meaning of this event
 * @member {String} action
 */
Event.prototype['action'] = undefined;

/**
 * The batch identifier is used to group related event stream data together. This could be as simple as a UUID or your internal reference to that distinct player session event
 * @member {String} batchId
 */
Event.prototype['batchId'] = undefined;

/**
 * It is a reference to a models ID for any of the following objects - Product, Achievement, Reward, Award
 * @member {String} entityId
 */
Event.prototype['entityId'] = undefined;

/**
 * It is a reference to a models ID for any of the following objects - Product, Achievement, Reward, Award
 * @member {String} entityRefId
 */
Event.prototype['entityRefId'] = undefined;

/**
 * The actual numerical value related to the event
 * @member {Number} sourceValue
 */
Event.prototype['sourceValue'] = undefined;

/**
 * A value derived from the source value field. In the context of Product additionally an adjustment factor will be applied
 * @member {Number} points
 */
Event.prototype['points'] = undefined;

/**
 * ISO8601 timestamp for when this event happened. All records are stored in UTC time zone
 * @member {Date} transactionTimestamp
 */
Event.prototype['transactionTimestamp'] = undefined;

/**
 * Event metadata map.
 * @member {Object.<String, Object>} metadata
 */
Event.prototype['metadata'] = undefined;

/**
 * @member {Object.<String, Object>} customFields
 */
Event.prototype['customFields'] = undefined;

/**
 * A list of Strings of groups that the tag belongs to
 * @member {Array.<String>} tags
 */
Event.prototype['tags'] = undefined;

/**
 * @member {Array.<String>} relatesTo
 */
Event.prototype['relatesTo'] = undefined;

/**
 * @member {Array.<String>} relatesToExternal
 */
Event.prototype['relatesToExternal'] = undefined;


// Implement ModelDefault interface:
/**
 * A unique system generated identifier
 * @member {String} id
 */
ModelDefault.prototype['id'] = undefined;
/**
 * This is the space name which is linked to the account
 * @member {String} spaceName
 */
ModelDefault.prototype['spaceName'] = undefined;
/**
 * ISO8601 timestamp for when a Model was created. All records are stored in UTC time zone
 * @member {Date} created
 */
ModelDefault.prototype['created'] = undefined;
// Implement EventAllOf interface:
/**
 * Unique system identifier of a Member
 * @member {String} memberId
 */
EventAllOf.prototype['memberId'] = undefined;
/**
 * The reference to this member in external system
 * @member {String} memberRefId
 */
EventAllOf.prototype['memberRefId'] = undefined;
/**
 * The identifier that describes the meaning of this event
 * @member {String} action
 */
EventAllOf.prototype['action'] = undefined;
/**
 * The batch identifier is used to group related event stream data together. This could be as simple as a UUID or your internal reference to that distinct player session event
 * @member {String} batchId
 */
EventAllOf.prototype['batchId'] = undefined;
/**
 * It is a reference to a models ID for any of the following objects - Product, Achievement, Reward, Award
 * @member {String} entityId
 */
EventAllOf.prototype['entityId'] = undefined;
/**
 * It is a reference to a models ID for any of the following objects - Product, Achievement, Reward, Award
 * @member {String} entityRefId
 */
EventAllOf.prototype['entityRefId'] = undefined;
/**
 * The actual numerical value related to the event
 * @member {Number} sourceValue
 */
EventAllOf.prototype['sourceValue'] = undefined;
/**
 * A value derived from the source value field. In the context of Product additionally an adjustment factor will be applied
 * @member {Number} points
 */
EventAllOf.prototype['points'] = undefined;
/**
 * ISO8601 timestamp for when this event happened. All records are stored in UTC time zone
 * @member {Date} transactionTimestamp
 */
EventAllOf.prototype['transactionTimestamp'] = undefined;
/**
 * Event metadata map.
 * @member {Object.<String, Object>} metadata
 */
EventAllOf.prototype['metadata'] = undefined;
/**
 * @member {Object.<String, Object>} customFields
 */
EventAllOf.prototype['customFields'] = undefined;
/**
 * A list of Strings of groups that the tag belongs to
 * @member {Array.<String>} tags
 */
EventAllOf.prototype['tags'] = undefined;
/**
 * @member {Array.<String>} relatesTo
 */
EventAllOf.prototype['relatesTo'] = undefined;
/**
 * @member {Array.<String>} relatesToExternal
 */
EventAllOf.prototype['relatesToExternal'] = undefined;




export default Event;

