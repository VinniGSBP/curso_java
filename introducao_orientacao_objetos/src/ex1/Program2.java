package ex1;
import java.util.Scanner;
import java.util.Locale;

import entities.Employee;
public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
	
		System.out.printf("Name: ");
		employee.name = sc.nextLine();
		
		System.out.printf("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.printf("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println(employee);
		
		System.out.println(" Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update data: " + employee);
		sc.close();
	}

}
