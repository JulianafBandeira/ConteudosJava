package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Salario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Salario> list = new ArrayList<>();

		System.out.print("Registrar quantos? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("Employee #%s:\n", i + 1);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			Salario sal = new Salario(id, name, salary);

			list.add(sal);
		}

		System.out.println("Enter the employee ID: ");
		int idsalary = sc.nextInt();

		Salario sal = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

		if (sal == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			int index = list.indexOf(sal);
			list.get(index).increase(percentage);
		}
		for (Salario sal1 : list) {
			System.out.println(sal1);
		}
 
		sc.close();

	}

}
