package Pilares_OO.Heranca.desafio1;

public class ClasseDoCarro {

	public static void main(String[] args) {
		Lamborghini lamborghini = new Lamborghini();
		Carro mercedez = new Mercedez();
		
		lamborghini.velocidadeAtual = 50;
		mercedez.velocidadeAtual = 60;
		
		lamborghini.acelerar();
		mercedez.acelerar();
		lamborghini.acelerar();

		
		System.out.println("Velocidade atual");
		System.out.println("Lamborghini: " + lamborghini.velocidadeAtual + " km/h");
		System.out.println("Mercedez: " + mercedez.velocidadeAtual + " km/h");
		
		lamborghini.ligarTurbo();
		lamborghini.frear();
		mercedez.frear();
		
		System.out.println("\nVelocidade atual");
		System.out.println("Lamborghini: " + lamborghini.velocidadeAtual + " km/h");
		System.out.println("Mercedez: " + mercedez.velocidadeAtual + " km/h");
	}

}
