package com.br.vkcoders.olhaaquicondominio.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Adicionar anotacao pois eh um controller REST
@RestController
// Qual URL esse controller ira responder
@RequestMapping("/hello")
public class HelloController {

    // Quando chegar uma requisicao do tipo GET ele execultara essa funcao
    @GetMapping
    public String HelloWord() {
        return "Hello World!";
    }
}
