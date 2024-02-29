package vetor_matriz;

public class Teste {

	public static void main(String[] args) {
		int numeros[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int tamanho = numeros.length;
		int somaDiagonalPrincipal = 0;
		int somaDiagonalSecundaria = 0;
		int[] diagonalPrincipal = new int[tamanho];
		int[] diagonalSecundaria = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			diagonalPrincipal[i] = numeros[i][i];
			somaDiagonalPrincipal += diagonalPrincipal[i];

			diagonalSecundaria[i] = numeros[i][tamanho - 1 - i];
			somaDiagonalSecundaria += diagonalSecundaria[i];
		}

		System.out.print("Diagonal Principal: ");
		for (int num : diagonalPrincipal) {
			System.out.print(num + " ");
		}
		System.out.println("(Soma: " + somaDiagonalPrincipal + ")");

		System.out.print("Diagonal Secundária: ");
		for (int num : diagonalSecundaria) {
			System.out.print(num + " ");
		}
		System.out.println("(Soma: " + somaDiagonalSecundaria + ")");

	}

}
