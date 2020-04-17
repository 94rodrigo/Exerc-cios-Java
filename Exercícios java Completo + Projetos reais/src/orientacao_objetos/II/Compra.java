package orientacao_objetos.II;

import java.util.ArrayList;

public class Compra {
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void addCompra(Produto produto, int qtde) {
		this.itens.add(new Item(produto, qtde));
	}
	
	void addCompra(String nome, double preco, int qtde) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, qtde));
	}
	
	double obterValorTotal() {
		double total = 0;
		for(Item item: itens) {
			total += item.qtde * item.produto.preco;
		}
		return total;
	}
}
