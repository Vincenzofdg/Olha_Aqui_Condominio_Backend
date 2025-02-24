package com.br.vkcoders.olhaaquicondominio.controllers;

import com.br.vkcoders.olhaaquicondominio.models.ArticleModel;
import com.br.vkcoders.olhaaquicondominio.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.br.vkcoders.olhaaquicondominio.records.ArticleRecord;

@RestController
@RequestMapping("/publication/article")
public class ArticleController {

    // Autowired: Dependencies Injection
    @Autowired
    private ArticleRepository repository;

    @GetMapping
    public ResponseEntity<String> getAllArticles() {
        return ResponseEntity.ok("rota de materias GET");
    }

    @PostMapping
    public ResponseEntity<ArticleRecord> createAnnounce(@RequestBody ArticleRecord payload) {
        repository.save(new ArticleModel(payload));
        return ResponseEntity.ok(payload);
    }
}
