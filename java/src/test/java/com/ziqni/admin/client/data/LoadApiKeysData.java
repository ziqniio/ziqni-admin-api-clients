package com.ziqni.admin.client.data;

import com.ziqni.admin.client.ApiClientFactory;
import com.ziqni.admin.client.ApiException;
import com.ziqni.admin.client.api.ApiKeysApi;
import com.ziqni.admin.client.configuration.ApiRestClientFactory;
import com.ziqni.admin.client.model.*;
import com.ziqni.admin.client.model.CreateApiKeyRequest;
import com.ziqni.admin.client.model.ModelApiResponse;
import com.ziqni.admin.client.model.Role;
import tests.utils.CompleteableFutureTestWrapper;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class LoadApiKeysData implements CompleteableFutureTestWrapper {

    private ApiKeysApi api;

    private Role role = Role.WEB;
    private List<String> constraints = List.of("active", "default");

    public LoadApiKeysData() {
        this.api = ApiClientFactory.getApiKeysApi();
    }

    public CreateApiKeyRequest getCreateRequest() {
        return new CreateApiKeyRequest()
                .description("Test description")
                .role(role)
                .whiteListIPs(List.of("127.0.0.1"   ))
                .addConstraints(constraints)
                .metadata(new LoadMetadata().getMetadataAsList())
                ;
    }

    public List<CreateApiKeyRequest> getCreateRequestAsList(int numberOfItems) {
        return IntStream.range(0, numberOfItems)
                .mapToObj(i -> getCreateRequest())
                .collect(Collectors.toList());
    }

    public List<CreateApiKeyRequest> getCreateRequestAsList(CreateApiKeyRequest request) {
        return List.of(request);
    }

    public ModelApiResponse createTestData(CreateApiKeyRequest request) throws ApiException {
        var response = $(api.createApiKeys(request));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(1, response.getResults().size(), "Should contain created entity");
        assertNotNull(response.getResults().get(0).getId(), "Created entity should has id");

        return response;
    }


    public void deleteTestData(List<String> idsToDelete) throws ApiException {
        var responseList = idsToDelete.stream().map(x -> {
            try {
                return api.deleteApiKeysById(x);
            } catch (ApiException e){
                throw new UndeclaredThrowableException(e);
            }}).collect(Collectors.toList());

        assertEquals(idsToDelete.size(), responseList.size(), "Failed to delete some custom fields");

    }

}

