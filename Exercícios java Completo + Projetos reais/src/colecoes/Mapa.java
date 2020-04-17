package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1, "Roberto");
		usuarios.put(1, "Rodrigo"); // inclui ou altera
		usuarios.put(2, "Alberto");
		usuarios.put(3, "ASSASAS");
		
		
		System.out.println(usuarios);
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsValue("Rodrigo"));
		
		System.out.println(usuarios.get(3));
	}

}
