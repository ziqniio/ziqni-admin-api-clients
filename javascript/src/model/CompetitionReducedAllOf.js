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
import CompetitionStatus from './CompetitionStatus';
import CompetitionType from './CompetitionType';
import Dependancy from './Dependancy';

/**
 * The CompetitionReducedAllOf model module.
 * @module model/CompetitionReducedAllOf
 * @version 0.0.26
 */
class CompetitionReducedAllOf {
    /**
     * Constructs a new <code>CompetitionReducedAllOf</code>.
     * @alias module:model/CompetitionReducedAllOf
     * @param competitionType {module:model/CompetitionType} 
     * @param numberOfRounds {Number} Number of rounds to be played in a competition
     * @param name {String} A name or a name of a competition. Can be translated
     * @param status {module:model/CompetitionStatus} 
     * @param statusCode {Number} The code of the competition
     * @param dependantOn {Array.<module:model/Dependancy>} 
     * @param scheduledStartDate {Date} ISO8601 timestamp for when a Competition should start. All records are stored in UTC time zone
     * @param scheduledEndDate {Date} ISO8601 timestamp for when a Competition should end. All records are stored in UTC time zone
     * @param constraints {Array.<String>} Additional constraints
     */
    constructor(competitionType, numberOfRounds, name, status, statusCode, dependantOn, scheduledStartDate, scheduledEndDate, constraints) { 
        
        CompetitionReducedAllOf.initialize(this, competitionType, numberOfRounds, name, status, statusCode, dependantOn, scheduledStartDate, scheduledEndDate, constraints);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, competitionType, numberOfRounds, name, status, statusCode, dependantOn, scheduledStartDate, scheduledEndDate, constraints) { 
        obj['competitionType'] = competitionType;
        obj['numberOfRounds'] = numberOfRounds;
        obj['name'] = name;
        obj['status'] = status;
        obj['statusCode'] = statusCode;
        obj['dependantOn'] = dependantOn;
        obj['scheduledStartDate'] = scheduledStartDate;
        obj['scheduledEndDate'] = scheduledEndDate;
        obj['constraints'] = constraints;
    }

    /**
     * Constructs a <code>CompetitionReducedAllOf</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CompetitionReducedAllOf} obj Optional instance to populate.
     * @return {module:model/CompetitionReducedAllOf} The populated <code>CompetitionReducedAllOf</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CompetitionReducedAllOf();

            if (data.hasOwnProperty('competitionType')) {
                obj['competitionType'] = CompetitionType.constructFromObject(data['competitionType']);
            }
            if (data.hasOwnProperty('numberOfRounds')) {
                obj['numberOfRounds'] = ApiClient.convertToType(data['numberOfRounds'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = CompetitionStatus.constructFromObject(data['status']);
            }
            if (data.hasOwnProperty('statusCode')) {
                obj['statusCode'] = ApiClient.convertToType(data['statusCode'], 'Number');
            }
            if (data.hasOwnProperty('dependantOn')) {
                obj['dependantOn'] = ApiClient.convertToType(data['dependantOn'], [Dependancy]);
            }
            if (data.hasOwnProperty('entrantMemberType')) {
                obj['entrantMemberType'] = ApiClient.convertToType(data['entrantMemberType'], 'String');
            }
            if (data.hasOwnProperty('scheduledStartDate')) {
                obj['scheduledStartDate'] = ApiClient.convertToType(data['scheduledStartDate'], 'Date');
            }
            if (data.hasOwnProperty('scheduledEndDate')) {
                obj['scheduledEndDate'] = ApiClient.convertToType(data['scheduledEndDate'], 'Date');
            }
            if (data.hasOwnProperty('actualStartDate')) {
                obj['actualStartDate'] = ApiClient.convertToType(data['actualStartDate'], 'Date');
            }
            if (data.hasOwnProperty('actualEndDate')) {
                obj['actualEndDate'] = ApiClient.convertToType(data['actualEndDate'], 'Date');
            }
            if (data.hasOwnProperty('tags')) {
                obj['tags'] = ApiClient.convertToType(data['tags'], ['String']);
            }
            if (data.hasOwnProperty('constraints')) {
                obj['constraints'] = ApiClient.convertToType(data['constraints'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/CompetitionType} competitionType
 */
CompetitionReducedAllOf.prototype['competitionType'] = undefined;

/**
 * Number of rounds to be played in a competition
 * @member {Number} numberOfRounds
 */
CompetitionReducedAllOf.prototype['numberOfRounds'] = undefined;

/**
 * A name or a name of a competition. Can be translated
 * @member {String} name
 */
CompetitionReducedAllOf.prototype['name'] = undefined;

/**
 * @member {module:model/CompetitionStatus} status
 */
CompetitionReducedAllOf.prototype['status'] = undefined;

/**
 * The code of the competition
 * @member {Number} statusCode
 */
CompetitionReducedAllOf.prototype['statusCode'] = undefined;

/**
 * @member {Array.<module:model/Dependancy>} dependantOn
 */
CompetitionReducedAllOf.prototype['dependantOn'] = undefined;

/**
 * @member {String} entrantMemberType
 */
CompetitionReducedAllOf.prototype['entrantMemberType'] = undefined;

/**
 * ISO8601 timestamp for when a Competition should start. All records are stored in UTC time zone
 * @member {Date} scheduledStartDate
 */
CompetitionReducedAllOf.prototype['scheduledStartDate'] = undefined;

/**
 * ISO8601 timestamp for when a Competition should end. All records are stored in UTC time zone
 * @member {Date} scheduledEndDate
 */
CompetitionReducedAllOf.prototype['scheduledEndDate'] = undefined;

/**
 * ISO8601 timestamp for when a Competition started. All records are stored in UTC time zone
 * @member {Date} actualStartDate
 */
CompetitionReducedAllOf.prototype['actualStartDate'] = undefined;

/**
 * ISO8601 timestamp for when a Competition ended. All records are stored in UTC time zone
 * @member {Date} actualEndDate
 */
CompetitionReducedAllOf.prototype['actualEndDate'] = undefined;

/**
 * A list of id's used to tag
 * @member {Array.<String>} tags
 */
CompetitionReducedAllOf.prototype['tags'] = undefined;

/**
 * Additional constraints
 * @member {Array.<String>} constraints
 */
CompetitionReducedAllOf.prototype['constraints'] = undefined;






export default CompetitionReducedAllOf;

