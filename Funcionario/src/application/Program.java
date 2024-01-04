package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		funcionario.name = sc.nextLine();
		funcionario.grossSalary = sc.nextDouble();
		funcionario.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Name: " + funcionario.name);
		System.out.printf("Gross salary: %.2f\n",funcionario.grossSalary);
		System.out.printf("Tax: %.2f\n",funcionario.tax);
		System.out.println();
		System.out.println("Employee: " + funcionario);
		System.out.println();
		
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		funcionario.increaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data: " + funcionario);
		sc.close();

	}

}
