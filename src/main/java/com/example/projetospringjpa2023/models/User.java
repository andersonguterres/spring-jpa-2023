package com.example.projetospringjpa2023.models;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class User implements Serializable {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;

}