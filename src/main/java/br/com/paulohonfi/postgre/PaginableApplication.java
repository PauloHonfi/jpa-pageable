package br.com.paulohonfi.postgre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PaginableApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaginableApplication.class, args);
	}

}
