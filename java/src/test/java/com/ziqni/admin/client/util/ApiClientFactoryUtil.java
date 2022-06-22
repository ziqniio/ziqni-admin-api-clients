package com.ziqni.admin.client.util;

import com.ziqni.admin.client.ApiClientFactory;
import com.ziqni.admin.client.api.CompetitionsApiTest;
import com.ziqni.admin.client.configuration.AdminApiClientConfig;
import com.ziqni.admin.client.configuration.AdminApiClientConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiClientFactoryUtil {

    private static final Logger logger = LoggerFactory.getLogger(ApiClientFactoryUtil.class);

    public static void initApiClientFactory() throws Exception {
        ApiClientFactory.initialise();

        if(AdminApiClientConfig.isWebsocket()) {
            while (ApiClientFactory.getStreamingClient() == null) {
                Thread.sleep(500);
                logger.info("Waiting for the streaming client to initialize");
            }

            final var started = ApiClientFactory.getStreamingClient().start();
            while (!ApiClientFactory.getStreamingClient().isConnected()) {
                Thread.sleep(500);
                logger.info("Waiting for the streaming client start");
            }
        }
    }

}
