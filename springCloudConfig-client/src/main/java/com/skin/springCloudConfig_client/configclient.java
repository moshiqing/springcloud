package com.skin.springCloudConfig_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class configclient {
    public static void main( String[] args ){
    	SpringApplication.run(configclient.class, args);
    }
}
