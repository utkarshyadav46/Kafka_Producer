package com.Kafka.demo.controller;

import com.Kafka.demo.model.Message;
import com.Kafka.demo.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/web")
public class RestControllerClass
{
    @Autowired
    ProducerService producerService;

    @PostMapping("/push/{msg}")
    public void sendMessage(@RequestBody Message message) throws Exception {
        try
        {
            producerService.sendMessage(message);
        }
        catch(Exception e)
        {
            throw  new Exception("There is an exception");
        }
    }
}
