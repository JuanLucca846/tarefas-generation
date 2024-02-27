package lacos_condicionais;

import java.util.Scanner;

public class Interativo {
public static void main(String[] args) {
		
		
		
		float x;
		int y;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um valor para x");
		x = leia.nextFloat();
		
		
		System.out.println("Digite um valor para y");
		y = leia.nextInt();
		
		if(x > y) {
			System.out.println("X maior que Y");
		}else if(x == y) {
			System.out.println("Não tem maior");
		}else {
			System.out.println("Y maior que X");
		}

	}
}
