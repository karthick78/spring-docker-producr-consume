package com.example.springbootkafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private KafkaProducer kafkaProducer;

    @Autowired
    public TestController(KafkaProducer kafkaProducer){
        this.kafkaProducer=kafkaProducer;

    }
    @PostMapping("/publish")
    public void sendMessage(@RequestParam("message") String message){
        this.kafkaProducer.onMessage(message);

    }
}
