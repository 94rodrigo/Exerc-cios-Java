package orientacao_objetos_desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Rodrigo");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.67, 100);
		compra1.adicionarItem(new Produto("Notebook", 2000), 2);
		
		c1.compras.add(compra1);
		
		System.out.println(c1.obterValorTotal());
	}

}
