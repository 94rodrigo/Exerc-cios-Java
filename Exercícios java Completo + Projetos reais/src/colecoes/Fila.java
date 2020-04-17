package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
//		Offer e add -> adicionam elementos na fila
		fila.add("Rodrigo");
		fila.offer("João"); //se tiver restrição de tamanho, retorna false se estiver lotado
		fila.offer("Carlos");
		fila.offer("Bia");
		fila.offer("Rafaela");
		
		System.out.println(fila.peek()); // retorna o primeiro da fila. Se estiver vazio, retorna null
		System.out.println(fila.element()); // Ambos não removem elemento
		
//		fila.clear();
//		fila.isEmpty();
//		fila.size();
//		fila.contains(arg0);
		
		// .poll e .remove -> remove o primeiro elemento adicionado
		System.out.println(fila.poll()); // se estiver vazia, retorna null
		System.out.println(fila.remove()); // lança uma exceção

	}

}
