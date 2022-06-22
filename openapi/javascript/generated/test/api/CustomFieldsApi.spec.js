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
    instance = new @ZiqniTechAdminApiClient.CustomFieldsApi();
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

  describe('CustomFieldsApi', function() {
    describe('createCustomFields', function() {
      it('should call createCustomFields successfully', function(done) {
        //uncomment below and update the code to test createCustomFields
        //instance.createCustomFields(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteCustomFields', function() {
      it('should call deleteCustomFields successfully', function(done) {
        //uncomment below and update the code to test deleteCustomFields
        //instance.deleteCustomFields(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteCustomFieldsByQuery', function() {
      it('should call deleteCustomFieldsByQuery successfully', function(done) {
        //uncomment below and update the code to test deleteCustomFieldsByQuery
        //instance.deleteCustomFieldsByQuery(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getCustomFields', function() {
      it('should call getCustomFields successfully', function(done) {
        //uncomment below and update the code to test getCustomFields
        //instance.getCustomFields(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getCustomFieldsByQuery', function() {
      it('should call getCustomFieldsByQuery successfully', function(done) {
        //uncomment below and update the code to test getCustomFieldsByQuery
        //instance.getCustomFieldsByQuery(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateCustomFields', function() {
      it('should call updateCustomFields successfully', function(done) {
        //uncomment below and update the code to test updateCustomFields
        //instance.updateCustomFields(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));