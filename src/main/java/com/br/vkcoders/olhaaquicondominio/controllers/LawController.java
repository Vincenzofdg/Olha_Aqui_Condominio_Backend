package com.br.vkcoders.olhaaquicondominio.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.br.vkcoders.olhaaquicondominio.records.ArticleRecord;

@RestController
@RequestMapping("/laws")
public class LawController {

    @GetMapping
    public ResponseEntity<String> getAllArticles() {
        return ResponseEntity.ok("rota de materias GET");
    }

    @PostMapping
    public void createAnnounce(@RequestBody ArticleRecord payload) {
        System.out.println(payload);
    }
}
