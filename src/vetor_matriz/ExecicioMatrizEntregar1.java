package vetor_matriz;

import java.util.Scanner;

public class ExecicioMatrizEntregar1 {

	public static void main(String[] args) {
		int numeros[][] = new int[3][3];

		int linha, coluna, somaPrincipal = 0, somaSecundaria = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println(" Digite os numeros: ");

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.print(" ");
				numeros[linha][coluna] = leia.nextInt();

			}
		}

		System.out.println(" Elementos da Diagonal Principal: ");

		for (linha = 0; linha < 3; linha++) {

			for (coluna = 0; coluna < 3; coluna++) {
				if (linha == coluna) {
					somaPrincipal = somaPrincipal + numeros[linha][coluna];
					System.out.print(" " + numeros[linha][coluna]);

				}

			}

		}
		System.out.println(" \n\n Elementos da Diagonal Secundária: ");

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				if (coluna == 3 - 1 - linha) {
					somaSecundaria = somaSecundaria + numeros[linha][coluna];
					System.out.print(" " + numeros[linha][coluna]);
				}

			}
		}

		System.out.println(" \n\n Soma dos Elementos da Diagonal Principal: ");
		System.out.println(" " + somaPrincipal);

		System.out.println(" \n Soma dos Elementos da Diagonal Secundária: ");
		System.out.println(" " + somaSecundaria);
		System.out.println();

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.printf(" %d |", numeros[linha][coluna]);
			}
			System.out.println();
		}

	}
}