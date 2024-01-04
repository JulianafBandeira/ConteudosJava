package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dollar;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("What is dollar price? ");
		double price = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double comprar = sc.nextDouble();

		double totalAmount = Dollar.amount(price, comprar);
		System.out.printf("Amount to be paid in reais = %.2f", totalAmount);

		sc.close();
	}
}