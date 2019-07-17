package and.digital;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDateTime;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import and.digital.api.CustomerPhoneRestController;

@RunWith(SpringRunner.class)
@SpringBootTest// tells SpringBoot to go and look for main configuration class(one with @@SpringBootApplication for example) and use that to start a Spring Application Context.
public class ApplicationTest {

	@Autowired
	CustomerPhoneRestController customerPhoneRestController;
	
	@Test
	public void contextLoads() throws Exception {
		System.out.println("Inside Application Test : " + LocalDateTime.now());
		assertThat(customerPhoneRestController).isNotNull();
	}
}
