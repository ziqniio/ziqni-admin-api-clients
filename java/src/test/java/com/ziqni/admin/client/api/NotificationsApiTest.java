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
import com.ziqni.admin.client.data.LoadCustomFieldsData;
import com.ziqni.admin.client.data.LoadMessagesData;
import com.ziqni.admin.client.data.LoadTagsData;
import com.ziqni.admin.client.model.*;
import com.ziqni.admin.client.data.LoadCustomFieldsData;
import com.ziqni.admin.client.data.LoadMessagesData;
import com.ziqni.admin.client.model.*;
import com.ziqni.admin.client.util.ApiClientFactoryUtil;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static com.ziqni.admin.client.util.ApiClientFactoryUtil.initApiClientFactory;
import static org.junit.jupiter.api.Assertions.*;


/**
 * API tests for Messages API
 */

//Fixme - tests are missing for account message retrieval
//Fixme - tests need to check sending messages to multiple members
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class NotificationsApiTest implements tests.utils.CompleteableFutureTestWrapper{

    private static final Logger logger = LoggerFactory.getLogger(NotificationsApiTest.class);

    private final NotificationsApi api;
    private final LoadMessagesData loadData;
    private final LoadTagsData loadTagsData;
    private final LoadCustomFieldsData loadCustomFieldsData;

    private String tagKey;
    private String customFieldKey;

    private List<String> notificationIdsToDelete = new ArrayList<>();
    private final List<String> tagIdsToDelete = new ArrayList<>();
    private final List<String> customFieldIdsToDelete = new ArrayList<>();


    public NotificationsApiTest() throws Exception {
        ApiClientFactoryUtil.initApiClientFactory();
        this.api = ApiClientFactory.getNotificationsApi();

        this.loadData = new LoadMessagesData();
        this.loadCustomFieldsData = new LoadCustomFieldsData();
        this.loadTagsData = new LoadTagsData();
    }

    @BeforeAll
    public void setUp() {
        try {
            tagKey = loadTagsData.getModel();
            customFieldKey = loadCustomFieldsData.getModel(customFieldIdsToDelete, AppliesTo.MESSAGE);

            tagIdsToDelete.add(tagKey);
        } catch (ApiException e) {
            logger.error("error", e.getCause());
        }
    }

    @AfterAll
    public void cleanUp() throws InterruptedException {
        try {
            Thread.sleep(5000);
            loadData.deleteNotificationMessageTestData(notificationIdsToDelete);

            loadTagsData.deleteTestData(tagIdsToDelete);
            loadCustomFieldsData.deleteTestData(customFieldIdsToDelete);
        } catch (ApiException e) {
            logger.error("error", e.getCause());
        }

    }

    @Test
    @Order(2)
    public void createNotificationsReturnOkTest() throws ApiException {
        final var createRequest = loadData.getCreateNotificationRequestAsList(1);
        ModelApiResponse response = $(api.createNotifications(createRequest));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(1, response.getResults().size(), "Should contain created entity");
        assertNotNull(response.getResults().get(0).getId(), "Created entity should has id");

        notificationIdsToDelete.add(response.getResults().get(0).getId());

    }

    @Test
    @Order(2)
    public void createNotificationsWithCustomFieldsAndTagsReturnOkTest() throws ApiException {
        final var createRequest = loadData.getCreateNotificationMessageRequest()
                .customFields(Map.of(customFieldKey,"Given"))
                .tags(List.of(tagKey));
        ModelApiResponse response = $(api.createNotifications(List.of(createRequest)));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(1, response.getResults().size(), "Should contain created entity");
        assertNotNull(response.getResults().get(0).getId(), "Created entity should has id");

        notificationIdsToDelete.add(response.getResults().get(0).getId());

    }

    @Test
    public void deleteNotificationsTest() throws ApiException, InterruptedException {
        final var createRequest = loadData.getCreateNotificationMessageRequest();
        final var id = loadData.createNotificationMessageTestData(createRequest).getResults().get(0).getId();

        Thread.sleep(5000);

        ModelApiResponse response = $(api.deleteNotifications(List.of(id)));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(1, response.getMeta().getResultCount(), "Results should contain entry");
        assertEquals(0, response.getErrors().size(), "Errors should be empty");
    }

    @Test
    public void deleteNotificationsByQueryTest() throws ApiException, InterruptedException {
        var translationEntry = new TranslationEntry();
        translationEntry.setFieldName("name");
        translationEntry.setText("Given");
        var translation = new Translation();
        translation.setLanguageKey("anp");
        translation.setTranslations(List.of(translationEntry));
        final var createRequest = loadData.getCreateNotificationMessageRequest().translations(List.of(translation));
        final var createdResponse = loadData.createNotificationMessageTestData(createRequest);

        assertNotNull(createdResponse);
        assertNotNull(createdResponse.getResults());
        assertNotNull(createdResponse.getErrors());
        assertEquals(1, createdResponse.getResults().size(), "Should contain created entity");
        String givenId = createdResponse.getResults().get(0).getId();
        assertNotNull(givenId, "Created entity should has id");

        Thread.sleep(5000);

        QueryRequest givenQuery = new QueryRequest()
                .addMustItem(new QueryMultiple().queryField("id").queryValues(List.of(givenId)));

        ModelApiResponse response = $(api.deleteNotificationsByQuery(givenQuery));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(1, response.getMeta().getResultCount(), "Results should contain entry");
        assertEquals(0, response.getErrors().size(), "Errors should be empty");

    }

    @Test
    public void getNotificationsReturnOkTest() throws ApiException, InterruptedException {
        var request = loadData.getCreateNotificationMessageRequest();
        var createResponse = loadData.createNotificationMessageTestData(request);
        var id = createResponse.getResults().get(0).getId();

        Thread.sleep(5000);

        Integer limit = 1;
        Integer skip = 0;

        var response = $(api.getNotifications(List.of(id), limit, skip));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertTrue(response.getErrors().isEmpty(), "Should have no errors");
        assertEquals(1, response.getResults().size(), "Result count should match limit");

        notificationIdsToDelete.add(id);
    }

    @Test
    public void getNotificationsByQueryTest() throws ApiException, InterruptedException {
        var request = loadData.getCreateNotificationMessageRequest();
        var createResponse = loadData.createNotificationMessageTestData(request);
        var id = createResponse.getResults().get(0).getId();

        Thread.sleep(5000);

        assertNotNull(createResponse);
        assertNotNull(createResponse.getResults());
        assertNotNull(createResponse.getErrors());
        assertEquals(1, createResponse.getResults().size(), "Should contain created entity");
        String givenId = createResponse.getResults().get(0).getId();
        assertNotNull(givenId, "Created entity should has id");

        QueryRequest givenQuery = new QueryRequest()
                .addMustItem(new QueryMultiple().queryField("id").queryValues(List.of(givenId)));

        var response = $(api.getNotificationsByQuery(givenQuery));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertTrue(response.getErrors().isEmpty(), "Should have no errors");
        assertEquals(1, response.getResults().size(), "Result count should match limit");

        notificationIdsToDelete.add(id);
    }

    @Test
    public void getNotificationsNoArgumentsReturnEmptyTest() throws ApiException {
        var request = loadData.getCreateNotificationMessageRequest();
        var createResponse = loadData.createNotificationMessageTestData(request);
        var id = createResponse.getResults().get(0).getId();

        List<String> ids = Collections.emptyList();
        Integer limit = 0;
        Integer skip = 0;
        var response = $(api.getNotifications(ids, limit, skip));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertFalse(response.getResults().isEmpty(), "Should have a result");
        assertTrue(response.getErrors().isEmpty(), "Should have no errors");

        notificationIdsToDelete.add(id);
    }

    @Test
    public void getNotificationIdWithWhitespaceReturnErrorTest() throws ApiException, InterruptedException {
        var request = loadData.getCreateNotificationMessageRequest();
        var createResponse = loadData.createNotificationMessageTestData(request);
        var id = createResponse.getResults().get(0).getId();

        var idWithSpaces = id.stripTrailing() + " ";

        Thread.sleep(5000);

        Integer limit = 1;
        Integer skip = 0;
        var response = $(api.getNotifications(List.of(idWithSpaces), limit, skip));

        assertNotNull(response);
        assertNotNull(response.getErrors());
        assertNotNull(response.getResults());
        assertTrue(response.getErrors().isEmpty(), "Should not have error");
        assertEquals(1, response.getResults().size(), "Should have single result");
        assertTrue(response.getErrors().isEmpty(), "Should not return error");

        notificationIdsToDelete.add(id);
    }

    @Test
    public void getNotificationsIdWithWhitespaceBetweenReturnResultTest() throws ApiException, InterruptedException {
        var request = loadData.getCreateNotificationMessageRequest();
        var createResponse = loadData.createNotificationMessageTestData(request);
        var id = createResponse.getResults().get(0).getId();

        var idWithSpaces = id.stripLeading().substring(0, id.length() / 2).concat(" ").concat(id.substring(id.length() / 2));

        Thread.sleep(5000);

        Integer limit = 1;
        Integer skip = 0;
        var response = $(api.getNotifications(List.of(idWithSpaces), limit, skip));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertTrue(response.getErrors().isEmpty(), "Should not have error");
        assertEquals(0, response.getErrors().size(), "Should not have an error");
        assertTrue(response.getResults().isEmpty(), "Should not return result");

        notificationIdsToDelete.add(id);
    }

}