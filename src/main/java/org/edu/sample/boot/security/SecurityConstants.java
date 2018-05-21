package org.edu.sample.boot.security;

import java.util.concurrent.TimeUnit;

public class SecurityConstants {

    public static final String SECRET = "SecretKeyToGenJWTs";
    public static final long EXPIRATION_TIME = TimeUnit.HOURS.toMillis(8l);
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";

}
