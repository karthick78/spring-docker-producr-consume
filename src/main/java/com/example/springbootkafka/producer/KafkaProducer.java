package com.example.springbootkafka.producer;

import org.apache.kafka.common.internals.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    private String topic="test_topic";

    public void onMessage(String message){
        this.kafkaTemplate.send(topic, message);

    }
}
