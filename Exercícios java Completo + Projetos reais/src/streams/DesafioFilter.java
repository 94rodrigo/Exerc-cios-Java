package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	public static void main(String[] args) {
		Carro c01 = new Carro("VW", "Golf", "Hatch", 80000.00, true);
		Carro c02 = new Carro("Fiat", "Strada", "Picape", 40000.00, false);
		Carro c03 = new Carro("Honda", "Fit", "Minivan", 60000.00, true);
		Carro c04 = new Carro("Honda", "Civic", "Sedan", 90000.00, false);
		Carro c05 = new Carro("BMW", "328i", "Sedan", 250000.00, true);
		Carro c06 = new Carro("VW", "Jetta", "Sedan", 90000.00, false);
		Carro c07 = new Carro("VW", "Up", "Hatch", 35000.00, true);
		Carro c08 = new Carro("Chevrolet", "Tracker", "SUV", 95000.00, false);
		Carro c09 = new Carro("Chevrolet", "Onix", "Hatch", 45000.00, true);
		Carro c10 = new Carro("VW", "Kombi", "Perua", 30000.00, false);
		
		List<Carro> carros = Arrays.asList(c01, c02, c03, c04, c05, c06, c07, c08, c09, c10);
		
		Predicate<Carro> metalica = c -> c.pinturaMetalica;
//		Predicate<Carro> marca = c -> c.marca.equals("VW");
//		Predicate<Carro> categoria = c -> c.categoria.equals("Hatch");
		Predicate<Carro> caro = c -> c.preco >= 70000.00;
		
		Function<Carro, String> anuncio = 
				c -> "O " + c.marca + " " + c.modelo + " possui pintura metálica e custa R$ " + c.preco;
				
		carros.stream()
			.filter(metalica)
			.filter(caro)
			.map(anuncio)
			.forEach(System.out::println);
	}
}
