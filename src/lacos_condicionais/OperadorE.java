package lacos_condicionais;

import java.util.Scanner;

public class OperadorE {
	public static void main(String[] args) {
		/*
		int idade;
		boolean carteiraM;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a sua idade");
		idade = leia.nextInt();
		
		System.out.println("Você tem carteira de habilitação? (true/false)");
		carteiraM = leia.nextBoolean();
		
		if(idade >= 18 && carteiraM) {
			System.out.println("Pode dirigir");
		}else {
			System.out.println("Não pode dirigir :(");
		}
		
		leia.close();
*/
		
		float nota1, nota2, media;
		
		String nome;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		nome = leia.next();
		
		System.out.println(nome);
		
		System.out.println("Digite a primeira nota");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota");
		nota2 = leia.nextFloat();
		
		media = (nota1 + nota2) / 2;
		
		System.out.println("Sua media foi de : " + media);
	}

}
