package com.ziqni.admin.client.data;

import com.ziqni.admin.client.ApiClientFactory;
import com.ziqni.admin.client.ApiException;
import com.ziqni.admin.client.api.RewardsApi;
import com.ziqni.admin.client.configuration.ApiRestClientFactory;
import com.ziqni.admin.client.model.*;
import com.ziqni.admin.client.model.CreateEntityRewardRequest;
import com.ziqni.admin.client.model.ModelApiResponse;
import com.ziqni.admin.client.model.RewardEntityType;
import tests.utils.CompleteableFutureTestWrapper;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class LoadRewardsData implements CompleteableFutureTestWrapper {

    private RewardsApi api;

    public LoadRewardsData() {
        this.api = ApiClientFactory.getRewardsApi();
    }

    public CreateEntityRewardRequest getCreateRequest(String rewardTypeId, String entityId, String entityType) {
        final var givenName = "Test_name-" + UUID.randomUUID().toString();
        final var givenRewardRank = "1,2,3,4-10";
        final var givenRewardValue = new Random().nextDouble();
        final var constraints = new ArrayList<String>();
        constraints.add("memberAcknowledgmentRequired");

        return new CreateEntityRewardRequest()
                .name(givenName)
                .rewardRank(givenRewardRank)
                .rewardTypeId(rewardTypeId)
                .rewardValue(givenRewardValue)
                .constraints(constraints)
                .period(100)
                .entityType(RewardEntityType.fromValue(entityType))
                .icon("")
                .entityId(entityId)
                .description("Test_description")
                .metadata(new LoadMetadata().getMetadataAsList())
                .delay(100);
    }

    public List<CreateEntityRewardRequest> getCreateRequestAsList(int numberOfItems, String rewardTypeId, String entityId, String entityType) {
        return IntStream.range(0, numberOfItems)
                .mapToObj(i -> getCreateRequest(rewardTypeId, entityId, entityType))
                .collect(Collectors.toList());
    }

    public List<CreateEntityRewardRequest> getCreateRequestAsList(CreateEntityRewardRequest request) {
        return List.of(request);
    }

    public ModelApiResponse createTestData(List<CreateEntityRewardRequest> request) throws ApiException {
        var response = $(api.createRewards(request));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(request.size(), response.getResults().size(), "Should contain created entity");
        assertNotNull(response.getResults().get(0).getId(), "Created entity should has id");

        return response;
    }

    public ModelApiResponse createTestData(List<CreateEntityRewardRequest> request, Integer expected) throws ApiException {
        var response = $(api.createRewards(request));

        assertNotNull(response);
        assertNotNull(response.getResults());
        assertNotNull(response.getErrors());
        assertEquals(expected, response.getResults().size(), "Should contain created entity");
        assertNotNull(response.getResults().get(0).getId(), "Created entity should has id");

        return response;
    }


    public void deleteTestData(List<String> idsToDelete) throws ApiException {
        if(idsToDelete.size() > 0) {
            var response = $(api.deleteRewards(idsToDelete));

            assertTrue(Objects.nonNull(response));
            assertEquals(idsToDelete.size(), response.getMeta().getResultCount(), "Failed to delete some reward types");
        }

    }

}

