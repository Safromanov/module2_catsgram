package ru.yandex.practicum.catsgram.exception;

public class UserAlreadyExistException extends IllegalArgumentException{

    public UserAlreadyExistException(String email) {
        super(String.format("email %s уже существует", email));
    }
}
