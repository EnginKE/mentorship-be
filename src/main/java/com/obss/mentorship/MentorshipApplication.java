package com.obss.mentorship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MentorshipApplication {

	public static void main(String[] args) {
		SpringApplication.run(MentorshipApplication.class, args);
	}

}
