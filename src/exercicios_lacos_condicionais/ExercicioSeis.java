package exercicios_lacos_condicionais;

import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {

		String nome;
		int cargo;
		float salario;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nome do colaborador: ");
		nome = scanner.nextLine();

		System.out.println("Cargo: ");
		cargo = scanner.nextInt();

		System.out.println("Salário: ");
		salario = scanner.nextFloat();

		switch (cargo) {
		case 1:
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Gerente");
			System.out.println("Salario: R$ " + salario * 1.10);
			break;
		case 2:
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Vendedor");
			System.out.println("Salario: R$ " + salario * 1.07);
			break;
		case 3:
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Supervisor");
			System.out.println("Salario: R$ " + salario * 1.09);
			break;
		case 4:
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Motorista");
			System.out.println("Salario: R$ " + salario * 1.06);
			break;
		case 5:
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Estoquista");
			System.out.println("Salario: R$ " + salario * 1.05);
			break;
		case 6:
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Tecnico de TI");
			System.out.println("Salario: R$ " + salario * 1.08);
			break;

		}

		scanner.close();

	}

}
