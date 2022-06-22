/*
 * Copyright (c) 2022. ZIQNI LTD registered in England and Wales, company registration number-09693684
 */
package com.ziqni.admin.client.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IdentityAuthorization {

    private static final Logger logger = LoggerFactory.getLogger(IdentityAuthorization.class);

    public static String getAccessTokenString() {

        var i = AdminApiClientConfig
                .getIdentityClient();

        logger.debug("Is identity client closed [{}]", i.isClosed());

        return i
                .tokenManager()
                .getAccessTokenString();
    }
}
