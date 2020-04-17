package lambdas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/*
1. A partir do produto, calcular o preço real (com desconto)
2. Imposto Municipla : >= 2500 (8.5%) / < 2500 (Isento)
3. Frete: >= 3000 (100) / < 3000 (50)
4. Arredondar: Deixar duas casas decimais
5. Formatar: R$ 1234,56
*/
public class Desafio {
	public static void main(String[] args) {
		Produto p = new Produto("Tablet", 3235.89, 0.13);
		
		Function<Produto, Double> aplicarDesconto =
				(produto) -> produto.preco*(1-produto.desconto);
		
		UnaryOperator<Double> aplicarImposto = (preco) -> {
			return preco >= 2500.00 ? preco*=(1+0.085) : preco;
		};
		
		UnaryOperator<Double> aplicarFrete = (preco) -> {
			return preco >= 3000.00 ? preco+=100 : preco+50;
		};
		
		UnaryOperator<Double> arredondar = (preco) -> {
			BigDecimal bd = new BigDecimal(preco).setScale(2, RoundingMode.HALF_EVEN);
			return preco = bd.doubleValue();
		};
		
		Function<Double, String> formatar = (preco) -> {
			return "R$ " + preco.toString().replace(".", ",");
		};
		
		String precoFinal = aplicarDesconto
				.andThen(aplicarImposto)
				.andThen(aplicarFrete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		System.out.println(precoFinal);
		
	}
}
