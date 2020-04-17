package Pilares_OO.Heranca.desafio1;

public class Lamborghini extends Carro implements Esportivo{
	
	
	Lamborghini() {
		super(350);
	}

	void acelerar() {
		super.acelerar();
		super.acelerar();
		super.acelerar();
		super.acelerar();
		
	}
	
	void frear() {
		if(this.velocidadeAtual - 25 <= 0)
			this.velocidadeAtual = 0;
		else
			this.velocidadeAtual -= 25;
		
	}
	
	@Override
	public void ligarTurbo() {
		delta = 35;
		
	}
	
	@Override
	public void desligarTurbo() {
		delta = 20;
		
	}
}
