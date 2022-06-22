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
import KafkaConnection from './KafkaConnection';
import RabbitMqConnection from './RabbitMqConnection';
import SqsConnection from './SqsConnection';

/**
 * The Connection model module.
 * @module model/Connection
 * @version 0.0.26
 */
class Connection {
    /**
     * Constructs a new <code>Connection</code>.
     * @alias module:model/Connection
     * @implements module:model/KafkaConnection
     * @implements module:model/RabbitMqConnection
     * @implements module:model/SqsConnection
     * @param name {String} The type of the consumer
     * @param brokers {String} Kafka broker endpoints.
     * @param groupId {String} Group Id for connection
     * @param topic {String} Topic name
     * @param lastKnownStatus {String} Last known status of the connection
     * @param lastKnownStatusCode {Number} Status code correspoding to the last known status
     * @param transformerId {String} The transformer to use, if empty the default system transformer will be used
     * @param id {String} A unique system generated identifier
     * @param spaceName {String} This is the space name which is linked to the account
     * @param created {Date} ISO8601 timestamp for when a Model was created. All records are stored in UTC time zone
     * @param uri {String} The SQS endpoint.
     * @param virtualHost {String} The virtual host of the rabbitmq broker
     * @param port {Number} The port number on which consumer will connect on rabbitmq broker
     * @param userName {String} Consumer username for authentication
     * @param password {String} Consumer password for authentication
     * @param queueName {String} Name of the queue
     * @param constraints {Array.<String>} Additional constraints
     * @param acessKey {String} The access key of the IAM user
     */
    constructor(name, brokers, groupId, topic, lastKnownStatus, lastKnownStatusCode, transformerId, id, spaceName, created, uri, virtualHost, port, userName, password, queueName, constraints, acessKey) { 
        KafkaConnection.initialize(this, name, brokers, groupId, topic, lastKnownStatus, lastKnownStatusCode, transformerId, id, spaceName, created);RabbitMqConnection.initialize(this, id, spaceName, created, name, uri, virtualHost, port, userName, password, queueName, lastKnownStatus, lastKnownStatusCode, constraints, transformerId);SqsConnection.initialize(this, id, spaceName, created, name, uri, acessKey, lastKnownStatus, lastKnownStatusCode, transformerId);
        Connection.initialize(this, name, brokers, groupId, topic, lastKnownStatus, lastKnownStatusCode, transformerId, id, spaceName, created, uri, virtualHost, port, userName, password, queueName, constraints, acessKey);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, name, brokers, groupId, topic, lastKnownStatus, lastKnownStatusCode, transformerId, id, spaceName, created, uri, virtualHost, port, userName, password, queueName, constraints, acessKey) { 
        obj['name'] = name;
        obj['brokers'] = brokers;
        obj['groupId'] = groupId;
        obj['topic'] = topic;
        obj['lastKnownStatus'] = lastKnownStatus;
        obj['lastKnownStatusCode'] = lastKnownStatusCode;
        obj['uri'] = uri;
        obj['virtualHost'] = virtualHost;
        obj['port'] = port;
        obj['userName'] = userName;
        obj['password'] = password;
        obj['queueName'] = queueName;
        obj['constraints'] = constraints;
        obj['acessKey'] = acessKey;
    }

    /**
     * Constructs a <code>Connection</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Connection} obj Optional instance to populate.
     * @return {module:model/Connection} The populated <code>Connection</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Connection();
            KafkaConnection.constructFromObject(data, obj);
            RabbitMqConnection.constructFromObject(data, obj);
            SqsConnection.constructFromObject(data, obj);

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('spaceName')) {
                obj['spaceName'] = ApiClient.convertToType(data['spaceName'], 'String');
            }
            if (data.hasOwnProperty('created')) {
                obj['created'] = ApiClient.convertToType(data['created'], 'Date');
            }
            if (data.hasOwnProperty('transformerId')) {
                obj['transformerId'] = ApiClient.convertToType(data['transformerId'], 'String');
            }
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
            if (data.hasOwnProperty('connectionType')) {
                obj['connectionType'] = ApiClient.convertToType(data['connectionType'], 'String');
            }
            if (data.hasOwnProperty('uri')) {
                obj['uri'] = ApiClient.convertToType(data['uri'], 'String');
            }
            if (data.hasOwnProperty('virtualHost')) {
                obj['virtualHost'] = ApiClient.convertToType(data['virtualHost'], 'String');
            }
            if (data.hasOwnProperty('port')) {
                obj['port'] = ApiClient.convertToType(data['port'], 'Number');
            }
            if (data.hasOwnProperty('userName')) {
                obj['userName'] = ApiClient.convertToType(data['userName'], 'String');
            }
            if (data.hasOwnProperty('password')) {
                obj['password'] = ApiClient.convertToType(data['password'], 'String');
            }
            if (data.hasOwnProperty('queueName')) {
                obj['queueName'] = ApiClient.convertToType(data['queueName'], 'String');
            }
            if (data.hasOwnProperty('exchange')) {
                obj['exchange'] = ApiClient.convertToType(data['exchange'], 'String');
            }
            if (data.hasOwnProperty('routingKey')) {
                obj['routingKey'] = ApiClient.convertToType(data['routingKey'], 'String');
            }
            if (data.hasOwnProperty('constraints')) {
                obj['constraints'] = ApiClient.convertToType(data['constraints'], ['String']);
            }
            if (data.hasOwnProperty('acessKey')) {
                obj['acessKey'] = ApiClient.convertToType(data['acessKey'], 'String');
            }
        }
        return obj;
    }


}

/**
 * A unique system generated identifier
 * @member {String} id
 */
Connection.prototype['id'] = undefined;

/**
 * This is the space name which is linked to the account
 * @member {String} spaceName
 */
Connection.prototype['spaceName'] = undefined;

/**
 * ISO8601 timestamp for when a Model was created. All records are stored in UTC time zone  
 * @member {Date} created
 */
Connection.prototype['created'] = undefined;

/**
 * 
 * @member {String} transformerId
 */
Connection.prototype['transformerId'] = undefined;

/**
 * @member {Object.<String, Object>} customFields
 */
Connection.prototype['customFields'] = undefined;

/**
 * A list of id's used to tag models
 * @member {Array.<String>} tags
 */
Connection.prototype['tags'] = undefined;

/**
 * @member {Object.<String, String>} metadata
 */
Connection.prototype['metadata'] = undefined;

/**
 * The type of the consumer
 * @member {String} name
 */
Connection.prototype['name'] = undefined;

/**
 * The description of the consumer
 * @member {String} description
 */
Connection.prototype['description'] = undefined;

/**
 * Kafka broker endpoints.
 * @member {String} brokers
 */
Connection.prototype['brokers'] = undefined;

/**
 * Group Id for connection
 * @member {String} groupId
 */
Connection.prototype['groupId'] = undefined;

/**
 * Topic name
 * @member {String} topic
 */
Connection.prototype['topic'] = undefined;

/**
 * Last known status of the connection
 * @member {String} lastKnownStatus
 */
Connection.prototype['lastKnownStatus'] = undefined;

/**
 * Status code correspoding to the last known status
 * @member {Number} lastKnownStatusCode
 */
Connection.prototype['lastKnownStatusCode'] = undefined;

/**
 * The type of connection
 * @member {String} connectionType
 */
Connection.prototype['connectionType'] = undefined;

/**
 * The SQS endpoint.
 * @member {String} uri
 */
Connection.prototype['uri'] = undefined;

/**
 * The virtual host of the rabbitmq broker
 * @member {String} virtualHost
 */
Connection.prototype['virtualHost'] = undefined;

/**
 * The port number on which consumer will connect on rabbitmq broker
 * @member {Number} port
 */
Connection.prototype['port'] = undefined;

/**
 * Consumer username for authentication
 * @member {String} userName
 */
Connection.prototype['userName'] = undefined;

/**
 * Consumer password for authentication
 * @member {String} password
 */
Connection.prototype['password'] = undefined;

/**
 * Name of the queue
 * @member {String} queueName
 */
Connection.prototype['queueName'] = undefined;

/**
 * Exchange to connect to
 * @member {String} exchange
 */
Connection.prototype['exchange'] = undefined;

/**
 * Routing key to use
 * @member {String} routingKey
 */
Connection.prototype['routingKey'] = undefined;

/**
 * Additional constraints
 * @member {Array.<String>} constraints
 */
Connection.prototype['constraints'] = undefined;

/**
 * The access key of the IAM user
 * @member {String} acessKey
 */
Connection.prototype['acessKey'] = undefined;


// Implement KafkaConnection interface:
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
KafkaConnection.prototype['created'] = undefined;
// Implement RabbitMqConnection interface:
/**
 * A unique system generated identifier
 * @member {String} id
 */
RabbitMqConnection.prototype['id'] = undefined;
/**
 * This is the space name which is linked to the account
 * @member {String} spaceName
 */
RabbitMqConnection.prototype['spaceName'] = undefined;
/**
 * ISO8601 timestamp for when a Model was created. All records are stored in UTC time zone
 * @member {Date} created
 */
RabbitMqConnection.prototype['created'] = undefined;
/**
 * @member {Object.<String, Object>} customFields
 */
RabbitMqConnection.prototype['customFields'] = undefined;
/**
 * A list of id's used to tag models
 * @member {Array.<String>} tags
 */
RabbitMqConnection.prototype['tags'] = undefined;
/**
 * @member {Object.<String, String>} metadata
 */
RabbitMqConnection.prototype['metadata'] = undefined;
/**
 * The name of the consumer
 * @member {String} name
 */
RabbitMqConnection.prototype['name'] = undefined;
/**
 * The description of the consumer
 * @member {String} description
 */
RabbitMqConnection.prototype['description'] = undefined;
/**
 * The SQS endpoint.
 * @member {String} uri
 */
RabbitMqConnection.prototype['uri'] = undefined;
/**
 * The virtual host of the rabbitmq broker
 * @member {String} virtualHost
 */
RabbitMqConnection.prototype['virtualHost'] = undefined;
/**
 * The port number on which consumer will connect on rabbitmq broker
 * @member {Number} port
 */
RabbitMqConnection.prototype['port'] = undefined;
/**
 * Consumer username for authentication
 * @member {String} userName
 */
RabbitMqConnection.prototype['userName'] = undefined;
/**
 * Consumer password for authentication
 * @member {String} password
 */
RabbitMqConnection.prototype['password'] = undefined;
/**
 * Name of the queue
 * @member {String} queueName
 */
RabbitMqConnection.prototype['queueName'] = undefined;
/**
 * Exchange to connect to
 * @member {String} exchange
 */
RabbitMqConnection.prototype['exchange'] = undefined;
/**
 * Routing key to use
 * @member {String} routingKey
 */
RabbitMqConnection.prototype['routingKey'] = undefined;
/**
 * Last known status of the connection
 * @member {String} lastKnownStatus
 */
RabbitMqConnection.prototype['lastKnownStatus'] = undefined;
/**
 * Status code correspoding to the last known status
 * @member {Number} lastKnownStatusCode
 */
RabbitMqConnection.prototype['lastKnownStatusCode'] = undefined;
/**
 * Additional constraints
 * @member {Array.<String>} constraints
 */
RabbitMqConnection.prototype['constraints'] = undefined;
/**
 * The transformer to use, if empty the default system transformer will be used
 * @member {String} transformerId
 */
RabbitMqConnection.prototype['transformerId'] = undefined;
/**
 * The type of connection
 * @member {String} connectionType
 */
RabbitMqConnection.prototype['connectionType'] = undefined;
// Implement SqsConnection interface:
/**
 * A unique system generated identifier
 * @member {String} id
 */
SqsConnection.prototype['id'] = undefined;
/**
 * This is the space name which is linked to the account
 * @member {String} spaceName
 */
SqsConnection.prototype['spaceName'] = undefined;
/**
 * ISO8601 timestamp for when a Model was created. All records are stored in UTC time zone
 * @member {Date} created
 */
SqsConnection.prototype['created'] = undefined;
/**
 * @member {Object.<String, Object>} customFields
 */
SqsConnection.prototype['customFields'] = undefined;
/**
 * A list of id's used to tag models
 * @member {Array.<String>} tags
 */
SqsConnection.prototype['tags'] = undefined;
/**
 * @member {Object.<String, String>} metadata
 */
SqsConnection.prototype['metadata'] = undefined;
/**
 * The type of the consumer
 * @member {String} name
 */
SqsConnection.prototype['name'] = undefined;
/**
 * The description of the consumer
 * @member {String} description
 */
SqsConnection.prototype['description'] = undefined;
/**
 * The SQS endpoint.
 * @member {String} uri
 */
SqsConnection.prototype['uri'] = undefined;
/**
 * The access key of the IAM user
 * @member {String} acessKey
 */
SqsConnection.prototype['acessKey'] = undefined;
/**
 * Last known status of the connection
 * @member {String} lastKnownStatus
 */
SqsConnection.prototype['lastKnownStatus'] = undefined;
/**
 * Status code correspoding to the last known status
 * @member {Number} lastKnownStatusCode
 */
SqsConnection.prototype['lastKnownStatusCode'] = undefined;
/**
 * The transformer to use, if empty the default system transformer will be used
 * @member {String} transformerId
 */
SqsConnection.prototype['transformerId'] = undefined;
/**
 * The type of connection
 * @member {String} connectionType
 */
SqsConnection.prototype['connectionType'] = undefined;




export default Connection;

