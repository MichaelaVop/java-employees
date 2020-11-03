package ca.employee.system;

import java.time.LocalDate;

public class HourlyEmployee {
	
	private double payRate;
	private double hoursWorked;
	public final String DEFAULT_STRING = "Unknown";
	
	public HourlyEmployee(String firstName, String lastName, String email,  String phoneNum, LocalDate dayStarted,
			double payRate, double hoursWorked) {
			
		super();
		setPayRate(payRate);
		setHoursWorked(hoursWorked);
		
	}
	
	public double incomeAmount() {
		return payRate * hoursWorked;
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
	
	@Override
	public String toString() {
		return String.format(super.toString()
				+ "\nPay rate: " + getPayRate()
				+ "\nHours worked: " + getHoursWorked()
				+ "\nTotal income: " + incomeAmount());
	}
		


}
