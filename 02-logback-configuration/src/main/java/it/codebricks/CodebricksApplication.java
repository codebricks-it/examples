package it.codebricks;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class CodebricksApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodebricksApplication.class, args);
		log.info("Application started");
	}

}
