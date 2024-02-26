package exerciciosintroducao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		
		float salario, abono, novoSalario;
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o salario");
		salario = scanner.nextFloat();
		
		System.out.println("Digite o abono");
		abono = scanner.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println(novoSalario);

	}

}
