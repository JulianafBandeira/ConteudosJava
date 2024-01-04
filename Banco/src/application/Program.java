package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Banco banco = new Banco(0, null);

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();

		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			banco = new Banco(number, holder, initialDeposit);
		} else {
			banco = new Banco(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(banco);
		
		System.out.println();
		System.out.print("Enter a desposit value: ");
		double depositValue = sc.nextDouble();
		banco.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(banco);
		
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		banco.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(banco);
		
		
		sc.close();

	}

}
