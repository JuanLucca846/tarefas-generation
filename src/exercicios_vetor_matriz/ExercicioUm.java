package exercicios_vetor_matriz;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {

		int vetorInteiros[] = new int[]{ 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 }, indice, numero;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o número que você deseja encontrar: ");
		numero = scanner.nextInt();

		if(numero <= 9) {
			System.out.println("O numero " + vetorInteiros[numero] + " está localizado na posição: " + numero);
		}else {
			System.out.println("O número " + numero + " não foi encontrado!");
		}
		
		
	}

}
