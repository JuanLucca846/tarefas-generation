package exercicios_laco_repeticao;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {

		int primeiroNumero, segundoNumero;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro número do intervalo: ");
		primeiroNumero = scanner.nextInt();

		System.out.println("Digite o último número do intervalo: ");
		segundoNumero = scanner.nextInt();

		System.out.println("No Intervalo entre " + primeiroNumero + " e " + segundoNumero + ": ");

		for (; primeiroNumero <= segundoNumero; primeiroNumero++) {
			if (primeiroNumero % 3 == 0 && primeiroNumero % 5 == 0) {
				System.out.println(primeiroNumero + " é multiplo de 3 e 5");
			}
		}

	}

}
