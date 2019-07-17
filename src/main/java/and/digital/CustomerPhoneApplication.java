package and.digital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import and.digital.business.DemoRepository;

@SpringBootApplication
public class CustomerPhoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerPhoneApplication.class, args);
	}
	
	@Bean
	DemoRepository getDemoRepository() {
		return DemoRepository.getDemoRepository();
		
	}
}
