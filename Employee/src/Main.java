import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the new employee name");
		String name = scan.nextLine();
		System.out.println("Please enter the salary of the employee");
		int salary = scan.nextInt();
		System.out.println("Please enter the work hour of the employee");
		int workhour = scan.nextInt();
		System.out.println("Please enter the birth year of the employee");
		int birth = scan.nextInt();
		Employee employee = new Employee(birth, workhour, salary, name);
		employee.toString(employee);
	}

}
