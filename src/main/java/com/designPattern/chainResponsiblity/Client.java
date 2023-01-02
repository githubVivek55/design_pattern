package com.designPattern.chainResponsiblity;

public class Client {
    public static void main(String[] args) {
        AuthenticationHandler client = new BasicAuthHandler(new CertificateAuthHandler
                (new DigestAuthenticationHandler(null)));
        client.handleAuthentication("digest");
        client.handleAuthentication("certificate");
        client.handleAuthentication("basic");
    }
}
