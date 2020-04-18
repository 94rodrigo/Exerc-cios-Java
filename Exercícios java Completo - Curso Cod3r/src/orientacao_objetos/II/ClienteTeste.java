package orientacao_objetos.II;

public class ClienteTeste {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Rodrigo");
		Compra compra1 = new Compra();
		compra1.addCompra("Caderno", 10.00, 3);
		compra1.addCompra(new Produto("Caneta", 1.50), 5);
		
		Compra compra2 = new Compra();
		compra2.addCompra("Notebook", 2000, 1);
		
		c1.addCompra(compra1);
		c1.addCompra(compra2);
		
		System.out.println(c1.obterValorCompra());
	}
	
	
}
