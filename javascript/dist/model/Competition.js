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
import CompetitionAllOf from './CompetitionAllOf';
import CompetitionStatus from './CompetitionStatus';
import CompetitionType from './CompetitionType';
import DependantOn from './DependantOn';
import ModelDefault from './ModelDefault';
import OptParamModels from './OptParamModels';
import ProductReduced from './ProductReduced';
/**
 * The Competition model module.
 * @module model/Competition
 * @version 0.0.26
 */

class Competition {
  /**
   * Constructs a new <code>Competition</code>.
   * @alias module:model/Competition
   * @implements module:model/ModelDefault
   * @implements module:model/OptParamModels
   * @implements module:model/CompetitionAllOf
   * @param id {String} A unique system generated identifier
   * @param spaceName {String} This is the space name which is linked to the account
   * @param created {Date} ISO8601 timestamp for when a Model was created. All records are stored in UTC time zone
   * @param competitionType {module:model/CompetitionType} 
   * @param numberOfRounds {Number} Number of rounds to be played in a competition
   * @param name {String} A name or a name of a competition. Can be translated
   * @param minNumberOfEntrants {Number} Maximum number of partiipants allowed in a competition
   * @param scheduledStartDate {Date} ISO8601 timestamp for when a Competition should start. All records are stored in UTC time zone
   * @param scheduledEndDate {Date} ISO8601 timestamp for when a Competition should end. All records are stored in UTC time zone
   * @param status {module:model/CompetitionStatus} 
   * @param constraints {Array.<String>} Additional constraints
   * @param products {Array.<module:model/ProductReduced>} 
   */
  constructor(id, spaceName, created, competitionType, numberOfRounds, name, minNumberOfEntrants, scheduledStartDate, scheduledEndDate, status, constraints, products) {
    ModelDefault.initialize(this, id, spaceName, created);
    OptParamModels.initialize(this);
    CompetitionAllOf.initialize(this, competitionType, numberOfRounds, name, minNumberOfEntrants, scheduledStartDate, scheduledEndDate, status, constraints, products);
    Competition.initialize(this, id, spaceName, created, competitionType, numberOfRounds, name, minNumberOfEntrants, scheduledStartDate, scheduledEndDate, status, constraints, products);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj, id, spaceName, created, competitionType, numberOfRounds, name, minNumberOfEntrants, scheduledStartDate, scheduledEndDate, status, constraints, products) {
    obj['id'] = id;
    obj['spaceName'] = spaceName;
    obj['created'] = created;
    obj['competitionType'] = competitionType;
    obj['numberOfRounds'] = numberOfRounds;
    obj['name'] = name;
    obj['minNumberOfEntrants'] = minNumberOfEntrants;
    obj['scheduledStartDate'] = scheduledStartDate;
    obj['scheduledEndDate'] = scheduledEndDate;
    obj['status'] = status;
    obj['constraints'] = constraints;
    obj['products'] = products;
  }
  /**
   * Constructs a <code>Competition</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Competition} obj Optional instance to populate.
   * @return {module:model/Competition} The populated <code>Competition</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new Competition();
      ModelDefault.constructFromObject(data, obj);
      OptParamModels.constructFromObject(data, obj);
      CompetitionAllOf.constructFromObject(data, obj);

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }

      if (data.hasOwnProperty('spaceName')) {
        obj['spaceName'] = ApiClient.convertToType(data['spaceName'], 'String');
      }

      if (data.hasOwnProperty('created')) {
        obj['created'] = ApiClient.convertToType(data['created'], 'Date');
      }

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

      if (data.hasOwnProperty('competitionType')) {
        obj['competitionType'] = CompetitionType.constructFromObject(data['competitionType']);
      }

      if (data.hasOwnProperty('numberOfRounds')) {
        obj['numberOfRounds'] = ApiClient.convertToType(data['numberOfRounds'], 'Number');
      }

      if (data.hasOwnProperty('numberOfGroupStages')) {
        obj['numberOfGroupStages'] = ApiClient.convertToType(data['numberOfGroupStages'], 'Number');
      }

      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }

      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }

      if (data.hasOwnProperty('termsAndConditions')) {
        obj['termsAndConditions'] = ApiClient.convertToType(data['termsAndConditions'], 'String');
      }

      if (data.hasOwnProperty('maxNumberOfEntrants')) {
        obj['maxNumberOfEntrants'] = ApiClient.convertToType(data['maxNumberOfEntrants'], 'Number');
      }

      if (data.hasOwnProperty('minNumberOfEntrants')) {
        obj['minNumberOfEntrants'] = ApiClient.convertToType(data['minNumberOfEntrants'], 'Number');
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

      if (data.hasOwnProperty('status')) {
        obj['status'] = CompetitionStatus.constructFromObject(data['status']);
      }

      if (data.hasOwnProperty('statusCode')) {
        obj['statusCode'] = ApiClient.convertToType(data['statusCode'], 'Number');
      }

      if (data.hasOwnProperty('constraints')) {
        obj['constraints'] = ApiClient.convertToType(data['constraints'], ['String']);
      }

      if (data.hasOwnProperty('products')) {
        obj['products'] = ApiClient.convertToType(data['products'], [ProductReduced]);
      }

      if (data.hasOwnProperty('entrantMemberTagsFilter')) {
        obj['entrantMemberTagsFilter'] = DependantOn.constructFromObject(data['entrantMemberTagsFilter']);
      }

      if (data.hasOwnProperty('productTagsFilter')) {
        obj['productTagsFilter'] = DependantOn.constructFromObject(data['productTagsFilter']);
      }
    }

    return obj;
  }

}
/**
 * A unique system generated identifier
 * @member {String} id
 */


Competition.prototype['id'] = undefined;
/**
 * This is the space name which is linked to the account
 * @member {String} spaceName
 */

Competition.prototype['spaceName'] = undefined;
/**
 * ISO8601 timestamp for when a Model was created. All records are stored in UTC time zone
 * @member {Date} created
 */

Competition.prototype['created'] = undefined;
/**
 * @member {Object.<String, Object>} customFields
 */

Competition.prototype['customFields'] = undefined;
/**
 * A list of id's used to tag models
 * @member {Array.<String>} tags
 */

Competition.prototype['tags'] = undefined;
/**
 * @member {Object.<String, String>} metadata
 */

Competition.prototype['metadata'] = undefined;
/**
 * @member {module:model/CompetitionType} competitionType
 */

Competition.prototype['competitionType'] = undefined;
/**
 * Number of rounds to be played in a competition
 * @member {Number} numberOfRounds
 */

Competition.prototype['numberOfRounds'] = undefined;
/**
 * Number of group stages
 * @member {Number} numberOfGroupStages
 */

Competition.prototype['numberOfGroupStages'] = undefined;
/**
 * A name or a name of a competition. Can be translated
 * @member {String} name
 */

Competition.prototype['name'] = undefined;
/**
 * Description of the competition. Can be translated
 * @member {String} description
 */

Competition.prototype['description'] = undefined;
/**
 * Terms and conditions of a competition. Can be translated
 * @member {String} termsAndConditions
 */

Competition.prototype['termsAndConditions'] = undefined;
/**
 * Maximum number of partiipants allowed in a competition
 * @member {Number} maxNumberOfEntrants
 */

Competition.prototype['maxNumberOfEntrants'] = undefined;
/**
 * Maximum number of partiipants allowed in a competition
 * @member {Number} minNumberOfEntrants
 */

Competition.prototype['minNumberOfEntrants'] = undefined;
/**
 * @member {String} entrantMemberType
 */

Competition.prototype['entrantMemberType'] = undefined;
/**
 * ISO8601 timestamp for when a Competition should start. All records are stored in UTC time zone
 * @member {Date} scheduledStartDate
 */

Competition.prototype['scheduledStartDate'] = undefined;
/**
 * ISO8601 timestamp for when a Competition should end. All records are stored in UTC time zone
 * @member {Date} scheduledEndDate
 */

Competition.prototype['scheduledEndDate'] = undefined;
/**
 * ISO8601 timestamp for when a Competition started. All records are stored in UTC time zone
 * @member {Date} actualStartDate
 */

Competition.prototype['actualStartDate'] = undefined;
/**
 * ISO8601 timestamp for when a Competition ended. All records are stored in UTC time zone
 * @member {Date} actualEndDate
 */

Competition.prototype['actualEndDate'] = undefined;
/**
 * @member {module:model/CompetitionStatus} status
 */

Competition.prototype['status'] = undefined;
/**
 * The code of the competition
 * @member {Number} statusCode
 */

Competition.prototype['statusCode'] = undefined;
/**
 * Additional constraints
 * @member {Array.<String>} constraints
 */

Competition.prototype['constraints'] = undefined;
/**
 * 
 * @member {Array.<module:model/ProductReduced>} products
 */

Competition.prototype['products'] = undefined;
/**
 * @member {module:model/DependantOn} entrantMemberTagsFilter
 */

Competition.prototype['entrantMemberTagsFilter'] = undefined;
/**
 * @member {module:model/DependantOn} productTagsFilter
 */

Competition.prototype['productTagsFilter'] = undefined; // Implement ModelDefault interface:

/**
 * A unique system generated identifier
 * @member {String} id
 */

ModelDefault.prototype['id'] = undefined;
/**
 * This is the space name which is linked to the account
 * @member {String} spaceName
 */

ModelDefault.prototype['spaceName'] = undefined;
/**
 * ISO8601 timestamp for when a Model was created. All records are stored in UTC time zone
 * @member {Date} created
 */

ModelDefault.prototype['created'] = undefined; // Implement OptParamModels interface:

/**
 * @member {Object.<String, Object>} customFields
 */

OptParamModels.prototype['customFields'] = undefined;
/**
 * A list of id's used to tag models
 * @member {Array.<String>} tags
 */

OptParamModels.prototype['tags'] = undefined;
/**
 * @member {Object.<String, String>} metadata
 */

OptParamModels.prototype['metadata'] = undefined; // Implement CompetitionAllOf interface:

/**
 * @member {module:model/CompetitionType} competitionType
 */

CompetitionAllOf.prototype['competitionType'] = undefined;
/**
 * Number of rounds to be played in a competition
 * @member {Number} numberOfRounds
 */

CompetitionAllOf.prototype['numberOfRounds'] = undefined;
/**
 * Number of group stages
 * @member {Number} numberOfGroupStages
 */

CompetitionAllOf.prototype['numberOfGroupStages'] = undefined;
/**
 * A name or a name of a competition. Can be translated
 * @member {String} name
 */

CompetitionAllOf.prototype['name'] = undefined;
/**
 * Description of the competition. Can be translated
 * @member {String} description
 */

CompetitionAllOf.prototype['description'] = undefined;
/**
 * Terms and conditions of a competition. Can be translated
 * @member {String} termsAndConditions
 */

CompetitionAllOf.prototype['termsAndConditions'] = undefined;
/**
 * Maximum number of partiipants allowed in a competition
 * @member {Number} maxNumberOfEntrants
 */

CompetitionAllOf.prototype['maxNumberOfEntrants'] = undefined;
/**
 * Maximum number of partiipants allowed in a competition
 * @member {Number} minNumberOfEntrants
 */

CompetitionAllOf.prototype['minNumberOfEntrants'] = undefined;
/**
 * @member {String} entrantMemberType
 */

CompetitionAllOf.prototype['entrantMemberType'] = undefined;
/**
 * ISO8601 timestamp for when a Competition should start. All records are stored in UTC time zone
 * @member {Date} scheduledStartDate
 */

CompetitionAllOf.prototype['scheduledStartDate'] = undefined;
/**
 * ISO8601 timestamp for when a Competition should end. All records are stored in UTC time zone
 * @member {Date} scheduledEndDate
 */

CompetitionAllOf.prototype['scheduledEndDate'] = undefined;
/**
 * ISO8601 timestamp for when a Competition started. All records are stored in UTC time zone
 * @member {Date} actualStartDate
 */

CompetitionAllOf.prototype['actualStartDate'] = undefined;
/**
 * ISO8601 timestamp for when a Competition ended. All records are stored in UTC time zone
 * @member {Date} actualEndDate
 */

CompetitionAllOf.prototype['actualEndDate'] = undefined;
/**
 * @member {module:model/CompetitionStatus} status
 */

CompetitionAllOf.prototype['status'] = undefined;
/**
 * The code of the competition
 * @member {Number} statusCode
 */

CompetitionAllOf.prototype['statusCode'] = undefined;
/**
 * Additional constraints
 * @member {Array.<String>} constraints
 */

CompetitionAllOf.prototype['constraints'] = undefined;
/**
 * 
 * @member {Array.<module:model/ProductReduced>} products
 */

CompetitionAllOf.prototype['products'] = undefined;
/**
 * @member {module:model/DependantOn} entrantMemberTagsFilter
 */

CompetitionAllOf.prototype['entrantMemberTagsFilter'] = undefined;
/**
 * @member {module:model/DependantOn} productTagsFilter
 */

CompetitionAllOf.prototype['productTagsFilter'] = undefined;
export default Competition;