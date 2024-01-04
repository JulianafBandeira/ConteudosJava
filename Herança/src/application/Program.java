package application;

import java.util.Locale;

import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Account acc = new Account(1001, "Juliana", 0.0);
		
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		//UPCASTING
		//pega um objeto da sub e o atribui para um objeto da super
				
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1001, "teste", 0.0, 300.0);
		Account acc3 = new SavingsAccount(1004, "seila", 0.0, 0.01);
		
		//DOWNCASTING
		//converte um objeto da super para a sub
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		
		acc4.loan(100.0);
		
		
		//BusisnessAccount acc5 = (BusinessAccount)acc3;
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.00);
			System.out.println("loan!");
		}
		
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update! ");
		}
		
	}

}
