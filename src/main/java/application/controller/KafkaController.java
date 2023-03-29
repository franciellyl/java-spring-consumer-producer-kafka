package application.controller;

import application.consumer.KafkaConsumer;
import application.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
    private final KafkaProducer kafkaProducer;
    @GetMapping(value = "/send")
    public void send(){
        kafkaProducer.send("Test message send to topic.");
    }
}
