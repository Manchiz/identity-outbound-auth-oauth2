/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.identity.application.authenticator.oauth2;

/**
 * Constant class for Oauth2GenericAuthenticator.
 */
public class Oauth2GenericAuthenticatorConstants {

    public static final String OAUTH2_GRANT_TYPE_CODE = "code";
    public static final String EMAIL = "email";
    public static final String OAUTH2_PARAM_STATE = "state";
    public static final String OAUTH2_LOGIN_TYPE = "oauth2";
    public static final String AUTHENTICATOR_NAME = "OAUTH2";
    public static final String AUTHENTICATOR_FRIENDLY_NAME = "OAUTH2";
    public static final String ACCESS_TOKEN = "access_token";

    public static final String CLIENT_ID = "ClientId";
    public static final String CLIENT_ID_DP = "Client Id";
    public static final String CLIENT_ID_DESC = "Enter client identifier value";

    public static final String CLIENT_SECRET = "ClientSecret";
    public static final String CLIENT_SECRET_DP = "Client Secret";
    public static final String CLIENT_SECRET_DESC = "Enter client secret value";

    public static final String CALLBACK_URL = "CallbackUrl";
    public static final String CALLBACK_URL_DP = "Callback URL";
    public static final String CALLBACK_URL_DESC = "Enter callback URL";
    public static final String CALLBACK_URL_DEFAULT = "/commonauth";

    public static final String OAUTH2_AUTHZ_URL = "AuthEndpoint";
    public static final String OAUTH2_AUTHZ_URL_DP = "Authorization Endpoint URL";
    public static final String OAUTH2_AUTHZ_URL_DESC = "Enter authorization endpoint URL";

    public static final String OAUTH2_TOKEN_URL = "AuthTokenEndpoint";
    public static final String OAUTH2_TOKEN_URL_DP = "Token Endpoint URL";
    public static final String OAUTH2_TOKEN_URL_DESC = "Enter token endpoint URL";

    public static final String OAUTH2_USER_INFO_URL = "UserInfoEndpoint";
    public static final String OAUTH2_USER_INFO_URL_DP = "User Information Endpoint URL";
    public static final String OAUTH2_USER_INFO_URL_DESC = "Enter user information endpoint URL";

    public static final String IS_BASIC_AUTH_ENABLED = "IsBasicAuthEnabled";
    public static final String IS_BASIC_AUTH_ENABLED_DP = "Enable HTTP basic auth for client authentication";
    public static final String IS_BASIC_AUTH_ENABLED_DESC =
            "Specifies that HTTP basic authentication should be used for client authentication, " +
                    "else client credentials will be included in the request body";
    public static final String IS_BASIC_AUTH_ENABLED_DEFAULT = "false";

    public static final String SCOPE = "Scope";
    public static final String SCOPE_DP = "Scope";
    public static final String SCOPE_DESC = "Enter scope";

    public static final String SELF_CONTAINED_TOKEN_ENABLED = "SelfContainedTokenEnabled";
    public static final String SELF_CONTAINED_TOKEN_ENABLED_DP = "Enable retrieving user claims via self-contained " +
            "access token";
    public static final String SELF_CONTAINED_TOKEN_ENABLED_DESC =
            "Specifies that self-contained access token should be used for retrieve user claims, else userinfo " +
                    "endpoint will be used";
    public static final String SELF_CONTAINED_TOKEN_ENABLED_DEFAULT = "false";

    public static final String VAR_TYPE_BOOLEAN = "boolean";
    public static final String AUTH_TYPE = "Basic ";
    public static final String TOKEN_TYPE = "Bearer ";
    public static final String DEFAULT_PROTOCOL_IDENTIFIER = "https";
}
