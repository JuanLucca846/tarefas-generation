package exercicios_lacos_condicionais;

import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {

		float primeiroNumero, segundoNumero;
		int operacao;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o 1º número: ");
		primeiroNumero = scanner.nextFloat();

		System.out.println("Digite o 2º número: ");
		segundoNumero = scanner.nextFloat();

		System.out.println("Operação: ");
		operacao = scanner.nextInt();

		switch (operacao) {
		case 1:
			System.out.println(primeiroNumero + " + " + segundoNumero + " = " + (primeiroNumero + segundoNumero));
			break;
		case 2:
			System.out.println(primeiroNumero + " - " + segundoNumero + " = " + (primeiroNumero - segundoNumero));
			break;
		case 3:
			System.out.println(primeiroNumero + " * " + segundoNumero + " = " + (primeiroNumero * segundoNumero));
			break;
		case 4:
			System.out.println(primeiroNumero + " / " + segundoNumero + " = " + (primeiroNumero / segundoNumero));
			break;
		default:
			System.out.println("Operação Inválida!");

		}

		scanner.close();

	}

}
