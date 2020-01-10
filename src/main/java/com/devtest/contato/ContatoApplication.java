package com.devtest.contato;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
public class ContatoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContatoApplication.class, args);
	}

}
