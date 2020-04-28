
package com.karthik.UserRegandLoginApp;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.karthik.UserRegandLoginApp.repository.UserJdbcRepository;

@SpringBootApplication
public class UserRegandLoginApp {
	//	private static final Logger log = LoggerFactory.getLogger(UserRegandLoginApp.class);

	public static void main(String[] args) {
		SpringApplication.run(UserRegandLoginApp.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserJdbcRepository userjdbcrepository) {
		return (args) -> {

		};
	}

}
