import com.oracle.enterprise.middleware.IService;
import br.com.biancacorp.importacao.core.Importador;

public class OracleMain {

	public static void main(String[] args) {
		IService service;
		service = new Importador();
		System.out.println("ORACLE ERP");
		service.importInvoice("<xml> invoice </xml>");
	}

}
