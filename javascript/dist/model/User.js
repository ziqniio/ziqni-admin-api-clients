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
import UserAllOf from './UserAllOf';
import UserModelDefault from './UserModelDefault';
/**
 * The User model module.
 * @module model/User
 * @version 0.0.26
 */

class User {
  /**
   * Constructs a new <code>User</code>.
   * @alias module:model/User
   * @implements module:model/UserModelDefault
   * @implements module:model/UserAllOf
   * @param objectType {String} 
   * @param email {String} The email of the user to log in
   * @param constraints {Array.<String>} Additional constraints
   */
  constructor(objectType, email, constraints) {
    UserModelDefault.initialize(this, objectType);
    UserAllOf.initialize(this, email, constraints);
    User.initialize(this, objectType, email, constraints);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj, objectType, email, constraints) {
    obj['objectType'] = objectType;
    obj['email'] = email;
    obj['constraints'] = constraints;
  }
  /**
   * Constructs a <code>User</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/User} obj Optional instance to populate.
   * @return {module:model/User} The populated <code>User</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new User();
      UserModelDefault.constructFromObject(data, obj);
      UserAllOf.constructFromObject(data, obj);

      if (data.hasOwnProperty('objectType')) {
        obj['objectType'] = ApiClient.convertToType(data['objectType'], 'String');
      }

      if (data.hasOwnProperty('firstName')) {
        obj['firstName'] = ApiClient.convertToType(data['firstName'], 'String');
      }

      if (data.hasOwnProperty('lastName')) {
        obj['lastName'] = ApiClient.convertToType(data['lastName'], 'String');
      }

      if (data.hasOwnProperty('email')) {
        obj['email'] = ApiClient.convertToType(data['email'], 'String');
      }

      if (data.hasOwnProperty('constraints')) {
        obj['constraints'] = ApiClient.convertToType(data['constraints'], ['String']);
      }

      if (data.hasOwnProperty('spaces')) {
        obj['spaces'] = ApiClient.convertToType(data['spaces'], ['String']);
      }
    }

    return obj;
  }

}
/**
 * @member {String} objectType
 */


User.prototype['objectType'] = undefined;
/**
 * The Name of an individual
 * @member {String} firstName
 */

User.prototype['firstName'] = undefined;
/**
 * The Surname of an individual
 * @member {String} lastName
 */

User.prototype['lastName'] = undefined;
/**
 * The email of the user to log in
 * @member {String} email
 */

User.prototype['email'] = undefined;
/**
 * Additional constraints
 * @member {Array.<String>} constraints
 */

User.prototype['constraints'] = undefined;
/**
 * 
 * @member {Array.<String>} spaces
 */

User.prototype['spaces'] = undefined; // Implement UserModelDefault interface:

/**
 * @member {String} objectType
 */

UserModelDefault.prototype['objectType'] = undefined; // Implement UserAllOf interface:

/**
 * The Name of an individual
 * @member {String} firstName
 */

UserAllOf.prototype['firstName'] = undefined;
/**
 * The Surname of an individual
 * @member {String} lastName
 */

UserAllOf.prototype['lastName'] = undefined;
/**
 * The email of the user to log in
 * @member {String} email
 */

UserAllOf.prototype['email'] = undefined;
/**
 * Additional constraints
 * @member {Array.<String>} constraints
 */

UserAllOf.prototype['constraints'] = undefined;
/**
 * 
 * @member {Array.<String>} spaces
 */

UserAllOf.prototype['spaces'] = undefined;
export default User;