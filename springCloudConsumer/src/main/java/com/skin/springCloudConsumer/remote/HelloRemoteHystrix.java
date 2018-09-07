package com.skin.springCloudConsumer.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.skin.springCloudConsumer.remote.HelloRemote;

@Component
public class HelloRemoteHystrix implements HelloRemote{

    public String hello(@RequestParam(value = "name") String name) {
        return "hello" +name+", this messge send failed ";
    }

}
