package exercicios_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();

		for (int contador = 0; contador < 5; contador++) {
			System.out.println("Digite uma cor: ");
			String adicionaCor = scanner.nextLine();
			cores.add(adicionaCor);
		}

		System.out.println("Listar todas as cores: " + cores);

		Collections.sort(cores);
		System.out.println("Ordenar as cores: " + cores);

	}

}
