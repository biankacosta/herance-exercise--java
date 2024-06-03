package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> listEmp = new ArrayList<>();
		
		System.out.println("Enter the number of employees: ");
		int empNum = sc.nextInt();
		
		for (int i = 1; i <empNum+1; i++) {
			System.out.println("Employee number #" + i + ":");
			System.out.println("Outsourced? (y/n)");
			char ans = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if (ans == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				listEmp.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			else {
				listEmp.add(new Employee(name, hours, valuePerHour));
			}
			
		}
		
		
	}

}
