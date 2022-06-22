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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.@ZiqniTechAdminApiClient);
  }
}(this, function(expect, @ZiqniTechAdminApiClient) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new @ZiqniTechAdminApiClient.CreateRabbitMqConnectionRequest();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('CreateRabbitMqConnectionRequest', function() {
    it('should create an instance of CreateRabbitMqConnectionRequest', function() {
      // uncomment below and update the code to test CreateRabbitMqConnectionRequest
      //var instance = new @ZiqniTechAdminApiClient.CreateRabbitMqConnectionRequest();
      //expect(instance).to.be.a(@ZiqniTechAdminApiClient.CreateRabbitMqConnectionRequest);
    });

    it('should have the property customFields (base name: "customFields")', function() {
      // uncomment below and update the code to test the property customFields
      //var instance = new @ZiqniTechAdminApiClient.CreateRabbitMqConnectionRequest();
      //expect(instance).to.be();
    });

    it('should have the property tags (base name: "tags")', function() {
      // uncomment below and update the code to test the property tags
      //var instance = new @ZiqniTechAdminApiClient.CreateRabbitMqConnectionRequest();
      //expect(instance).to.be();
    });

    it('should have the property metadata (base name: "metadata")', function() {
      // uncomment below and update the code to test the property metadata
      //var instance = new @ZiqniTechAdminApiClient.CreateRabbitMqConnectionRequest();
      //expect(instance).to.be();
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instance = new @ZiqniTechAdminApiClient.CreateRabbitMqConnectionRequest();
      //expect(instance).to.be();
    });

    it('should have the property description (base name: "description")', function() {
      // uncomment below and update the code to test the property description
      //var instance = new @ZiqniTechAdminApiClient.CreateRabbitMqConnectionRequest();
      //expect(instance).to.be();
    });

    it('should have the property port (base name: "port")', function() {
      // uncomment below and update the code to test the property port
      //var instance = new @ZiqniTechAdminApiClient.CreateRabbitMqConnectionRequest();
      //expect(instance).to.be();
    });

    it('should have the property virtualHost (base name: "virtualHost")', function() {
      // uncomment below and update the code to test the property virtualHost
      //var instance = new @ZiqniTechAdminApiClient.CreateRabbitMqConnectionRequest();
      //expect(instance).to.be();
    });

    it('should have the property uri (base name: "uri")', function() {
      // uncomment below and update the code to test the property uri
      //var instance = new @ZiqniTechAdminApiClient.CreateRabbitMqConnectionRequest();
      //expect(instance).to.be();
    });

    it('should have the property userName (base name: "userName")', function() {
      // uncomment below and update the code to test the property userName
      //var instance = new @ZiqniTechAdminApiClient.CreateRabbitMqConnectionRequest();
      //expect(instance).to.be();
    });

    it('should have the property password (base name: "password")', function() {
      // uncomment below and update the code to test the property password
      //var instance = new @ZiqniTechAdminApiClient.CreateRabbitMqConnectionRequest();
      //expect(instance).to.be();
    });

    it('should have the property queueName (base name: "queueName")', function() {
      // uncomment below and update the code to test the property queueName
      //var instance = new @ZiqniTechAdminApiClient.CreateRabbitMqConnectionRequest();
      //expect(instance).to.be();
    });

    it('should have the property exchange (base name: "exchange")', function() {
      // uncomment below and update the code to test the property exchange
      //var instance = new @ZiqniTechAdminApiClient.CreateRabbitMqConnectionRequest();
      //expect(instance).to.be();
    });

    it('should have the property routingKey (base name: "routingKey")', function() {
      // uncomment below and update the code to test the property routingKey
      //var instance = new @ZiqniTechAdminApiClient.CreateRabbitMqConnectionRequest();
      //expect(instance).to.be();
    });

    it('should have the property addConstraints (base name: "addConstraints")', function() {
      // uncomment below and update the code to test the property addConstraints
      //var instance = new @ZiqniTechAdminApiClient.CreateRabbitMqConnectionRequest();
      //expect(instance).to.be();
    });

    it('should have the property transformerId (base name: "transformerId")', function() {
      // uncomment below and update the code to test the property transformerId
      //var instance = new @ZiqniTechAdminApiClient.CreateRabbitMqConnectionRequest();
      //expect(instance).to.be();
    });

  });

}));
