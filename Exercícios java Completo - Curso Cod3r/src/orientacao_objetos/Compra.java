package orientacao_objetos;

import java.util.ArrayList;

public class Compra {
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(Item item) {
		itens.add(item);
		item.compra = this;
	}
	
	double getValorTotal() {
		double total = 0;
		for(Item item: itens) {
			total += item.qtde*item.preco;
		}
		
		return total;
	}
}
