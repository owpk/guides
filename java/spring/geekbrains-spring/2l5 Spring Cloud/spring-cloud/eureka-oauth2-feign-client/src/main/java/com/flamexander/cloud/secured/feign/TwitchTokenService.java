package com.flamexander.cloud.secured.feign;

import org.springframework.security.core.token.Token;
import org.springframework.security.core.token.TokenService;

public class TwitchTokenService implements TokenService {

    @Override
    public Token allocateToken(String s) {
        return null;
    }

    @Override
    public Token verifyToken(String s) {
        return null;
    }
}
