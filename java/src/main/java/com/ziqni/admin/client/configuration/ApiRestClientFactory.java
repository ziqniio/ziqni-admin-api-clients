/*
 * Copyright (c) 2022. ZIQNI LTD registered in England and Wales, company registration number-09693684
 */
package com.ziqni.admin.client.configuration;

import com.ziqni.admin.client.ApiClient;
import com.ziqni.admin.client.util.CoreClientObjectMapper;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.net.http.HttpClient;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Properties;

public abstract class ApiRestClientFactory {

    public static ApiClient apiClient = null;

    /**
     * Remove certificate validation
     * @return SSLContext to use
     */
    private static SSLContext trustAllCerts(){

        final Properties props = System.getProperties(); props.setProperty("jdk.internal.httpclient.disableHostnameVerification", Boolean.TRUE.toString());
        SSLContext sslContext;

        TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {

                    @Override
                    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                        return null;
                    }

                    @Override
                    public void checkClientTrusted(
                            java.security.cert.X509Certificate[] certs, String authType) {
                    }

                    @Override
                    public void checkServerTrusted(
                            java.security.cert.X509Certificate[] certs, String authType) {
                    }
                }
        };

        try {
            sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, trustAllCerts, new SecureRandom());
        } catch (NoSuchAlgorithmException | KeyManagementException e) {
            throw new RuntimeException(e);
        }

        return sslContext;
    }

    private static void load() {

        var builder= HttpClient.newBuilder().sslContext(trustAllCerts());

        ApiRestClientFactory.apiClient = com.ziqni.admin.client.Configuration.getDefaultApiClient()
                .setHttpClientBuilder(builder)
                .setBasePath(AdminApiClientConfig.getAdminClientServerBasePath())
                .setHost(AdminApiClientConfig.getAdminClientServerHost())
                .setPort(AdminApiClientConfig.getAdminClientServerPort())
                .setScheme(AdminApiClientConfig.getAdminClientServerScheme())
                .setObjectMapper(new CoreClientObjectMapper().serializingObjectMapper())
                .setRequestInterceptor(builder1 -> {
                    final var token = AdminApiClientConfig.getAccessTokenString();
                    if(token != null)
                        builder1.header("Authorization", "Bearer " + token);
                });
    }

    public static ApiClient getApiClient(){
        if(ApiRestClientFactory.apiClient == null){
            ApiRestClientFactory.load();
            assert ApiRestClientFactory.apiClient != null;
        }

        return ApiRestClientFactory.apiClient;
    }
}
