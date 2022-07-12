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
import AchievementStatus from './AchievementStatus';
import DependantOn from './DependantOn';
import Scheduling from './Scheduling';
/**
 * The AchievementAllOf model module.
 * @module model/AchievementAllOf
 * @version 0.0.26
 */

class AchievementAllOf {
  /**
   * Constructs a new <code>AchievementAllOf</code>.
   * @alias module:model/AchievementAllOf
   * @param name {String} A name for the Achievement. Can be translated
   * @param icon {String} An Icon id that has been pre uploaded to the system to display for Achievement
   * @param constraints {Array.<String>} Additional constraints, if set means true
   */
  constructor(name, icon, constraints) {
    AchievementAllOf.initialize(this, name, icon, constraints);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj, name, icon, constraints) {
    obj['name'] = name;
    obj['icon'] = icon;
    obj['constraints'] = constraints;
  }
  /**
   * Constructs a <code>AchievementAllOf</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AchievementAllOf} obj Optional instance to populate.
   * @return {module:model/AchievementAllOf} The populated <code>AchievementAllOf</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AchievementAllOf();

      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }

      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }

      if (data.hasOwnProperty('termsAndConditions')) {
        obj['termsAndConditions'] = ApiClient.convertToType(data['termsAndConditions'], 'String');
      }

      if (data.hasOwnProperty('icon')) {
        obj['icon'] = ApiClient.convertToType(data['icon'], 'String');
      }

      if (data.hasOwnProperty('scheduling')) {
        obj['scheduling'] = Scheduling.constructFromObject(data['scheduling']);
      }

      if (data.hasOwnProperty('maxNumberOfIssues')) {
        obj['maxNumberOfIssues'] = ApiClient.convertToType(data['maxNumberOfIssues'], 'Number');
      }

      if (data.hasOwnProperty('status')) {
        obj['status'] = AchievementStatus.constructFromObject(data['status']);
      }

      if (data.hasOwnProperty('statusCode')) {
        obj['statusCode'] = ApiClient.convertToType(data['statusCode'], 'Number');
      }

      if (data.hasOwnProperty('constraints')) {
        obj['constraints'] = ApiClient.convertToType(data['constraints'], ['String']);
      }

      if (data.hasOwnProperty('achievementDependencies')) {
        obj['achievementDependencies'] = DependantOn.constructFromObject(data['achievementDependencies']);
      }

      if (data.hasOwnProperty('memberTagsFilter')) {
        obj['memberTagsFilter'] = DependantOn.constructFromObject(data['memberTagsFilter']);
      }

      if (data.hasOwnProperty('productTagsFilter')) {
        obj['productTagsFilter'] = DependantOn.constructFromObject(data['productTagsFilter']);
      }
    }

    return obj;
  }

}
/**
 * A name for the Achievement. Can be translated
 * @member {String} name
 */


AchievementAllOf.prototype['name'] = undefined;
/**
 * A name for the Achievement. Can be translated
 * @member {String} description
 */

AchievementAllOf.prototype['description'] = undefined;
/**
 * Terms and conditions of an achievement. Can be translated
 * @member {String} termsAndConditions
 */

AchievementAllOf.prototype['termsAndConditions'] = undefined;
/**
 * An Icon id that has been pre uploaded to the system to display for Achievement
 * @member {String} icon
 */

AchievementAllOf.prototype['icon'] = undefined;
/**
 * @member {module:model/Scheduling} scheduling
 */

AchievementAllOf.prototype['scheduling'] = undefined;
/**
 * Maximum number of issued achievements
 * @member {Number} maxNumberOfIssues
 */

AchievementAllOf.prototype['maxNumberOfIssues'] = undefined;
/**
 * @member {module:model/AchievementStatus} status
 */

AchievementAllOf.prototype['status'] = undefined;
/**
 * The code of the contest
 * @member {Number} statusCode
 */

AchievementAllOf.prototype['statusCode'] = undefined;
/**
 * Additional constraints, if set means true
 * @member {Array.<String>} constraints
 */

AchievementAllOf.prototype['constraints'] = undefined;
/**
 * @member {module:model/DependantOn} achievementDependencies
 */

AchievementAllOf.prototype['achievementDependencies'] = undefined;
/**
 * @member {module:model/DependantOn} memberTagsFilter
 */

AchievementAllOf.prototype['memberTagsFilter'] = undefined;
/**
 * @member {module:model/DependantOn} productTagsFilter
 */

AchievementAllOf.prototype['productTagsFilter'] = undefined;
export default AchievementAllOf;