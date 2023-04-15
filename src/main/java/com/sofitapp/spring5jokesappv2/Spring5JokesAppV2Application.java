package com.sofitapp.spring5jokesappv2;

import com.sofitapp.spring5jokesappv2.controllers.JokesController;
import com.sofitapp.spring5jokesappv2.services.JokesServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5JokesAppV2Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring5JokesAppV2Application.class, args);

	}

}
