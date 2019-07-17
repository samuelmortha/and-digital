package and.digital.model;

public class PhoneNumber {

	private Long id;
	private boolean isActive;
	private String phoneNumber;
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public PhoneNumber() {}
	public PhoneNumber(Long id, String phoneNumber, Boolean isActive) {
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.isActive = isActive;
	}
	
	@Override
	public boolean equals(Object object) {
		if(object instanceof PhoneNumber) {
			if (this.phoneNumber.equals(((PhoneNumber) object).getPhoneNumber())) {
				return true;
			}
			return false;
		}
		return false;
	}
	
}
