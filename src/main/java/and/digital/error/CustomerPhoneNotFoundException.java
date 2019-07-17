package and.digital.error;

public class CustomerPhoneNotFoundException extends RuntimeException{

	public CustomerPhoneNotFoundException(String message) {
		super(message);
	}
}
