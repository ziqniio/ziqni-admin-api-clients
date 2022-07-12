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
import ApiKeyAllOf from './ApiKeyAllOf';
import ModelDefault from './ModelDefault';
import OptParamModels from './OptParamModels';
import Role from './Role';

/**
 * The ApiKey model module.
 * @module model/ApiKey
 * @version 0.0.26
 */
class ApiKey {
    /**
     * Constructs a new <code>ApiKey</code>.
     * @alias module:model/ApiKey
     * @implements module:model/ModelDefault
     * @implements module:model/OptParamModels
     * @implements module:model/ApiKeyAllOf
     * @param id {String} A unique system generated identifier
     * @param spaceName {String} This is the space name which is linked to the account
     * @param created {Date} ISO8601 timestamp for when a Model was created. All records are stored in UTC time zone
     * @param key {String} An Api key hash
     * @param role {module:model/Role} 
     * @param constraints {Array.<String>} Additional constraints
     */
    constructor(id, spaceName, created, key, role, constraints) { 
        ModelDefault.initialize(this, id, spaceName, created);OptParamModels.initialize(this);ApiKeyAllOf.initialize(this, key, role, constraints);
        ApiKey.initialize(this, id, spaceName, created, key, role, constraints);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, spaceName, created, key, role, constraints) { 
        obj['id'] = id;
        obj['spaceName'] = spaceName;
        obj['created'] = created;
        obj['key'] = key;
        obj['role'] = role;
        obj['constraints'] = constraints;
    }

    /**
     * Constructs a <code>ApiKey</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ApiKey} obj Optional instance to populate.
     * @return {module:model/ApiKey} The populated <code>ApiKey</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ApiKey();
            ModelDefault.constructFromObject(data, obj);
            OptParamModels.constructFromObject(data, obj);
            ApiKeyAllOf.constructFromObject(data, obj);

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('spaceName')) {
                obj['spaceName'] = ApiClient.convertToType(data['spaceName'], 'String');
            }
            if (data.hasOwnProperty('created')) {
                obj['created'] = ApiClient.convertToType(data['created'], 'Date');
            }
            if (data.hasOwnProperty('customFields')) {
                obj['customFields'] = ApiClient.convertToType(data['customFields'], {'String': Object});
            }
            if (data.hasOwnProperty('tags')) {
                obj['tags'] = ApiClient.convertToType(data['tags'], ['String']);
            }
            if (data.hasOwnProperty('metadata')) {
                obj['metadata'] = ApiClient.convertToType(data['metadata'], {'String': 'String'});
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('whiteListIPs')) {
                obj['whiteListIPs'] = ApiClient.convertToType(data['whiteListIPs'], ['String']);
            }
            if (data.hasOwnProperty('key')) {
                obj['key'] = ApiClient.convertToType(data['key'], 'String');
            }
            if (data.hasOwnProperty('role')) {
                obj['role'] = Role.constructFromObject(data['role']);
            }
            if (data.hasOwnProperty('constraints')) {
                obj['constraints'] = ApiClient.convertToType(data['constraints'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * A unique system generated identifier
 * @member {String} id
 */
ApiKey.prototype['id'] = undefined;

/**
 * This is the space name which is linked to the account
 * @member {String} spaceName
 */
ApiKey.prototype['spaceName'] = undefined;

/**
 * ISO8601 timestamp for when a Model was created. All records are stored in UTC time zone
 * @member {Date} created
 */
ApiKey.prototype['created'] = undefined;

/**
 * @member {Object.<String, Object>} customFields
 */
ApiKey.prototype['customFields'] = undefined;

/**
 * A list of id's used to tag models
 * @member {Array.<String>} tags
 */
ApiKey.prototype['tags'] = undefined;

/**
 * @member {Object.<String, String>} metadata
 */
ApiKey.prototype['metadata'] = undefined;

/**
 * The description of an Api key
 * @member {String} description
 */
ApiKey.prototype['description'] = undefined;

/**
 * the IP's that need to be whitelisted with the Api key
 * @member {Array.<String>} whiteListIPs
 */
ApiKey.prototype['whiteListIPs'] = undefined;

/**
 * An Api key hash
 * @member {String} key
 */
ApiKey.prototype['key'] = undefined;

/**
 * @member {module:model/Role} role
 */
ApiKey.prototype['role'] = undefined;

/**
 * Additional constraints
 * @member {Array.<String>} constraints
 */
ApiKey.prototype['constraints'] = undefined;


// Implement ModelDefault interface:
/**
 * A unique system generated identifier
 * @member {String} id
 */
ModelDefault.prototype['id'] = undefined;
/**
 * This is the space name which is linked to the account
 * @member {String} spaceName
 */
ModelDefault.prototype['spaceName'] = undefined;
/**
 * ISO8601 timestamp for when a Model was created. All records are stored in UTC time zone
 * @member {Date} created
 */
ModelDefault.prototype['created'] = undefined;
// Implement OptParamModels interface:
/**
 * @member {Object.<String, Object>} customFields
 */
OptParamModels.prototype['customFields'] = undefined;
/**
 * A list of id's used to tag models
 * @member {Array.<String>} tags
 */
OptParamModels.prototype['tags'] = undefined;
/**
 * @member {Object.<String, String>} metadata
 */
OptParamModels.prototype['metadata'] = undefined;
// Implement ApiKeyAllOf interface:
/**
 * The description of an Api key
 * @member {String} description
 */
ApiKeyAllOf.prototype['description'] = undefined;
/**
 * the IP's that need to be whitelisted with the Api key
 * @member {Array.<String>} whiteListIPs
 */
ApiKeyAllOf.prototype['whiteListIPs'] = undefined;
/**
 * An Api key hash
 * @member {String} key
 */
ApiKeyAllOf.prototype['key'] = undefined;
/**
 * @member {module:model/Role} role
 */
ApiKeyAllOf.prototype['role'] = undefined;
/**
 * Additional constraints
 * @member {Array.<String>} constraints
 */
ApiKeyAllOf.prototype['constraints'] = undefined;




export default ApiKey;

