package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		Produto p1 = new Produto("Caneta", 12.56, 0.09);
		imprimir.accept(p1);
		
		Produto p2 = new Produto("Caneta2", 12.56, 0.10);
		Produto p3 = new Produto("Caneta3", 10.56, 0.11);
		Produto p4 = new Produto("Caneta4", 6.56, 0.12);
		Produto p5 = new Produto("Caneta5", 3.00, 0.13);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}
