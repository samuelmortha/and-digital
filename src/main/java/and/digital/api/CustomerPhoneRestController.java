package and.digital.api;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import and.digital.business.CustomerPhoneService;
import and.digital.model.PhoneNumber;

@RestController
@RequestMapping("/api")
public class CustomerPhoneRestController {

	Logger LOGGER = Logger.getLogger(CustomerPhoneRestController.class.getName());
	
	@Autowired
	CustomerPhoneService customerPhoneService;
	
	@GetMapping("/phonenumbers")
	public List<PhoneNumber> getAllPhoneNumbers(){
		LOGGER.info("Fetching all PhoneNumbers in the system.");
		return customerPhoneService.getAllPhoneNumbers();
	}
	
	@GetMapping("/phonenumbers/customer/{customerId}")
	public List<PhoneNumber> getCustomerPhoneNumbers(@PathVariable Long customerId) throws Exception{
		LOGGER.info("Fetching PhoneNumbers related to a particular Customer");
		return customerPhoneService.getCustomerPhoneNumbers(customerId);
	}
	
	@PostMapping(value= "/phonenumbers/activate", consumes = "application/json", produces = "application/json")
	@ResponseStatus(HttpStatus.OK)
	public PhoneNumber activatePhoneNumber(@RequestBody PhoneNumber phoneNumber) throws Exception{
		LOGGER.info("Activating a PhoneNumber");
		return customerPhoneService.activatePhoneNumber(phoneNumber);
	}
}
