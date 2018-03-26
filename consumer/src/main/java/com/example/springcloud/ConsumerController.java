package com.example.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private HelloRemote helloRemote;

    @RequestMapping(value = "/hello")
    public String hello() {
        return helloRemote.hello();
    }

    @RequestMapping(value = "/trouble")
    public String trouble() {
        return helloRemote.trouble();
    }
}
