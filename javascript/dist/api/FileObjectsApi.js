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
import ApiClient from "../ApiClient";
import ApiResponse from '../model/ApiResponse';
import CreateFileObjectRequest from '../model/CreateFileObjectRequest';
import FileObjectsResponse from '../model/FileObjectsResponse';
import QueryRequest from '../model/QueryRequest';
import UpdateFileObjectRequest from '../model/UpdateFileObjectRequest';
/**
* FileObjects service.
* @module api/FileObjectsApi
* @version 0.0.26
*/

export default class FileObjectsApi {
  /**
  * Constructs a new FileObjectsApi. 
  * @alias module:api/FileObjectsApi
  * @class
  * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
  * default to {@link module:ApiClient#instance} if unspecified.
  */
  constructor(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;
  }
  /**
   * Callback function to receive the result of the copyFileObjects operation.
   * @callback module:api/FileObjectsApi~copyFileObjectsCallback
   * @param {String} error Error message, if any.
   * @param {module:model/ApiResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * NOT AVAILABLE IN CURRENT RELEASE
   * Copy an existing file object
   * @param {module:model/UpdateFileObjectRequest} body Copy file objects inside a repository and dumplicate in another folder or repository.
   * @param {Object} opts Optional parameters
   * @param {Array.<String>} opts.id The unique identifiers of the resources
   * @param {module:api/FileObjectsApi~copyFileObjectsCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/ApiResponse}
   */


  copyFileObjects(body, opts, callback) {
    opts = opts || {};
    let postBody = body; // verify the required parameter 'body' is set

    if (body === undefined || body === null) {
      throw new Error("Missing the required parameter 'body' when calling copyFileObjects");
    }

    let pathParams = {};
    let queryParams = {
      'id': this.apiClient.buildCollectionParam(opts['id'], 'multi')
    };
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = ['application/json'];
    let accepts = ['application/json'];
    let returnType = ApiResponse;
    return this.apiClient.callApi('/file-objects/copy', 'POST', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the createFileObjects operation.
   * @callback module:api/FileObjectsApi~createFileObjectsCallback
   * @param {String} error Error message, if any.
   * @param {module:model/ApiResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * @param {module:model/CreateFileObjectRequest} body Create a new file object repository in your Ziqni space
   * @param {module:api/FileObjectsApi~createFileObjectsCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/ApiResponse}
   */


  createFileObjects(body, callback) {
    let postBody = body; // verify the required parameter 'body' is set

    if (body === undefined || body === null) {
      throw new Error("Missing the required parameter 'body' when calling createFileObjects");
    }

    let pathParams = {};
    let queryParams = {};
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = ['application/json'];
    let accepts = ['application/json'];
    let returnType = ApiResponse;
    return this.apiClient.callApi('/file-objects', 'POST', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the deleteFileObjects operation.
   * @callback module:api/FileObjectsApi~deleteFileObjectsCallback
   * @param {String} error Error message, if any.
   * @param {module:model/ApiResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * @param {Object} opts Optional parameters
   * @param {Array.<String>} opts.id The unique identifiers of the resources
   * @param {Boolean} opts.permanent Permanently delete the file object. Default is false
   * @param {module:api/FileObjectsApi~deleteFileObjectsCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/ApiResponse}
   */


  deleteFileObjects(opts, callback) {
    opts = opts || {};
    let postBody = null;
    let pathParams = {};
    let queryParams = {
      'id': this.apiClient.buildCollectionParam(opts['id'], 'multi'),
      'permanent': opts['permanent']
    };
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = [];
    let accepts = ['application/json'];
    let returnType = ApiResponse;
    return this.apiClient.callApi('/file-objects', 'DELETE', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the deleteFileObjectsByQuery operation.
   * @callback module:api/FileObjectsApi~deleteFileObjectsByQueryCallback
   * @param {String} error Error message, if any.
   * @param {module:model/ApiResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * NOT AVAILABLE IN CURRENT RELEASE
   * Delete file objects by query
   * @param {Object} opts Optional parameters
   * @param {Array.<String>} opts.id The unique identifiers of the resources
   * @param {module:model/QueryRequest} opts.body Delete file objects inside a repository from Ziqni by unique file by unique object ID's or any other POST body parameters using the POST method
   * @param {module:api/FileObjectsApi~deleteFileObjectsByQueryCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/ApiResponse}
   */


  deleteFileObjectsByQuery(opts, callback) {
    opts = opts || {};
    let postBody = opts['body'];
    let pathParams = {};
    let queryParams = {
      'id': this.apiClient.buildCollectionParam(opts['id'], 'multi')
    };
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = ['application/json'];
    let accepts = ['application/json'];
    let returnType = ApiResponse;
    return this.apiClient.callApi('/file-objects/delete', 'POST', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the downloadFileObjects operation.
   * @callback module:api/FileObjectsApi~downloadFileObjectsCallback
   * @param {String} error Error message, if any.
   * @param {File} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * NOT AVAILABLE IN CURRENT RELEASE
   * Download file objects from your Ziqni space
   * @param {Object} opts Optional parameters
   * @param {String} opts.path The canonical path of the file to download
   * @param {module:api/FileObjectsApi~downloadFileObjectsCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link File}
   */


  downloadFileObjects(opts, callback) {
    opts = opts || {};
    let postBody = null;
    let pathParams = {};
    let queryParams = {
      'path': opts['path']
    };
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = [];
    let accepts = ['text/xml', 'application/json'];
    let returnType = File;
    return this.apiClient.callApi('/file-objects/download', 'GET', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the getFileObjects operation.
   * @callback module:api/FileObjectsApi~getFileObjectsCallback
   * @param {String} error Error message, if any.
   * @param {module:model/FileObjectsResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * Returns a list of file objects
   * @param {Object} opts Optional parameters
   * @param {Number} opts.limit Limit the returned total records found
   * @param {Number} opts.skip Skip the returned records found and return the next batch of records
   * @param {Array.<String>} opts.id The unique identifiers of the resources
   * @param {String} opts.download 
   * @param {module:api/FileObjectsApi~getFileObjectsCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/FileObjectsResponse}
   */


  getFileObjects(opts, callback) {
    opts = opts || {};
    let postBody = null;
    let pathParams = {};
    let queryParams = {
      '_limit': opts['limit'],
      '_skip': opts['skip'],
      'id': this.apiClient.buildCollectionParam(opts['id'], 'multi'),
      'download': opts['download']
    };
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = [];
    let accepts = ['application/json'];
    let returnType = FileObjectsResponse;
    return this.apiClient.callApi('/file-objects', 'GET', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the getFileObjectsByQuery operation.
   * @callback module:api/FileObjectsApi~getFileObjectsByQueryCallback
   * @param {String} error Error message, if any.
   * @param {module:model/FileObjectsResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * Retrieve file objects by query
   * @param {Object} opts Optional parameters
   * @param {Array.<String>} opts.id The unique identifiers of the resources
   * @param {module:model/QueryRequest} opts.body Retrieve file objects inside a repository from Ziqni by unique file object ID's or any other POST body parameters using the POST method
   * @param {module:api/FileObjectsApi~getFileObjectsByQueryCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/FileObjectsResponse}
   */


  getFileObjectsByQuery(opts, callback) {
    opts = opts || {};
    let postBody = opts['body'];
    let pathParams = {};
    let queryParams = {
      'id': this.apiClient.buildCollectionParam(opts['id'], 'multi')
    };
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = ['application/json'];
    let accepts = ['application/json'];
    let returnType = FileObjectsResponse;
    return this.apiClient.callApi('/file-objects/query', 'POST', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the saveTemplates operation.
   * @callback module:api/FileObjectsApi~saveTemplatesCallback
   * @param {String} error Error message, if any.
   * @param {module:model/ApiResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * NOT AVAILABLE IN CURRENT RELEASE
   * Create or update file objects and binaries in your Ziqni space
   * @param {Object} opts Optional parameters
   * @param {String} opts.parentFolderPath The folder to save these file in.
   * @param {String} opts.repositoryId 
   * @param {String} opts.templateToSave 
   * @param {String} opts.templateName 
   * @param {String} opts.tags 
   * @param {module:api/FileObjectsApi~saveTemplatesCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/ApiResponse}
   */


  saveTemplates(opts, callback) {
    opts = opts || {};
    let postBody = null;
    let pathParams = {};
    let queryParams = {};
    let headerParams = {};
    let formParams = {
      'parentFolderPath': opts['parentFolderPath'],
      'repositoryId': opts['repositoryId'],
      'templateToSave': opts['templateToSave'],
      'templateName': opts['templateName'],
      'tags': opts['tags']
    };
    let authNames = ['OAuth2'];
    let contentTypes = ['multipart/form-data'];
    let accepts = ['application/json'];
    let returnType = ApiResponse;
    return this.apiClient.callApi('/file-objects/save-template', 'POST', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the updateFileObjects operation.
   * @callback module:api/FileObjectsApi~updateFileObjectsCallback
   * @param {String} error Error message, if any.
   * @param {module:model/ApiResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * @param {Array.<module:model/UpdateFileObjectRequest>} body Update a file object in your Ziqni space.
   * @param {module:api/FileObjectsApi~updateFileObjectsCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/ApiResponse}
   */


  updateFileObjects(body, callback) {
    let postBody = body; // verify the required parameter 'body' is set

    if (body === undefined || body === null) {
      throw new Error("Missing the required parameter 'body' when calling updateFileObjects");
    }

    let pathParams = {};
    let queryParams = {};
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = ['application/json'];
    let accepts = ['application/json'];
    let returnType = ApiResponse;
    return this.apiClient.callApi('/file-objects', 'PUT', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the uploadFileObjects operation.
   * @callback module:api/FileObjectsApi~uploadFileObjectsCallback
   * @param {String} error Error message, if any.
   * @param {module:model/ApiResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * NOT AVAILABLE IN CURRENT RELEASE
   * Create or update file objects and binaries in your Ziqni space
   * @param {Object} opts Optional parameters
   * @param {String} opts.parentFolderPath The folder to save these file in.
   * @param {Array.<File>} opts.files The files to upload
   * @param {String} opts.repositoryId 
   * @param {String} opts.tags 
   * @param {module:api/FileObjectsApi~uploadFileObjectsCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/ApiResponse}
   */


  uploadFileObjects(opts, callback) {
    opts = opts || {};
    let postBody = null;
    let pathParams = {};
    let queryParams = {};
    let headerParams = {};
    let formParams = {
      'parentFolderPath': opts['parentFolderPath'],
      'files': this.apiClient.buildCollectionParam(opts['files'], 'passthrough'),
      'repositoryId': opts['repositoryId'],
      'tags': opts['tags']
    };
    let authNames = ['OAuth2'];
    let contentTypes = ['multipart/form-data'];
    let accepts = ['application/json'];
    let returnType = ApiResponse;
    return this.apiClient.callApi('/file-objects/upload', 'POST', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }

}