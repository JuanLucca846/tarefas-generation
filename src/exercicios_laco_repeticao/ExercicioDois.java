package exercicios_laco_repeticao;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {

		int numero, contador, par = 0, impar = 0;

		Scanner scanner = new Scanner(System.in);

		for (contador = 0; contador < 10; contador++) {
			System.out.println("Digite o " + (contador + 1) + "º número: ");
			numero = scanner.nextInt();
			if (numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("Total de números pares: " + par);
		System.out.println("Total de números ímpares: " + impar);

	}

}
