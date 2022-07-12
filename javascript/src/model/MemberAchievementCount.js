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

import ApiClient from '../ApiClient';
import CountResponse from './CountResponse';
import MemberAchievementCountAllOf from './MemberAchievementCountAllOf';

/**
 * The MemberAchievementCount model module.
 * @module model/MemberAchievementCount
 * @version 0.0.26
 */
class MemberAchievementCount {
    /**
     * Constructs a new <code>MemberAchievementCount</code>.
     * This is the Member Achievement Count model
     * @alias module:model/MemberAchievementCount
     * @implements module:model/MemberAchievementCountAllOf
     * @implements module:model/CountResponse
     * @param name {String} A the name of the member
     * @param memberId {String} A unique identifier of a Member
     * @param memberRefId {String} The reference to this member in your system
     * @param latestIssuedTimestamp {Date} ISO8601 timestamp for when a Model was created. All records are stored in UTC time zone
     * @param entityId {String} A unique identifier of a Entity
     * @param countValue {Number} The value in how many times the achievemnt was issued
     */
    constructor(name, memberId, memberRefId, latestIssuedTimestamp, entityId, countValue) { 
        MemberAchievementCountAllOf.initialize(this, name, memberId, memberRefId, latestIssuedTimestamp);CountResponse.initialize(this, entityId, countValue);
        MemberAchievementCount.initialize(this, name, memberId, memberRefId, latestIssuedTimestamp, entityId, countValue);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, name, memberId, memberRefId, latestIssuedTimestamp, entityId, countValue) { 
        obj['name'] = name;
        obj['memberId'] = memberId;
        obj['memberRefId'] = memberRefId;
        obj['latestIssuedTimestamp'] = latestIssuedTimestamp;
        obj['entityId'] = entityId;
        obj['countValue'] = countValue;
    }

    /**
     * Constructs a <code>MemberAchievementCount</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MemberAchievementCount} obj Optional instance to populate.
     * @return {module:model/MemberAchievementCount} The populated <code>MemberAchievementCount</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MemberAchievementCount();
            MemberAchievementCountAllOf.constructFromObject(data, obj);
            CountResponse.constructFromObject(data, obj);

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('memberId')) {
                obj['memberId'] = ApiClient.convertToType(data['memberId'], 'String');
            }
            if (data.hasOwnProperty('memberRefId')) {
                obj['memberRefId'] = ApiClient.convertToType(data['memberRefId'], 'String');
            }
            if (data.hasOwnProperty('latestIssuedTimestamp')) {
                obj['latestIssuedTimestamp'] = ApiClient.convertToType(data['latestIssuedTimestamp'], 'Date');
            }
            if (data.hasOwnProperty('entityId')) {
                obj['entityId'] = ApiClient.convertToType(data['entityId'], 'String');
            }
            if (data.hasOwnProperty('countValue')) {
                obj['countValue'] = ApiClient.convertToType(data['countValue'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * A the name of the member
 * @member {String} name
 */
MemberAchievementCount.prototype['name'] = undefined;

/**
 * A unique identifier of a Member
 * @member {String} memberId
 */
MemberAchievementCount.prototype['memberId'] = undefined;

/**
 * The reference to this member in your system
 * @member {String} memberRefId
 */
MemberAchievementCount.prototype['memberRefId'] = undefined;

/**
 * ISO8601 timestamp for when a Model was created. All records are stored in UTC time zone
 * @member {Date} latestIssuedTimestamp
 */
MemberAchievementCount.prototype['latestIssuedTimestamp'] = undefined;

/**
 * A unique identifier of a Entity
 * @member {String} entityId
 */
MemberAchievementCount.prototype['entityId'] = undefined;

/**
 * The value in how many times the achievemnt was issued
 * @member {Number} countValue
 */
MemberAchievementCount.prototype['countValue'] = undefined;


// Implement MemberAchievementCountAllOf interface:
/**
 * A the name of the member
 * @member {String} name
 */
MemberAchievementCountAllOf.prototype['name'] = undefined;
/**
 * A unique identifier of a Member
 * @member {String} memberId
 */
MemberAchievementCountAllOf.prototype['memberId'] = undefined;
/**
 * The reference to this member in your system
 * @member {String} memberRefId
 */
MemberAchievementCountAllOf.prototype['memberRefId'] = undefined;
/**
 * ISO8601 timestamp for when a Model was created. All records are stored in UTC time zone
 * @member {Date} latestIssuedTimestamp
 */
MemberAchievementCountAllOf.prototype['latestIssuedTimestamp'] = undefined;
// Implement CountResponse interface:
/**
 * A unique identifier of a Entity
 * @member {String} entityId
 */
CountResponse.prototype['entityId'] = undefined;
/**
 * The value in how many times the achievemnt was issued
 * @member {Number} countValue
 */
CountResponse.prototype['countValue'] = undefined;




export default MemberAchievementCount;

