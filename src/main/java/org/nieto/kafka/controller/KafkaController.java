package org.nieto.kafka.controller;

import org.nieto.kafka.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class KafkaController {

    @Autowired
    private KafkaService kafkaService;

    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Welcome to java-kafka-test");
    }

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody String message) {
        kafkaService.sendMessage(message);
        return ResponseEntity.ok("Ejecutado");
    }

}
