package Arrays1;

import java.util.Arrays;

public class Exercicio_Arrays1 {

	public static void main(String[] args) {
		double[] notasAlunaA = new double[3];
		notasAlunaA[0] = 7.8;
		notasAlunaA[1] = 8;
		notasAlunaA[2] = 6.3;
		
		System.out.println("Notas: " + Arrays.toString(notasAlunaA));
		
		double total = 0;
		for(int i = 0; i<notasAlunaA.length; i++) {
			total += notasAlunaA[i];
		}
		System.out.println("Total: " + total);
		System.out.println("Média: " + total/3);
		
		double[] notasAlunoB = {6.5, 3, 9.7};
		total = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			total += notasAlunoB[i];
		}
		System.out.println("AlunoB: " + total/notasAlunoB.length);

	}

}
