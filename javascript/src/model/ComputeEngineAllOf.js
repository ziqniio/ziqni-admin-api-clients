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

/**
 * The ComputeEngineAllOf model module.
 * @module model/ComputeEngineAllOf
 * @version 0.0.26
 */
class ComputeEngineAllOf {
    /**
     * Constructs a new <code>ComputeEngineAllOf</code>.
     * @alias module:model/ComputeEngineAllOf
     * @param description {String} 
     * @param name {String} 
     */
    constructor(description, name) { 
        
        ComputeEngineAllOf.initialize(this, description, name);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, description, name) { 
        obj['description'] = description;
        obj['name'] = name;
    }

    /**
     * Constructs a <code>ComputeEngineAllOf</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComputeEngineAllOf} obj Optional instance to populate.
     * @return {module:model/ComputeEngineAllOf} The populated <code>ComputeEngineAllOf</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComputeEngineAllOf();

            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('version')) {
                obj['version'] = ApiClient.convertToType(data['version'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('uptime')) {
                obj['uptime'] = ApiClient.convertToType(data['uptime'], 'Number');
            }
            if (data.hasOwnProperty('constraints')) {
                obj['constraints'] = ApiClient.convertToType(data['constraints'], ['String']);
            }
            if (data.hasOwnProperty('statistics')) {
                obj['statistics'] = ApiClient.convertToType(data['statistics'], {'String': 'String'});
            }
            if (data.hasOwnProperty('lastKnownStatusCode')) {
                obj['lastKnownStatusCode'] = ApiClient.convertToType(data['lastKnownStatusCode'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {String} description
 */
ComputeEngineAllOf.prototype['description'] = undefined;

/**
 * @member {Number} version
 */
ComputeEngineAllOf.prototype['version'] = undefined;

/**
 * @member {String} name
 */
ComputeEngineAllOf.prototype['name'] = undefined;

/**
 * Long
 * @member {Number} uptime
 */
ComputeEngineAllOf.prototype['uptime'] = undefined;

/**
 * @member {Array.<String>} constraints
 */
ComputeEngineAllOf.prototype['constraints'] = undefined;

/**
 * @member {Object.<String, String>} statistics
 */
ComputeEngineAllOf.prototype['statistics'] = undefined;

/**
 * 
 * @member {Number} lastKnownStatusCode
 */
ComputeEngineAllOf.prototype['lastKnownStatusCode'] = undefined;






export default ComputeEngineAllOf;

