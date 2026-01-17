package exerciciosComProgramacaoOrientadaObjetos;

import java.util.Locale;
import java.util.Scanner;

import entitites.Employee;

public class exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		double aumento;
		
		System.out.println("Name: ");
		employee.name = sc.next();
		
		System.out.println();
		System.out.println("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println();
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println(employee);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble(); 
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + employee);
		
		
		
		sc.close();
	}

}
