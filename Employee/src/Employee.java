
import java.lang.Math;

public class Employee {
	
	private String name;
	private double salary;
	private int workHours,hireYear;
	
	
	public Employee(int hireYear, int workHours, double salary, String name) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
		
		
	}
	
	public double tax() {
		if (salary >= 1000) {
			return salary*0.03;
		}
		return 0.0;
		
	}
	
	public double bonus() {
		return Math.abs(30 * (40-workHours));
	}
	public double increase() {
		int year = 2022-hireYear;
		if (year < 10) {
			return salary*0.5;
		}
		else if (year >= 10 && year < 20) {
			return salary*0.15;
		}
		return salary*0.20;
		
	}
	public void toString(Employee employee) { // Overloading
		System.out.println("");
		System.out.println("Tax " + employee.tax());
		System.out.println("Bonus " + employee.bonus());
		System.out.println("Increase Salary " + employee.increase());
		System.out.println("");		
		
	}

}
