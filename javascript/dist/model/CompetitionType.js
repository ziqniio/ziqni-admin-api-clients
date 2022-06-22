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
/**
* Enum class CompetitionType.
* @enum {}
* @readonly
*/

export default class CompetitionType {
  /**
   * value: "Leaderboard"
   * @const
   */
  "Leaderboard" = "Leaderboard";
  /**
  * Returns a <code>CompetitionType</code> enum value from a Javascript object name.
  * @param {Object} data The plain JavaScript object containing the name of the enum value.
  * @return {module:model/CompetitionType} The enum <code>CompetitionType</code> value.
  */

  static constructFromObject(object) {
    return object;
  }

}