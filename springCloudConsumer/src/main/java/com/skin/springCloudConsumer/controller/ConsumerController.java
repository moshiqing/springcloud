package com.skin.springCloudConsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skin.springCloudConsumer.remote.HelloRemote;

@RestController
public class ConsumerController {

	 @Autowired
	 HelloRemote he;
	 
	 @RequestMapping("/hello/{name}")
	    public String index(@PathVariable("name") String name) {
	        return he.hello(name);
	    }
}
