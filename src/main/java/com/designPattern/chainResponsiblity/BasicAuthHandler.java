package com.designPattern.chainResponsiblity;

public class BasicAuthHandler extends AuthenticationHandler{

    public BasicAuthHandler(AuthenticationHandler handler) {
        super(handler);
    }

    public void handleAuthentication(String type){
        if("basic".equals(type)){
            System.out.println("handling basic authentication");
        }else{
            super.handleAuthentication(type);
        }
    }
}
