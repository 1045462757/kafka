package com.example.controller;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author tiger
 * @date 2020/8/14
 */
@Component
public class ConsumerListener {

    @KafkaListener(topics = "test")
    public void onMessage(String message) {
        System.out.println(message);
    }

}
