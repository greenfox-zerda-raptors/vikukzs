package com.greenfox;

import com.greenfox.domain.Meal;
import com.greenfox.domain.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CaloriecounterApplication implements CommandLineRunner {

	@Autowired
	private MealRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(CaloriecounterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for (int i = 0; i < 5; i++) {
			repository.save(new Meal("2017.01.02", "breakfast", "scrambled eggs with bacon", 1200));
		}
	}
}
