package com.ziqni.admin.client.data;

import com.ziqni.admin.client.ApiClientFactory;
import com.ziqni.admin.client.ApiException;
import com.ziqni.admin.client.api.CollaboratorsApi;
import com.ziqni.admin.client.configuration.ApiRestClientFactory;
import com.ziqni.admin.client.model.CreateCollaboratorRequest;
import com.ziqni.admin.client.model.ModelApiResponse;
import com.ziqni.admin.client.model.CreateCollaboratorRequest;
import com.ziqni.admin.client.model.ModelApiResponse;
import tests.utils.CompleteableFutureTestWrapper;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class LoadCollaboratorsData implements CompleteableFutureTestWrapper {

    private CollaboratorsApi api;

    public LoadCollaboratorsData() {
        this.api = ApiClientFactory.getCollaboratorsApi();
    }

    public CreateCollaboratorRequest getCreateRequest() {

        return new CreateCollaboratorRequest()
                .addAddRolesItem("AdminConsumer")
                .addAddRolesItem("AdminEvents");
    }

    public List<CreateCollaboratorRequest> getCreateRequestAsList(int numberOfItems) {
        return IntStream.range(0, numberOfItems)
                .mapToObj(i -> getCreateRequest())
                .collect(Collectors.toList());
    }

    public List<CreateCollaboratorRequest> getCreateRequestAsList(CreateCollaboratorRequest request) {
        return List.of(request);
    }

    public ModelApiResponse createTestData(CreateCollaboratorRequest request) throws ApiException {
        var response = api.createCollaborators(List.of(request)).join();

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(1, response.getResults().size(), "Should contain created entity");
        assertNotNull(response.getResults().get(0).getExternalReference(), "Created entity should has id");

        return response;
    }


    public void deleteTestData(List<String> emailsToDelete) throws ApiException {

        final var modelApiResponse = $(api.deleteCollaborators(emailsToDelete));

        assertTrue(Objects.nonNull(modelApiResponse));
       assertEquals(emailsToDelete.size(), modelApiResponse.getMeta().getResultCount(), "Failed to delete some collaborators");

    }

}

