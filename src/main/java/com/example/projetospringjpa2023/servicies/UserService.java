package com.example.projetospringjpa2023.servicies;

import com.example.projetospringjpa2023.models.User;
import com.example.projetospringjpa2023.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<User> listaDeUsuarios() {
        return userRepository.findAll();
    }

    public User buscarUsuarioPorID(Long id) {
        return userRepository.findById(id).get();
    }

}
