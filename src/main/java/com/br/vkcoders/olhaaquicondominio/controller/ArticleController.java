package com.br.vkcoders.olhaaquicondominio.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publication/article")
public class ArticleController {
    @GetMapping
    public ResponseEntity<String> getAllArticles() {
        return ResponseEntity.ok("rota de materias");
    }
}
