package and.digital.business;

import java.util.Arrays;
import java.util.List;

import and.digital.model.Customer;
import and.digital.model.PhoneNumber;

public class DemoRepository {

	private List<Customer> customers;
	private List<PhoneNumber> phoneNumbers;
	private static DemoRepository demoRepository;
	
	private DemoRepository() {
		phoneNumbers = Arrays.asList(
				new PhoneNumber(Long.valueOf(1), "+44-123-456-7801", true),
				new PhoneNumber(Long.valueOf(2), "+44-123-456-7802", false),
				new PhoneNumber(Long.valueOf(3), "+44-123-456-7803", false),
				new PhoneNumber(Long.valueOf(4), "+44-123-456-7804", true),
				new PhoneNumber(Long.valueOf(5), "+44-123-456-7805", false),
				new PhoneNumber(Long.valueOf(6), "+44-123-456-7806", false),
				new PhoneNumber(Long.valueOf(7), "+44-123-456-7807", true),
				new PhoneNumber(Long.valueOf(8), "+44-123-456-7808", true),
				new PhoneNumber(Long.valueOf(9), "+44-123-456-7809", false)
				);
		customers = Arrays.asList(
				new Customer(Long.valueOf(1), phoneNumbers.subList(0, 3)),
				new Customer(Long.valueOf(2), phoneNumbers.subList(3, 5)),
				new Customer(Long.valueOf(3), phoneNumbers.subList(5, 8))
				);
	}
	
	public static DemoRepository getDemoRepository() {
		if(demoRepository == null)
			demoRepository = new DemoRepository();
		
		return demoRepository;
	}
	
	public List<PhoneNumber> getAllPhoneNumbers(){
		return this.phoneNumbers;
	}
	
	public List<PhoneNumber> getPhoneNumbersByCustomerId(Long customerId) throws Exception{		
		for (Customer customer : customers) {
			if(customer.getId().equals(customerId))
				return customer.getPhoneNumbers();
		}
		throw new Exception("Customer with given Id not found : " + customerId);
	}
	
	public PhoneNumber activatePhoneNumber(PhoneNumber phoneNumber) throws Exception{
		for (PhoneNumber phone : phoneNumbers) {
			if(phone.equals(phoneNumber)) {
				phone.setActive(true);
				return phone;
			}
		}
		throw new Exception("PhoneNumber given not found : " + phoneNumber.getPhoneNumber());
	}
	
}
