package com.Kafka.demo.service.implementation;

import com.Kafka.demo.model.Message;
import com.Kafka.demo.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerServiceImpl implements ProducerService
{
    @Autowired
    KafkaTemplate<String, Object>kt;
    @Value("TOPIC_NAME")
    static String TOPIC;

    public  void sendMessage(Message message)
    {
        kt.send(TOPIC, message.getMessage());
    }
}
