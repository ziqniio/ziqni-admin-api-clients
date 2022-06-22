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
* Enum class EventRefType.
* @enum {}
* @readonly
*/

export default class EventRefType {
  /**
   * value: "Competition"
   * @const
   */
  "Competition" = "Competition";
  /**
   * value: "Contest"
   * @const
   */

  "Contest" = "Contest";
  /**
   * value: "Achievement"
   * @const
   */

  "Achievement" = "Achievement";
  /**
   * value: "User"
   * @const
   */

  "User" = "User";
  /**
   * value: "MemberMessage"
   * @const
   */

  "MemberMessage" = "MemberMessage";
  /**
  * Returns a <code>EventRefType</code> enum value from a Javascript object name.
  * @param {Object} data The plain JavaScript object containing the name of the enum value.
  * @return {module:model/EventRefType} The enum <code>EventRefType</code> value.
  */

  static constructFromObject(object) {
    return object;
  }

}