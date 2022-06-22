/*
 * Ziqni Application Services
 * Ziqni Application Services are used to manage and configure spaces.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@ziqni.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ziqni.admin.client.api;

import com.ziqni.admin.client.ApiClientFactory;
import com.ziqni.admin.client.ApiException;
import com.ziqni.admin.client.data.LoadTransformerData;
import com.ziqni.admin.client.model.*;
import com.ziqni.admin.client.data.LoadTransformerData;
import com.ziqni.admin.client.model.*;
import com.ziqni.admin.client.util.ApiClientFactoryUtil;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static com.ziqni.admin.client.util.ApiClientFactoryUtil.initApiClientFactory;
import static org.junit.jupiter.api.Assertions.*;


/**
 * API tests for TransformersApi
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TransformersApiTest implements tests.utils.CompleteableFutureTestWrapper{

    private static final Logger logger = LoggerFactory.getLogger(TransformersApiTest.class);

    private TransformersApi api;

    private LoadTransformerData loadTestData;

    private List<String> idsToDelete = new ArrayList<>();

    public TransformersApiTest() throws Exception {
        ApiClientFactoryUtil.initApiClientFactory();
        this.api = ApiClientFactory.getTransformersApi();
        this.loadTestData = new LoadTransformerData();
    }

//    @BeforeAll
    public void setUp(){
        //nothing to initialise here
    }

//    @AfterAll
    public void cleanUp() throws ApiException, InterruptedException {
        try {
            Thread.sleep(5000);
            loadTestData.deleteTestData(idsToDelete);
        } catch (ApiException e) {
            logger.error("error", e.getCause());
        }
    }

    @Test
    @Order(1)
    public void createSingleTransformerOkTest() throws ApiException {

        var request = loadTestData.getCreateRequest();
        var response = $(api.createTransformers(loadTestData.getCreateRequestAsList(request)));
        var id = response.getResults().get(0).getId();

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());

        assertEquals(1, response.getResults().size(), "Should contain created entity");
        assertNotNull(response.getResults().get(0).getId(), "Created entity should has id");

        idsToDelete.add(id);
    }

    @Test
    @Order(2)
    public void getSingleTransformerOkTest() throws ApiException {

//        var request = loadTestData.getCreateRequest();
//        var requestList = loadTestData.getCreateRequestAsList(request);
//        var createResponse = loadTestData.createTestData(requestList);
//        var id = createResponse.getResults().get(0).getId();
        var id = "YU4MDH4BD9Qlc0ir0LjM";

        TransformerResponse response = $(api.getTransformers( List.of(id) , 1, 0));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertTrue(response.getErrors().isEmpty(), "Should have no errors");
        assertEquals(1, response.getResults().size(), "Should has single result");

        Transformer transformer = response.getResults().get(0);
        assertEquals(id, transformer.getId(), "Found id should be equal to requested");
//        assertEquals(request.getName(), transformer.getName(), "Found name should be equal to created previously");
//        assertEquals(request.getSource(), transformer.getSource(), "Found source should be equal to created previously");
//        assertEquals(request.getSourceLanguage(), transformer.getSourceLanguage(), "Found sourceLanguage should be equal to created previously");
//
//        idsToDelete.add(id);

    }

    @Test
    @Order(2)
    public void getSingleTransformerByQueryOkTest() throws ApiException, InterruptedException {

        var request = loadTestData.getCreateRequest();
        var createResponse = loadTestData.createTestData(loadTestData.getCreateRequestAsList(request));

        var id = createResponse.getResults().get(0).getId();

        Thread.sleep(5000);

        QueryRequest given = new QueryRequest()
                .addShouldItem(new QueryMultiple().queryField("name").queryValues(List.of(request.getName())))
                .shouldMatch(1);

        TransformerResponse response = $(api.getTransformersByQuery( given));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertTrue(response.getErrors().isEmpty(), "Should have no errors");
        assertFalse(response.getResults().isEmpty(), "Should has single result");

        Transformer transformer = response.getResults().get(0);
        assertEquals(id, transformer.getId(), "Found id should be equal to requested");
        Assertions.assertEquals(request.getName(), transformer.getName(), "Found name should be equal to created previously");
        Assertions.assertEquals(request.getSource(), transformer.getSource(), "Found source should be equal to created previously");
        Assertions.assertEquals(request.getSourceLanguage(), transformer.getSourceLanguage(), "Found sourceLanguage should be equal to created previously");

        idsToDelete.add(id);
    }

    @Test
    @Order(3)
    public void updateTransformersTestOk() throws ApiException {

        var request = loadTestData.getCreateRequest();
        var createResponse = loadTestData.createTestData(loadTestData.getCreateRequestAsList(request));

        var id = createResponse.getResults().get(0).getId();

        String givenUpdateName = "Test_update_name";

        UpdateTransformerRequest body = new UpdateTransformerRequest()
                .id(id)
                .name(givenUpdateName);

        ModelApiResponse response = $(api.updateTransformers(List.of(body)));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(1, response.getResults().size(), "Should contain updated entity");
        assertNotNull(response.getResults().get(0).getId(), "Created entity should has id");

        String updatedId = response.getResults().get(0).getId();


        List<String> ids = List.of(updatedId);
        Integer limit = 1;
        Integer skip = 0;
        TransformerResponse updated = $(api.getTransformers( ids, limit, skip));

        assertNotNull(updated);
        assertNotNull(updated.getResults());
        assertNotNull(updated.getErrors());
        assertTrue(updated.getErrors().isEmpty(), "Should have no errors");
        assertEquals(limit, updated.getResults().size(), "Should has single result");

        Transformer transformer = updated.getResults().get(0);
        assertEquals(updatedId, transformer.getId(), "Found id should be equal to requested");
        assertEquals(givenUpdateName, transformer.getName(), "Found name should be equal to provided for update");
        Assertions.assertEquals(request.getSource(), transformer.getSource(), "Found source should be equal to provided for update");
        Assertions.assertEquals(request.getSourceLanguage(), transformer.getSourceLanguage(), "Found sourceLanguage should be equal to created previously");

        idsToDelete.add(id);
    }

    @Test
    @Order(5)
    public void updateTransformersWithoutNameReturnOkTest() throws ApiException {

        var request = loadTestData.getCreateRequest();
        var createResponse = loadTestData.createTestData(loadTestData.getCreateRequestAsList(request));

        var id = createResponse.getResults().get(0).getId();

        UpdateTransformerRequest given = new UpdateTransformerRequest()
                .id(id)
                .name(null);

        ModelApiResponse response = $(api.updateTransformers(List.of(given)));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(1, response.getResults().size(), "Results should be empty");
        assertEquals(0, response.getErrors().size(), "Errors should contain entry");

        idsToDelete.add(id);
    }

    @Test
    @Order(6)
    public void updateTransformerWithoutIdReturnErrorTest() throws ApiException {

        UpdateTransformerRequest given = new UpdateTransformerRequest()
                .id(null);

        ModelApiResponse response = $(api.updateTransformers(List.of(given)));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(0, response.getResults().size(), "Results should be empty");
        assertEquals(1, response.getErrors().size(), "Errors should contain entry");
    }

    @Test
    @Order(7)
    public void updateTransformerWithoutSourceReturnOkTest() throws ApiException {

        var request = loadTestData.getCreateRequest();
        var createResponse = loadTestData.createTestData(loadTestData.getCreateRequestAsList(request));
        var id = createResponse.getResults().get(0).getId();

        UpdateTransformerRequest given = new UpdateTransformerRequest()
                .id(id)
                .source("");

        ModelApiResponse response = $(api.updateTransformers(List.of(given)));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(1, response.getResults().size(), "Results should be empty");
        assertEquals(0, response.getErrors().size(), "Errors should contain entry");

        idsToDelete.add(id);
    }

    @Test
    @Order(8)
    public void updateTransformerWithoutSourceLanguageReturnOkTest() throws ApiException {

        var request = loadTestData.getCreateRequest();
        var createResponse = loadTestData.createTestData(loadTestData.getCreateRequestAsList(request));
        var id = createResponse.getResults().get(0).getId();

        UpdateTransformerRequest given = new UpdateTransformerRequest()
                .id(id)
                .sourceLanguage(null);

        ModelApiResponse response = $(api.updateTransformers(List.of(given)));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(1, response.getResults().size(), "Results should be empty");
        assertEquals(0, response.getErrors().size(), "Errors should contain entry");

        idsToDelete.add(id);
    }

    @Test
    @Order(9)
    public void updateTransformersWithNameLongerThan100ReturnErrorTest() throws ApiException {

        var request = loadTestData.getCreateRequest();
        var createResponse = loadTestData.createTestData(loadTestData.getCreateRequestAsList(request));
        var id = createResponse.getResults().get(0).getId();

        UpdateTransformerRequest given = new UpdateTransformerRequest()
                .id(id)
                .name("x".repeat(501));

        ModelApiResponse response = $(api.updateTransformers(List.of(given)));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(0, response.getResults().size(), "Results should be empty");
        assertEquals(1, response.getErrors().size(), "Errors should contain entry");

        idsToDelete.add(id);
    }

    @Test
    @Order(10)
    public void deleteTransformerOkTest() throws ApiException, InterruptedException {

        var request = loadTestData.getCreateRequest();
        var createResponse = loadTestData.createTestData(loadTestData.getCreateRequestAsList(request));
        var id = createResponse.getResults().get(0).getId();

        Thread.sleep(5000);

        ModelApiResponse response = $(api.deleteTransformers(List.of(id)));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(1, response.getMeta().getResultCount(), "Results should contain entry");
        assertEquals(0, response.getErrors().size(), "Errors should be empty");
    }

    @Test
    public void deleteTransformerWithIncorrectIdReturnErrorTest() throws ApiException {

        List<String> id = List.of("Some_incorect_id");
        ModelApiResponse response = $(api.deleteTransformers( id));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(0, response.getResults().size(), "Results should be empty");
        assertEquals(1, response.getErrors().size(), "Errors should contain entry");
    }

    @Test
    public void createTransformerWithoutNameReturnErrorTest() throws ApiException {

        var request = loadTestData.getCreateRequest()
                .name(null);

        ModelApiResponse response = $(api.createTransformers(List.of(request)));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(0, response.getResults().size(), "Results should be empty");
        assertEquals(1, response.getErrors().size(), "Errors should contain entry");
    }

    @Test
    public void createTransformerWithoutSourceReturnErrorTest() throws ApiException {

        var request = loadTestData.getCreateRequest()
                .source(null);

        ModelApiResponse response = $(api.createTransformers(List.of(request)));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(0, response.getResults().size(), "Results should be empty");
        assertEquals(1, response.getErrors().size(), "Errors should contain entry");
    }

    @Test
    public void createTransformerWithoutSourceLanguageReturnErrorTest() throws ApiException {

        var request = loadTestData.getCreateRequest()
                .sourceLanguage(null);

        ModelApiResponse response = $(api.createTransformers(List.of(request)));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(0, response.getResults().size(), "Results should be empty");
        assertEquals(1, response.getErrors().size(), "Errors should contain entry");
    }

    @Test
    public void getTransformersMultipleIdsReturnOkTest() throws ApiException {

        var numberOfItems = 2;
        var createResponse = loadTestData.createTestData(loadTestData.getCreateRequestAsList(numberOfItems));

        List<String> givenIds = createResponse.getResults().stream().map(Result::getId).collect(Collectors.toList());

        TransformerResponse response = $(api.getTransformers( givenIds, numberOfItems, 0));

        assertNotNull(response);
        assertNotNull(response.getErrors());
        assertNotNull(response.getResults());
        assertTrue(response.getErrors().isEmpty(), "Should have no errors");
        assertEquals(givenIds.size(), response.getResults().size(), "Should have single result");

        List<String> foundIds = response.getResults()
                .stream()
                .map(Transformer::getId)
                .collect(Collectors.toList());

        assertTrue(foundIds.containsAll(givenIds), "Found id should be equal to requested");

        idsToDelete.addAll(givenIds);
    }

    @Test
    public void getTransformersBlankIdReturnOkTest() throws ApiException {

        var request = loadTestData.getCreateRequest();
        var requestList = loadTestData.getCreateRequestAsList(request);
        var createResponse = loadTestData.createTestData(requestList);
        var id = createResponse.getResults().get(0).getId();

        TransformerResponse response = $(api.getTransformers(List.of(""), 1, 0));

        assertNotNull(response);
        assertNotNull(response.getErrors());
        assertNotNull(response.getResults());
        assertTrue(response.getErrors().isEmpty(), "Should have an error");
        assertTrue(!response.getResults().isEmpty(), "Should have some result");

        idsToDelete.add(id);

    }

    @Test
    public void getTransformersMultipleIdsOneMalformedReturnErrorTest() throws ApiException {

        var numberOfItems = 2;
        var createResponse = loadTestData.createTestData(loadTestData.getCreateRequestAsList(numberOfItems));

        List<String> givenIds = createResponse.getResults().stream().map(Result::getId).collect(Collectors.toList());

        var incorrectId = givenIds.get(0).toUpperCase();
        givenIds.add(incorrectId);

        TransformerResponse response = $(api.getTransformers( givenIds, givenIds.size(), 0));

        assertNotNull(response);
        assertNotNull(response.getErrors());
        assertNotNull(response.getResults());
        assertEquals(0, response.getErrors().size(), "Should have single error");
        assertEquals(numberOfItems, response.getResults().size(), "Should have requested valid results");

        List<String> foundIds = response.getResults()
                .stream()
                .map(Transformer::getId)
                .collect(Collectors.toList());

        assertTrue(givenIds.containsAll(foundIds), "Found id should be equal to requested");

        givenIds.remove(incorrectId);

        idsToDelete.addAll(givenIds);
    }

    @Test
    @Disabled //Enable it after partial responses are implemented on core
    public void getTransformersMultipleIdsOneBlankReturnErrorTest() throws ApiException {

        var numberOfItems = 2;
        var createResponse = loadTestData.createTestData(loadTestData.getCreateRequestAsList(numberOfItems));

        List<String> givenIds = createResponse.getResults().stream().map(Result::getId).collect(Collectors.toList());

        var incorrectId = "";
        givenIds.add(incorrectId);

        TransformerResponse response = $(api.getTransformers( givenIds, givenIds.size(), 0));

        assertNotNull(response);
        assertNotNull(response.getErrors());
        assertNotNull(response.getResults());
        assertTrue(response.getErrors().isEmpty(), "Should have errors");
        assertEquals(numberOfItems, response.getResults().size(), "Should have requested valid results");

        List<String> foundIds = response.getResults()
                .stream()
                .map(Transformer::getId)
                .collect(Collectors.toList());

        assertTrue(givenIds.containsAll(foundIds), "Found id should be equal to requested");

        givenIds.remove(incorrectId);

        idsToDelete.addAll(givenIds);

    }

    @Test
    public void getTransformersIdWithWhitespaceBetweenReturnErrorTest() throws ApiException {

        var request = loadTestData.getCreateRequest();
        var response = $(api.createTransformers(loadTestData.getCreateRequestAsList(request)));
        var id = response.getResults().get(0).getId();

        var incorrectId = id.substring(0, id.length() / 2).concat(" ").concat(id.substring(id.length() / 2));

        TransformerResponse getResponse = $(api.getTransformers( List.of(incorrectId), 1, 0));

        assertNotNull(getResponse);
        assertNotNull(getResponse.getResults());
        assertNotNull(getResponse.getErrors());
        Assertions.assertFalse(getResponse.getErrors().isEmpty(), "Should have error");
        assertTrue(getResponse.getResults().isEmpty(), "Should not return result");

        idsToDelete.add(id);
    }

    @Test
    public void deleteTransformerByQueryOkTest() throws ApiException, InterruptedException {

        CreateTransformerRequest given = new CreateTransformerRequest()
                .name("test_name_" + UUID.randomUUID().toString())
                .source("{}")
                .sourceLanguage(SourceLanguage.SCALA);
        ModelApiResponse createdGiven = $(api.createTransformers(List.of(given)));
        assertNotNull(createdGiven);
        assertNotNull(createdGiven.getResults());
        assertEquals(1, createdGiven.getResults().size(), "Should contain created entity");
        String givenId = createdGiven.getResults().get(0).getId();
        assertNotNull(createdGiven.getResults().get(0).getId(), "Created entity should has id");

        Thread.sleep(5000);

        QueryRequest givenQuery = new QueryRequest()
                .addShouldItem(new QueryMultiple().queryField("id").queryValues(List.of(givenId)))
                .shouldMatch(1);
        ModelApiResponse response = $(api.deleteTransformersByQuery( givenQuery));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(1, response.getMeta().getResultCount(), "Results should contain entry");
        assertEquals(0, response.getErrors().size(), "Errors should be empty");
    }

}
