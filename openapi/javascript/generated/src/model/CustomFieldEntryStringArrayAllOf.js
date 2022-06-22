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
 * The CustomFieldEntryStringArrayAllOf model module.
 * @module model/CustomFieldEntryStringArrayAllOf
 * @version 0.0.26
 */
class CustomFieldEntryStringArrayAllOf {
    /**
     * Constructs a new <code>CustomFieldEntryStringArrayAllOf</code>.
     * @alias module:model/CustomFieldEntryStringArrayAllOf
     * @param fieldType {String} The data type stored in this generic object ( string, number, string[], number[])
     */
    constructor(fieldType) { 
        
        CustomFieldEntryStringArrayAllOf.initialize(this, fieldType);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, fieldType) { 
        obj['fieldType'] = fieldType;
    }

    /**
     * Constructs a <code>CustomFieldEntryStringArrayAllOf</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CustomFieldEntryStringArrayAllOf} obj Optional instance to populate.
     * @return {module:model/CustomFieldEntryStringArrayAllOf} The populated <code>CustomFieldEntryStringArrayAllOf</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CustomFieldEntryStringArrayAllOf();

            if (data.hasOwnProperty('fieldType')) {
                obj['fieldType'] = ApiClient.convertToType(data['fieldType'], 'String');
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * The data type stored in this generic object ( string, number, string[], number[])
 * @member {String} fieldType
 */
CustomFieldEntryStringArrayAllOf.prototype['fieldType'] = undefined;

/**
 * 
 * @member {Array.<String>} value
 */
CustomFieldEntryStringArrayAllOf.prototype['value'] = undefined;






export default CustomFieldEntryStringArrayAllOf;

