package and.digital.business;

import java.util.List;

import org.springframework.stereotype.Service;

import and.digital.model.PhoneNumber;

@Service
public class CustomerPhoneServiceImpl implements CustomerPhoneService {

	DemoRepository demoRepository;
	
	public CustomerPhoneServiceImpl(DemoRepository demoRepository) {
		this.demoRepository = demoRepository;
	}
	
	@Override
	public List<PhoneNumber> getCustomerPhoneNumbers(Long customerId) throws Exception{
		return demoRepository.getPhoneNumbersByCustomerId(customerId);
	}

	@Override
	public List<PhoneNumber> getAllPhoneNumbers(){
		return demoRepository.getAllPhoneNumbers();
	}

	@Override
	public PhoneNumber activatePhoneNumber(PhoneNumber phoneNumber)  throws Exception{
		return demoRepository.activatePhoneNumber(phoneNumber);
	}
}
