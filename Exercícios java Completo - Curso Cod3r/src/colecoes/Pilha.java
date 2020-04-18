package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno prńcipe"); // boolean
		livros.push("Dom Quixote"); //não tem retorno
		livros.push("O Hobbit");

		System.out.println(livros.peek()); // mostra elemento do topo
		System.out.println(livros.element()); // mostra elemento do topo
		
		System.out.println(livros.poll());
		System.out.println(livros.pop());
		
//		livros.size();
//		livros.clear();
//		livros.contains(arg0);
//		livros.isEmpty();
	}

}
