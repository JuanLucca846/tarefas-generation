package exercicios_lacos_condicionais;

import java.util.Scanner;

public class ExercicioTres {
	public static void main(String[] args) {
		String nome;
		int idade;
		boolean primeiraDoacao;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o Nome do doador: ");
		nome = scanner.nextLine();

		System.out.println("Digite a Idade do doador: ");
		idade = scanner.nextInt();

		System.out.println("Primeira doação de sangue? (true/false) ");
		primeiraDoacao = scanner.nextBoolean();

		if (idade >= 60 && idade <= 69 && primeiraDoacao) {
			System.out.println(nome + " não está apto para doar sangue!");
		} else if (idade >= 18 && idade < 60) {
			System.out.println(nome + " está apto para doar sangue!");
		} else {
			System.out.println(nome + " não está apto para doar sangue!");
		}

		scanner.close();

	}
}
