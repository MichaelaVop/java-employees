package ca.employee.system;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
	
	private double payRate;
	private double hoursWorked;
	public final String DEFAULT_STRING = "Unknown";
	
	public HourlyEmployee(String firstName, String lastName, String email,  String phoneNum, LocalDate dayStarted,
			double payRate, double hoursWorked) {
			
		super(firstName, lastName, email, phoneNum, dayStarted);
		setPayRate(payRate);
		setHoursWorked(hoursWorked);
		
	}
	
	public double getPayRate() {
		return payRate;
	}
	
	public double getHoursWorked() {
		return hoursWorked;
	}
	
	public void setPayRate(double payRate) {
		if (payRate > 0.0) {
			this.payRate = payRate;
		} else {
			this.payRate = 1.0;
		}
	}
	
	public void setHoursWorked(double hoursWorked) {
		if (hoursWorked > 0.0 && hoursWorked <= 40.0) {
			this.hoursWorked = hoursWorked;
		} else {
			this.hoursWorked = 1.0;
		}
	}
	
	
	public double incomeAmount() {
		return payRate * hoursWorked;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString()
				+ "\nPay rate: " + payRate
				+ "\nHours worked: " + hoursWorked
				+ "\nTotal income: " + incomeAmount();
	}
		


}
