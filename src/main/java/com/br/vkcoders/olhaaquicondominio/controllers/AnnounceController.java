package com.br.vkcoders.olhaaquicondominio.controllers;

import com.br.vkcoders.olhaaquicondominio.models.AnnounceModel;
import com.br.vkcoders.olhaaquicondominio.repositories.AnnounceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.br.vkcoders.olhaaquicondominio.records.AnnounceRecord;

@RestController
@RequestMapping("/publication/announce")
public class AnnounceController {

    @Autowired
    // Dependencies Injection
    private AnnounceRepository repository;

    @GetMapping
    public ResponseEntity<String> getAllAnnounces() {
        return ResponseEntity.ok("rota de anuncios GET");
    }

    @PostMapping
    public void createAnnounce(@RequestBody AnnounceRecord payload) {
        repository.save(new AnnounceModel(payload));
    }
}
