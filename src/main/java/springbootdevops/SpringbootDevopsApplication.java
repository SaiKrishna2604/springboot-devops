package springbootdevops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDevopsApplication.class, args);
	}
	
	@GetMapping("/")
	public String testMethod() {
		return "welcome to Sai Krishna tutorials!!";
	}

}
