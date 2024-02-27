package exercicios_lacos_condicionais;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {

		int codigo, quantidade;
		float valor;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Código do Produto: ");
		codigo = scanner.nextInt();

		System.out.println("Quantidade: ");
		quantidade = scanner.nextInt();

		switch (codigo) {
		case 1:
			System.out.println("Produto: Cachorro Quente");
			valor = (float) 10.00;
			System.out.printf("Valor total: R$ %.2f", valor * quantidade);
			break;
		case 2:
			System.out.println("Produto: X-Salada");
			valor = (float) 15.00;
			System.out.println("Valor total: R$ " + valor * quantidade);
			break;
		case 3:
			System.out.println("Produto: X-Bacon");
			valor = (float) 18.00;
			System.out.println("Valor total: R$ " + valor * quantidade);
			break;
		case 4:
			System.out.println("Produto: Bauru");
			valor = (float) 12.00;
			System.out.println("Valor total: R$ " + valor * quantidade);
			break;
		case 5:
			System.out.println("Produto: Refrigerante");
			valor = (float) 8.00;
			System.out.println("Valor total: R$ " + valor * quantidade);
			break;
		case 6:
			System.out.println("Produto: Suco de laranja");
			valor = (float) 13.00;
			System.out.println("Valor total: R$ " + valor * quantidade);
			break;

		}

		scanner.close();
	}

}
