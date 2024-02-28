package exercicios_laco_repeticao;

import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {

		int numero, resultado = 0, contador = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Digite um número: ");
			numero = scanner.nextInt();

			if (numero % 3 == 0) {
				resultado += numero;
				contador++;
			}

		} while (numero != 0);

		System.out.println("A média de todos os números múltiplos de 3 é: " + (float) (resultado / contador));

	}

}
