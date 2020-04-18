package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {
		
		// Não permite conversão int -> Double
		
		BinaryOperator<Double> calc = (x, y) -> { // Double -> tipo que é recebido e retornado
			return x + y;
		};
		System.out.println(calc.apply(2.0, 3.0));
		
		calc = (x, y) -> x*y;
		System.out.println(calc.apply(2.0, 3.0));
	}
}
