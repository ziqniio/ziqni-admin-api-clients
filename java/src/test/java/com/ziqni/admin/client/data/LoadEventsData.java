package com.ziqni.admin.client.data;

import com.ziqni.admin.client.ApiClientFactory;
import com.ziqni.admin.client.ApiException;
import com.ziqni.admin.client.api.EventsApi;
import com.ziqni.admin.client.model.CreateEventRequest;
import com.ziqni.admin.client.model.ModelApiResponse;

import com.ziqni.admin.client.model.CreateEventRequest;
import com.ziqni.admin.client.model.ModelApiResponse;
import com.ziqni.admin.client.util.DateUtil;
import tests.utils.CompleteableFutureTestWrapper;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class LoadEventsData implements CompleteableFutureTestWrapper {

    private EventsApi api;

    public LoadEventsData() {
        this.api = ApiClientFactory.getEventsApi();
    }

    public Map<String, Object> getEventsMetada() {
        return Map.ofEntries(
                Map.entry("key1", "value"),
                Map.entry("key2", Arrays.asList("value2", "value3")),
                Map.entry("key3", Arrays.asList(1.0, 2.0)),
                Map.entry("key4", 1L)
        );
    }

    public CreateEventRequest getCreateRequest(String action, String memberRefId, String entityRefId) {

        String refId = "Test_key-" + UUID.randomUUID();

        return new CreateEventRequest()
                .action(action)
                .batchId(refId)
                .entityRefId(entityRefId)
                .memberRefId(memberRefId)
                .sourceValue(1.0)
                .transactionTimestamp(DateUtil.now())
                ;
    }

    public List<CreateEventRequest> getCreateRequestAsList(int numberOfItems, String action, String memberRefId, String entityRefId) {
        return IntStream.range(0, numberOfItems)
                .mapToObj(i -> getCreateRequest(action, memberRefId, entityRefId))
                .collect(Collectors.toList());
    }

    public List<CreateEventRequest> getCreateRequestAsList(CreateEventRequest request) {
        return List.of(request);
    }

    public ModelApiResponse createTestData(List<CreateEventRequest> requestList) throws ApiException {
        var response = $(api.createEvents(requestList));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(requestList.size(), response.getResults().size(), "Should contain created entity");
        assertNotNull(response.getResults().get(0).getId(), "Created entity should has id");

        return response;
    }

    //Events do not have delete endpoint

}

