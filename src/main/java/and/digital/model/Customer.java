package and.digital.model;

import java.util.List;

public class Customer {

	private Long id;
	private List<PhoneNumber> phoneNumbers;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	
	public Customer() {}
	public Customer(Long id, List<PhoneNumber> phoneNumbers) {
		this.id = id;
		this.phoneNumbers = phoneNumbers;
	}	
	
}
