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
 * The CreateSqsConnectionRequestAllOf model module.
 * @module model/CreateSqsConnectionRequestAllOf
 * @version 0.0.26
 */
class CreateSqsConnectionRequestAllOf {
    /**
     * Constructs a new <code>CreateSqsConnectionRequestAllOf</code>.
     * @alias module:model/CreateSqsConnectionRequestAllOf
     * @param name {String} The name of the consumer
     * @param uri {String} The SQS endpoint.
     * @param acessKey {String} The access key of the IAM user
     * @param secretKey {String} The secret key of IAM user
     * @param transformerId {String} The transformer to use, if empty the default system transformer will be used
     */
    constructor(name, uri, acessKey, secretKey, transformerId) { 
        
        CreateSqsConnectionRequestAllOf.initialize(this, name, uri, acessKey, secretKey, transformerId);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, name, uri, acessKey, secretKey, transformerId) { 
        obj['name'] = name;
        obj['uri'] = uri;
        obj['acessKey'] = acessKey;
        obj['secretKey'] = secretKey;
        obj['transformerId'] = transformerId;
    }

    /**
     * Constructs a <code>CreateSqsConnectionRequestAllOf</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateSqsConnectionRequestAllOf} obj Optional instance to populate.
     * @return {module:model/CreateSqsConnectionRequestAllOf} The populated <code>CreateSqsConnectionRequestAllOf</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateSqsConnectionRequestAllOf();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('uri')) {
                obj['uri'] = ApiClient.convertToType(data['uri'], 'String');
            }
            if (data.hasOwnProperty('acessKey')) {
                obj['acessKey'] = ApiClient.convertToType(data['acessKey'], 'String');
            }
            if (data.hasOwnProperty('secretKey')) {
                obj['secretKey'] = ApiClient.convertToType(data['secretKey'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('transformerId')) {
                obj['transformerId'] = ApiClient.convertToType(data['transformerId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The name of the consumer
 * @member {String} name
 */
CreateSqsConnectionRequestAllOf.prototype['name'] = undefined;

/**
 * The SQS endpoint.
 * @member {String} uri
 */
CreateSqsConnectionRequestAllOf.prototype['uri'] = undefined;

/**
 * The access key of the IAM user
 * @member {String} acessKey
 */
CreateSqsConnectionRequestAllOf.prototype['acessKey'] = undefined;

/**
 * The secret key of IAM user
 * @member {String} secretKey
 */
CreateSqsConnectionRequestAllOf.prototype['secretKey'] = undefined;

/**
 * The description of the consumer
 * @member {String} description
 */
CreateSqsConnectionRequestAllOf.prototype['description'] = undefined;

/**
 * The transformer to use, if empty the default system transformer will be used
 * @member {String} transformerId
 */
CreateSqsConnectionRequestAllOf.prototype['transformerId'] = undefined;






export default CreateSqsConnectionRequestAllOf;

