package io.namoosori.cofig.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope //actuator 스코프를 지정
public class ConfigClientController {

    @Value("${namoosori.value}")
    private String configStr;


    @GetMapping("/test")
    public String test() {
        return configStr;
    }
}
