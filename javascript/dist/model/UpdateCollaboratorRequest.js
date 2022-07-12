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
import UpdateCollaboratorRequestAllOf from './UpdateCollaboratorRequestAllOf';
/**
 * The UpdateCollaboratorRequest model module.
 * @module model/UpdateCollaboratorRequest
 * @version 0.0.26
 */

class UpdateCollaboratorRequest {
  /**
   * Constructs a new <code>UpdateCollaboratorRequest</code>.
   * @alias module:model/UpdateCollaboratorRequest
   * @implements module:model/UpdateCollaboratorRequestAllOf
   * @param email {String} 
   */
  constructor(email) {
    UpdateCollaboratorRequestAllOf.initialize(this, email);
    UpdateCollaboratorRequest.initialize(this, email);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj, email) {
    obj['email'] = email;
  }
  /**
   * Constructs a <code>UpdateCollaboratorRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/UpdateCollaboratorRequest} obj Optional instance to populate.
   * @return {module:model/UpdateCollaboratorRequest} The populated <code>UpdateCollaboratorRequest</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new UpdateCollaboratorRequest();
      UpdateCollaboratorRequestAllOf.constructFromObject(data, obj);

      if (data.hasOwnProperty('email')) {
        obj['email'] = ApiClient.convertToType(data['email'], 'String');
      }

      if (data.hasOwnProperty('addRoles')) {
        obj['addRoles'] = ApiClient.convertToType(data['addRoles'], ['String']);
      }

      if (data.hasOwnProperty('removeRoles')) {
        obj['removeRoles'] = ApiClient.convertToType(data['removeRoles'], ['String']);
      }
    }

    return obj;
  }

}
/**
 * 
 * @member {String} email
 */


UpdateCollaboratorRequest.prototype['email'] = undefined;
/**
 * 
 * @member {Array.<String>} addRoles
 */

UpdateCollaboratorRequest.prototype['addRoles'] = undefined;
/**
 * 
 * @member {Array.<String>} removeRoles
 */

UpdateCollaboratorRequest.prototype['removeRoles'] = undefined; // Implement UpdateCollaboratorRequestAllOf interface:

/**
 * 
 * @member {String} email
 */

UpdateCollaboratorRequestAllOf.prototype['email'] = undefined;
/**
 * 
 * @member {Array.<String>} addRoles
 */

UpdateCollaboratorRequestAllOf.prototype['addRoles'] = undefined;
/**
 * 
 * @member {Array.<String>} removeRoles
 */

UpdateCollaboratorRequestAllOf.prototype['removeRoles'] = undefined;
export default UpdateCollaboratorRequest;