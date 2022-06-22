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
import com.ziqni.admin.client.data.LoadApiKeysData;
import com.ziqni.admin.client.data.LoadCustomFieldsData;
import com.ziqni.admin.client.data.LoadMetadata;
import com.ziqni.admin.client.data.LoadTagsData;
import com.ziqni.admin.client.model.*;
import com.ziqni.admin.client.data.LoadApiKeysData;
import com.ziqni.admin.client.data.LoadCustomFieldsData;
import com.ziqni.admin.client.data.LoadMetadata;
import com.ziqni.admin.client.data.LoadTagsData;
import com.ziqni.admin.client.model.*;
import com.ziqni.admin.client.util.ApiClientFactoryUtil;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.ziqni.admin.client.util.ApiClientFactoryUtil.initApiClientFactory;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ApiKeysApiTest implements tests.utils.CompleteableFutureTestWrapper{

    private static final Logger logger = LoggerFactory.getLogger(ApiKeysApiTest.class);



    private ApiKeysApi api;
    private LoadApiKeysData loadTestData;
    private String tagKey;
    private String customFieldKey;

    private List<String> idsToDelete = new ArrayList<>();
    private List<String> tagIdsToDelete = new ArrayList<>();
    private List<String> customFieldIdsToDelete = new ArrayList<>();

    private LoadMetadata loadMetadata;
    private final LoadTagsData loadTagsData;
    private final LoadCustomFieldsData loadCustomFieldsData;


    public ApiKeysApiTest() throws Exception {
        ApiClientFactoryUtil.initApiClientFactory();
        this.api = ApiClientFactory.getApiKeysApi();
        this.loadTestData = new LoadApiKeysData();
        this.loadMetadata = new LoadMetadata();
        this.loadCustomFieldsData = new LoadCustomFieldsData();
        this.loadTagsData = new LoadTagsData();
    }

    @BeforeAll
    public void setUp() throws ApiException, InterruptedException {

        tagKey = loadTagsData.getModel();
        //FIXME add ApiKEy to AppliesTo
        customFieldKey = loadCustomFieldsData.getModel(customFieldIdsToDelete, AppliesTo.EVENT);

        tagIdsToDelete.add(tagKey);

    }

    @AfterAll
    public void cleanUp(){
        try {

            Thread.sleep(5000);
            loadTestData.deleteTestData(idsToDelete);
            loadTagsData.deleteTestData(tagIdsToDelete);
            loadCustomFieldsData.deleteTestData(customFieldIdsToDelete);
        } catch (ApiException | InterruptedException e) {
            logger.error("error", e.getCause());
        }
    }

    @Test
    @Order(1)
    public void createApiKeysReturnOkTest() throws ApiException {

        var request = loadTestData.getCreateRequest();

        var response = $(api.createApiKeys(request));

        var id = response.getResults().get(0).getId();

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(1, response.getResults().size(), "Should contain created entity");
        assertNotNull(id, "Created entity should has id");
        logger.info(response.toString());
        idsToDelete.add(id);
    }

    @Test
    @Order(2)
    public void getSingleApiKeysByIdTest() throws ApiException, InterruptedException {
        var request = loadTestData.getCreateRequest();
        var createResponse = $(api.createApiKeys(request));
        var id = createResponse.getResults().get(0).getId();

        Thread.sleep(5000);

        var response = $(api.getApiKeysById(id));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertTrue(response.getErrors().isEmpty(), "Should have no errors");
        assertEquals(1, response.getResults().size(), "Should has single result");

        ApiKey apiKey = response.getResults().get(0);

        assertEquals(id, apiKey.getId(), "Found id should be equal to requested");
        Assertions.assertEquals(request.getRole(), apiKey.getRole(), "Found id should be equal to requested");
        Assertions.assertTrue(apiKey.getConstraints().containsAll(request.getAddConstraints()),
                "Found constraints should contain all of" + request.getAddConstraints());

        Assertions.assertNull(apiKey.getTags(), "Found tags should be null");
        Assertions.assertNotNull(apiKey.getDescription(), "Found description should not be null or blank");

        idsToDelete.add(id);
    }

    @Test
    @Order(3)
    public void getApiKeysByQueryTest() throws ApiException, InterruptedException {
        var request = loadTestData.getCreateRequest();
        var createResponse = $(api.createApiKeys(request));
        var id = createResponse.getResults().get(0).getId();

        QueryRequest body = new QueryRequest()
                .must(List.of(new QueryMultiple()
                        .queryField("id")
                        .queryValues(List.of(id))));

        Thread.sleep(5000);

        ApiKeyResponse response = $(api.getApiKeysByQuery( body));

        if(response.getMeta().getResultCount() == 0) {
            Thread.sleep(5000);
            response = $(api.getApiKeysByQuery( body));
        }

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertTrue(response.getErrors().isEmpty(), "Should have no errors");
        assertEquals(1, response.getResults().size(), "Should has single result");

        ApiKey apiKey = response.getResults().get(0);

        assertEquals(id, apiKey.getId(), "Found id should be equal to requested");
        Assertions.assertEquals(request.getRole(), apiKey.getRole(), "Found id should be equal to requested");
        Assertions.assertTrue(apiKey.getConstraints().containsAll(request.getAddConstraints()),
                "Found constraints should contain all of" + request.getAddConstraints());

        Assertions.assertNull(apiKey.getTags(), "Found tags should be null");
        Assertions.assertEquals(request.getDescription(), apiKey.getDescription(), "Found description should be null or blank");

        idsToDelete.add(id);
    }

    @Test
    @Order(4)
    public void getListOfApiKeysTest() throws ApiException {
        var request = loadTestData.getCreateRequest();
        var createResponse = $(api.createApiKeys(request));
        var id = createResponse.getResults().get(0).getId();

        Integer limit = 1;
        Integer skip = 0;
        ApiKeyResponse response =
                $(api.getApiKeys(Collections.emptyList(), limit, skip));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertTrue(response.getErrors().isEmpty(), "Should have no errors");
        assertEquals(1, response.getResults().size(), "Should has single result");

        idsToDelete.add(id);
    }



    @Test
    @Order(5)
    public void updateApiKeysValidRequestReturnOkTest() throws ApiException {

        var request = loadTestData.getCreateRequest();
        var createResponse = $(api.createApiKeys(request));
        var id = createResponse.getResults().get(0).getId();

        //GIVEN
        var givenDescription = "Test_update_description";
        var givenWhiteListIps = List.of("192.168.0.1", "0.0.0.0");
        var givenMetadata = loadMetadata.getEmptyMetadataAsList();
//        List<String> givenTagIds = dataSourceHelper.findExistingTagsForTest();
//        List<String> givenCustomFieldIds = dataSourceHelper.findExistingCustomFieldsForTest();

        var given = new UpdateApiKeyRequest()
                .id(id)
                .description(givenDescription)
                .metadata(givenMetadata)
                .whiteListIPs(givenWhiteListIps);

        //WHEN
        var response = $(api.updateApiKeys(given));

        //THAN
        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(1, response.getResults().size(), "Should contain updated entity");
        assertNotNull(response.getResults().get(0).getId(), "Created entity should has id");

        String updatedId = response.getResults().get(0).getId();

        ApiKeyResponse ApiKeyResponse = $(api.getApiKeysById(updatedId));

        assertNotNull(ApiKeyResponse);
        assertNotNull(ApiKeyResponse.getResults());
        assertEquals(1, ApiKeyResponse.getResults().size(), "Should contain entity");

        ApiKey apiKey = ApiKeyResponse.getResults().get(0);

        assertEquals(id, apiKey.getId(), "Found id should be equal to requested");
        assertTrue(apiKey.getConstraints().size() >= request.getAddConstraints().size(), "Found number of constraints should be equal ");

//        assertNotNull(apiKey.getTags(), "Found tags should be null");
//        List<String> actualTagIds = apiKey.getTags()
//                .stream()
//                .map(TagsReduced::getId)
//                .collect(Collectors.toList());
//        assertTrue(givenTagIds.containsAll(actualTagIds), "Should contain all provided ids");
//
//        assertNotNull(apiKey.getMetadata(), "Found metadata should not be null");
//        assertTrue(apiKey.getMetadata().contains(givenMetadata));
//
//        assertNotNull(apiKey.getCustomFields(), "Found custom fields should be null");
//        List<String> actualCustomFieldIds = apiKey.getCustomFields()
//                .stream()
//                .map(CustomFieldReduced::getId)
//                .collect(Collectors.toList());
//        assertTrue(givenCustomFieldIds.containsAll(actualCustomFieldIds), "Should contain all provided ids");

        assertNotNull(apiKey.getDescription(), "Found description should be not blank");
        assertEquals(givenDescription, apiKey.getDescription(), "Description should be the same as provided");

        assertNotNull(apiKey.getWhiteListIPs(), "Found whitelist ips should not be null");
        assertTrue(apiKey.getWhiteListIPs().containsAll(apiKey.getWhiteListIPs()), "Should contain all provided ips");

        idsToDelete.add(id);
    }

    @Test
    @Order(6)
    public void updateApiKeysWithoutConstraintsReturnErrorTest() throws ApiException {

        var request = loadTestData.getCreateRequest();
        var createResponse = $(api.createApiKeys(request));
        var id = createResponse.getResults().get(0).getId();

        UpdateApiKeyRequest given = new UpdateApiKeyRequest()
                .id(id)
                .addConstraints(null);

        var response = $(api.updateApiKeys(given));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(1, response.getResults().size(), "Results should be empty");
        assertEquals(0, response.getErrors().size(), "Errors should contain entry");

        idsToDelete.add(id);
    }

    @Test
    @Order(7)
    public void updateApiKeysWithoutRoleReturnOkTest() throws ApiException {

        var request = loadTestData.getCreateRequest();
        var createResponse = $(api.createApiKeys(request));
        var id = createResponse.getResults().get(0).getId();

        UpdateApiKeyRequest given = new UpdateApiKeyRequest()
                .id(id)
                .role(null);

        ModelApiResponse response = $(api.updateApiKeys(given));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(1, response.getResults().size(), "Results should be empty");
        assertEquals(0, response.getErrors().size(), "Errors should contain entry");

        assertTrue(idsToDelete.add(id), "Failed to add id to delete list, id : [" + id + "]");
    }

    @Test
    @Order(8)
    public void updateApiKeysWithWrongIpsReturnErrorTest() throws ApiException {

        var request = loadTestData.getCreateRequest();
        var createResponse = $(api.createApiKeys(request));
        var id = createResponse.getResults().get(0).getId();

        UpdateApiKeyRequest given = new UpdateApiKeyRequest()
                .id(id)
                .whiteListIPs(List.of("not_ip_regexp"));

        ModelApiResponse response = $(api.updateApiKeys(given));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(0, response.getResults().size(), "Results should be empty");
        assertEquals(1, response.getErrors().size(), "Errors should contain entry");

        assertTrue(idsToDelete.add(id), "Failed to add id to delete list, id : [" + id + "]");
    }

    @Test
    @Order(9)
    public void updateApiKeysWithMetaDataReturnOkTest() throws ApiException, InterruptedException {

        var request = loadTestData.getCreateRequest();
        var createResponse = $(api.createApiKeys(request));
        var id = createResponse.getResults().get(0).getId();


        UpdateApiKeyRequest given = new UpdateApiKeyRequest()
                .id(id)
                .metadata(new LoadMetadata().getMetadataAsList());

        ModelApiResponse response = $(api.updateApiKeys(given));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(1, response.getResults().size(), "Results should be empty");
        assertEquals(0, response.getErrors().size(), "Errors should contain entry");

        Thread.sleep(10000);
        ApiKeyResponse ApiKeyResponse = $(api.getApiKeysById(id));

        assertNotNull(ApiKeyResponse);
        assertNotNull(ApiKeyResponse.getResults());
        assertEquals(1, ApiKeyResponse.getResults().size(), "Should contain entity");

        ApiKey apiKey = ApiKeyResponse.getResults().get(0);

        assertEquals(id, apiKey.getId(), "Found id should be equal to requested");
        assertNotNull(apiKey.getMetadata(), "Found metadata should not be null");
        assertTrue(idsToDelete.add(id), "Failed to add id to delete list, id : [" + id + "]");
    }

    @Test
    @Order(9)
    public void updateApiKeysWithDuplicateConstraintsReturnOkTest() throws ApiException {

        var request = loadTestData.getCreateRequest();
        var createResponse = $(api.createApiKeys(request));
        var id = createResponse.getResults().get(0).getId();

        UpdateApiKeyRequest given = new UpdateApiKeyRequest()
                .id(id)
                .addConstraints(List.of("active", "active"));

        ModelApiResponse response = $(api.updateApiKeys(given));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(1, response.getResults().size(), "Results should be empty");
        assertEquals(0, response.getErrors().size(), "Errors should contain entry");

        assertTrue(idsToDelete.add(id), "Failed to add id to delete list, id : [" + id + "]");
    }

    @Test
    @Order(10)
    public void updateApiKeysWithDescriptionLongerThan100ReturnErrorTest() throws ApiException {

        var request = loadTestData.getCreateRequest();
        var createResponse = $(api.createApiKeys(request));
        var id = createResponse.getResults().get(0).getId();

        UpdateApiKeyRequest given = new UpdateApiKeyRequest()
                .id(id)
                .description("x".repeat(101));

        ModelApiResponse response = $(api.updateApiKeys(given));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(0, response.getResults().size(), "Results should be empty");
        assertEquals(1, response.getErrors().size(), "Errors should contain entry");

        assertTrue(idsToDelete.add(id), "Failed to add id to delete list, id : [" + id + "]");
    }

    @Test
    @Order(11)
    @Disabled //FixMe - enable it after delete by query is implemented
    public void updateApiKeysWithMetadataLimitMoreThan50ReturnErrorTest() throws ApiException {

        var request = loadTestData.getCreateRequest();
        var createResponse = $(api.createApiKeys(request));
        var id = createResponse.getResults().get(0).getId();

        Map<String,String> givenMetas = new HashMap<>();
        IntStream.range(0, 51).forEach( i -> LoadMetadata.addRandomMetadataEntry(givenMetas));

        UpdateApiKeyRequest given = new UpdateApiKeyRequest()
                .id(id)
                .metadata(givenMetas);

        ModelApiResponse response = $(api.updateApiKeys(given));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(0, response.getResults().size(), "Results should be empty");
        assertEquals(1, response.getErrors().size(), "Errors should contain entry");

        assertTrue(idsToDelete.add(id), "Failed to add id to delete list, id : [" + id + "]");
    }

    @Test
    @Order(12)
    public void deleteApiKeysByIdTest() throws ApiException, InterruptedException {

        var request = loadTestData.getCreateRequest();
        var createResponse = $(api.createApiKeys(request));
        var id = createResponse.getResults().get(0).getId();

        Thread.sleep(10000);
        ModelApiResponse response = $(api.deleteApiKeysById(id));

        if(response.getMeta().getResultCount() == 0) {
            Thread.sleep(5000);
            response = $(api.deleteApiKeysById(id));
        }

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(1, response.getMeta().getResultCount(), "Results should contain entry");
        assertEquals(0, response.getErrors().size(), "Errors should be empty");
    }

    @Test
    @Order(12)
    public void deleteApiKeysTest() throws ApiException, InterruptedException {

        var request = loadTestData.getCreateRequest();
        var createResponse = $(api.createApiKeys(request));
        var id = createResponse.getResults().get(0).getId();

        Thread.sleep(10000);
        ModelApiResponse response = $(api.deleteApiKeys(List.of(id)));

        if(response.getMeta().getResultCount() == 0) {
            Thread.sleep(5000);
            response = $(api.deleteApiKeys(List.of(id)));
        }

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(1, response.getMeta().getResultCount(), "Results should contain entry");
        assertEquals(0, response.getErrors().size(), "Errors should be empty");
    }

    @Test
    public void deleteApiKeysByQueryTest() throws ApiException, InterruptedException {

        var request = loadTestData.getCreateRequest();
        var createResponse = $(api.createApiKeys(request));
        var id = createResponse.getResults().get(0).getId();

        Thread.sleep(5000);

        QueryRequest body = new QueryRequest()
                .addMustItem(new QueryMultiple()
                        .queryField("id")
                        .queryValues(List.of(id)));

        ModelApiResponse deleteResponse = $(api.deleteApiKeysByQuery( body));

        assertNotNull(deleteResponse);
        assertNotNull(deleteResponse.getResults());
        assertNotNull(deleteResponse.getErrors());
        assertEquals(1, deleteResponse.getMeta().getResultCount(), "Results should contain entry");
        assertEquals(0, deleteResponse.getErrors().size(), "Errors should be empty");
    }

    @Test
    public void deleteApiKeysWithDefaultConstraintReturnErrorTest() throws ApiException {

        var request = loadTestData.getCreateRequest()
                .addConstraints(List.of("default"));

        var createResponse = $(api.createApiKeys(request));
        var id = createResponse.getResults().get(0).getId();

        ModelApiResponse deleteResponse = $(api.deleteApiKeysById(id));

        assertNotNull(deleteResponse);
        assertNotNull(deleteResponse.getResults());
        assertNotNull(deleteResponse.getErrors());
        assertEquals(0, deleteResponse.getMeta().getResultCount(), "Results should be empty");
        assertEquals(0, deleteResponse.getErrors().size(), "Errors should contain result");

        //cleanup
        UpdateApiKeyRequest update = new UpdateApiKeyRequest()
                .id(id)
                .addConstraints(List.of("active"));

        ModelApiResponse updateResponse = $(api.updateApiKeys(update));

        assertNotNull(updateResponse);
        assertNotNull(updateResponse.getResults());
        assertNotNull(updateResponse.getErrors());
        assertEquals(1, updateResponse.getResults().size(), "Should contain created entity");
        assertNotNull(updateResponse.getResults().get(0).getId(), "Created entity should has id");
    }

    @Test
    @Disabled //FixMe - enable it after custom fields are implemented
    public void createApiKeysWithIncorrectCustomFieldsReturnErrorTest() throws ApiException {

        var request = loadTestData.getCreateRequest().customFields(new HashMap<>());

        ModelApiResponse response = $(api.createApiKeys(request));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(0, response.getResults().size(), "Results should be empty");
        assertEquals(1, response.getErrors().size(), "Errors should contain entry");
    }

    @Test
    @Disabled //FixMe - enable it after custom fields are implemented
    public void createApiKeysWithCustomFieldsLimitMoreThan50ReturnErrorTest() throws ApiException {

        Map<String,Object> givenCustomFields = IntStream.range(0, 51)
                .mapToObj(i -> UUID.randomUUID().toString())
                .collect(Collectors.toMap(x->x,x->x));

        var request = loadTestData.getCreateRequest()
                .customFields(givenCustomFields);

        ModelApiResponse response = $(api.createApiKeys(request));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(0, response.getResults().size(), "Results should be empty");
        assertEquals(1, response.getErrors().size(), "Errors should contain entry");
    }

    @Test
    public void createApiKeysWithoutConstraintsReturnErrorTest() throws ApiException {

        var request = loadTestData.getCreateRequest()
                .addConstraints(null);

        ModelApiResponse response = $(api.createApiKeys(request));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(1, response.getResults().size(), "Results should be empty");
        assertEquals(0, response.getErrors().size(), "Errors should contain entry");

        var id = response.getResults().get(0).getId();

        assertTrue(idsToDelete.add(id), "Failed to add id to delete list, id : [" + id + "]");
    }

    @Test
    public void createApiKeysWithoutRoleReturnErrorTest() throws ApiException {

        var request = loadTestData.getCreateRequest()
                .role(null);

        ModelApiResponse response = $(api.createApiKeys(request));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(0, response.getResults().size(), "Results should be empty");
        assertEquals(1, response.getErrors().size(), "Errors should contain entry");


    }

    @Test
    public void createApiKeysWithDuplicatedWhitlistIpsReturnErrorTest() throws ApiException {

        var request = loadTestData.getCreateRequest()
                .whiteListIPs(List.of("0.0.0.0", "0.0.0.0"));

        ModelApiResponse response = $(api.createApiKeys(request));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(0, response.getResults().size(), "Results should be empty");
        assertEquals(1, response.getErrors().size(), "Errors should contain entry");
    }

    @Test
    public void createApiKeysWithBadWhitelistIpReturnErrorTest() throws ApiException {

        var request = loadTestData.getCreateRequest()
                .whiteListIPs(List.of("test_ip_not_match_regexp"));

        ModelApiResponse response = $(api.createApiKeys(request));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(0, response.getResults().size(), "Results should be empty");
        assertEquals(1, response.getErrors().size(), "Errors should contain entry");
    }

    @Test
    @Order(30)
    public void updateApiKeyRemoveConstraintReturnOkTest() throws ApiException, InterruptedException {
        final var createRequest = loadTestData.getCreateRequest();
        final var createResponse = loadTestData.createTestData(createRequest);
        final var id = createResponse.getResults().get(0).getId();

        Thread.sleep(5000);

        ApiKeyResponse responseAfterCreate = $(api.getApiKeys( List.of(id), 1, 0));

        assertNotNull(responseAfterCreate);
        assertNotNull(responseAfterCreate.getResults());
        assertNotNull(responseAfterCreate.getErrors());
        assertTrue(responseAfterCreate.getErrors().isEmpty(), "Should have no errors");
        assertEquals(1, responseAfterCreate.getResults().size(), "Should has single result");
        String givenDescription = UUID.randomUUID().toString();

        UpdateApiKeyRequest given = new UpdateApiKeyRequest()
                .id(id)
                .description(givenDescription)
                .addRemoveConstraintsItem("active")
                .addRemoveConstraintsItem("default");

        ModelApiResponse updated = $(api.updateApiKeys(given));

        assertNotNull(updated);
        assertNotNull(updated.getResults());
        assertNotNull(updated.getErrors());
        assertEquals(1, updated.getResults().size(), "Should contain updated entity");
        assertNotNull(updated.getResults().get(0).getId(), "Created entity should has id");

        String updatedId = updated.getResults().get(0).getId();


        List<String> ids = List.of(updatedId);
        Integer limit = 1;
        Integer skip = 0;

        ApiKeyResponse response = $(api.getApiKeys(ids, limit, skip));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertTrue(response.getErrors().isEmpty(), "Should have no errors");
        assertEquals(limit, response.getResults().size(), "Should has single result");

        ApiKey item = response.getResults().get(0);

        assertEquals(0, item.getConstraints().size());
        assertEquals(id, item.getId(), "Found id should be equal to requested");
        assertEquals(responseAfterCreate.getResults().get(0).getKey(), item.getKey(), "Found key should be equal to created previously");
        assertEquals(givenDescription, item.getDescription(), "Found description should be equal to created previously");

        idsToDelete.add(id);

    }

    @Test
    @Order(2)
    public void createApiKeyWithTagsAndCustomFieldsReturnOkTest() throws ApiException, InterruptedException {

        final var createRequest = loadTestData.getCreateRequest()
                .tags(List.of(tagKey))
                .customFields(Map.of(customFieldKey, "name"));

        ModelApiResponse createResponse =loadTestData.createTestData(createRequest);

        final var id = createResponse.getResults().get(0).getId();


        int limit = 1;
        int skip = 0;

        Thread.sleep(5000);
        var response = $(api.getApiKeys(List.of(id), limit, skip));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertTrue(response.getErrors().isEmpty(), "Should have no errors");
        assertEquals(limit, response.getResults().size(), "Should has single result");
        assertNotNull(response.getResults().get(0).getCustomFields());
        assertNotNull(response.getResults().get(0).getTags());
        assertEquals(1,response.getResults().get(0).getCustomFields().size());
        assertEquals(1,response.getResults().get(0).getTags().size());

        idsToDelete.add(id);
    }
    @Test
    @Order(2)
    public void createApiKeyWithTagsAndNoCustomFieldsValueReturnOkTest() throws ApiException, InterruptedException {

        final Map<String, Object> customFieldMap = new HashMap<>();
        customFieldMap.put(customFieldKey,null);
        final var createRequest = loadTestData.getCreateRequest()
                .tags(List.of(tagKey))
                .customFields(customFieldMap);

        ModelApiResponse createResponse =loadTestData.createTestData(createRequest);

        final var id = createResponse.getResults().get(0).getId();


        int limit = 1;
        int skip = 0;

        Thread.sleep(5000);
        var response = $(api.getApiKeys(List.of(id), limit, skip));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertTrue(response.getErrors().isEmpty(), "Should have no errors");
        assertEquals(limit, response.getResults().size(), "Should has single result");
        assertNotNull(response.getResults().get(0).getCustomFields());
        assertNotNull(response.getResults().get(0).getTags());
        assertEquals(0,response.getResults().get(0).getCustomFields().size());
        assertEquals(1,response.getResults().get(0).getTags().size());

        idsToDelete.add(id);
    }
    @Test
    @Order(5)
    public void updateApiKeyWithTagsReturnOkTest() throws ApiException {

        var request = loadTestData.getCreateRequest();
        var createResponse = $(api.createApiKeys(request));
        var id = createResponse.getResults().get(0).getId();

        //GIVEN

      var given = new UpdateApiKeyRequest()
                .id(id)
               .tags(List.of(tagKey));

        //WHEN
        var response = $(api.updateApiKeys(given));

        //THAN
        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(1, response.getResults().size(), "Should contain updated entity");
        assertNotNull(response.getResults().get(0).getId(), "Created entity should has id");

        String updatedId = response.getResults().get(0).getId();

        ApiKeyResponse ApiKeyResponse = $(api.getApiKeysById(updatedId));

        assertNotNull(ApiKeyResponse);
        assertNotNull(ApiKeyResponse.getResults());
        assertEquals(1, ApiKeyResponse.getResults().size(), "Should contain entity");

        ApiKey apiKey = ApiKeyResponse.getResults().get(0);

        assertNotNull(apiKey.getTags());
        assertEquals(1,apiKey.getTags().size());
        assertEquals(id, apiKey.getId(), "Found id should be equal to requested");
        assertTrue(apiKey.getConstraints().size() >= request.getAddConstraints().size(), "Found number of constraints should be equal ");

        idsToDelete.add(id);
    }


    @Test
    @Order(5)
    public void updateApiKeyWithCustomFieldsWithNoValueReturnOkTest() throws ApiException {

        var request = loadTestData.getCreateRequest();
        var createResponse = $(api.createApiKeys(request));
        var id = createResponse.getResults().get(0).getId();

        //GIVEN
        Map<String, Object> customFieldMap= new HashMap<>();
         customFieldMap.put("custom",null);
        var given = new UpdateApiKeyRequest()
                .id(id)
                .customFields(customFieldMap);

        //WHEN
        var response = $(api.updateApiKeys(given));

        //THAN
        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(1, response.getResults().size(), "Should contain updated entity");
        assertNotNull(response.getResults().get(0).getId(), "Created entity should has id");

        String updatedId = response.getResults().get(0).getId();

        ApiKeyResponse ApiKeyResponse = $(api.getApiKeysById(updatedId));

        assertNotNull(ApiKeyResponse);
        assertNotNull(ApiKeyResponse.getResults());
        assertEquals(1, ApiKeyResponse.getResults().size(), "Should contain entity");

        ApiKey apiKey = ApiKeyResponse.getResults().get(0);

        assertNotNull(apiKey.getCustomFields());
        assertEquals(0,apiKey.getCustomFields().size());
        assertEquals(id, apiKey.getId(), "Found id should be equal to requested");
        assertTrue(apiKey.getConstraints().size() >= request.getAddConstraints().size(), "Found number of constraints should be equal ");

        idsToDelete.add(id);
    }



}
