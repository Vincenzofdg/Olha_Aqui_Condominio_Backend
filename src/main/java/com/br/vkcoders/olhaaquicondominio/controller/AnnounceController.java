package com.br.vkcoders.olhaaquicondominio.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/publication/announce")
public class AnnounceController {

    @GetMapping
    public ResponseEntity<String> getAllAnnounces() {
        return ResponseEntity.ok("rota de anuncios");
    }

    @PostMapping
    public void createAnnounce(@RequestBody Object json) {
        System.out.println(json);
    }
}
