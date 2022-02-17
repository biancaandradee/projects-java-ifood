package core;

/* Toda classe, queiramos ou não, possui Object como sua superclasse
 * A Declaração public class Pessoa é uma forma "condensada/resumida" de se explicitar o seguinte
 * public class Pessoa extends Object
 * Dessa forma, Object possui um construtor (sem parâmetros). Este construtor é invocado
 * pelo construtor da classe que criamos através da 1a linha, chamando super()
 * (no fundo é o construtor da classe pai) 
 */

public class Pessoa {
	protected String nome;
	protected String email;
	protected String telefone;
	
	public Pessoa(String nome, String email, String telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	public void mostrar() {
		System.out.println("Pessoa: "+this.nome+"/"+this.email+"/"+this.telefone);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
