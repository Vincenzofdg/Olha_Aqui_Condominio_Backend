//package com.br.vkcoders.olhaaquicondominio.controllers;
//
//import com.br.vkcoders.olhaaquicondominio.models.UserModel;
//import com.br.vkcoders.olhaaquicondominio.records.UserRecord;
//import com.br.vkcoders.olhaaquicondominio.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/users")
//public class UserController {
//
//    // Autowired: Dependencies Injection
//    @Autowired
//    private UserRepository repository;
//
////    @GetMapping
////    public ResponseEntity<List<AnnounceModel>> getAllAnnounces() {
////        List<AnnounceModel> result = repository.findAll();
////        return ResponseEntity.ok(result);
////    }
////
////    @GetMapping("/{id}")
////    public ResponseEntity<AnnounceModel> getAnnounceById(@PathVariable String id) {
////        Optional<AnnounceModel> result = repository.findById(id);
////        return result
////                .map(ResponseEntity::ok)
////                .orElseGet(() -> ResponseEntity.notFound().build());
////    }
////
////    @PostMapping
////    public ResponseEntity<AnnounceRecord> createAnnounce(@RequestBody AnnounceRecord payload) {
////        repository.save(new AnnounceModel(payload));
////        return ResponseEntity.ok(payload);
////    }
//}
