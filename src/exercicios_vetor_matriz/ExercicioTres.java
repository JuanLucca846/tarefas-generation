package exercicios_vetor_matriz;

public class ExercicioTres {

	public static void main(String[] args) {
		int numeros[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }, linha, coluna, resultadoDiagonalPrincipal = 0,
				d1 = 0, d2 = 0, d3 = 0, resultadoDiagonalSecundaria = 0;

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {

				if (linha == coluna) {
					System.out.println("numeros [" + linha + "][" + coluna + "]" + numeros[linha][coluna]);
					resultadoDiagonalPrincipal += numeros[linha][coluna];

				}
			}
		}

		System.out.println("Soma: " + resultadoDiagonalPrincipal);

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {

				if (linha == 0 && coluna == 2) {
					System.out.println("numeros [" + linha + "][" + coluna + "]" + numeros[linha][coluna]);
					d1 = numeros[linha][coluna];
				} else if (linha == 1 && coluna == 1) {
					System.out.println("numeros [" + linha + "][" + coluna + "]" + numeros[linha][coluna]);
					d2 = numeros[linha][coluna];
				} else if (linha == 2 && coluna == 0) {
					System.out.println("numeros [" + linha + "][" + coluna + "]" + numeros[linha][coluna]);
					d3 = numeros[linha][coluna];
				}
			}
		}

		System.out.println("Soma: " + (resultadoDiagonalSecundaria = d1 + d2 + d3));

	}

}
