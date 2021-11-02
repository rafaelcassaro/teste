package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ListaEntities.Employees;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		List<Employees> employees = new ArrayList<>();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Employee #" + (i+1));
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			
			employees.add(new Employees(id,name,salary ));
		}
		
		System.out.println("Enter the employee id that will have salary increase : ");
		int testeID = sc.nextInt();
		if(employees.indexOf(int testeID) != -1) {
			System.out.println("Enter percentage: ");
			double percent = sc.nextDouble();
			
		}
		else {
			System.out.println("This id does not exist!");
		}
		
		
		
		System.out.println("Employees: ");
		for(Employees obj:  employees) {
			System.out.println(obj);
			
		}
		

		
		
		
		
		
		sc.close();

	}

}
