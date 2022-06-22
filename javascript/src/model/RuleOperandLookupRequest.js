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
 * The RuleOperandLookupRequest model module.
 * @module model/RuleOperandLookupRequest
 * @version 0.0.26
 */
class RuleOperandLookupRequest {
    /**
     * Constructs a new <code>RuleOperandLookupRequest</code>.
     * @alias module:model/RuleOperandLookupRequest
     * @param context {String} The object context to search within
     */
    constructor(context) { 
        
        RuleOperandLookupRequest.initialize(this, context);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, context) { 
        obj['context'] = context;
    }

    /**
     * Constructs a <code>RuleOperandLookupRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RuleOperandLookupRequest} obj Optional instance to populate.
     * @return {module:model/RuleOperandLookupRequest} The populated <code>RuleOperandLookupRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RuleOperandLookupRequest();

            if (data.hasOwnProperty('context')) {
                obj['context'] = ApiClient.convertToType(data['context'], 'String');
            }
            if (data.hasOwnProperty('searchText')) {
                obj['searchText'] = ApiClient.convertToType(data['searchText'], 'String');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], ['String']);
            }
            if (data.hasOwnProperty('skip')) {
                obj['skip'] = ApiClient.convertToType(data['skip'], 'Number');
            }
            if (data.hasOwnProperty('limit')) {
                obj['limit'] = ApiClient.convertToType(data['limit'], 'Number');
            }
            if (data.hasOwnProperty('constraints')) {
                obj['constraints'] = ApiClient.convertToType(data['constraints'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * The object context to search within
 * @member {String} context
 */
RuleOperandLookupRequest.prototype['context'] = undefined;

/**
 * The text to search, at least 3 characters are required.
 * @member {String} searchText
 */
RuleOperandLookupRequest.prototype['searchText'] = undefined;

/**
 * The identifier to retrieve, if this is set search text will be ignored
 * @member {Array.<String>} id
 */
RuleOperandLookupRequest.prototype['id'] = undefined;

/**
 * How many response objects will be skipped for preview. Deafault is zero [0]
 * @member {Number} skip
 */
RuleOperandLookupRequest.prototype['skip'] = undefined;

/**
 * How many response objects will be returned. Deafult is zero [0] and the maximum is fifty [50]
 * @member {Number} limit
 */
RuleOperandLookupRequest.prototype['limit'] = undefined;

/**
 * Additional constraints
 * @member {Array.<String>} constraints
 */
RuleOperandLookupRequest.prototype['constraints'] = undefined;






export default RuleOperandLookupRequest;

