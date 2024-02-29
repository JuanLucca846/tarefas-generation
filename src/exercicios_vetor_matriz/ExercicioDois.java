package exercicios_vetor_matriz;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {

		int vetorInteiros[] = new int[10], vetorImpares[] = new int[5], vetorPares[] = new int[5], indice,
				indiceImpar = 0, indicePar = 0;

		Scanner scanner = new Scanner(System.in);

		for (indice = 0; indice < vetorInteiros.length; indice++) {
			System.out.println("Digite os números do vetor: ");
			vetorInteiros[indice] = scanner.nextInt();

			if (indice % 2 == 1) {
				vetorImpares[indiceImpar] = vetorInteiros[indice];
				indiceImpar++;
			} 
			// if dos pares lembrar dps if()
		}

		System.out.println("Elementos nos índices ímpares: ");
		for (indice = 0; indice < vetorImpares.length; indice++) {
			System.out.println(vetorImpares[indice]);
		}

		System.out.println("Pares");
		for (indice = 0; indice < vetorImpares.length; indice++) {
			System.out.println(vetorImpares[indice]);
		}

	}

}
