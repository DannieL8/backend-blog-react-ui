package com.api.blog.controllers;

import com.api.blog.models.User;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.kafka.clients.admin.Admin ;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Future;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private final String TOPIC = "unit_test_topic";



    @PostMapping("/publish/{name}")
    public String postKafkaMessage(@PathVariable("name") final String status){
      kafkaTemplate.send(TOPIC,status);

       // System.out.println(result.partition());
        return "Published successfully!";
    }

    @KafkaListener(id="1", topicPartitions =  {@TopicPartition(topic = TOPIC, partitions = "0"), @TopicPartition(topic = TOPIC, partitions = "1"),@TopicPartition(topic = TOPIC, partitions = "2"),@TopicPartition(topic = TOPIC, partitions = "4"),@TopicPartition(topic = TOPIC, partitions = "5"),@TopicPartition(topic = TOPIC, partitions = "6"),@TopicPartition(topic = TOPIC, partitions = "9")})
     public String listenToTopicData(@RequestParam String status){
        System.out.println(status);
        return status;
    }

    @Bean
    public NewTopic topic_unit_test() {
        return new NewTopic("unit_test_topic", 10, (short) 1);
    }


}
