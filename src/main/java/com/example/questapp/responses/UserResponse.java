package com.example.questapp.responses;

import com.example.questapp.entities.User;
import lombok.Data;

@Data
public class UserResponse {
    Long userId;
    String username;

    public UserResponse(User user) {
        this.userId = user.getId();
        this.username = user.getUsername();
    }
}
