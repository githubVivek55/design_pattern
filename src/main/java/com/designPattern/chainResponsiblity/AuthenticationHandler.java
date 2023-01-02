package com.designPattern.chainResponsiblity;

public abstract class AuthenticationHandler {
    private AuthenticationHandler next;
    public AuthenticationHandler(AuthenticationHandler next){
        this.next=next;
    }
    public void handleAuthentication(String type){
        if(next!=null){
            next.handleAuthentication(type);
        }
    }
}
