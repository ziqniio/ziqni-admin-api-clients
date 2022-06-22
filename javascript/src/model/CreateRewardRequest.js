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
import CreateRewardRequestAllOf from './CreateRewardRequestAllOf';
import Translation from './Translation';

/**
 * The CreateRewardRequest model module.
 * @module model/CreateRewardRequest
 * @version 0.0.26
 */
class CreateRewardRequest {
    /**
     * Constructs a new <code>CreateRewardRequest</code>.
     * @alias module:model/CreateRewardRequest
     * @implements module:model/CreateOptParamModels
     * @implements module:model/CreateRewardRequestAllOf
     * @param name {String} The name of a reward
     * @param rewardRank {String} If used in the context of contest this will associate with the rank of the leaderboard
     * @param rewardValue {Number} Numerical value of the reward that will be issued based on the reward type
     * @param delay {Number} Delay of issuing a reward in minutes
     * @param rewardTypeId {String} A unique id of the Reward Type
     */
    constructor(name, rewardRank, rewardValue, delay, rewardTypeId) { 
        CreateOptParamModels.initialize(this);CreateRewardRequestAllOf.initialize(this, name, rewardRank, rewardValue, delay, rewardTypeId);
        CreateRewardRequest.initialize(this, name, rewardRank, rewardValue, delay, rewardTypeId);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, name, rewardRank, rewardValue, delay, rewardTypeId) { 
        obj['name'] = name;
        obj['rewardRank'] = rewardRank;
        obj['rewardValue'] = rewardValue;
        obj['delay'] = delay;
        obj['rewardTypeId'] = rewardTypeId;
    }

    /**
     * Constructs a <code>CreateRewardRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateRewardRequest} obj Optional instance to populate.
     * @return {module:model/CreateRewardRequest} The populated <code>CreateRewardRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateRewardRequest();
            CreateOptParamModels.constructFromObject(data, obj);
            CreateRewardRequestAllOf.constructFromObject(data, obj);

            if (data.hasOwnProperty('customFields')) {
                obj['customFields'] = ApiClient.convertToType(data['customFields'], {'String': Object});
            }
            if (data.hasOwnProperty('tags')) {
                obj['tags'] = ApiClient.convertToType(data['tags'], ['String']);
            }
            if (data.hasOwnProperty('metadata')) {
                obj['metadata'] = ApiClient.convertToType(data['metadata'], {'String': 'String'});
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('rewardRank')) {
                obj['rewardRank'] = ApiClient.convertToType(data['rewardRank'], 'String');
            }
            if (data.hasOwnProperty('rewardValue')) {
                obj['rewardValue'] = ApiClient.convertToType(data['rewardValue'], 'Number');
            }
            if (data.hasOwnProperty('icon')) {
                obj['icon'] = ApiClient.convertToType(data['icon'], 'String');
            }
            if (data.hasOwnProperty('issueLimit')) {
                obj['issueLimit'] = ApiClient.convertToType(data['issueLimit'], 'Number');
            }
            if (data.hasOwnProperty('delay')) {
                obj['delay'] = ApiClient.convertToType(data['delay'], 'Number');
            }
            if (data.hasOwnProperty('pointInTime')) {
                obj['pointInTime'] = ApiClient.convertToType(data['pointInTime'], 'Date');
            }
            if (data.hasOwnProperty('period')) {
                obj['period'] = ApiClient.convertToType(data['period'], 'Number');
            }
            if (data.hasOwnProperty('translations')) {
                obj['translations'] = ApiClient.convertToType(data['translations'], [Translation]);
            }
            if (data.hasOwnProperty('addConstraints')) {
                obj['addConstraints'] = ApiClient.convertToType(data['addConstraints'], ['String']);
            }
            if (data.hasOwnProperty('rewardTypeId')) {
                obj['rewardTypeId'] = ApiClient.convertToType(data['rewardTypeId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * A list of custom field entries
 * @member {Object.<String, Object>} customFields
 */
CreateRewardRequest.prototype['customFields'] = undefined;

/**
 * A list of id's used to tag models
 * @member {Array.<String>} tags
 */
CreateRewardRequest.prototype['tags'] = undefined;

/**
 * @member {Object.<String, String>} metadata
 */
CreateRewardRequest.prototype['metadata'] = undefined;

/**
 * The name of a reward
 * @member {String} name
 */
CreateRewardRequest.prototype['name'] = undefined;

/**
 * The description of a Reward
 * @member {String} description
 */
CreateRewardRequest.prototype['description'] = undefined;

/**
 * If used in the context of contest this will associate with the rank of the leaderboard
 * @member {String} rewardRank
 */
CreateRewardRequest.prototype['rewardRank'] = undefined;

/**
 * Numerical value of the reward that will be issued based on the reward type
 * @member {Number} rewardValue
 */
CreateRewardRequest.prototype['rewardValue'] = undefined;

/**
 * An Icon id that has been pre uploaded to the system to display for reward
 * @member {String} icon
 */
CreateRewardRequest.prototype['icon'] = undefined;

/**
 * how many of thsese rewards are
 * @member {Number} issueLimit
 */
CreateRewardRequest.prototype['issueLimit'] = undefined;

/**
 * Delay of issuing a reward in minutes
 * @member {Number} delay
 */
CreateRewardRequest.prototype['delay'] = undefined;

/**
 * ISO8601 timestamp for when a Reward is available until a specific point in time. All records are stored in UTC time zone
 * @member {Date} pointInTime
 */
CreateRewardRequest.prototype['pointInTime'] = undefined;

/**
 * Reward available for a period of time from issuing in minutes
 * @member {Number} period
 */
CreateRewardRequest.prototype['period'] = undefined;

/**
 * @member {Array.<module:model/Translation>} translations
 */
CreateRewardRequest.prototype['translations'] = undefined;

/**
 * Additional constraints
 * @member {Array.<String>} addConstraints
 */
CreateRewardRequest.prototype['addConstraints'] = undefined;

/**
 * A unique id of the Reward Type
 * @member {String} rewardTypeId
 */
CreateRewardRequest.prototype['rewardTypeId'] = undefined;


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
// Implement CreateRewardRequestAllOf interface:
/**
 * The name of a reward
 * @member {String} name
 */
CreateRewardRequestAllOf.prototype['name'] = undefined;
/**
 * The description of a Reward
 * @member {String} description
 */
CreateRewardRequestAllOf.prototype['description'] = undefined;
/**
 * If used in the context of contest this will associate with the rank of the leaderboard
 * @member {String} rewardRank
 */
CreateRewardRequestAllOf.prototype['rewardRank'] = undefined;
/**
 * Numerical value of the reward that will be issued based on the reward type
 * @member {Number} rewardValue
 */
CreateRewardRequestAllOf.prototype['rewardValue'] = undefined;
/**
 * An Icon id that has been pre uploaded to the system to display for reward
 * @member {String} icon
 */
CreateRewardRequestAllOf.prototype['icon'] = undefined;
/**
 * how many of thsese rewards are
 * @member {Number} issueLimit
 */
CreateRewardRequestAllOf.prototype['issueLimit'] = undefined;
/**
 * Delay of issuing a reward in minutes
 * @member {Number} delay
 */
CreateRewardRequestAllOf.prototype['delay'] = undefined;
/**
 * ISO8601 timestamp for when a Reward is available until a specific point in time. All records are stored in UTC time zone
 * @member {Date} pointInTime
 */
CreateRewardRequestAllOf.prototype['pointInTime'] = undefined;
/**
 * Reward available for a period of time from issuing in minutes
 * @member {Number} period
 */
CreateRewardRequestAllOf.prototype['period'] = undefined;
/**
 * @member {Array.<module:model/Translation>} translations
 */
CreateRewardRequestAllOf.prototype['translations'] = undefined;
/**
 * Additional constraints
 * @member {Array.<String>} addConstraints
 */
CreateRewardRequestAllOf.prototype['addConstraints'] = undefined;
/**
 * A unique id of the Reward Type
 * @member {String} rewardTypeId
 */
CreateRewardRequestAllOf.prototype['rewardTypeId'] = undefined;




export default CreateRewardRequest;

