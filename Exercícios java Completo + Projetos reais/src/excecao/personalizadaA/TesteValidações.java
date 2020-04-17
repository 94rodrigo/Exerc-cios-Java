package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidações {
	public static void main(String[] args) {
		Aluno aluno;
		try {
			aluno = new Aluno("A", -7);
			Validar.usuario(aluno);
			Validar.usuario(null);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		}catch(NumeroForaDoIntervalo | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		

		System.out.println("Fim :)");
	}
	
}
