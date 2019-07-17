package and.digital.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ControllerAdvice
public class CustomerPhoneNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(CustomerPhoneNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String customerPhoneNumberNotFoundHandler(CustomerPhoneNotFoundException notFoundException) {
		return notFoundException.getMessage();
	}
}
