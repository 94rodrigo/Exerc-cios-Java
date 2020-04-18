package equals_Hashcode;

public class Usuario {
	String nome, email;
	
	public boolean equals(Object objeto) {
		Usuario outro = (Usuario) objeto;		
		boolean nomeIgual = outro.nome.equals(this.nome);
		boolean emailIgual = outro.email.equals(this.email);
		
		return nomeIgual && emailIgual;
	}
}
