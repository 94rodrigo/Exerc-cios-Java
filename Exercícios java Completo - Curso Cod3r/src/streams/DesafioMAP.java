package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMAP {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		/*
		1. Número para string binária... 6 => "110"
		2. Inverter a string... "110" => "011"
		3. Converter de volta para inteiro... "011" => 3 
		*/
		
		Function<Integer, String> stringBinaria = n1 -> Integer
				.toBinaryString(n1);
		UnaryOperator<String> inverter = (n1) -> {
			StringBuffer sb = new StringBuffer(n1);
			return sb.reverse().toString();
		};
		Function<String, Integer> converter = (n1) -> {
			Integer bin = Integer.parseInt(n1, 2);
			return bin;
		};
		
		nums.stream()
			.map(stringBinaria)
			.map(inverter)
			.map(converter)
			.forEach(System.out::println);
		
//		
//		nums.stream().map(m -> m.toBinaryString(m)).forEach(System.out::println);
//		nums.forEach(System.out::println);
	}
}
