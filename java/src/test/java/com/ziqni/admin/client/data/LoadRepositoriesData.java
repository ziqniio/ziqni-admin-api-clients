package com.ziqni.admin.client.data;

import com.ziqni.admin.client.ApiClientFactory;
import com.ziqni.admin.client.ApiException;
import com.ziqni.admin.client.api.FileRepositoriesApi;
import com.ziqni.admin.client.model.CreateRepositoryRequest;
import com.ziqni.admin.client.model.HostingOptions;
import com.ziqni.admin.client.model.ModelApiResponse;
import tests.utils.CompleteableFutureTestWrapper;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class LoadRepositoriesData implements CompleteableFutureTestWrapper {

    private FileRepositoriesApi api;

    public LoadRepositoriesData() {
        this.api = ApiClientFactory.getFileRepositoriesApi();
    }

    public CreateRepositoryRequest getCreateRequest() {
        List<String> constraints = List.of("public", "system");
        String givenName = "Test_name-" + UUID.randomUUID().toString();
        HostingOptions givenHostingOption = new HostingOptions()
                .indexFileName("index_file_name")
                .errorFileName("error_file_name");

        return new CreateRepositoryRequest()
                .name(givenName)
                .description("Test Description")
                .hostingOptions(givenHostingOption)
                .constraints(constraints)
                .metadata(new LoadMetadata().getMetadataAsList());
    }

    public List<CreateRepositoryRequest> getCreateRequestAsList(int numberOfItems) {
        return IntStream.range(0, numberOfItems)
                .mapToObj(i -> getCreateRequest())
                .collect(Collectors.toList());
    }

    public List<CreateRepositoryRequest> getCreateRequestAsList(CreateRepositoryRequest request) {
        return List.of(request);
    }

    public ModelApiResponse createTestData(List<CreateRepositoryRequest> request) throws ApiException {
        var response = $(api.createFileRepositories(request));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(request.size(), response.getResults().size(), "Should contain created entity");
        assertNotNull(response.getResults().get(0).getId(), "Created entity should has id");

        return response;
    }


    public void deleteTestData(List<String> idsToDelete) throws ApiException {
        if(!idsToDelete.isEmpty()) {
            var response = $(api.deleteFileRepositories(idsToDelete,true));

            assertTrue(Objects.nonNull(response));
            assertEquals(idsToDelete.size(), response.getMeta().getResultCount(), "Failed to delete some unit of measure");
        }
    }

}

