package ru.yandex.practicum.catsgram.exception;

public class InvalidEmailException extends IllegalArgumentException{
    public InvalidEmailException() {
        super("Email не может быть пустой");
    }
}
