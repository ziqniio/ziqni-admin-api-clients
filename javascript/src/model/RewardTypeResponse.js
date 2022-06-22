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
import RewardType from './RewardType';

/**
 * The RewardTypeResponse model module.
 * @module model/RewardTypeResponse
 * @version 0.0.26
 */
class RewardTypeResponse {
    /**
     * Constructs a new <code>RewardTypeResponse</code>.
     * This is the Response for Reward Type
     * @alias module:model/RewardTypeResponse
     * @param meta {module:model/MetaExtended} 
     */
    constructor(meta) { 
        
        RewardTypeResponse.initialize(this, meta);
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
     * Constructs a <code>RewardTypeResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RewardTypeResponse} obj Optional instance to populate.
     * @return {module:model/RewardTypeResponse} The populated <code>RewardTypeResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RewardTypeResponse();

            if (data.hasOwnProperty('meta')) {
                obj['meta'] = MetaExtended.constructFromObject(data['meta']);
            }
            if (data.hasOwnProperty('results')) {
                obj['results'] = ApiClient.convertToType(data['results'], [RewardType]);
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
RewardTypeResponse.prototype['meta'] = undefined;

/**
 * @member {Array.<module:model/RewardType>} results
 */
RewardTypeResponse.prototype['results'] = undefined;

/**
 * @member {Array.<module:model/Error>} errors
 */
RewardTypeResponse.prototype['errors'] = undefined;






export default RewardTypeResponse;
