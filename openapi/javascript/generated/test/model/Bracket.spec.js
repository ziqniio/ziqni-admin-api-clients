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
    instance = new @ZiqniTechAdminApiClient.Bracket();
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

  describe('Bracket', function() {
    it('should create an instance of Bracket', function() {
      // uncomment below and update the code to test Bracket
      //var instance = new @ZiqniTechAdminApiClient.Bracket();
      //expect(instance).to.be.a(@ZiqniTechAdminApiClient.Bracket);
    });

    it('should have the property rounds (base name: "rounds")', function() {
      // uncomment below and update the code to test the property rounds
      //var instance = new @ZiqniTechAdminApiClient.Bracket();
      //expect(instance).to.be();
    });

    it('should have the property contests (base name: "contests")', function() {
      // uncomment below and update the code to test the property contests
      //var instance = new @ZiqniTechAdminApiClient.Bracket();
      //expect(instance).to.be();
    });

  });

}));