package com.example.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConsumerController {
    @Autowired
    private HelloRemote helloRemote;

    @Value("${greeting}")
    String greeting;

    @RequestMapping("/hello")
    public String hello() {
        return helloRemote.hello();
    }

    @RequestMapping("/trouble")
    public String trouble() {
        return helloRemote.trouble();
    }

    @RequestMapping("/greeting")
    public String greeting() {
        return greeting;
    }
}
