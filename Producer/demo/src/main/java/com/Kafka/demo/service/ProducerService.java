package com.Kafka.demo.service;

import com.Kafka.demo.model.Message;

public interface ProducerService
{

    void sendMessage(Message msg);
}
