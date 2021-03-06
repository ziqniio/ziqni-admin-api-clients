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
import com.ziqni.admin.client.data.LoadMessagesData;
import com.ziqni.admin.client.model.ModelApiResponse;
import com.ziqni.admin.client.model.QueryMultiple;
import com.ziqni.admin.client.model.QueryRequest;
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
public class AccountMessagesApiTest implements tests.utils.CompleteableFutureTestWrapper{

    private static final Logger logger = LoggerFactory.getLogger(AccountMessagesApiTest.class);

    private final AccountMessagesApi api;
    private final LoadMessagesData loadData;

    private final List<String> accountMessagesToDelete = new ArrayList<>();

    private String idForDeleteTest;
    private String idForDeleteByQueryTest;
    private String idForGetTest;

    public AccountMessagesApiTest() throws Exception {
        ApiClientFactoryUtil.initApiClientFactory();
        this.api = ApiClientFactory.getAccountMessagesApi();

        this.loadData = new LoadMessagesData();
    }

    @BeforeAll
    public void setUp() {
        //NB: These ids must be for account messages that have been created at the backend
       idForDeleteByQueryTest = "bTm6bX4Bo4d99drGM5iU";
       idForDeleteTest = "cDm7bX4Bo4d99drGJZgU";
       idForGetTest = "fDnGbX4Bo4d99drGSZjY";

       accountMessagesToDelete.add(idForGetTest);
    }

    @AfterAll
    public void cleanUp() throws InterruptedException {
        try {
            Thread.sleep(5000);
            loadData.deleteAccountMessageTestData(accountMessagesToDelete);
        } catch (ApiException e) {
            logger.error("error", e.getCause());
        }

    }

    @Test
    public void deleteAccountMessagesTest() throws ApiException {
        ModelApiResponse response = $(api.deleteAccountMessages(List.of(idForDeleteTest)));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(1, response.getMeta().getResultCount(), "Results should contain entry");
        assertEquals(0, response.getErrors().size(), "Errors should be empty");
    }

    @Test
    public void deleteAccountMessagesByQueryTest() throws ApiException {
        QueryRequest givenQuery = new QueryRequest()
                .addMustItem(new QueryMultiple().queryField("id").queryValues(List.of(idForDeleteByQueryTest)));
        ModelApiResponse response = $(api.deleteAccountMessagesByQuery(givenQuery));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(1, response.getMeta().getResultCount(), "Results should contain entry");
        assertEquals(0, response.getErrors().size(), "Errors should be empty");

    }

    @Test
    public void getAccountMessagesReturnOkTest() throws ApiException {
        Integer limit = 1;
        Integer skip = 0;

        var response = $(api.getAccountMessages(List.of(idForGetTest), limit, skip));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertTrue(response.getErrors().isEmpty(), "Should have no errors");
        assertEquals(1, response.getResults().size(), "Result count should match limit");

    }


    @Test
    public void getAccountMessagesByQueryTest() throws ApiException{
        QueryRequest givenQuery = new QueryRequest()
                .addMustItem(new QueryMultiple().queryField("id").queryValues(List.of(idForGetTest)));

        var response = $(api.getAccountMessagesByQuery(givenQuery));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertTrue(response.getErrors().isEmpty(), "Should have no errors");
        assertEquals(1, response.getResults().size(), "Result count should match limit");

    }


}
