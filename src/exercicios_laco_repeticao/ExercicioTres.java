package exercicios_laco_repeticao;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {

		int idade = 0, menor = 0, maior = 0;

		Scanner scanner = new Scanner(System.in);

		while (idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = scanner.nextInt();

			if (idade < 21) {
				menor++;
			} else if (idade > 50) {
				maior++;
			}
		}

		System.out.println("Total de pessoas menores de 21 anos: " + (menor - 1));
		System.out.println("Total de pessoas maiores de 50 anos: " + maior);

	}

}
