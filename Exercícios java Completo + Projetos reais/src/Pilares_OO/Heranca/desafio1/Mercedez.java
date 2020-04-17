package Pilares_OO.Heranca.desafio1;

public class Mercedez extends Carro{
	
	Mercedez() {
		super(250);
	}


	@Override
	void acelerar() {
		super.acelerar();
		super.acelerar();
	}

}
