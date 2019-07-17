package and.digital;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import and.digital.business.CustomerPhoneService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MedicineServiceTest {

	@Autowired
	CustomerPhoneService customerPhoneService;
	
	@Test
	public void getAllPhoneNumbers() {
		System.out.println("Inside CustomerPhoneServiceTest : " + LocalDateTime.now() + customerPhoneService);
		assertTrue("NOT PASS", customerPhoneService.getAllPhoneNumbers().size()>0);
	}
}
