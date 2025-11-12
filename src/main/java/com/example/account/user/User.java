package com.example.account.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {

    @Id
    private Long id;

    private String username;
    private String email;
    private String phone;
    private String password;
}
