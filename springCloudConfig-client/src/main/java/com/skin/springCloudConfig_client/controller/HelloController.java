package com.skin.springCloudConfig_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${neohello}")
    String hello;

    @RequestMapping("/hello")
    public String from() {
        return this.hello;
//    	return "dsa";
    }
}
