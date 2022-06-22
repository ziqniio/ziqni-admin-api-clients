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
import CreateRabbitMqConnectionRequestAllOf from './CreateRabbitMqConnectionRequestAllOf';

/**
 * The CreateRabbitMqConnectionRequest model module.
 * @module model/CreateRabbitMqConnectionRequest
 * @version 0.0.26
 */
class CreateRabbitMqConnectionRequest {
    /**
     * Constructs a new <code>CreateRabbitMqConnectionRequest</code>.
     * @alias module:model/CreateRabbitMqConnectionRequest
     * @implements module:model/CreateOptParamModels
     * @implements module:model/CreateRabbitMqConnectionRequestAllOf
     * @param port {Number} The port number on which consumer will connect on rabbitmq broker
     * @param uri {String} Broker endpoint
     * @param userName {String} Consumer username for authentication
     * @param password {String} Consumer password for authentication
     * @param queueName {String} Name of the queue
     * @param transformerId {String} 
     */
    constructor(port, uri, userName, password, queueName, transformerId) { 
        CreateOptParamModels.initialize(this);CreateRabbitMqConnectionRequestAllOf.initialize(this, port, uri, userName, password, queueName, transformerId);
        CreateRabbitMqConnectionRequest.initialize(this, port, uri, userName, password, queueName, transformerId);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, port, uri, userName, password, queueName, transformerId) { 
        obj['port'] = port;
        obj['uri'] = uri;
        obj['userName'] = userName;
        obj['password'] = password;
        obj['queueName'] = queueName;
        obj['transformerId'] = transformerId;
    }

    /**
     * Constructs a <code>CreateRabbitMqConnectionRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateRabbitMqConnectionRequest} obj Optional instance to populate.
     * @return {module:model/CreateRabbitMqConnectionRequest} The populated <code>CreateRabbitMqConnectionRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateRabbitMqConnectionRequest();
            CreateOptParamModels.constructFromObject(data, obj);
            CreateRabbitMqConnectionRequestAllOf.constructFromObject(data, obj);

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
            if (data.hasOwnProperty('port')) {
                obj['port'] = ApiClient.convertToType(data['port'], 'Number');
            }
            if (data.hasOwnProperty('virtualHost')) {
                obj['virtualHost'] = ApiClient.convertToType(data['virtualHost'], 'String');
            }
            if (data.hasOwnProperty('uri')) {
                obj['uri'] = ApiClient.convertToType(data['uri'], 'String');
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
            if (data.hasOwnProperty('addConstraints')) {
                obj['addConstraints'] = ApiClient.convertToType(data['addConstraints'], ['String']);
            }
            if (data.hasOwnProperty('transformerId')) {
                obj['transformerId'] = ApiClient.convertToType(data['transformerId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * A list of custom field entries
 * @member {Object.<String, Object>} customFields
 */
CreateRabbitMqConnectionRequest.prototype['customFields'] = undefined;

/**
 * A list of id's used to tag models
 * @member {Array.<String>} tags
 */
CreateRabbitMqConnectionRequest.prototype['tags'] = undefined;

/**
 * @member {Object.<String, String>} metadata
 */
CreateRabbitMqConnectionRequest.prototype['metadata'] = undefined;

/**
 * The name of the consumer
 * @member {String} name
 */
CreateRabbitMqConnectionRequest.prototype['name'] = undefined;

/**
 * The description of the consumer
 * @member {String} description
 */
CreateRabbitMqConnectionRequest.prototype['description'] = undefined;

/**
 * The port number on which consumer will connect on rabbitmq broker
 * @member {Number} port
 */
CreateRabbitMqConnectionRequest.prototype['port'] = undefined;

/**
 * The virtual host of the rabbitmq broker
 * @member {String} virtualHost
 */
CreateRabbitMqConnectionRequest.prototype['virtualHost'] = undefined;

/**
 * Broker endpoint
 * @member {String} uri
 */
CreateRabbitMqConnectionRequest.prototype['uri'] = undefined;

/**
 * Consumer username for authentication
 * @member {String} userName
 */
CreateRabbitMqConnectionRequest.prototype['userName'] = undefined;

/**
 * Consumer password for authentication
 * @member {String} password
 */
CreateRabbitMqConnectionRequest.prototype['password'] = undefined;

/**
 * Name of the queue
 * @member {String} queueName
 */
CreateRabbitMqConnectionRequest.prototype['queueName'] = undefined;

/**
 * Exchange to bind to
 * @member {String} exchange
 */
CreateRabbitMqConnectionRequest.prototype['exchange'] = undefined;

/**
 * Routing key to use
 * @member {String} routingKey
 */
CreateRabbitMqConnectionRequest.prototype['routingKey'] = undefined;

/**
 * Additional constraints.  Supported values:  - ssl  - durable  - exclusive  - autoDelete
 * @member {Array.<String>} addConstraints
 */
CreateRabbitMqConnectionRequest.prototype['addConstraints'] = undefined;

/**
 * 
 * @member {String} transformerId
 */
CreateRabbitMqConnectionRequest.prototype['transformerId'] = undefined;


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
// Implement CreateRabbitMqConnectionRequestAllOf interface:
/**
 * The name of the consumer
 * @member {String} name
 */
CreateRabbitMqConnectionRequestAllOf.prototype['name'] = undefined;
/**
 * The description of the consumer
 * @member {String} description
 */
CreateRabbitMqConnectionRequestAllOf.prototype['description'] = undefined;
/**
 * The port number on which consumer will connect on rabbitmq broker
 * @member {Number} port
 */
CreateRabbitMqConnectionRequestAllOf.prototype['port'] = undefined;
/**
 * The virtual host of the rabbitmq broker
 * @member {String} virtualHost
 */
CreateRabbitMqConnectionRequestAllOf.prototype['virtualHost'] = undefined;
/**
 * Broker endpoint
 * @member {String} uri
 */
CreateRabbitMqConnectionRequestAllOf.prototype['uri'] = undefined;
/**
 * Consumer username for authentication
 * @member {String} userName
 */
CreateRabbitMqConnectionRequestAllOf.prototype['userName'] = undefined;
/**
 * Consumer password for authentication
 * @member {String} password
 */
CreateRabbitMqConnectionRequestAllOf.prototype['password'] = undefined;
/**
 * Name of the queue
 * @member {String} queueName
 */
CreateRabbitMqConnectionRequestAllOf.prototype['queueName'] = undefined;
/**
 * Exchange to bind to
 * @member {String} exchange
 */
CreateRabbitMqConnectionRequestAllOf.prototype['exchange'] = undefined;
/**
 * Routing key to use
 * @member {String} routingKey
 */
CreateRabbitMqConnectionRequestAllOf.prototype['routingKey'] = undefined;
/**
 * Additional constraints.  Supported values:  - ssl  - durable  - exclusive  - autoDelete
 * @member {Array.<String>} addConstraints
 */
CreateRabbitMqConnectionRequestAllOf.prototype['addConstraints'] = undefined;
/**
 * 
 * @member {String} transformerId
 */
CreateRabbitMqConnectionRequestAllOf.prototype['transformerId'] = undefined;




export default CreateRabbitMqConnectionRequest;

