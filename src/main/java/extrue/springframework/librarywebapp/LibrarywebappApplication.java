package extrue.springframework.librarywebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LibrarywebappApplication {


	public static void main(String[] args) {
		SpringApplication.run(LibrarywebappApplication.class, args);
	}

}
