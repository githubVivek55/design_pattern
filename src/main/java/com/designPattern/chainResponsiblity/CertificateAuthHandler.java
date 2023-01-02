package com.designPattern.chainResponsiblity;

public class CertificateAuthHandler extends AuthenticationHandler{
    public CertificateAuthHandler(AuthenticationHandler next){
        super(next);
    }
    public void handleAuthentication(String type){
        if("certificate".equals(type)){
            System.out.println("Handle certificate based authentication");
        }else{
            super.handleAuthentication(type);
        }
    }
}
