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
import MessageStatus from './MessageStatus';
import UpdateMessageStatusRequestAllOf from './UpdateMessageStatusRequestAllOf';
import UpdateModelDefault from './UpdateModelDefault';

/**
 * The UpdateMessageStatusRequest model module.
 * @module model/UpdateMessageStatusRequest
 * @version 0.0.26
 */
class UpdateMessageStatusRequest {
    /**
     * Constructs a new <code>UpdateMessageStatusRequest</code>.
     * @alias module:model/UpdateMessageStatusRequest
     * @implements module:model/UpdateModelDefault
     * @implements module:model/UpdateMessageStatusRequestAllOf
     * @param id {String} A unique system generated identifier
     */
    constructor(id) { 
        UpdateModelDefault.initialize(this, id);UpdateMessageStatusRequestAllOf.initialize(this);
        UpdateMessageStatusRequest.initialize(this, id);
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
     * Constructs a <code>UpdateMessageStatusRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UpdateMessageStatusRequest} obj Optional instance to populate.
     * @return {module:model/UpdateMessageStatusRequest} The populated <code>UpdateMessageStatusRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdateMessageStatusRequest();
            UpdateModelDefault.constructFromObject(data, obj);
            UpdateMessageStatusRequestAllOf.constructFromObject(data, obj);

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = MessageStatus.constructFromObject(data['status']);
            }
        }
        return obj;
    }


}

/**
 * A unique system generated identifier
 * @member {String} id
 */
UpdateMessageStatusRequest.prototype['id'] = undefined;

/**
 * @member {module:model/MessageStatus} status
 */
UpdateMessageStatusRequest.prototype['status'] = undefined;


// Implement UpdateModelDefault interface:
/**
 * A unique system generated identifier
 * @member {String} id
 */
UpdateModelDefault.prototype['id'] = undefined;
// Implement UpdateMessageStatusRequestAllOf interface:
/**
 * @member {module:model/MessageStatus} status
 */
UpdateMessageStatusRequestAllOf.prototype['status'] = undefined;




export default UpdateMessageStatusRequest;

