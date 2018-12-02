package org.apex.main;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee empDetails = new Employee(5134, "Mridula","Lead Analyst",
											"mt@gmail.com", "9494390768", 7,
											"1700 Civic Center","CA", "95050",
										    5000,2000, 5);

		empDetails.display();
		empDetails.salary();
		
		
	}

}
