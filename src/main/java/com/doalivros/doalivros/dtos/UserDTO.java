package com.doalivros.doalivros.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.validation.constraints.NotBlank;

public class UserDTO {
    
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    private LocalDateTime lastVisit;

    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public LocalDateTime getLastVisit() {
        return lastVisit;
    }

    // Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
