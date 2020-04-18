package Arrays1;

import java.util.Scanner;

public class Desafio_Arrays1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tamanho;
		System.out.print("Informe quantas notas deseja lançar: ");
		tamanho = teclado.nextInt();
		double[] notas = new double[tamanho];
		for(int i = 0; i<notas.length; i++) {
			System.out.print("Insira a " + (i+1) + "º nota: ");
			notas[i] = teclado.nextDouble();
		}
		double total = 0;
		for(double nota: notas){
			total += nota;
		}
		System.out.println("Média: " + (total/notas.length));
		
		teclado.close();

	}

}
