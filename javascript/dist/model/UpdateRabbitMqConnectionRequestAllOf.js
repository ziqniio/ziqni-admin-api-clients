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
/**
 * The UpdateRabbitMqConnectionRequestAllOf model module.
 * @module model/UpdateRabbitMqConnectionRequestAllOf
 * @version 0.0.26
 */

class UpdateRabbitMqConnectionRequestAllOf {
  /**
   * Constructs a new <code>UpdateRabbitMqConnectionRequestAllOf</code>.
   * @alias module:model/UpdateRabbitMqConnectionRequestAllOf
   */
  constructor() {
    UpdateRabbitMqConnectionRequestAllOf.initialize(this);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj) {}
  /**
   * Constructs a <code>UpdateRabbitMqConnectionRequestAllOf</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/UpdateRabbitMqConnectionRequestAllOf} obj Optional instance to populate.
   * @return {module:model/UpdateRabbitMqConnectionRequestAllOf} The populated <code>UpdateRabbitMqConnectionRequestAllOf</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new UpdateRabbitMqConnectionRequestAllOf();

      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }

      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
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

      if (data.hasOwnProperty('transformerId')) {
        obj['transformerId'] = ApiClient.convertToType(data['transformerId'], 'String');
      }
    }

    return obj;
  }

}
/**
 * The name of the consumer
 * @member {String} name
 */


UpdateRabbitMqConnectionRequestAllOf.prototype['name'] = undefined;
/**
 * The description of the consumer
 * @member {String} description
 */

UpdateRabbitMqConnectionRequestAllOf.prototype['description'] = undefined;
/**
 * The SQS endpoint.
 * @member {String} uri
 */

UpdateRabbitMqConnectionRequestAllOf.prototype['uri'] = undefined;
/**
 * The virtual host of the rabbitmq broker
 * @member {String} virtualHost
 */

UpdateRabbitMqConnectionRequestAllOf.prototype['virtualHost'] = undefined;
/**
 * The port number on which consumer will connect on rabbitmq broker
 * @member {Number} port
 */

UpdateRabbitMqConnectionRequestAllOf.prototype['port'] = undefined;
/**
 * Consumer username for authentication
 * @member {String} userName
 */

UpdateRabbitMqConnectionRequestAllOf.prototype['userName'] = undefined;
/**
 * Consumer password for authentication
 * @member {String} password
 */

UpdateRabbitMqConnectionRequestAllOf.prototype['password'] = undefined;
/**
 * Name of the queue
 * @member {String} queueName
 */

UpdateRabbitMqConnectionRequestAllOf.prototype['queueName'] = undefined;
/**
 * Exchange to connect to
 * @member {String} exchange
 */

UpdateRabbitMqConnectionRequestAllOf.prototype['exchange'] = undefined;
/**
 * Routing key to use
 * @member {String} routingKey
 */

UpdateRabbitMqConnectionRequestAllOf.prototype['routingKey'] = undefined;
/**
 * Additional constraints
 * @member {Array.<String>} constraints
 */

UpdateRabbitMqConnectionRequestAllOf.prototype['constraints'] = undefined;
/**
 * The transformer to use, if empty the default system transformer will be used
 * @member {String} transformerId
 */

UpdateRabbitMqConnectionRequestAllOf.prototype['transformerId'] = undefined;
export default UpdateRabbitMqConnectionRequestAllOf;