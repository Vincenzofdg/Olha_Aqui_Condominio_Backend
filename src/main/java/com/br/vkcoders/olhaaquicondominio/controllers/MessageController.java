package com.br.vkcoders.olhaaquicondominio.controllers;

import com.br.vkcoders.olhaaquicondominio.models.MessageModel;
import com.br.vkcoders.olhaaquicondominio.records.MessageRecord;
import com.br.vkcoders.olhaaquicondominio.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private MessageRepository repository;

    @GetMapping
    public ResponseEntity<List<MessageModel>> getAllMessages() {
        List<MessageModel> result = repository.findAll();
        return ResponseEntity.ok(result);
    }

    @PostMapping
    public ResponseEntity<MessageRecord> createMessage(@RequestBody MessageRecord payload) {
        repository.save(new MessageModel(payload));
        return ResponseEntity.ok(payload);
    }
}
