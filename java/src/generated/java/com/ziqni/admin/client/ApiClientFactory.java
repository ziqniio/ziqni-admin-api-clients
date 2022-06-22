package com.ziqni.admin.client;

import com.ziqni.admin.client.configuration.ApiRestClientFactory;
import com.ziqni.admin.client.configuration.AdminApiClientConfig;
import com.ziqni.admin.client.api.*;
import com.ziqni.admin.client.ws.WsAddress;
import java.time.Duration;
import com.ziqni.admin.client.notifications.SystemNotifications;
import java.util.concurrent.atomic.AtomicReference;
import com.ziqni.admin.client.notifications.model.SubscriptionResponse;
import com.ziqni.admin.client.notifications.model.SubscriptionTypes;
import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class ApiClientFactory {

    private static final Logger logger = LoggerFactory.getLogger(ApiClientFactory.class);

    private static StreamingClient streamingClient;
    private static Boolean initialised = false;
    private static AccountMessagesApi accountMessagesApi;
    private static AchievementsApi achievementsApi;
    private static ActionTypesApi actionTypesApi;
    private static ApiKeysApi apiKeysApi;
    private static AwardsApi awardsApi;
    private static CollaboratorsApi collaboratorsApi;
    private static CompetitionsApi competitionsApi;
    private static ComputeEngineApi computeEngineApi;
    private static ConsumersApi consumersApi;
    private static ContestsApi contestsApi;
    private static CustomFieldsApi customFieldsApi;
    private static DefaultApi defaultApi;
    private static EventsApi eventsApi;
    private static FileObjectsApi fileObjectsApi;
    private static FileRepositoriesApi fileRepositoriesApi;
    private static LanguagesApi languagesApi;
    private static MemberMessagesApi memberMessagesApi;
    private static MembersApi membersApi;
    private static NotificationsApi notificationsApi;
    private static ProductsApi productsApi;
    private static RewardTypesApi rewardTypesApi;
    private static RewardsApi rewardsApi;
    private static RulesApi rulesApi;
    private static SpacesApi spacesApi;
    private static TagsApi tagsApi;
    private static TransformersApi transformersApi;
    private static TranslationsApi translationsApi;
    private static UnitsOfMeasureApi unitsOfMeasureApi;
    private static UserApi userApi;
    private static WebhooksApi webhooksApi;
    

    public static void initialise() throws Exception {
        if(initialised) return;

        ApiClientFactory.initialised = true;

        if(AdminApiClientConfig.isWebsocket())
            streamingClient = new StreamingClient(new WsAddress().getAddress());

        logger.info("streaming client initialised [{}]", streamingClient.isConnected());
    }

    private static void init() {
        try {
            initialise();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Boolean getInitialised() {
        return initialised;
    }

    public static StreamingClient getStreamingClient() {
        assert getInitialised();
        return streamingClient;
    }

    private static final AtomicReference<SystemNotifications> systemNotificationsAtomicReference = new AtomicReference<>();
    public static void initSystemNotificationsApi(Consumer<SubscriptionResponse> onSubscriptionResponse, Consumer<SubscriptionTypes> onSubscriptionTypes) throws Exception {
        logger.info("Init sys notify, are websockets enabled [{}]", AdminApiClientConfig.isWebsocket());
        assert AdminApiClientConfig.isWebsocket();
        if(!ApiClientFactory.initialised)
            init();
        if(systemNotificationsAtomicReference.get() != null)
            throw new Exception("System notification already initialised");
        getStreamingClient().asyncWebSocketClient(ws -> {
            var s = new SystemNotifications(ws,onSubscriptionResponse,onSubscriptionTypes);
            systemNotificationsAtomicReference.set(s);
            logger.info("sys notify initialised [{}] and systemNotificationsAtomicReference update with [{}]", s.getSubscriptions().size(), systemNotificationsAtomicReference.get().toString());
        });

//        logger.info("sys notify initialised systemNotificationsAtomicReference is [{}]", systemNotificationsAtomicReference.get().toString());
    }

    public static SystemNotifications getSystemNotificationsApi(){
        assert AdminApiClientConfig.isWebsocket();
        logger.info("get sys notify systemNotificationsAtomicReference [{}]", systemNotificationsAtomicReference.get().toString());
        if(systemNotificationsAtomicReference.get() == null)
            throw new RuntimeException("System notification not initialised");
        return systemNotificationsAtomicReference.get();
    }

    public static boolean isSystemNotificationsApiInitialised() {
        return systemNotificationsAtomicReference.get() != null;
    }

     public static AccountMessagesApi getAccountMessagesApi() {
        if(ApiClientFactory.accountMessagesApi == null) {
            init();

            ApiClientFactory.accountMessagesApi = (AdminApiClientConfig.isWebsocket())
                    ? new AccountMessagesApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new AccountMessagesApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.accountMessagesApi;
    }

     public static AchievementsApi getAchievementsApi() {
        if(ApiClientFactory.achievementsApi == null) {
            init();

            ApiClientFactory.achievementsApi = (AdminApiClientConfig.isWebsocket())
                    ? new AchievementsApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new AchievementsApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.achievementsApi;
    }

     public static ActionTypesApi getActionTypesApi() {
        if(ApiClientFactory.actionTypesApi == null) {
            init();

            ApiClientFactory.actionTypesApi = (AdminApiClientConfig.isWebsocket())
                    ? new ActionTypesApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new ActionTypesApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.actionTypesApi;
    }

     public static ApiKeysApi getApiKeysApi() {
        if(ApiClientFactory.apiKeysApi == null) {
            init();

            ApiClientFactory.apiKeysApi = (AdminApiClientConfig.isWebsocket())
                    ? new ApiKeysApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new ApiKeysApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.apiKeysApi;
    }

     public static AwardsApi getAwardsApi() {
        if(ApiClientFactory.awardsApi == null) {
            init();

            ApiClientFactory.awardsApi = (AdminApiClientConfig.isWebsocket())
                    ? new AwardsApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new AwardsApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.awardsApi;
    }

     public static CollaboratorsApi getCollaboratorsApi() {
        if(ApiClientFactory.collaboratorsApi == null) {
            init();

            ApiClientFactory.collaboratorsApi = (AdminApiClientConfig.isWebsocket())
                    ? new CollaboratorsApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new CollaboratorsApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.collaboratorsApi;
    }

     public static CompetitionsApi getCompetitionsApi() {
        if(ApiClientFactory.competitionsApi == null) {
            init();

            ApiClientFactory.competitionsApi = (AdminApiClientConfig.isWebsocket())
                    ? new CompetitionsApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new CompetitionsApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.competitionsApi;
    }

     public static ComputeEngineApi getComputeEngineApi() {
        if(ApiClientFactory.computeEngineApi == null) {
            init();

            ApiClientFactory.computeEngineApi = (AdminApiClientConfig.isWebsocket())
                    ? new ComputeEngineApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new ComputeEngineApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.computeEngineApi;
    }

     public static ConsumersApi getConsumersApi() {
        if(ApiClientFactory.consumersApi == null) {
            init();

            ApiClientFactory.consumersApi = (AdminApiClientConfig.isWebsocket())
                    ? new ConsumersApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new ConsumersApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.consumersApi;
    }

     public static ContestsApi getContestsApi() {
        if(ApiClientFactory.contestsApi == null) {
            init();

            ApiClientFactory.contestsApi = (AdminApiClientConfig.isWebsocket())
                    ? new ContestsApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new ContestsApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.contestsApi;
    }

     public static CustomFieldsApi getCustomFieldsApi() {
        if(ApiClientFactory.customFieldsApi == null) {
            init();

            ApiClientFactory.customFieldsApi = (AdminApiClientConfig.isWebsocket())
                    ? new CustomFieldsApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new CustomFieldsApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.customFieldsApi;
    }

     public static DefaultApi getDefaultApi() {
        if(ApiClientFactory.defaultApi == null) {
            init();

            ApiClientFactory.defaultApi = (AdminApiClientConfig.isWebsocket())
                    ? new DefaultApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new DefaultApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.defaultApi;
    }

     public static EventsApi getEventsApi() {
        if(ApiClientFactory.eventsApi == null) {
            init();

            ApiClientFactory.eventsApi = (AdminApiClientConfig.isWebsocket())
                    ? new EventsApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new EventsApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.eventsApi;
    }

     public static FileObjectsApi getFileObjectsApi() {
        if(ApiClientFactory.fileObjectsApi == null) {
            init();

            ApiClientFactory.fileObjectsApi = (AdminApiClientConfig.isWebsocket())
                    ? new FileObjectsApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new FileObjectsApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.fileObjectsApi;
    }

     public static FileRepositoriesApi getFileRepositoriesApi() {
        if(ApiClientFactory.fileRepositoriesApi == null) {
            init();

            ApiClientFactory.fileRepositoriesApi = (AdminApiClientConfig.isWebsocket())
                    ? new FileRepositoriesApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new FileRepositoriesApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.fileRepositoriesApi;
    }

     public static LanguagesApi getLanguagesApi() {
        if(ApiClientFactory.languagesApi == null) {
            init();

            ApiClientFactory.languagesApi = (AdminApiClientConfig.isWebsocket())
                    ? new LanguagesApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new LanguagesApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.languagesApi;
    }

     public static MemberMessagesApi getMemberMessagesApi() {
        if(ApiClientFactory.memberMessagesApi == null) {
            init();

            ApiClientFactory.memberMessagesApi = (AdminApiClientConfig.isWebsocket())
                    ? new MemberMessagesApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new MemberMessagesApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.memberMessagesApi;
    }

     public static MembersApi getMembersApi() {
        if(ApiClientFactory.membersApi == null) {
            init();

            ApiClientFactory.membersApi = (AdminApiClientConfig.isWebsocket())
                    ? new MembersApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new MembersApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.membersApi;
    }

     public static NotificationsApi getNotificationsApi() {
        if(ApiClientFactory.notificationsApi == null) {
            init();

            ApiClientFactory.notificationsApi = (AdminApiClientConfig.isWebsocket())
                    ? new NotificationsApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new NotificationsApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.notificationsApi;
    }

     public static ProductsApi getProductsApi() {
        if(ApiClientFactory.productsApi == null) {
            init();

            ApiClientFactory.productsApi = (AdminApiClientConfig.isWebsocket())
                    ? new ProductsApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new ProductsApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.productsApi;
    }

     public static RewardTypesApi getRewardTypesApi() {
        if(ApiClientFactory.rewardTypesApi == null) {
            init();

            ApiClientFactory.rewardTypesApi = (AdminApiClientConfig.isWebsocket())
                    ? new RewardTypesApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new RewardTypesApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.rewardTypesApi;
    }

     public static RewardsApi getRewardsApi() {
        if(ApiClientFactory.rewardsApi == null) {
            init();

            ApiClientFactory.rewardsApi = (AdminApiClientConfig.isWebsocket())
                    ? new RewardsApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new RewardsApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.rewardsApi;
    }

     public static RulesApi getRulesApi() {
        if(ApiClientFactory.rulesApi == null) {
            init();

            ApiClientFactory.rulesApi = (AdminApiClientConfig.isWebsocket())
                    ? new RulesApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new RulesApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.rulesApi;
    }

     public static SpacesApi getSpacesApi() {
        if(ApiClientFactory.spacesApi == null) {
            init();

            ApiClientFactory.spacesApi = (AdminApiClientConfig.isWebsocket())
                    ? new SpacesApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new SpacesApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.spacesApi;
    }

     public static TagsApi getTagsApi() {
        if(ApiClientFactory.tagsApi == null) {
            init();

            ApiClientFactory.tagsApi = (AdminApiClientConfig.isWebsocket())
                    ? new TagsApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new TagsApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.tagsApi;
    }

     public static TransformersApi getTransformersApi() {
        if(ApiClientFactory.transformersApi == null) {
            init();

            ApiClientFactory.transformersApi = (AdminApiClientConfig.isWebsocket())
                    ? new TransformersApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new TransformersApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.transformersApi;
    }

     public static TranslationsApi getTranslationsApi() {
        if(ApiClientFactory.translationsApi == null) {
            init();

            ApiClientFactory.translationsApi = (AdminApiClientConfig.isWebsocket())
                    ? new TranslationsApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new TranslationsApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.translationsApi;
    }

     public static UnitsOfMeasureApi getUnitsOfMeasureApi() {
        if(ApiClientFactory.unitsOfMeasureApi == null) {
            init();

            ApiClientFactory.unitsOfMeasureApi = (AdminApiClientConfig.isWebsocket())
                    ? new UnitsOfMeasureApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new UnitsOfMeasureApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.unitsOfMeasureApi;
    }

     public static UserApi getUserApi() {
        if(ApiClientFactory.userApi == null) {
            init();

            ApiClientFactory.userApi = (AdminApiClientConfig.isWebsocket())
                    ? new UserApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new UserApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.userApi;
    }

     public static WebhooksApi getWebhooksApi() {
        if(ApiClientFactory.webhooksApi == null) {
            init();

            ApiClientFactory.webhooksApi = (AdminApiClientConfig.isWebsocket())
                    ? new WebhooksApiWs(ApiRestClientFactory.getApiClient(), streamingClient, Duration.ofSeconds(5))
                    : new WebhooksApi(ApiRestClientFactory.getApiClient());
        }

        return ApiClientFactory.webhooksApi;
    }

    
}
