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
import CreateTagRequest from '../model/CreateTagRequest';
import QueryRequest from '../model/QueryRequest';
import TagResponse from '../model/TagResponse';
import UpdateTagRequest from '../model/UpdateTagRequest';
/**
* Tags service.
* @module api/TagsApi
* @version 0.0.26
*/

export default class TagsApi {
  /**
  * Constructs a new TagsApi. 
  * @alias module:api/TagsApi
  * @class
  * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
  * default to {@link module:ApiClient#instance} if unspecified.
  */
  constructor(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;
  }
  /**
   * Callback function to receive the result of the createTags operation.
   * @callback module:api/TagsApi~createTagsCallback
   * @param {String} error Error message, if any.
   * @param {module:model/ApiResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * Create tags
   * Create new Tags in the Ziqni database
   * @param {Array.<module:model/CreateTagRequest>} body Create Tags in the Ziqni database
   * @param {module:api/TagsApi~createTagsCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/ApiResponse}
   */


  createTags(body, callback) {
    let postBody = body; // verify the required parameter 'body' is set

    if (body === undefined || body === null) {
      throw new Error("Missing the required parameter 'body' when calling createTags");
    }

    let pathParams = {};
    let queryParams = {};
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = ['application/json'];
    let accepts = ['application/json'];
    let returnType = ApiResponse;
    return this.apiClient.callApi('/tags', 'POST', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the deleteTags operation.
   * @callback module:api/TagsApi~deleteTagsCallback
   * @param {String} error Error message, if any.
   * @param {module:model/ApiResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * Delete tags
   * Delete Tags for a given identifier specified
   * @param {Object} opts Optional parameters
   * @param {Array.<String>} opts.id The unique identifiers of the resources
   * @param {module:api/TagsApi~deleteTagsCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/ApiResponse}
   */


  deleteTags(opts, callback) {
    opts = opts || {};
    let postBody = null;
    let pathParams = {};
    let queryParams = {
      'id': this.apiClient.buildCollectionParam(opts['id'], 'multi')
    };
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = [];
    let accepts = ['application/json'];
    let returnType = ApiResponse;
    return this.apiClient.callApi('/tags', 'DELETE', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the deleteTagsByQuery operation.
   * @callback module:api/TagsApi~deleteTagsByQueryCallback
   * @param {String} error Error message, if any.
   * @param {module:model/ApiResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * Delete tags by query
   * Delete Tags from Ziqni database by unique Tags ID's or any other POST body parameters using the POST method
   * @param {Object} opts Optional parameters
   * @param {module:model/QueryRequest} opts.body Delete Tags from Ziqni database by unique Tags ID's or any other POST body parameters using the POST method
   * @param {module:api/TagsApi~deleteTagsByQueryCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/ApiResponse}
   */


  deleteTagsByQuery(opts, callback) {
    opts = opts || {};
    let postBody = opts['body'];
    let pathParams = {};
    let queryParams = {};
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = ['application/json'];
    let accepts = ['application/json'];
    let returnType = ApiResponse;
    return this.apiClient.callApi('/tags/delete', 'POST', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the getTags operation.
   * @callback module:api/TagsApi~getTagsCallback
   * @param {String} error Error message, if any.
   * @param {module:model/TagResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * Get tags
   * Returns a list of Tags. This assumes that tags have first been uploaded via a POST request or web console
   * @param {Object} opts Optional parameters
   * @param {Array.<String>} opts.id The unique identifiers of the resources
   * @param {Number} opts.limit Limit the returned total records found
   * @param {Number} opts.skip Skip the returned records found and return the next batch of records
   * @param {module:api/TagsApi~getTagsCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/TagResponse}
   */


  getTags(opts, callback) {
    opts = opts || {};
    let postBody = null;
    let pathParams = {};
    let queryParams = {
      'id': this.apiClient.buildCollectionParam(opts['id'], 'multi'),
      '_limit': opts['limit'],
      '_skip': opts['skip']
    };
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = [];
    let accepts = ['application/json'];
    let returnType = TagResponse;
    return this.apiClient.callApi('/tags', 'GET', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the getTagsByQuery operation.
   * @callback module:api/TagsApi~getTagsByQueryCallback
   * @param {String} error Error message, if any.
   * @param {module:model/TagResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * Get tags by query
   * Retrieve Tags from Ziqni database by unique Tags ID's or any other POST body parameters using the POST method
   * @param {Object} opts Optional parameters
   * @param {module:model/QueryRequest} opts.body Retrieve Tags from Ziqni database by unique Tags ID's or any other POST body parameters using the POST method
   * @param {module:api/TagsApi~getTagsByQueryCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/TagResponse}
   */


  getTagsByQuery(opts, callback) {
    opts = opts || {};
    let postBody = opts['body'];
    let pathParams = {};
    let queryParams = {};
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = ['application/json'];
    let accepts = ['application/json'];
    let returnType = TagResponse;
    return this.apiClient.callApi('/tags/query', 'POST', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the updateTags operation.
   * @callback module:api/TagsApi~updateTagsCallback
   * @param {String} error Error message, if any.
   * @param {module:model/ApiResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * Update tags
   * Update existing Tags in the Ziqni database
   * @param {Array.<module:model/UpdateTagRequest>} body Update a Tag in the Ziqni database.
   * @param {module:api/TagsApi~updateTagsCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/ApiResponse}
   */


  updateTags(body, callback) {
    let postBody = body; // verify the required parameter 'body' is set

    if (body === undefined || body === null) {
      throw new Error("Missing the required parameter 'body' when calling updateTags");
    }

    let pathParams = {};
    let queryParams = {};
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = ['application/json'];
    let accepts = ['application/json'];
    let returnType = ApiResponse;
    return this.apiClient.callApi('/tags', 'PUT', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }

}