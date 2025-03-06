package com.br.vkcoders.olhaaquicondominio.controllers;

import com.br.vkcoders.olhaaquicondominio.models.LawModel;
import com.br.vkcoders.olhaaquicondominio.repositories.LawRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.br.vkcoders.olhaaquicondominio.records.LawRecord;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/laws")
public class LawController {

    @Autowired
    private LawRepository repository;

    @GetMapping
    public ResponseEntity<List<LawModel>> getAllArticles() {
        List<LawModel> result = repository.findAll();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LawModel> getLawById(@PathVariable String id) {
        Optional<LawModel> result = repository.findById(id);
        return result
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<LawRecord> createAnnounce(@RequestBody LawRecord payload) {
        repository.save(new LawModel(payload));
        return ResponseEntity.ok(payload);
    }
}
