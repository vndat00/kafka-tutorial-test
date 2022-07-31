package com.vndat.springbootkafkatutorial.kafka;

import com.vndat.springbootkafkatutorial.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "vndat00_json", groupId = "myGroud")
    public void consume(User user){
        LOGGER.info(String.format("Json message received: %s", user.toString()));
    }

}
