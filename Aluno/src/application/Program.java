package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();

		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();

		if (aluno.media() < 60) {
			System.out.printf("FINAL GRADE = %.2f\n", aluno.media());
			System.out.println("FAILED");
			double pontoRestante = 60 - aluno.media();
			System.out.printf("MISSING %.2f POINTS", pontoRestante);
		} else {
			System.out.printf("FINAL GRADE = %.2f\n", aluno.media());
			System.out.println("PASS");
		}

	}

}
