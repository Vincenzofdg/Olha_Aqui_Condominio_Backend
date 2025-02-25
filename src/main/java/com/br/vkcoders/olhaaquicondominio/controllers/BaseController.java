package com.br.vkcoders.olhaaquicondominio.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class BaseController {

    @GetMapping
    public ResponseEntity<String> basePath() {
        return ResponseEntity.ok("Olha Aqui Condominio API");
    }
}
