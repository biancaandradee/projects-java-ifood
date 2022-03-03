
public class Pessoa {

	String nome;
	String sobrenome;
	String idade;
	
	
	@Override
	  public boolean equals(Object obj) {
	    if (!(obj instanceof Pessoa))
	      return false;
	    Pessoa other = (Pessoa) obj;
	    if (!this.nome.equals(other.nome) || !this.idade.equals(other.idade))
	      return false;
	    return true;
	  }

}
