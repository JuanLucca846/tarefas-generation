package exercicios_laco_repeticao;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {

		int numero, resultado = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Digite um número: ");
			numero = scanner.nextInt();

			if (numero > 0) {
				resultado += numero;
			}

		} while (numero != 0);

		System.out.println("A soma dos números positivos é: " + resultado);

	}

}
