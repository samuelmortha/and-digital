package and.digital.business;

import java.util.List;

import and.digital.model.PhoneNumber;

public interface CustomerPhoneService {
	List<PhoneNumber> getCustomerPhoneNumbers(Long customerId) throws Exception;
	List<PhoneNumber> getAllPhoneNumbers();
	PhoneNumber activatePhoneNumber(PhoneNumber phoneNumber) throws Exception;
}
