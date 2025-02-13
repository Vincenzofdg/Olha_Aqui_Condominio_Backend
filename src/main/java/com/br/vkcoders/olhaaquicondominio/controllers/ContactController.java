package com.br.vkcoders.olhaaquicondominio.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @GetMapping
    public ResponseEntity<String> getAllAnnounces() {
        return ResponseEntity.ok("rota de contatos GET");
    }
}
