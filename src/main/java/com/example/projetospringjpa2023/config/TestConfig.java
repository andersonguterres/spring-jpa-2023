package com.example.projetospringjpa2023.config;

import com.example.projetospringjpa2023.models.User;
import com.example.projetospringjpa2023.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Anderson", "jaja", "loal", "laol");
        User user2 = new User(null, "Maria", "jaja", "loal", "laol");
        //  userRepository.save(user1);
        // userRepository.save(user2);
        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}

