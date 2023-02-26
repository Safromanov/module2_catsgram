package ru.yandex.practicum.catsgram.model;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.time.Instant;
@Value
public class Post {
    String author; // автор

    Instant creationDate = Instant.now(); // дата создания
    String description; // описание
    String photoUrl; // url-адрес фотографии

    public Post(String author, String description, String photoUrl) {
        this.author = author;
        this.description = description;
        this.photoUrl = photoUrl;
    }
}