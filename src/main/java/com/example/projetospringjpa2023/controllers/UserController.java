package com.example.projetospringjpa2023.controllers;

import com.example.projetospringjpa2023.models.User;
import com.example.projetospringjpa2023.servicies.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> listaDeUsuarios() {
        List<User> lista = userService.listaDeUsuarios();
        return ResponseEntity.ok().body(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> buscarUsuarioPorID(@PathVariable Long id) {
        User user = userService.buscarUsuarioPorID(id);
        return ResponseEntity.ok().body(user);
    }


}
