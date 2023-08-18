package com.Consumer.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @Autowired
    KafkaTemplate<String, Object> kt;
    @KafkaListener(topics="topic2", groupId = "ab")
    public void listen(String message)
    {
        System.out.println("Message Recieved is : " + message);
    }
}