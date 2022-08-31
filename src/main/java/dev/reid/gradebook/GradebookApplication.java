package dev.reid.gradebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"dev.reid"})
@EntityScan(basePackages = {"dev.reid.entities"})
@EnableJpaRepositories(basePackages = {"dev.reid.repos"})
public class GradebookApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradebookApplication.class, args);
	}

}
