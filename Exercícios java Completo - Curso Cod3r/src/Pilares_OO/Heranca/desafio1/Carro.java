package Pilares_OO.Heranca.desafio1;

public class Carro {
	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual, delta = 5;
	
	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA)
			velocidadeAtual = VELOCIDADE_MAXIMA;
		else
			velocidadeAtual += delta;
	}
	
	void frear() {
		if(velocidadeAtual - delta <= 0)
			velocidadeAtual = 0;
		else
			velocidadeAtual -= delta;
	}
}
