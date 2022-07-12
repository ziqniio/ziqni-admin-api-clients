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
import ApiClient from "../ApiClient";
import ApiResponse from '../model/ApiResponse';
import CollaboratorResponse from '../model/CollaboratorResponse';
import CollaboratorRolesResponse from '../model/CollaboratorRolesResponse';
import CreateCollaboratorRequest from '../model/CreateCollaboratorRequest';
import QueryRequest from '../model/QueryRequest';
import UpdateCollaboratorRequest from '../model/UpdateCollaboratorRequest';
/**
* Collaborators service.
* @module api/CollaboratorsApi
* @version 0.0.26
*/

export default class CollaboratorsApi {
  /**
  * Constructs a new CollaboratorsApi. 
  * @alias module:api/CollaboratorsApi
  * @class
  * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
  * default to {@link module:ApiClient#instance} if unspecified.
  */
  constructor(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;
  }
  /**
   * Callback function to receive the result of the createCollaborators operation.
   * @callback module:api/CollaboratorsApi~createCollaboratorsCallback
   * @param {String} error Error message, if any.
   * @param {module:model/ApiResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * Create a new Collaborator in the Ziqni
   * @param {Array.<module:model/CreateCollaboratorRequest>} body Create a Collaborator in the Ziqni system
   * @param {module:api/CollaboratorsApi~createCollaboratorsCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/ApiResponse}
   */


  createCollaborators(body, callback) {
    let postBody = body; // verify the required parameter 'body' is set

    if (body === undefined || body === null) {
      throw new Error("Missing the required parameter 'body' when calling createCollaborators");
    }

    let pathParams = {};
    let queryParams = {};
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = ['application/json'];
    let accepts = ['application/json'];
    let returnType = ApiResponse;
    return this.apiClient.callApi('/collaborators', 'POST', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the deleteCollaborators operation.
   * @callback module:api/CollaboratorsApi~deleteCollaboratorsCallback
   * @param {String} error Error message, if any.
   * @param {module:model/ApiResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * Returns a list of Collaborators. This assumes that Users have first been uploaded via a POST request or web console
   * @param {Object} opts Optional parameters
   * @param {Array.<String>} opts.emails The list of user emails to search by
   * @param {module:api/CollaboratorsApi~deleteCollaboratorsCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/ApiResponse}
   */


  deleteCollaborators(opts, callback) {
    opts = opts || {};
    let postBody = null;
    let pathParams = {};
    let queryParams = {
      'emails': this.apiClient.buildCollectionParam(opts['emails'], 'multi')
    };
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = [];
    let accepts = ['application/json'];
    let returnType = ApiResponse;
    return this.apiClient.callApi('/collaborators', 'DELETE', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the getAvailableRolesForCollaborators operation.
   * @callback module:api/CollaboratorsApi~getAvailableRolesForCollaboratorsCallback
   * @param {String} error Error message, if any.
   * @param {module:model/CollaboratorRolesResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * Returns a list of Collaborators. This assumes that Users have first been uploaded via a POST request or web console
   * @param {module:api/CollaboratorsApi~getAvailableRolesForCollaboratorsCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/CollaboratorRolesResponse}
   */


  getAvailableRolesForCollaborators(callback) {
    let postBody = null;
    let pathParams = {};
    let queryParams = {};
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = [];
    let accepts = ['application/json'];
    let returnType = CollaboratorRolesResponse;
    return this.apiClient.callApi('/collaborators/available-roles', 'GET', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the getCollaborators operation.
   * @callback module:api/CollaboratorsApi~getCollaboratorsCallback
   * @param {String} error Error message, if any.
   * @param {module:model/CollaboratorResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * Returns a list of Collaborators. This assumes that Users have first been uploaded via a POST request or web console
   * @param {Object} opts Optional parameters
   * @param {Array.<String>} opts.emails The list of user emails to search by
   * @param {Number} opts.limit Limit the returned total records found
   * @param {Number} opts.skip Skip the returned records found and return the next batch of records
   * @param {module:api/CollaboratorsApi~getCollaboratorsCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/CollaboratorResponse}
   */


  getCollaborators(opts, callback) {
    opts = opts || {};
    let postBody = null;
    let pathParams = {};
    let queryParams = {
      'emails': this.apiClient.buildCollectionParam(opts['emails'], 'multi'),
      '_limit': opts['limit'],
      '_skip': opts['skip']
    };
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = [];
    let accepts = ['application/json'];
    let returnType = CollaboratorResponse;
    return this.apiClient.callApi('/collaborators', 'GET', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the getCollaboratorsByQuery operation.
   * @callback module:api/CollaboratorsApi~getCollaboratorsByQueryCallback
   * @param {String} error Error message, if any.
   * @param {module:model/CollaboratorResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * NOT AVAILABLE IN CURRENT RELEASE
   * Retrieve collaborators for the account
   * @param {Object} opts Optional parameters
   * @param {module:model/QueryRequest} opts.body Retrieve collaborators for the account
   * @param {module:api/CollaboratorsApi~getCollaboratorsByQueryCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/CollaboratorResponse}
   */


  getCollaboratorsByQuery(opts, callback) {
    opts = opts || {};
    let postBody = opts['body'];
    let pathParams = {};
    let queryParams = {};
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = ['application/json'];
    let accepts = ['application/json'];
    let returnType = CollaboratorResponse;
    return this.apiClient.callApi('/collaborators/query', 'POST', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the updateCollaborators operation.
   * @callback module:api/CollaboratorsApi~updateCollaboratorsCallback
   * @param {String} error Error message, if any.
   * @param {module:model/ApiResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * Update an existing Collaborator in the Ziqni system
   * @param {Array.<module:model/UpdateCollaboratorRequest>} body Update a Collaborator in the Ziqni system. * Any Put body Parameters that are excluded in the Request body field will be considered as empty and updated with an empty field
   * @param {module:api/CollaboratorsApi~updateCollaboratorsCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/ApiResponse}
   */


  updateCollaborators(body, callback) {
    let postBody = body; // verify the required parameter 'body' is set

    if (body === undefined || body === null) {
      throw new Error("Missing the required parameter 'body' when calling updateCollaborators");
    }

    let pathParams = {};
    let queryParams = {};
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = ['application/json'];
    let accepts = ['application/json'];
    let returnType = ApiResponse;
    return this.apiClient.callApi('/collaborators', 'PUT', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }

}