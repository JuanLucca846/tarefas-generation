package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploFila {

	public static void main(String[] args) {
		
		
		Queue<Integer> fila = new LinkedList<Integer>();
		
		for(int i = 0; i <= 10; i++) {
			fila.add(i);
		}
		
		System.out.println(fila);
		
		System.out.println(fila.remove());
		
		System.out.println(fila);
		
		System.out.println(fila.add(11));
		
		System.out.println(fila);
		
		System.out.println(fila.peek());
		
		
		Iterator<Integer> iterator = fila.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		

	}

}
