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
import CreateFileObjectRequestAllOf from './CreateFileObjectRequestAllOf';
import CreateOptParamModels from './CreateOptParamModels';

/**
 * The CreateFileObjectRequest model module.
 * @module model/CreateFileObjectRequest
 * @version 0.0.26
 */
class CreateFileObjectRequest {
    /**
     * Constructs a new <code>CreateFileObjectRequest</code>.
     * @alias module:model/CreateFileObjectRequest
     * @implements module:model/CreateOptParamModels
     * @implements module:model/CreateFileObjectRequestAllOf
     * @param repositoryId {String} The repository identifier this file belongs too
     * @param name {String} Name of the original file uploaded
     * @param mimeType {String} Mime type of the file. Example mime types - text/csv or application/vmd.ms-excel or application/x-directory for directories
     * @param parentFolderPath {String} The folder containing the file within the repository
     */
    constructor(repositoryId, name, mimeType, parentFolderPath) { 
        CreateOptParamModels.initialize(this);CreateFileObjectRequestAllOf.initialize(this, repositoryId, name, mimeType, parentFolderPath);
        CreateFileObjectRequest.initialize(this, repositoryId, name, mimeType, parentFolderPath);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, repositoryId, name, mimeType, parentFolderPath) { 
        obj['repositoryId'] = repositoryId;
        obj['name'] = name;
        obj['mimeType'] = mimeType;
        obj['parentFolderPath'] = parentFolderPath;
    }

    /**
     * Constructs a <code>CreateFileObjectRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateFileObjectRequest} obj Optional instance to populate.
     * @return {module:model/CreateFileObjectRequest} The populated <code>CreateFileObjectRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateFileObjectRequest();
            CreateOptParamModels.constructFromObject(data, obj);
            CreateFileObjectRequestAllOf.constructFromObject(data, obj);

            if (data.hasOwnProperty('customFields')) {
                obj['customFields'] = ApiClient.convertToType(data['customFields'], {'String': Object});
            }
            if (data.hasOwnProperty('tags')) {
                obj['tags'] = ApiClient.convertToType(data['tags'], ['String']);
            }
            if (data.hasOwnProperty('metadata')) {
                obj['metadata'] = ApiClient.convertToType(data['metadata'], {'String': 'String'});
            }
            if (data.hasOwnProperty('repositoryId')) {
                obj['repositoryId'] = ApiClient.convertToType(data['repositoryId'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('mimeType')) {
                obj['mimeType'] = ApiClient.convertToType(data['mimeType'], 'String');
            }
            if (data.hasOwnProperty('parentFolderPath')) {
                obj['parentFolderPath'] = ApiClient.convertToType(data['parentFolderPath'], 'String');
            }
            if (data.hasOwnProperty('constraints')) {
                obj['constraints'] = ApiClient.convertToType(data['constraints'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * A list of custom field entries
 * @member {Object.<String, Object>} customFields
 */
CreateFileObjectRequest.prototype['customFields'] = undefined;

/**
 * A list of id's used to tag models
 * @member {Array.<String>} tags
 */
CreateFileObjectRequest.prototype['tags'] = undefined;

/**
 * @member {Object.<String, String>} metadata
 */
CreateFileObjectRequest.prototype['metadata'] = undefined;

/**
 * The repository identifier this file belongs too
 * @member {String} repositoryId
 */
CreateFileObjectRequest.prototype['repositoryId'] = undefined;

/**
 * Name of the original file uploaded
 * @member {String} name
 */
CreateFileObjectRequest.prototype['name'] = undefined;

/**
 * Mime type of the file. Example mime types - text/csv or application/vmd.ms-excel or application/x-directory for directories
 * @member {String} mimeType
 */
CreateFileObjectRequest.prototype['mimeType'] = undefined;

/**
 * The folder containing the file within the repository
 * @member {String} parentFolderPath
 */
CreateFileObjectRequest.prototype['parentFolderPath'] = undefined;

/**
 * Additional constraints, if the value is present it means the
 * @member {Array.<String>} constraints
 */
CreateFileObjectRequest.prototype['constraints'] = undefined;


// Implement CreateOptParamModels interface:
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
CreateOptParamModels.prototype['metadata'] = undefined;
// Implement CreateFileObjectRequestAllOf interface:
/**
 * The repository identifier this file belongs too
 * @member {String} repositoryId
 */
CreateFileObjectRequestAllOf.prototype['repositoryId'] = undefined;
/**
 * Name of the original file uploaded
 * @member {String} name
 */
CreateFileObjectRequestAllOf.prototype['name'] = undefined;
/**
 * Mime type of the file. Example mime types - text/csv or application/vmd.ms-excel or application/x-directory for directories
 * @member {String} mimeType
 */
CreateFileObjectRequestAllOf.prototype['mimeType'] = undefined;
/**
 * The folder containing the file within the repository
 * @member {String} parentFolderPath
 */
CreateFileObjectRequestAllOf.prototype['parentFolderPath'] = undefined;
/**
 * Additional constraints, if the value is present it means the
 * @member {Array.<String>} constraints
 */
CreateFileObjectRequestAllOf.prototype['constraints'] = undefined;




export default CreateFileObjectRequest;
