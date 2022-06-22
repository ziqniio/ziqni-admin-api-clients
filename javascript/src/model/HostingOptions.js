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
 * The HostingOptions model module.
 * @module model/HostingOptions
 * @version 0.0.26
 */
class HostingOptions {
    /**
     * Constructs a new <code>HostingOptions</code>.
     * Host a static website or any other web assets on Ziqni
     * @alias module:model/HostingOptions
     */
    constructor() { 
        
        HostingOptions.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>HostingOptions</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/HostingOptions} obj Optional instance to populate.
     * @return {module:model/HostingOptions} The populated <code>HostingOptions</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new HostingOptions();

            if (data.hasOwnProperty('indexFileName')) {
                obj['indexFileName'] = ApiClient.convertToType(data['indexFileName'], 'String');
            }
            if (data.hasOwnProperty('errorFileName')) {
                obj['errorFileName'] = ApiClient.convertToType(data['errorFileName'], 'String');
            }
        }
        return obj;
    }


}

/**
 * 
 * @member {String} indexFileName
 */
HostingOptions.prototype['indexFileName'] = undefined;

/**
 * 
 * @member {String} errorFileName
 */
HostingOptions.prototype['errorFileName'] = undefined;






export default HostingOptions;

