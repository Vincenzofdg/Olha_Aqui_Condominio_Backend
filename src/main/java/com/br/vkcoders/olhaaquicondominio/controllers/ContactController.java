package com.br.vkcoders.olhaaquicondominio.controllers;

import com.br.vkcoders.olhaaquicondominio.models.ContactModel;
import com.br.vkcoders.olhaaquicondominio.records.ContactRecord;
import com.br.vkcoders.olhaaquicondominio.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private ContactRepository repository;

    @GetMapping
    public ResponseEntity<String> getAllAnnounces() {
        return ResponseEntity.ok("rota de contatos GET");
    }

    @PostMapping
    public ResponseEntity<ContactRecord> createAnnounce(@RequestBody ContactRecord payload) {
        repository.save(new ContactModel(payload));
        return ResponseEntity.ok(payload);
    }
}
