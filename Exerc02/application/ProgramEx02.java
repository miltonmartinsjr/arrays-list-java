package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEx02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner imput = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		// PART 1 - READING DATA:
		
		System.out.print("How many employees will be registered? ");
		int numbEmployees = imput.nextInt();
		
		for(int i=1; i<=numbEmployees; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			int id = imput.nextInt();
			imput.nextLine();
			System.out.print("Name: ");
			String name = imput.nextLine();
			System.out.print("Salary: ");
			double salary = imput.nextDouble();
			
			list.add(new Employee(name, id, salary));
		}
		
		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idEmp = imput.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == idEmp).findFirst().orElse(null);
		
		if(emp == null) {
			
			System.out.println("This id does not exist!");
			
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = imput.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		// PART 3 - LISTING EMPLOYEES:
		
		System.out.println();
		System.out.println("List of employees:");
		for(Employee obj : list) {
			System.out.println(obj);
		}
				
		
		imput.close();
	}

}
