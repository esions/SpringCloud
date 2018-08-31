package com.eureka.costomer.web;

import com.eureka.costomer.service.CostomerFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/costomer")
public class CostomerController {
    @Resource
    private CostomerFeignService feignService;

    @RequestMapping("/get")
    public String customer() {
        return feignService.getProviderPort();
    }

}
