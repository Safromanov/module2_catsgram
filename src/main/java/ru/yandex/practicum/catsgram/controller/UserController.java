package ru.yandex.practicum.catsgram.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.catsgram.exception.InvalidEmailException;
import ru.yandex.practicum.catsgram.model.User;
import ru.yandex.practicum.catsgram.exception.UserAlreadyExistException;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {
    private final Map<String, User> users = new HashMap<>();

    @GetMapping
    public Collection<User> findAll() {
        log.debug("Текущее количество пользователей: {}", users.size());
        return users.values();
    }

    @PostMapping
    public User create(@RequestBody User user) {
        if (user.getEmail() == null || user.getEmail().isBlank())
            throw new InvalidEmailException();
        if (users.containsKey(user.getEmail())) throw new UserAlreadyExistException(user.getEmail());
        log.debug("Новый пользователь: {}", user);
        users.put(user.getEmail(), user);
        return user;
    }

    @PutMapping
    public User update(@RequestBody User user){
        if (user.getEmail() == null || user.getEmail().isBlank())
            throw new InvalidEmailException();
        users.put(user.getEmail(), user);
        return user;
    }

}
