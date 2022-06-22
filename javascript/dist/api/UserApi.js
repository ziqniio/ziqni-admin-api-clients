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
import AccountMessageResponse from '../model/AccountMessageResponse';
import ProfileResponse from '../model/ProfileResponse';
/**
* User service.
* @module api/UserApi
* @version 0.0.26
*/

export default class UserApi {
  /**
  * Constructs a new UserApi. 
  * @alias module:api/UserApi
  * @class
  * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
  * default to {@link module:ApiClient#instance} if unspecified.
  */
  constructor(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;
  }
  /**
   * Callback function to receive the result of the getUser operation.
   * @callback module:api/UserApi~getUserCallback
   * @param {String} error Error message, if any.
   * @param {module:model/ProfileResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * Returns the current users user. This assumes that a user has first been uploaded via a POST request or web console
   * @param {Object} opts Optional parameters
   * @param {Boolean} opts.includeSpaces Include Spaces
   * @param {module:api/UserApi~getUserCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/ProfileResponse}
   */


  getUser(opts, callback) {
    opts = opts || {};
    let postBody = null;
    let pathParams = {};
    let queryParams = {
      'includeSpaces': opts['includeSpaces']
    };
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = [];
    let accepts = ['application/json'];
    let returnType = ProfileResponse;
    return this.apiClient.callApi('/user', 'GET', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the getUserMessages operation.
   * @callback module:api/UserApi~getUserMessagesCallback
   * @param {String} error Error message, if any.
   * @param {module:model/AccountMessageResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * NOT AVAILABLE IN CURRENT RELEASE
   * Returns a list of the Users messages
   * @param {Object} opts Optional parameters
   * @param {Number} opts.limit Limit the returned total records found
   * @param {Number} opts.skip Skip the returned records found and return the next batch of records
   * @param {module:api/UserApi~getUserMessagesCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/AccountMessageResponse}
   */


  getUserMessages(opts, callback) {
    opts = opts || {};
    let postBody = null;
    let pathParams = {};
    let queryParams = {
      '_limit': opts['limit'],
      '_skip': opts['skip']
    };
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = [];
    let accepts = ['application/json'];
    let returnType = AccountMessageResponse;
    return this.apiClient.callApi('/user/inbox', 'GET', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the getUserMessagesById operation.
   * @callback module:api/UserApi~getUserMessagesByIdCallback
   * @param {String} error Error message, if any.
   * @param {module:model/AccountMessageResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * NOT AVAILABLE IN CURRENT RELEASE
   * Returns a Users message for the identifier provided
   * @param {String} id Unique identifier of the resource
   * @param {module:api/UserApi~getUserMessagesByIdCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/AccountMessageResponse}
   */


  getUserMessagesById(id, callback) {
    let postBody = null; // verify the required parameter 'id' is set

    if (id === undefined || id === null) {
      throw new Error("Missing the required parameter 'id' when calling getUserMessagesById");
    }

    let pathParams = {
      'id': id
    };
    let queryParams = {};
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = [];
    let accepts = ['application/json'];
    let returnType = AccountMessageResponse;
    return this.apiClient.callApi('/user/inbox/{id}', 'GET', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }

}