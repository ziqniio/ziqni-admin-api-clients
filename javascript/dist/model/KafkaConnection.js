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
import KafkaConnectionAllOf from './KafkaConnectionAllOf';
import ModelDefault from './ModelDefault';
import OptParamModels from './OptParamModels';
/**
 * The KafkaConnection model module.
 * @module model/KafkaConnection
 * @version 0.0.26
 */

class KafkaConnection {
  /**
   * Constructs a new <code>KafkaConnection</code>.
   * @alias module:model/KafkaConnection
   * @implements module:model/OptParamModels
   * @implements module:model/KafkaConnectionAllOf
   * @implements module:model/ModelDefault
   * @param name {String} The name of the consumer
   * @param brokers {String} Kafka broker endpoints.
   * @param groupId {String} Group Id for connection
   * @param topic {String} Topic name
   * @param lastKnownStatus {String} Last known status of the connection
   * @param lastKnownStatusCode {Number} Status code correspoding to the last known status
   * @param transformerId {String} The transformer to use, if empty the default system transformer will be used
   * @param id {String} A unique system generated identifier
   * @param spaceName {String} This is the space name which is linked to the account
   * @param created {Date} ISO8601 timestamp for when a Model was created. All records are stored in UTC time zone
   */
  constructor(name, brokers, groupId, topic, lastKnownStatus, lastKnownStatusCode, transformerId, id, spaceName, created) {
    OptParamModels.initialize(this);
    KafkaConnectionAllOf.initialize(this, name, brokers, groupId, topic, lastKnownStatus, lastKnownStatusCode, transformerId);
    ModelDefault.initialize(this, id, spaceName, created);
    KafkaConnection.initialize(this, name, brokers, groupId, topic, lastKnownStatus, lastKnownStatusCode, transformerId, id, spaceName, created);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj, name, brokers, groupId, topic, lastKnownStatus, lastKnownStatusCode, transformerId, id, spaceName, created) {
    obj['name'] = name;
    obj['brokers'] = brokers;
    obj['groupId'] = groupId;
    obj['topic'] = topic;
    obj['lastKnownStatus'] = lastKnownStatus;
    obj['lastKnownStatusCode'] = lastKnownStatusCode;
    obj['transformerId'] = transformerId;
    obj['id'] = id;
    obj['spaceName'] = spaceName;
    obj['created'] = created;
  }
  /**
   * Constructs a <code>KafkaConnection</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/KafkaConnection} obj Optional instance to populate.
   * @return {module:model/KafkaConnection} The populated <code>KafkaConnection</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new KafkaConnection();
      OptParamModels.constructFromObject(data, obj);
      KafkaConnectionAllOf.constructFromObject(data, obj);
      ModelDefault.constructFromObject(data, obj);

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

      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }

      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }

      if (data.hasOwnProperty('brokers')) {
        obj['brokers'] = ApiClient.convertToType(data['brokers'], 'String');
      }

      if (data.hasOwnProperty('groupId')) {
        obj['groupId'] = ApiClient.convertToType(data['groupId'], 'String');
      }

      if (data.hasOwnProperty('topic')) {
        obj['topic'] = ApiClient.convertToType(data['topic'], 'String');
      }

      if (data.hasOwnProperty('lastKnownStatus')) {
        obj['lastKnownStatus'] = ApiClient.convertToType(data['lastKnownStatus'], 'String');
      }

      if (data.hasOwnProperty('lastKnownStatusCode')) {
        obj['lastKnownStatusCode'] = ApiClient.convertToType(data['lastKnownStatusCode'], 'Number');
      }

      if (data.hasOwnProperty('transformerId')) {
        obj['transformerId'] = ApiClient.convertToType(data['transformerId'], 'String');
      }

      if (data.hasOwnProperty('connectionType')) {
        obj['connectionType'] = ApiClient.convertToType(data['connectionType'], 'String');
      }

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }

      if (data.hasOwnProperty('spaceName')) {
        obj['spaceName'] = ApiClient.convertToType(data['spaceName'], 'String');
      }

      if (data.hasOwnProperty('created')) {
        obj['created'] = ApiClient.convertToType(data['created'], 'Date');
      }
    }

    return obj;
  }

}
/**
 * @member {Object.<String, Object>} customFields
 */


KafkaConnection.prototype['customFields'] = undefined;
/**
 * A list of id's used to tag models
 * @member {Array.<String>} tags
 */

KafkaConnection.prototype['tags'] = undefined;
/**
 * @member {Object.<String, String>} metadata
 */

KafkaConnection.prototype['metadata'] = undefined;
/**
 * The name of the consumer
 * @member {String} name
 */

KafkaConnection.prototype['name'] = undefined;
/**
 * The description of the consumer
 * @member {String} description
 */

KafkaConnection.prototype['description'] = undefined;
/**
 * Kafka broker endpoints.
 * @member {String} brokers
 */

KafkaConnection.prototype['brokers'] = undefined;
/**
 * Group Id for connection
 * @member {String} groupId
 */

KafkaConnection.prototype['groupId'] = undefined;
/**
 * Topic name
 * @member {String} topic
 */

KafkaConnection.prototype['topic'] = undefined;
/**
 * Last known status of the connection
 * @member {String} lastKnownStatus
 */

KafkaConnection.prototype['lastKnownStatus'] = undefined;
/**
 * Status code correspoding to the last known status
 * @member {Number} lastKnownStatusCode
 */

KafkaConnection.prototype['lastKnownStatusCode'] = undefined;
/**
 * The transformer to use, if empty the default system transformer will be used
 * @member {String} transformerId
 */

KafkaConnection.prototype['transformerId'] = undefined;
/**
 * The type of connection
 * @member {String} connectionType
 */

KafkaConnection.prototype['connectionType'] = undefined;
/**
 * A unique system generated identifier
 * @member {String} id
 */

KafkaConnection.prototype['id'] = undefined;
/**
 * This is the space name which is linked to the account
 * @member {String} spaceName
 */

KafkaConnection.prototype['spaceName'] = undefined;
/**
 * ISO8601 timestamp for when a Model was created. All records are stored in UTC time zone
 * @member {Date} created
 */

KafkaConnection.prototype['created'] = undefined; // Implement OptParamModels interface:

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

OptParamModels.prototype['metadata'] = undefined; // Implement KafkaConnectionAllOf interface:

/**
 * The name of the consumer
 * @member {String} name
 */

KafkaConnectionAllOf.prototype['name'] = undefined;
/**
 * The description of the consumer
 * @member {String} description
 */

KafkaConnectionAllOf.prototype['description'] = undefined;
/**
 * Kafka broker endpoints.
 * @member {String} brokers
 */

KafkaConnectionAllOf.prototype['brokers'] = undefined;
/**
 * Group Id for connection
 * @member {String} groupId
 */

KafkaConnectionAllOf.prototype['groupId'] = undefined;
/**
 * Topic name
 * @member {String} topic
 */

KafkaConnectionAllOf.prototype['topic'] = undefined;
/**
 * Last known status of the connection
 * @member {String} lastKnownStatus
 */

KafkaConnectionAllOf.prototype['lastKnownStatus'] = undefined;
/**
 * Status code correspoding to the last known status
 * @member {Number} lastKnownStatusCode
 */

KafkaConnectionAllOf.prototype['lastKnownStatusCode'] = undefined;
/**
 * The transformer to use, if empty the default system transformer will be used
 * @member {String} transformerId
 */

KafkaConnectionAllOf.prototype['transformerId'] = undefined;
/**
 * The type of connection
 * @member {String} connectionType
 */

KafkaConnectionAllOf.prototype['connectionType'] = undefined; // Implement ModelDefault interface:

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

ModelDefault.prototype['created'] = undefined;
export default KafkaConnection;