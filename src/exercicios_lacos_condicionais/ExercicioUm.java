package exercicios_lacos_condicionais;

import java.util.Scanner;

public class ExercicioUm {
	public static void main(String[] args) {

		int a, b, c;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o número A: ");
		a = scanner.nextInt();

		System.out.println("Digite o número B: ");
		b = scanner.nextInt();

		System.out.println("Digite o número C: ");
		c = scanner.nextInt();

		if (a + b > c) {
			System.out.println("A soma de A + B é Maior do que C");
		} else if (a + b == c) {
			System.out.println("A soma de A + B é igual C");
		} else {
			System.out.println("A soma de A + B é Menor do que C");
		}

		scanner.close();

	}
}
