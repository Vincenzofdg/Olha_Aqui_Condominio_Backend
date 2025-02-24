package com.br.vkcoders.olhaaquicondominio.controllers;

import com.br.vkcoders.olhaaquicondominio.models.LawModel;
import com.br.vkcoders.olhaaquicondominio.records.ContactRecord;
import com.br.vkcoders.olhaaquicondominio.repositories.LawRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.br.vkcoders.olhaaquicondominio.records.LawRecord;

@RestController
@RequestMapping("/laws")
public class LawController {

    @Autowired
    private LawRepository repository;


    @GetMapping
    public ResponseEntity<String> getAllArticles() {
        return ResponseEntity.ok("rota de leis GET");
    }

    @PostMapping
    public ResponseEntity<LawRecord> createAnnounce(@RequestBody LawRecord payload) {
        repository.save(new LawModel(payload));
        return ResponseEntity.ok(payload);
    }
}
