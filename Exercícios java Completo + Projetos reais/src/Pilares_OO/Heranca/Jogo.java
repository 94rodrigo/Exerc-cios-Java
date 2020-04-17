package Pilares_OO.Heranca;

public class Jogo {
	public static void main(String[] args) {
		Jogador j1 = new Monstro();
		Heroi j2 = new Heroi(0, 0);
		
		j1.x = 10;
		j1.y = 10;
		
		j2.x = 10;
		j2.y = 11;
		
		j1.atacar(j2);
		j2.atacar(j1);
		
		System.out.println("Monstro: " + j1.vida);
		System.out.println("Herói: " + j2.vida);
		
		j1.andar(Direcao.NORTE);
	}
}
