package collections;

import java.util.Stack;

public class ExemploPilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		
		pilha.push("Patro verde");
		pilha.push("Patro vermelho");
		pilha.push("Patro azul");
		pilha.push("Patro preto");
		pilha.push("Patro amarelo");
		
		System.out.println(pilha);
		
		System.out.println(pilha.pop());
		
		System.out.println(pilha);

	}

}
