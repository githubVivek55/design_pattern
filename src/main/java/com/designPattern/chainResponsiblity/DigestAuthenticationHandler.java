package com.designPattern.chainResponsiblity;

public class DigestAuthenticationHandler extends AuthenticationHandler{
    public DigestAuthenticationHandler(AuthenticationHandler next) {
        super(next);
    }

    public void handleAuthentication(String type) {
        if("digest".equals(type)){
            System.out.println("digest authentication handler");
        }else{
            super.handleAuthentication(type);
        }
    }
}
