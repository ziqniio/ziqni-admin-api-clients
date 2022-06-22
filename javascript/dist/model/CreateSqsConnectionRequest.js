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
import CreateOptParamModels from './CreateOptParamModels';
import CreateSqsConnectionRequestAllOf from './CreateSqsConnectionRequestAllOf';
/**
 * The CreateSqsConnectionRequest model module.
 * @module model/CreateSqsConnectionRequest
 * @version 0.0.26
 */

class CreateSqsConnectionRequest {
  /**
   * Constructs a new <code>CreateSqsConnectionRequest</code>.
   * @alias module:model/CreateSqsConnectionRequest
   * @implements module:model/CreateOptParamModels
   * @implements module:model/CreateSqsConnectionRequestAllOf
   * @param name {String} The name of the consumer
   * @param uri {String} The SQS endpoint.
   * @param acessKey {String} The access key of the IAM user
   * @param secretKey {String} The secret key of IAM user
   * @param transformerId {String} The transformer to use, if empty the default system transformer will be used
   */
  constructor(name, uri, acessKey, secretKey, transformerId) {
    CreateOptParamModels.initialize(this);
    CreateSqsConnectionRequestAllOf.initialize(this, name, uri, acessKey, secretKey, transformerId);
    CreateSqsConnectionRequest.initialize(this, name, uri, acessKey, secretKey, transformerId);
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
   * Constructs a <code>CreateSqsConnectionRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CreateSqsConnectionRequest} obj Optional instance to populate.
   * @return {module:model/CreateSqsConnectionRequest} The populated <code>CreateSqsConnectionRequest</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CreateSqsConnectionRequest();
      CreateOptParamModels.constructFromObject(data, obj);
      CreateSqsConnectionRequestAllOf.constructFromObject(data, obj);

      if (data.hasOwnProperty('customFields')) {
        obj['customFields'] = ApiClient.convertToType(data['customFields'], {
          'String': Object
        });
      }

      if (data.hasOwnProperty('tags')) {
        obj['tags'] = ApiClient.convertToType(data['tags'], ['String']);
      }

      if (data.hasOwnProperty('metadata')) {
        obj['metadata'] = ApiClient.convertToType(data['metadata'], {
          'String': 'String'
        });
      }

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
 * A list of custom field entries
 * @member {Object.<String, Object>} customFields
 */


CreateSqsConnectionRequest.prototype['customFields'] = undefined;
/**
 * A list of id's used to tag models
 * @member {Array.<String>} tags
 */

CreateSqsConnectionRequest.prototype['tags'] = undefined;
/**
 * @member {Object.<String, String>} metadata
 */

CreateSqsConnectionRequest.prototype['metadata'] = undefined;
/**
 * The name of the consumer
 * @member {String} name
 */

CreateSqsConnectionRequest.prototype['name'] = undefined;
/**
 * The SQS endpoint.
 * @member {String} uri
 */

CreateSqsConnectionRequest.prototype['uri'] = undefined;
/**
 * The access key of the IAM user
 * @member {String} acessKey
 */

CreateSqsConnectionRequest.prototype['acessKey'] = undefined;
/**
 * The secret key of IAM user
 * @member {String} secretKey
 */

CreateSqsConnectionRequest.prototype['secretKey'] = undefined;
/**
 * The description of the consumer
 * @member {String} description
 */

CreateSqsConnectionRequest.prototype['description'] = undefined;
/**
 * The transformer to use, if empty the default system transformer will be used
 * @member {String} transformerId
 */

CreateSqsConnectionRequest.prototype['transformerId'] = undefined; // Implement CreateOptParamModels interface:

/**
 * A list of custom field entries
 * @member {Object.<String, Object>} customFields
 */

CreateOptParamModels.prototype['customFields'] = undefined;
/**
 * A list of id's used to tag models
 * @member {Array.<String>} tags
 */

CreateOptParamModels.prototype['tags'] = undefined;
/**
 * @member {Object.<String, String>} metadata
 */

CreateOptParamModels.prototype['metadata'] = undefined; // Implement CreateSqsConnectionRequestAllOf interface:

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
export default CreateSqsConnectionRequest;