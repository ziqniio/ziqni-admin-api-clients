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

/**
 * The CreateSpaceRequest model module.
 * @module model/CreateSpaceRequest
 * @version 0.0.26
 */
class CreateSpaceRequest {
    /**
     * Constructs a new <code>CreateSpaceRequest</code>.
     * @alias module:model/CreateSpaceRequest
     * @param name {String} The space name in the Ziqni system
     * @param accountType {String} Type of account; personal or company or vendor
     */
    constructor(name, accountType) { 
        
        CreateSpaceRequest.initialize(this, name, accountType);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, name, accountType) { 
        obj['name'] = name;
        obj['accountType'] = accountType;
    }

    /**
     * Constructs a <code>CreateSpaceRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateSpaceRequest} obj Optional instance to populate.
     * @return {module:model/CreateSpaceRequest} The populated <code>CreateSpaceRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateSpaceRequest();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('accountType')) {
                obj['accountType'] = ApiClient.convertToType(data['accountType'], 'String');
            }
            if (data.hasOwnProperty('masterSpace')) {
                obj['masterSpace'] = ApiClient.convertToType(data['masterSpace'], 'String');
            }
            if (data.hasOwnProperty('unitsOfMeasure')) {
                obj['unitsOfMeasure'] = ApiClient.convertToType(data['unitsOfMeasure'], ['String']);
            }
            if (data.hasOwnProperty('constraints')) {
                obj['constraints'] = ApiClient.convertToType(data['constraints'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * The space name in the Ziqni system
 * @member {String} name
 */
CreateSpaceRequest.prototype['name'] = undefined;

/**
 * Type of account; personal or company or vendor
 * @member {String} accountType
 */
CreateSpaceRequest.prototype['accountType'] = undefined;

/**
 * The master account for this account
 * @member {String} masterSpace
 */
CreateSpaceRequest.prototype['masterSpace'] = undefined;

/**
 * Foreign key to unit of measure id.
 * @member {Array.<String>} unitsOfMeasure
 */
CreateSpaceRequest.prototype['unitsOfMeasure'] = undefined;

/**
 * Additional constraints, if set means true
 * @member {Array.<String>} constraints
 */
CreateSpaceRequest.prototype['constraints'] = undefined;






export default CreateSpaceRequest;

