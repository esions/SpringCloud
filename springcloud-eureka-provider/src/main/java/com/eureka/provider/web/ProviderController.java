package com.eureka.provider.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Value("${server.port}")
    private Integer port;

    @RequestMapping("get")
    public String provider() {

        return "Hello,Provider! Port:" + port;
    }

}
