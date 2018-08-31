package com.eureka.costomer.service;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("eureka-provider")
public interface CostomerFeignService {

    @RequestMapping(method = RequestMethod.GET, value = "/provider/get")
    public String getProviderPort();
}
