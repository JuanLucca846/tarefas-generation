package exerciciosintroducao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		int contador = 1;
		float nota, total = 0, media;
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		
		while(contador <= 4) {
			System.out.println("Digite a nota " + contador);
			nota = scanner.nextFloat();
			
			total += nota;
			contador++;
		}
		media = total / 4; 
		System.out.println(df.format(media));
		
	}

}
