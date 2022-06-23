package annotation;

public class Customer {
	@CourseCode(value ="LUV", message ="Must starts with LUV")
	private String firstName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
