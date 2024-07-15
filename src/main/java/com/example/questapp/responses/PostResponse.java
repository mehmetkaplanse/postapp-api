package com.example.questapp.responses;

import com.example.questapp.entities.Post;
import lombok.Data;

@Data
public class PostResponse {
    Long id;
    String title;
    String text;
    UserResponse user;

    public PostResponse(Post entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.text = entity.getText();
        this.user = new UserResponse(entity.getUser());
    }
}
