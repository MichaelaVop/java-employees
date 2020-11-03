package ca.employee.system;

import java.time.LocalDate;

public class SalesEmployee {
	
	private double commitionRate;
	private double totalSales;
	
	public SalesEmployee(String firstName, String lastName, String email, String phoneNum, String dayStarted,
			double commitionRate, double totalSales) {
		
		super(firstName, lastName, phoneNum, email, dayStarted);
		setCommitionRate(commitionRate);
		setTotalSales(totalSales)
		
	}
	
	public double incomeAmount() {
		return commitionRate * totalSales;
	}
	
	public double getCommitionRate() {
		return commitionRate;
	}
	
	public double getTotalSales() {
		return totalSales;
	}
	
	
	public void setCommitionRate(double commitionRate) {
		if (commitionRate > 0) {
			this.commitionRate = commitionRate;
		} else {
			this.commitionRate = 1.0;
		}
	}
	
	public void setTotalSales(double totalSales) {
		if (totalSales > 0) {
			this.totalSales = totalSales;
		} else {
			this.totalSales = 1.0;
		}
	}
	
	
	@Override
	public String toString() {
		return String.format(super.toString() 
				+ "\nTotal sales: " + getTotalSales()
				+ "\nCommition rate: " + getCommitionRate()
				+ "\nTotal income: " + incomeAmount());
	}

}
