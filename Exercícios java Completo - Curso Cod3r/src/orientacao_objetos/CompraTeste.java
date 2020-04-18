package orientacao_objetos;

public class CompraTeste {

	public static void main(String[] args) {
		Compra c1 = new Compra();
		c1.cliente = "Rodrigo";
		
		c1.adicionarItem(new Item("Caneta", 20, 7.45));
		c1.adicionarItem(new Item("Borracha", 12, 3.89));
		c1.adicionarItem(new Item("Caderno", 3, 18.28));
		
		System.out.println(c1.itens.size());
		System.out.println(c1.getValorTotal());

	}

}
