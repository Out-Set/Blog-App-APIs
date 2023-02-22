package com.project.blogappapis.Security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import org.springframework.stereotype.Component;

@Component
public class JwtTokenHelper {
    public static final long JWT_TOKEN_VALIDITY = 5*60*60;

    private String secret = "JwtTokenKey";

    // Retrieve userName from JWT Token
    public String getUserNameFromToken(String token) {
        return get
    }
}
