package exercicios_lacos_condicionais;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		int a;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número: ");
		a = scanner.nextInt();

		if (a % 2 == 0 && a >= 0) {
			System.out.println("O Número " + a + " é par e positivo!");
		} else if (a % 2 == 1 && a >= 0) {
			System.out.println("O Número " + a + " é impar e positivo!");
		} else if (a % 2 == 0 && a < 0) {
			System.out.println("O Número " + a + " é par e negativo!");
		} else {
			System.out.println("O Número " + a + " é impar e negativo!");
		}

		scanner.close();

	}

}
