package com.br.vkcoders.olhaaquicondominio.controllers;

import com.br.vkcoders.olhaaquicondominio.models.AnnounceModel;
import com.br.vkcoders.olhaaquicondominio.repositories.AnnounceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.br.vkcoders.olhaaquicondominio.records.AnnounceRecord;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/publication/announce")
public class AnnounceController {

    // Autowired: Dependencies Injection
    @Autowired
    private AnnounceRepository repository;

    @GetMapping
    public ResponseEntity<List<AnnounceModel>> getAllAnnounces() {
        List<AnnounceModel> result = repository.findAll();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnnounceModel> getAnnounceById(@PathVariable Long id) {
        Optional<AnnounceModel> result = repository.findById(id);
        return result
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<AnnounceRecord> createAnnounce(@RequestBody AnnounceRecord payload) {
        repository.save(new AnnounceModel(payload));
        return ResponseEntity.ok(payload);
    }
}
