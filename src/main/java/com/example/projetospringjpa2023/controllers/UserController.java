package com.example.projetospringjpa2023.controllers;

import com.example.projetospringjpa2023.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @GetMapping
    public ResponseEntity<User> listaDeUsuarios() {
        User u = new User(1L, "Maria", "João", "lol", "aja");
        return ResponseEntity.ok().body(u);
    }
}
