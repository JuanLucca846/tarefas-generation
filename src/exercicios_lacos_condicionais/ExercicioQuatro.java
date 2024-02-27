package exercicios_lacos_condicionais;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		String primeiraPlavra, segundaPalavra, terceiraPalavra;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a primeira palavra: ");
		primeiraPlavra = scanner.next();

		System.out.println("Digite a segunda palavra: ");
		segundaPalavra = scanner.next();

		System.out.println("Digite a terceira palavra: ");
		terceiraPalavra = scanner.next();

		if (primeiraPlavra.equals("vertebrado") && segundaPalavra.equals("ave")
				&& terceiraPalavra.equals("carnivoro")) {
			System.out.println("Águia");
		} else if (primeiraPlavra.equals("vertebrado") && segundaPalavra.equals("ave")
				&& terceiraPalavra.equals("onivoro")) {
			System.out.println("Pomba");
		} else if (primeiraPlavra.equals("vertebrado") && segundaPalavra.equals("mamifero")
				&& terceiraPalavra.equals("onivoro")) {
			System.out.println("Homem");
		} else if (primeiraPlavra.equals("vertebrado") && segundaPalavra.equals("mamifero")
				&& terceiraPalavra.equals("herbivoro")) {
			System.out.println("Vaca");
		} else if (primeiraPlavra.equals("invertebrado") && segundaPalavra.equals("inseto")
				&& terceiraPalavra.equals("hematofago")) {
			System.out.println("Pulga");
		} else if (primeiraPlavra.equals("invertebrado") && segundaPalavra.equals("inseto")
				&& terceiraPalavra.equals("herbivoro")) {
			System.out.println("Lagarta");
		} else if (primeiraPlavra.equals("invertebrado") && segundaPalavra.equals("anelideo")
				&& terceiraPalavra.equals("hematofago")) {
			System.out.println("Sanguessuga");
		} else {
			System.out.println("Minhoca");
		}

		scanner.close();

	}

}
