package com.ziqni.admin.client.data;

import com.ziqni.admin.client.ApiClientFactory;
import com.ziqni.admin.client.ApiException;
import com.ziqni.admin.client.api.UnitsOfMeasureApi;
import com.ziqni.admin.client.configuration.ApiRestClientFactory;
import com.ziqni.admin.client.model.*;
import com.ziqni.admin.client.model.CreateUnitOfMeasureRequest;
import com.ziqni.admin.client.model.ModelApiResponse;
import com.ziqni.admin.client.model.UnitOfMeasureType;
import tests.utils.CompleteableFutureTestWrapper;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class LoadUnitsOfMeasureData implements CompleteableFutureTestWrapper {

    private UnitsOfMeasureApi api;

    public LoadUnitsOfMeasureData() {
        this.api = ApiClientFactory.getUnitsOfMeasureApi();
    }

    public CreateUnitOfMeasureRequest getCreateRequest() {

        final String givenName = "Test_name-" + UUID.randomUUID();
        final String givenKey = "Test_key-" + UUID.randomUUID();
        final Double givenMultiplier = new Random().nextDouble();

        return new CreateUnitOfMeasureRequest()
                .name(givenName)
                .metadata(Map.of("Competition","Labs"))
                .key(givenKey)
                .description("Test description")
                .unitOfMeasureType(UnitOfMeasureType.OTHER)
                .multiplier(givenMultiplier);
    }

    public List<CreateUnitOfMeasureRequest> getCreateRequestAsList(int numberOfItems) {
        return IntStream.range(0, numberOfItems)
                .mapToObj(i -> getCreateRequest())
                .collect(Collectors.toList());
    }

    public List<CreateUnitOfMeasureRequest> getCreateRequestAsList(CreateUnitOfMeasureRequest request) {
        return List.of(request);
    }

    public ModelApiResponse createTestData(List<CreateUnitOfMeasureRequest> request) throws ApiException {
        var response = $(api.createUnitsOfMeasure(request));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(request.size(), response.getResults().size(), "Should contain created entity");
        assertNotNull(response.getResults().get(0).getId(), "Created entity should has id");

        return response;
    }


    public void deleteTestData(List<String> idsToDelete) throws ApiException {
        if(!idsToDelete.isEmpty()) {
            var response = $(api.deleteUnitsOfMeasure(idsToDelete));

            assertTrue(Objects.nonNull(response));
            assertEquals(idsToDelete.size(), response.getMeta().getResultCount(), "Failed to delete some unit of measure");
        }
    }

}

