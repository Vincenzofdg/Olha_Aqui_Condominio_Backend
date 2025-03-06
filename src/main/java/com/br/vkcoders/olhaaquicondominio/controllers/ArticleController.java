package com.br.vkcoders.olhaaquicondominio.controllers;

import com.br.vkcoders.olhaaquicondominio.models.ArticleModel;
import com.br.vkcoders.olhaaquicondominio.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.br.vkcoders.olhaaquicondominio.records.ArticleRecord;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/publication/article")
public class ArticleController {

    // Autowired: Dependencies Injection
    @Autowired
    private ArticleRepository repository;

    @GetMapping
    public ResponseEntity<List<ArticleModel>> getAllArticles() {
        List<ArticleModel> result = repository.findAll();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ArticleModel> getArticleById(@PathVariable String id) {
        Optional<ArticleModel> result = repository.findById(id);
        return result
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ArticleRecord> createAnnounce(@RequestBody ArticleRecord payload) {
        repository.save(new ArticleModel(payload));
        return ResponseEntity.ok(payload);
    }
}
