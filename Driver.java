package ca.employee.system;

import java.time.LocalDate;
import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		HourlyEmployee e1 = new HourlyEmployee("John", "Smith", "johnS@gmail.com", "758 937 9879", LocalDate.of(2019, 9, 8), 19.50, 21);
		HourlyEmployee e2 = new HourlyEmployee("Jack", "Den", "jackDen@gmail.com", "964 937 9879", LocalDate.of(2017, 10, 15), 19.50, 13);
		HourlyEmployee e3 = new HourlyEmployee("", "Smith", "tryJ@gmail.com", "758 937 9879", LocalDate.of(2019, 9, 8), 19.50, 21);

		/*
		SalesEmployee se1 = new SalesEmployee("John", "Black", "BJ@gmail.com", "758 976 9879", LocalDate.of(2020, 2, 18), 0.4, 12000.00);
		SalesEmployee se2 = new SalesEmployee("Peter", "Handy", "HP@gmail.com", "758 976 0972", LocalDate.of(2018, 6, 20), 0.45, 16320.00);
		SalesEmployee se3 = new SalesEmployee("", "Ghost", "whoknows@gmail.com", "758 976 9879", LocalDate.of(2020, 2, 18), 0.0, 12000.00);
		*/
		
		
		ArrayList<Employee>employees = new ArrayList<>();
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		//employees.add(se1);
		//employees.add(se2);
		//employees.add(se3);
		
		for(Employee i: employees) {
			System.out.println(i);
		}
		
		
	//public static void printEmployee(ArrayList<Employee>employees)

	//}

}
