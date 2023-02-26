package ru.yandex.practicum.catsgram.model;

import lombok.Value;
import java.time.LocalDate;

@Value
public class User {
     String email;
     String nickname;
     LocalDate birthdate;
}