package exercicios_lacos_condicionais;

import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {
		float saldo = (float) 1000.00, valor;
		int operacao;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Operação: ");
		operacao = scanner.nextInt();

		switch (operacao) {
		case 1:
			System.out.println("Operação - Saldo");
			System.out.println("Saldo: R$ " + saldo);
			break;
		case 2:
			System.out.println("Operação - Saque");

			System.out.println("Valor: ");
			valor = scanner.nextFloat();
			if (valor > saldo) {
				System.out.println("Saldo Insuficiente!");
			} else {
				System.out.println("Novo Saldo: " + (saldo - valor));
			}
			break;
		case 3:
			System.out.println("Operação - Depósito");
			System.out.println("Valor: ");
			valor = scanner.nextFloat();
			System.out.println("Novo Saldo: R$ " + (float) (saldo + valor));
			break;
		default:
			System.out.println("Operação Inválida!");

		}

		scanner.close();

	}

}
