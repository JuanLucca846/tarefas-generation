package vetor_matriz;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		
		String cachorros[] = new String[3];
		int indice;
		
		Scanner scanner = new Scanner(System.in);
		
		for(indice=0; indice <3; indice++){
			System.out.println("Digite o " + (indice + 1) + " º nome: ");
			cachorros[indice] = scanner.nextLine();
			
		}
		
		
		for(indice =0; indice < cachorros.length; indice++) {
			System.out.println(cachorros[indice]);
		}

	}

}
