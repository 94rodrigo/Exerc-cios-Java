package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet(); //não aceita repetição
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho: " + conjunto.size());
		
		System.out.println(conjunto.remove("Teste")); //true/false
		System.out.println(conjunto.contains(1)); //true/false
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		System.out.println(nums);
		
		//união entre dois conjuntos:
		System.out.println(conjunto.addAll(nums)); //retorna true/false
		//conjunto.retainAll(nums);
		System.out.println(conjunto);
		
	}

}
