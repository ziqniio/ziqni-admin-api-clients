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
import RabbitMqConnection from './RabbitMqConnection';

/**
 * The RabbitMqConnectionResponse model module.
 * @module model/RabbitMqConnectionResponse
 * @version 0.0.26
 */
class RabbitMqConnectionResponse {
    /**
     * Constructs a new <code>RabbitMqConnectionResponse</code>.
     * @alias module:model/RabbitMqConnectionResponse
     * @param meta {module:model/MetaExtended} 
     */
    constructor(meta) { 
        
        RabbitMqConnectionResponse.initialize(this, meta);
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
     * Constructs a <code>RabbitMqConnectionResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RabbitMqConnectionResponse} obj Optional instance to populate.
     * @return {module:model/RabbitMqConnectionResponse} The populated <code>RabbitMqConnectionResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RabbitMqConnectionResponse();

            if (data.hasOwnProperty('meta')) {
                obj['meta'] = MetaExtended.constructFromObject(data['meta']);
            }
            if (data.hasOwnProperty('results')) {
                obj['results'] = ApiClient.convertToType(data['results'], [RabbitMqConnection]);
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
RabbitMqConnectionResponse.prototype['meta'] = undefined;

/**
 * @member {Array.<module:model/RabbitMqConnection>} results
 */
RabbitMqConnectionResponse.prototype['results'] = undefined;

/**
 * @member {Array.<module:model/Error>} errors
 */
RabbitMqConnectionResponse.prototype['errors'] = undefined;






export default RabbitMqConnectionResponse;

