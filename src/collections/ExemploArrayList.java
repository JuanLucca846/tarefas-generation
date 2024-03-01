package collections;

import java.util.ArrayList;

public class ExemploArrayList {

	public static void main(String[] args) {
		
		ArrayList<Double> notas = new ArrayList<Double>();

		
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(4.0);
		
		System.out.println(notas);
		System.out.println(notas.indexOf(5d));
		
	}

}
