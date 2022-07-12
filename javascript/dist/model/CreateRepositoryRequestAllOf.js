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
import HostingOptions from './HostingOptions';
/**
 * The CreateRepositoryRequestAllOf model module.
 * @module model/CreateRepositoryRequestAllOf
 * @version 0.0.26
 */

class CreateRepositoryRequestAllOf {
  /**
   * Constructs a new <code>CreateRepositoryRequestAllOf</code>.
   * @alias module:model/CreateRepositoryRequestAllOf
   * @param name {String} The name of the repository. No special charaters or spaces permitted
   * @param constraints {Array.<String>} Additional constraints
   */
  constructor(name, constraints) {
    CreateRepositoryRequestAllOf.initialize(this, name, constraints);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj, name, constraints) {
    obj['name'] = name;
    obj['constraints'] = constraints;
  }
  /**
   * Constructs a <code>CreateRepositoryRequestAllOf</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CreateRepositoryRequestAllOf} obj Optional instance to populate.
   * @return {module:model/CreateRepositoryRequestAllOf} The populated <code>CreateRepositoryRequestAllOf</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CreateRepositoryRequestAllOf();

      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }

      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }

      if (data.hasOwnProperty('constraints')) {
        obj['constraints'] = ApiClient.convertToType(data['constraints'], ['String']);
      }

      if (data.hasOwnProperty('hostingOptions')) {
        obj['hostingOptions'] = HostingOptions.constructFromObject(data['hostingOptions']);
      }
    }

    return obj;
  }

}
/**
 * The name of the repository. No special charaters or spaces permitted
 * @member {String} name
 */


CreateRepositoryRequestAllOf.prototype['name'] = undefined;
/**
 * The description of the repository
 * @member {String} description
 */

CreateRepositoryRequestAllOf.prototype['description'] = undefined;
/**
 * Additional constraints
 * @member {Array.<String>} constraints
 */

CreateRepositoryRequestAllOf.prototype['constraints'] = undefined;
/**
 * @member {module:model/HostingOptions} hostingOptions
 */

CreateRepositoryRequestAllOf.prototype['hostingOptions'] = undefined;
export default CreateRepositoryRequestAllOf;