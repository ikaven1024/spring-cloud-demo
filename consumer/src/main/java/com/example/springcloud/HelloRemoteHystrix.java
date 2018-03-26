package com.example.springcloud;

import org.springframework.stereotype.Component;

@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello() {
        return "Hi, this message send failed";
    }

    @Override
    public String trouble() {
        return "Sorry, some trouble occurred";
    }
}
