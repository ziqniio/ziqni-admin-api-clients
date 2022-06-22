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
import AchievementReducedResponse from '../model/AchievementReducedResponse';
import ApiResponse from '../model/ApiResponse';
import CompetitionReducedResponse from '../model/CompetitionReducedResponse';
import ContestReducedResponse from '../model/ContestReducedResponse';
import CreateMemberRequest from '../model/CreateMemberRequest';
import MemberAwardResponse from '../model/MemberAwardResponse';
import MemberMessageResponse from '../model/MemberMessageResponse';
import MemberResponse from '../model/MemberResponse';
import QueryRequest from '../model/QueryRequest';
import UpdateMemberRequest from '../model/UpdateMemberRequest';
/**
* Members service.
* @module api/MembersApi
* @version 0.0.26
*/

export default class MembersApi {
  /**
  * Constructs a new MembersApi. 
  * @alias module:api/MembersApi
  * @class
  * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
  * default to {@link module:ApiClient#instance} if unspecified.
  */
  constructor(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;
  }
  /**
   * Callback function to receive the result of the createMembers operation.
   * @callback module:api/MembersApi~createMembersCallback
   * @param {String} error Error message, if any.
   * @param {module:model/ApiResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * Create members
   * Create new Members in the Ziqni database
   * @param {Array.<module:model/CreateMemberRequest>} body Create Members in the Ziqni database. An array can contain a maximum of 10,000 members in one request
   * @param {module:api/MembersApi~createMembersCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/ApiResponse}
   */


  createMembers(body, callback) {
    let postBody = body; // verify the required parameter 'body' is set

    if (body === undefined || body === null) {
      throw new Error("Missing the required parameter 'body' when calling createMembers");
    }

    let pathParams = {};
    let queryParams = {};
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = ['application/json', 'file/csv'];
    let accepts = ['application/json'];
    let returnType = ApiResponse;
    return this.apiClient.callApi('/members', 'POST', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the deleteMembers operation.
   * @callback module:api/MembersApi~deleteMembersCallback
   * @param {String} error Error message, if any.
   * @param {module:model/ApiResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * Delete members
   * Delete Members for a given identifier specified
   * @param {Object} opts Optional parameters
   * @param {Array.<String>} opts.id The unique identifiers of the resources
   * @param {module:api/MembersApi~deleteMembersCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/ApiResponse}
   */


  deleteMembers(opts, callback) {
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
    return this.apiClient.callApi('/members', 'DELETE', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the deleteMembersByQuery operation.
   * @callback module:api/MembersApi~deleteMembersByQueryCallback
   * @param {String} error Error message, if any.
   * @param {module:model/ApiResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * Delete members by query
   * Delete Members from Ziqni database by unique Members ID's or any other POST body parameters using the POST method
   * @param {Object} opts Optional parameters
   * @param {module:model/QueryRequest} opts.body Delete Members from Ziqni database by unique Members ID's or any other POST body parameters using the POST method
   * @param {module:api/MembersApi~deleteMembersByQueryCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/ApiResponse}
   */


  deleteMembersByQuery(opts, callback) {
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
    return this.apiClient.callApi('/members/delete', 'POST', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the getAchievementsForMembers operation.
   * @callback module:api/MembersApi~getAchievementsForMembersCallback
   * @param {String} error Error message, if any.
   * @param {module:model/AchievementReducedResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * NOT AVAILABLE IN CURRENT RELEASE
   * Returns a list of Achievements for the Member id provided
   * @param {String} id Unique identifier of the resource
   * @param {Object} opts Optional parameters
   * @param {String} opts.achievementId Id of an Achievement
   * @param {Number} opts.limit Limit the returned total records found
   * @param {Number} opts.skip Skip the returned records found and return the next batch of records
   * @param {module:api/MembersApi~getAchievementsForMembersCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/AchievementReducedResponse}
   */


  getAchievementsForMembers(id, opts, callback) {
    opts = opts || {};
    let postBody = null; // verify the required parameter 'id' is set

    if (id === undefined || id === null) {
      throw new Error("Missing the required parameter 'id' when calling getAchievementsForMembers");
    }

    let pathParams = {
      'id': id
    };
    let queryParams = {
      'achievementId': opts['achievementId'],
      '_limit': opts['limit'],
      '_skip': opts['skip']
    };
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = [];
    let accepts = ['application/json'];
    let returnType = AchievementReducedResponse;
    return this.apiClient.callApi('/members/{id}/achievements', 'GET', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the getAwardsForMembers operation.
   * @callback module:api/MembersApi~getAwardsForMembersCallback
   * @param {String} error Error message, if any.
   * @param {module:model/MemberAwardResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * NOT AVAILABLE IN CURRENT RELEASE
   * Returns a list of Awards for the Member id provided
   * @param {String} id Unique identifier of the resource
   * @param {Object} opts Optional parameters
   * @param {String} opts.awardId Id of an Award
   * @param {Number} opts.limit Limit the returned total records found
   * @param {Number} opts.skip Skip the returned records found and return the next batch of records
   * @param {module:api/MembersApi~getAwardsForMembersCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/MemberAwardResponse}
   */


  getAwardsForMembers(id, opts, callback) {
    opts = opts || {};
    let postBody = null; // verify the required parameter 'id' is set

    if (id === undefined || id === null) {
      throw new Error("Missing the required parameter 'id' when calling getAwardsForMembers");
    }

    let pathParams = {
      'id': id
    };
    let queryParams = {
      'awardId': opts['awardId'],
      '_limit': opts['limit'],
      '_skip': opts['skip']
    };
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = [];
    let accepts = ['application/json'];
    let returnType = MemberAwardResponse;
    return this.apiClient.callApi('/members/{id}/awards', 'GET', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the getCompetitionsForMembers operation.
   * @callback module:api/MembersApi~getCompetitionsForMembersCallback
   * @param {String} error Error message, if any.
   * @param {module:model/CompetitionReducedResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * NOT AVAILABLE IN CURRENT RELEASE
   * Returns a list Competitions for the Member id provided
   * @param {String} id Unique identifier of the resource
   * @param {Object} opts Optional parameters
   * @param {String} opts.competitionId Id of a Competition
   * @param {Number} opts.limit Limit the returned total records found
   * @param {Number} opts.skip Skip the returned records found and return the next batch of records
   * @param {module:api/MembersApi~getCompetitionsForMembersCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/CompetitionReducedResponse}
   */


  getCompetitionsForMembers(id, opts, callback) {
    opts = opts || {};
    let postBody = null; // verify the required parameter 'id' is set

    if (id === undefined || id === null) {
      throw new Error("Missing the required parameter 'id' when calling getCompetitionsForMembers");
    }

    let pathParams = {
      'id': id
    };
    let queryParams = {
      'competitionId': opts['competitionId'],
      '_limit': opts['limit'],
      '_skip': opts['skip']
    };
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = [];
    let accepts = ['application/json'];
    let returnType = CompetitionReducedResponse;
    return this.apiClient.callApi('/members/{id}/competitions', 'GET', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the getContestsForMembers operation.
   * @callback module:api/MembersApi~getContestsForMembersCallback
   * @param {String} error Error message, if any.
   * @param {module:model/ContestReducedResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * NOT AVAILABLE IN CURRENT RELEASE
   * Returns a list of Contests for the Member id provided
   * @param {String} id Unique identifier of the resource
   * @param {Object} opts Optional parameters
   * @param {String} opts.contestId Id of a Contest
   * @param {Number} opts.limit Limit the returned total records found
   * @param {Number} opts.skip Skip the returned records found and return the next batch of records
   * @param {module:api/MembersApi~getContestsForMembersCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/ContestReducedResponse}
   */


  getContestsForMembers(id, opts, callback) {
    opts = opts || {};
    let postBody = null; // verify the required parameter 'id' is set

    if (id === undefined || id === null) {
      throw new Error("Missing the required parameter 'id' when calling getContestsForMembers");
    }

    let pathParams = {
      'id': id
    };
    let queryParams = {
      'contestId': opts['contestId'],
      '_limit': opts['limit'],
      '_skip': opts['skip']
    };
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = [];
    let accepts = ['application/json'];
    let returnType = ContestReducedResponse;
    return this.apiClient.callApi('/members/{id}/contests', 'GET', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the getMembers operation.
   * @callback module:api/MembersApi~getMembersCallback
   * @param {String} error Error message, if any.
   * @param {module:model/MemberResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * Get members
   * Returns a list of Members. This assumes that members have first been uploaded via a POST request or web console
   * @param {Object} opts Optional parameters
   * @param {Array.<String>} opts.id The unique identifiers of the resources
   * @param {Number} opts.limit Limit the returned total records found
   * @param {Number} opts.skip Skip the returned records found and return the next batch of records
   * @param {module:api/MembersApi~getMembersCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/MemberResponse}
   */


  getMembers(opts, callback) {
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
    let returnType = MemberResponse;
    return this.apiClient.callApi('/members', 'GET', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the getMembersByQuery operation.
   * @callback module:api/MembersApi~getMembersByQueryCallback
   * @param {String} error Error message, if any.
   * @param {module:model/MemberResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * Get members by query
   * Retrieve Members from Ziqni database by unique Member ID's or any other POST body parameters using the POST method
   * @param {Object} opts Optional parameters
   * @param {module:model/QueryRequest} opts.body Retrieve Products from Ziqni database by unique Product ID's or any other POST body parameters using the POST method
   * @param {module:api/MembersApi~getMembersByQueryCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/MemberResponse}
   */


  getMembersByQuery(opts, callback) {
    opts = opts || {};
    let postBody = opts['body'];
    let pathParams = {};
    let queryParams = {};
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = ['application/json'];
    let accepts = ['application/json'];
    let returnType = MemberResponse;
    return this.apiClient.callApi('/members/query', 'POST', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the getMembersByRefId operation.
   * @callback module:api/MembersApi~getMembersByRefIdCallback
   * @param {String} error Error message, if any.
   * @param {module:model/MemberResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * Get members by reference ids
   * Returns a list of Members. This assumes that members have first been uploaded via a POST request or web console
   * @param {Object} opts Optional parameters
   * @param {Array.<String>} opts.refIds The reference ids  of the resources
   * @param {Number} opts.limit Limit the returned total records found
   * @param {Number} opts.skip Skip the returned records found and return the next batch of records
   * @param {module:api/MembersApi~getMembersByRefIdCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/MemberResponse}
   */


  getMembersByRefId(opts, callback) {
    opts = opts || {};
    let postBody = null;
    let pathParams = {};
    let queryParams = {
      'refIds': this.apiClient.buildCollectionParam(opts['refIds'], 'multi'),
      '_limit': opts['limit'],
      '_skip': opts['skip']
    };
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = [];
    let accepts = ['application/json'];
    let returnType = MemberResponse;
    return this.apiClient.callApi('/members/find-by-ref-identifiers', 'GET', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the getMessagesForMembers operation.
   * @callback module:api/MembersApi~getMessagesForMembersCallback
   * @param {String} error Error message, if any.
   * @param {module:model/MemberMessageResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * NOT AVAILABLE IN CURRENT RELEASE
   * Returns a list of Messages for the Member id provided
   * @param {String} id Unique identifier of the resource
   * @param {Object} opts Optional parameters
   * @param {String} opts.messageId Id of a Message
   * @param {Number} opts.limit Limit the returned total records found
   * @param {Number} opts.skip Skip the returned records found and return the next batch of records
   * @param {module:api/MembersApi~getMessagesForMembersCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/MemberMessageResponse}
   */


  getMessagesForMembers(id, opts, callback) {
    opts = opts || {};
    let postBody = null; // verify the required parameter 'id' is set

    if (id === undefined || id === null) {
      throw new Error("Missing the required parameter 'id' when calling getMessagesForMembers");
    }

    let pathParams = {
      'id': id
    };
    let queryParams = {
      'messageId': opts['messageId'],
      '_limit': opts['limit'],
      '_skip': opts['skip']
    };
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = [];
    let accepts = ['application/json'];
    let returnType = MemberMessageResponse;
    return this.apiClient.callApi('/members/{id}/inbox', 'GET', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the updateMembers operation.
   * @callback module:api/MembersApi~updateMembersCallback
   * @param {String} error Error message, if any.
   * @param {module:model/ApiResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * Update members
   * Update existing Members in the Ziqni database
   * @param {Array.<module:model/UpdateMemberRequest>} body Update member details in the Ziqni database for a given Member identifier. * Member Ref Id can not be changed after creation * A member Id must exist in the Ziqni database to update the member
   * @param {module:api/MembersApi~updateMembersCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/ApiResponse}
   */


  updateMembers(body, callback) {
    let postBody = body; // verify the required parameter 'body' is set

    if (body === undefined || body === null) {
      throw new Error("Missing the required parameter 'body' when calling updateMembers");
    }

    let pathParams = {};
    let queryParams = {};
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = ['application/json', 'file/csv'];
    let accepts = ['application/json'];
    let returnType = ApiResponse;
    return this.apiClient.callApi('/members', 'PUT', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }

}