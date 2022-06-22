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
import AchievementLiveStatus from './AchievementLiveStatus';
import AchievementLiveStatusRequestAllOf from './AchievementLiveStatusRequestAllOf';
import UpdateModelDefault from './UpdateModelDefault';

/**
 * The AchievementLiveStatusRequest model module.
 * @module model/AchievementLiveStatusRequest
 * @version 0.0.26
 */
class AchievementLiveStatusRequest {
    /**
     * Constructs a new <code>AchievementLiveStatusRequest</code>.
     * @alias module:model/AchievementLiveStatusRequest
     * @implements module:model/UpdateModelDefault
     * @implements module:model/AchievementLiveStatusRequestAllOf
     * @param id {String} A unique system generated identifier
     * @param status {module:model/AchievementLiveStatus} 
     */
    constructor(id, status) { 
        UpdateModelDefault.initialize(this, id);AchievementLiveStatusRequestAllOf.initialize(this, status);
        AchievementLiveStatusRequest.initialize(this, id, status);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, status) { 
        obj['id'] = id;
        obj['status'] = status;
    }

    /**
     * Constructs a <code>AchievementLiveStatusRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AchievementLiveStatusRequest} obj Optional instance to populate.
     * @return {module:model/AchievementLiveStatusRequest} The populated <code>AchievementLiveStatusRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AchievementLiveStatusRequest();
            UpdateModelDefault.constructFromObject(data, obj);
            AchievementLiveStatusRequestAllOf.constructFromObject(data, obj);

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = AchievementLiveStatus.constructFromObject(data['status']);
            }
        }
        return obj;
    }


}

/**
 * A unique system generated identifier
 * @member {String} id
 */
AchievementLiveStatusRequest.prototype['id'] = undefined;

/**
 * @member {module:model/AchievementLiveStatus} status
 */
AchievementLiveStatusRequest.prototype['status'] = undefined;


// Implement UpdateModelDefault interface:
/**
 * A unique system generated identifier
 * @member {String} id
 */
UpdateModelDefault.prototype['id'] = undefined;
// Implement AchievementLiveStatusRequestAllOf interface:
/**
 * @member {module:model/AchievementLiveStatus} status
 */
AchievementLiveStatusRequestAllOf.prototype['status'] = undefined;




export default AchievementLiveStatusRequest;

