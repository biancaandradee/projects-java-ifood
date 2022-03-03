import java.util.List;

public class BuscaPessoa1 {

	public PessoaFisica buscaPessoaPorCpf(List pessoas, String cpf) {
	    for (PessoaFisica pessoaFisica : pessoas) {
	      if (pessoaFisica.cpf.equals(cpf))
	        return pessoaFisica;
	    }
	    return null;
	  }
	
	  class PessoaFisica {
	    String cpf;
	    @Override
	    public int hashCode() {
	      final int prime = 31;
	      int result = 1;
	      result = prime * result + getOuterType().hashCode();
	      result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
	      return result;
	    }
	    
	    @Override
	    public boolean equals(Object obj) {
	      if (this == obj)
	        return true;
	      if (obj == null)
	        return false;
	      if (getClass() != obj.getClass())
	        return false;
	      PessoaFisica other = (PessoaFisica) obj;
	      if (!getOuterType().equals(other.getOuterType()))
	        return false;
	      if (cpf == null) {
	        if (other.cpf != null)
	          return false;
	      } else if (!cpf.equals(other.cpf))
	        return false;
	      return true;
	    }
	    
	    private BuscaPessoa1 getOuterType() {
	      return BuscaPessoa1.this;
	    }
	  }
}
