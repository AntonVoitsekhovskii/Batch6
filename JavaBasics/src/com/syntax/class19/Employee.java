package com.syntax.class19;

public class Employee {
	static String company;
	int empNumber;
	double salary;
	private long ssn;

	void getPaid() {
		System.out.println("Employee " + salary);
	}

	static void work() {
		System.out.println("Employee " + company);
	}

	public static void main(String[] args) {
		Employee.company = "ESP";
		Employee employee = new Employee();
		employee.empNumber = 104;
		employee.salary = 90000;
		
		ProductOwner pOwner = new ProductOwner();
		pOwner.empNumber = 123;
		pOwner.salary = 150000;
		pOwner.ceremonies = "Sprint Grooming, Sprint Planning, Sprint Demo, Daily Stain Up";
		pOwner.attendMeetings();
		pOwner.prioritizeBacklog();
		
		ScrumMaster scrum = new ScrumMaster();
		Tester tester = new Tester();
		Developer developer = new Developer();
		tester.test();
		developer.coding();
		scrum.navigateTeam();
	
	}

}

class ScrumTeam extends Employee {
	String ceremonies;

	void attendMeetings() {
		System.out.println("Scrum Team attend " + ceremonies);
	}
}

class ProductOwner extends ScrumTeam {
	void prioritizeBacklog() {

	}
}

class ScrumMaster extends ScrumTeam {
	void navigateTeam() {

	}
}

class Developer extends ScrumTeam {
	void coding() {

	}
}

class Tester extends ScrumTeam {
	void test() {

	}

}

class BussinessAnalyst extends ScrumTeam {
	void workWithRequirements() {

	}
}
