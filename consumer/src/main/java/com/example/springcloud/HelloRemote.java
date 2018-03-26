package com.example.springcloud;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "PRODUCER", fallback = HelloRemoteHystrix.class) // 服务名称，与服务提供者的应用名称保持一致
public interface HelloRemote {
    @RequestMapping(value = "/")
    String hello();

    @RequestMapping(value = "trouble")
    String trouble();
}
