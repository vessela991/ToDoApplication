package com.github.vessela991.ToDoApplication.Server.Infrastructure.Properties;

public class JwtProperties {
    public static final String SECRET = "secret";
    public static final int EXPIRATION_TIME = 86_400_000; // 1 day
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
}
