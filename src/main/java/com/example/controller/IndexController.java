package com.example.controller;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author tiger
 * @date 2020/8/14
 */
@RestController
public class IndexController {

    @Resource
    private KafkaTemplate<String, Object> kafkaTemplate;

    @GetMapping("/message/send")
    public boolean send(@RequestParam String message) {
        kafkaTemplate.send("test", message);
        return true;
    }
}
