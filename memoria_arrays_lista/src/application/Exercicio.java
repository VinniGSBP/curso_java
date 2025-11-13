package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Emplooy;

public class Exercicio {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.print("How many employees will be registered?");
		int n = sc.nextInt();		
		
		List<Emplooy> list = new ArrayList<>();
		
		
		for (int i = 0; i < n; i++) {
			System.out.println("Emplyoee #"+ (i+1)+ ":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
		
			
			Emplooy emp = new Emplooy(id, name, salary);
			
			list.add(emp);
			
		}
		
		
		System.out.println("Enter the employee id that will have salary increase:");
		
		int idsalary = sc.nextInt();
		
		Integer pos = position(list, idsalary);
		
		if (pos == null) {
		 System.out.println("ID not found");
		}
		
		else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of Employees: ");
		
		for (Emplooy emp : list) {
			System.out.println(emp);
		}
		
		
		
		
		
		
		
		
		sc.close();
	}
	
	public static int position(List<Emplooy> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id	) {
				return id;
			}
		}
		
		return -1;
	}
}
