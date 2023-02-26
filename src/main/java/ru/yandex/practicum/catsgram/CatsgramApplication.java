package ru.yandex.practicum.catsgram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.yandex.practicum.catsgram.model.Post;
import ru.yandex.practicum.catsgram.model.User;

import java.time.Instant;
import java.time.LocalDate;

@SpringBootApplication
public class CatsgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatsgramApplication.class, args);
	}

}
