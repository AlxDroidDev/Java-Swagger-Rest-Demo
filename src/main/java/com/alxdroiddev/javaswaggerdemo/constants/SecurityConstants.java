package com.alxdroiddev.javaswaggerdemo.constants;

public final class SecurityConstants {

    public static final String AUTH_LOGIN_URL = "/api/authenticate";

    //Para uma aplicação final deve ser parametrizado no dependency factory
    public static final String JWT_SECRET = "WnI0dTd4IUElRCpHLUphTmRSZ1VrWHAyczV2OHkvQj9FKEgrTWJRZVNoVm1ZcTN0Nnc5eiRDJkYpSkBOY1JmVQ==";

    public static final String TOKEN_HEADER = "Authorization";
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String TOKEN_TYPE_HEADER = "typ";
    public static final String TOKEN_TYPE = "JWT";
    public static final String TOKEN_ISSUER = "secure-api";
    public static final String TOKEN_AUDIENCE = "secure-app";
    public static final long TOKEN_EXPIRATION_TIME = 860_000_000;



    private SecurityConstants() {
        /* empty */
    }
}
