package ca.employee.system;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Employee {
	
	public String firstName;
	private String lastName;
	private String email;
	private String phoneNum;
	private LocalDate dayStarted;
	public final String DEFAULT_STRING = "Unknown";

	public Employee (String firstName, String lastName, String email, String phoneNum, LocalDate dayStarted) {
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setPhoneNum(phoneNum);
		setDayStarted(dayStarted);
		
	}
	
	public abstract double incomeAmount();
	
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public LocalDate getDayStarted() {
		return dayStarted;
	}
	
	
	public void setFirstName(String firstName) {
		if (!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		} else {
			this.firstName = DEFAULT_STRING;
		}
	}
	
	public void setLastName(String lastName) {
		if (!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		} else {
			this.lastName = DEFAULT_STRING;
		}
	}
	
	public void setEmail(String email) {
		if (!email.isEmpty() && !email.equalsIgnoreCase(null)) {
			this.email = email;
		} else {
			this.email = DEFAULT_STRING;
		}
	}
	
	public void setPhoneNum(String phoneNum) {
		if (!phoneNum.isEmpty() && !phoneNum.equalsIgnoreCase(null)) {
			this.phoneNum = phoneNum;
		} else {
			this.phoneNum = "Unknown";
		}
	}
	
	public void setDayStarted(LocalDate dayStarted) {
		if (Objects.nonNull(dayStarted)) {
			this.dayStarted = dayStarted;
		} else {
			System.err.println("The day started should not be null.");
			this.dayStarted = LocalDate.now();
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Employee name: " + firstName + " " + lastName
				+ "\nphone number: " + phoneNum
				+ "\nEmail: " + email
				+ "\nThe day started: " + dayStarted;
	}
	

}
