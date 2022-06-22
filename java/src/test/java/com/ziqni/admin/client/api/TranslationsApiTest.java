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

import com.ziqni.admin.client.data.*;
import com.ziqni.admin.client.model.*;
import com.ziqni.admin.client.data.LoadAchievementsData;
import com.ziqni.admin.client.data.LoadLanguagesData;
import com.ziqni.admin.client.data.LoadRewardTypesData;
import com.ziqni.admin.client.data.LoadTranslationData;
import com.ziqni.admin.client.model.*;
import com.ziqni.admin.client.util.ApiClientFactoryUtil;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tests.utils.CompleteableFutureTestWrapper;

import java.util.ArrayList;
import java.util.List;

import static com.ziqni.admin.client.util.ApiClientFactoryUtil.initApiClientFactory;
import static org.junit.jupiter.api.Assertions.*;


/**
 * API tests for RulesApi
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TranslationsApiTest implements CompleteableFutureTestWrapper {

    private static final Logger logger = LoggerFactory.getLogger(TranslationsApiTest.class);
    private final TranslationsApi api;
    private final LoadTranslationData loadData;
    private final LoadLanguagesData loadLanguagesData;
    private final LoadRewardTypesData loadRewardTypesData;
    private final LoadAchievementsData loadAchievementsData;
    private String languageId;
    private String languageKey;
    private String entityId;
    private String entityType;
    private List<String> idsToDelete = new ArrayList<>();
    private List<String> rewardTypeIdsToDelete = new ArrayList<>();
    private List<String> languageIdsToDelete = new ArrayList<>();
    private List<String> achievementIdsToDelete = new ArrayList<>();

    public TranslationsApiTest() throws Exception {
        ApiClientFactoryUtil.initApiClientFactory();
        this.api = ApiClientFactory.getTranslationsApi();

        this.loadData = new LoadTranslationData();
        this.loadLanguagesData = new LoadLanguagesData();
        this.loadAchievementsData = new LoadAchievementsData();
        this.loadRewardTypesData = new LoadRewardTypesData();

    }

    @BeforeAll
    public void setUp() {
        try {
            final var createRequest = loadRewardTypesData.getCreateRequest();
            final var createRequestAsList = loadRewardTypesData.getCreateRequestAsList(createRequest);
            final var response = loadRewardTypesData.createTestData(createRequestAsList);
            String rewardTypeId = response.getResults().get(0).getId();
            rewardTypeIdsToDelete.add(rewardTypeId);

            this.languageKey="anp";
            final var createRequestLanguage = loadLanguagesData.getCreateRequest(languageKey);
            final var createRequestLanguageAsList = loadLanguagesData.getCreateRequestAsList(createRequestLanguage);
            final var responseLanguage = loadLanguagesData.createTestData(createRequestLanguageAsList);
            this.languageId = responseLanguage.getResults().get(0).getId();
            languageIdsToDelete.add(languageId);

            final var createAch = loadAchievementsData.getCreateRequest(rewardTypeId);
            final var createAchAsList   = loadAchievementsData.getCreateRequestAsList(createAch);
            final var achResponse = loadAchievementsData.createTestData(createAchAsList);
            this.entityId = achResponse.getResults().get(0).getId();
            achievementIdsToDelete.add(entityId);

            entityType = RewardEntityType.ACHIEVEMENT.getValue();



        }catch (ApiException e){
            logger.error("error", e.getCause());
        }
    }

    @AfterAll
    public void cleanUp() throws ApiException {
        try{
            Thread.sleep(5000);
            loadData.deleteTestData(idsToDelete);
            loadRewardTypesData.deleteTestData(rewardTypeIdsToDelete);
            loadAchievementsData.deleteTestData(achievementIdsToDelete);
            loadLanguagesData.deleteTestData(languageIdsToDelete);
        }catch (ApiException | InterruptedException e){
            logger.error("error", e.getCause());
        }

    }

    @Test
    @Order(1)
    public void createSingleTransformerOkTest() throws ApiException {
        var request = loadData.getCreateRequest(languageId,languageKey,entityId,entityType);
        var response = $(api.createTranslations(loadData.getCreateRequestAsList(request)));
        var id = response.getResults().get(0).getId();

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());

        assertEquals(1, response.getResults().size(), "Should contain created entity");
        assertNotNull(response.getResults().get(0).getId(), "Created entity should has id");

        idsToDelete.add(id);
    }

    @Test
    @Order(3)
    public void updateTranslationTestOk() throws ApiException, InterruptedException {
        var request = loadData.getCreateRequest(languageId,languageKey,entityId,entityType);
        var createResponse = loadData.createTestData(loadData.getCreateRequestAsList(request));

        var id = createResponse.getResults().get(0).getId();

        final TranslationEntry translationEntryToUpdate = new TranslationEntry().fieldName("name").text("udated text");
        var body = new UpdateTranslationRequest()
                .id(id)
                .languageKey("csb")
                .translations(List.of(translationEntryToUpdate));

        ModelApiResponse response = $(api.updateTranslations(List.of(body)));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(1, response.getResults().size(), "Should contain updated entity");
        assertNotNull(response.getResults().get(0).getId(), "Created entity should has id");

        String updatedId = response.getResults().get(0).getId();

        Thread.sleep(10000);
        List<String> ids = List.of(updatedId);
        Integer limit = 1;
        Integer skip = 0;
        var updated = $(api.getTranslations( ids, limit, skip));

        assertNotNull(updated);
        assertNotNull(updated.getResults());
        assertNotNull(updated.getErrors());
        assertTrue(updated.getErrors().isEmpty(), "Should have no errors");
        assertEquals(limit, updated.getResults().size(), "Should has single result");

        var translation = updated.getResults().get(0);
        assertEquals(updatedId, translation.getId(), "Found id should be equal to requested");
        assertEquals(translationEntryToUpdate.getText(), translation.getTranslations().get(0).getText(), "Found name should be equal to provided for update");
        assertEquals(request.getEntityId(), translation.getEntityId(), "Found source should be equal to provided for update");
        assertEquals(request.getEntityType(), translation.getEntityType(), "Found sourceLanguage should be equal to created previously");

        idsToDelete.add(id);
    }

    @Test
     void getTranslationsReturnOkTest() throws ApiException, InterruptedException {
        final String id = loadData.createTestData(languageId,languageKey,entityId,entityType);
        final var limit = 1;
        final var skip = 0;

        Thread.sleep(10000);

        final var response = $(api.getTranslations(List.of("vRVM2X4BHzwJ66Hch7Us"),limit,skip));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertTrue(response.getErrors().isEmpty(), "Should have no errors");
        assertEquals(limit, response.getResults().size(), "Should has single result");

    }

    @Test
     void getTranslationsByEntityIdReturnOkTest() throws ApiException, InterruptedException {
         loadData.createTestData(languageId,languageKey,entityId,entityType);
        final var limit = 1;
        final var skip = 0;

        Thread.sleep(10000);
        //Put the id of an existing translation
        final var response = $(api.getTranslationsByEntityId(List.of(entityId),limit,skip));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertTrue(response.getErrors().isEmpty(), "Should have no errors");
        assertEquals(limit, response.getResults().size(), "Should has single result");

    }

    @Test
     void getTranslationsByQueryWithSingleIdReturnOkTest() throws ApiException, InterruptedException {
        final String id = loadData.createTestData(languageId,languageKey,entityId,entityType);

        Thread.sleep(10000);

        final var givenQuery = new QueryRequest()
                .addShouldItem(new QueryMultiple().queryField("id").queryValues(List.of(id)))
                .shouldMatch(1);

        final var response = $(api.getTranslationsByQuery( givenQuery));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(1, response.getResults().size(), "Results should contain entry");
        assertEquals(0, response.getErrors().size(), "Errors should be empty");

        idsToDelete.add(id);
    }



}
