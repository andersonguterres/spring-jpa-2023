package com.example.projetospringjpa2023.repositories;

import com.example.projetospringjpa2023.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
