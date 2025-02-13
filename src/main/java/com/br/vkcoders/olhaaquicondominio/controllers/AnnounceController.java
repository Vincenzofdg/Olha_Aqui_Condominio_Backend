package com.br.vkcoders.olhaaquicondominio.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.br.vkcoders.olhaaquicondominio.records.AnnounceRecord;

@RestController
@RequestMapping("/publication/announce")
public class AnnounceController {

    @GetMapping
    public ResponseEntity<String> getAllAnnounces() {
        return ResponseEntity.ok("rota de anuncios GET");
    }

    @PostMapping
    public void createAnnounce(@RequestBody AnnounceRecord payload) {
        System.out.println(payload);
    }
}
