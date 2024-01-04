package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		Pessoa[] vect = new Pessoa[n];
		double soma = 0;
		int menores = 0;
		double alturatotal = 0;
		double mediap = 0;

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Dados da %dª Pessoa:\n", i + 1);
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.println("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Pessoa(name, idade, altura);
			soma += vect[i].getAltura();
		}

		for (int i = 0; i < n; i++) {
			if (vect[i].getIdade() < 16) {
				menores++;
			}
			alturatotal += vect[i].getAltura();
		}

		mediap = (menores * 100.0) / n;

		double media = soma / vect.length;
		System.out.printf("\nAltura média: %.2f\n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", mediap);

		for (int i = 0; i < n; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.printf("%s\n", vect[i].getName());
			}
		}
		sc.close();
	}
}
