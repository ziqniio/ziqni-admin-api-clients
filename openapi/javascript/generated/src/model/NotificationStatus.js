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
* Enum class NotificationStatus.
* @enum {}
* @readonly
*/
export default class NotificationStatus {
    
        /**
         * value: "New"
         * @const
         */
        "New" = "New";

    
        /**
         * value: "Read"
         * @const
         */
        "Read" = "Read";

    
        /**
         * value: "CollaborationRequest"
         * @const
         */
        "CollaborationRequest" = "CollaborationRequest";

    
        /**
         * value: "Actioned"
         * @const
         */
        "Actioned" = "Actioned";

    
        /**
         * value: "Claimed"
         * @const
         */
        "Claimed" = "Claimed";

    
        /**
         * value: "Expired"
         * @const
         */
        "Expired" = "Expired";

    
        /**
         * value: "Canceled"
         * @const
         */
        "Canceled" = "Canceled";

    
        /**
         * value: "Deprecated"
         * @const
         */
        "Deprecated" = "Deprecated";

    

    /**
    * Returns a <code>NotificationStatus</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/NotificationStatus} The enum <code>NotificationStatus</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

