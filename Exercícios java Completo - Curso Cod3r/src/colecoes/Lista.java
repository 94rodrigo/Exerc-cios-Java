package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Rodrigo");
		
		lista.add(u1);
		lista.add(new Usuario("João"));
		lista.add(new Usuario("Maria"));
		lista.add(new Usuario("Roberto"));
		lista.add(new Usuario("Alberto"));
		
		System.out.println(lista.get(3).nome);
		
		for(Usuario u: lista) {
			System.out.println(u);
		}
		
	}
}
