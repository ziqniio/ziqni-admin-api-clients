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
import MatchCondition from './MatchCondition';
import Rule from './Rule';

/**
 * The Condition model module.
 * @module model/Condition
 * @version 0.0.26
 */
class Condition {
    /**
     * Constructs a new <code>Condition</code>.
     * @alias module:model/Condition
     * @param matchCondition {module:model/MatchCondition} 
     * @param rules {Array.<module:model/Rule>} 
     * @param constraints {Array.<String>} Additional constraints
     */
    constructor(matchCondition, rules, constraints) { 
        
        Condition.initialize(this, matchCondition, rules, constraints);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, matchCondition, rules, constraints) { 
        obj['matchCondition'] = matchCondition;
        obj['rules'] = rules;
        obj['constraints'] = constraints;
    }

    /**
     * Constructs a <code>Condition</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Condition} obj Optional instance to populate.
     * @return {module:model/Condition} The populated <code>Condition</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Condition();

            if (data.hasOwnProperty('matchCondition')) {
                obj['matchCondition'] = MatchCondition.constructFromObject(data['matchCondition']);
            }
            if (data.hasOwnProperty('rules')) {
                obj['rules'] = ApiClient.convertToType(data['rules'], [Rule]);
            }
            if (data.hasOwnProperty('constraints')) {
                obj['constraints'] = ApiClient.convertToType(data['constraints'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/MatchCondition} matchCondition
 */
Condition.prototype['matchCondition'] = undefined;

/**
 * @member {Array.<module:model/Rule>} rules
 */
Condition.prototype['rules'] = undefined;

/**
 * Additional constraints
 * @member {Array.<String>} constraints
 */
Condition.prototype['constraints'] = undefined;






export default Condition;

