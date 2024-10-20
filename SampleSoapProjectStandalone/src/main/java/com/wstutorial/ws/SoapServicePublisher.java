package com.wstutorial.ws;

import javax.xml.ws.Endpoint;

public class SoapServicePublisher {

    public static void main(String[] args) {
        String url = "http://localhost:8080/ws/hello"; // Define the URL for the service
        Endpoint.publish(url, new HelloServiceImpl()); // Publish the service
        System.out.println("Service is running at: " + url);
    }
}
