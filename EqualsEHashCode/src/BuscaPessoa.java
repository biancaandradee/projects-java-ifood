import java.util.List;

public class BuscaPessoa {
	
	public PessoaFisica buscaPessoaPorCpf(List pessoas, String cpf) {
	    PessoaFisica pessoaFisica = new PessoaFisica();
	    pessoaFisica.cpf = cpf;
	    int indexOfPessoa = pessoas.indexOf(pessoaFisica);
	    if (indexOfPessoa > 0) {
	      return (BuscaPessoa.PessoaFisica) pessoas.get(indexOfPessoa);
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
	    
	    private BuscaPessoa getOuterType() {
	      return BuscaPessoa.this;
	    }
	  }
}
