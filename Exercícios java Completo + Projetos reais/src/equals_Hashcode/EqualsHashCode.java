package equals_Hashcode;

public class EqualsHashCode {
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Rodrigo";
		u1.email = "rodrigo@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Rodrigo";
		u2.email = "rodrigo@gmail.com";
		
		System.out.println(u1.equals(u2)); //false
		System.out.println(u1.nome.equals(u2.nome)); //true
	}
}
