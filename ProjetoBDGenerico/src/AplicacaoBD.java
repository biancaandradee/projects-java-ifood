
public class AplicacaoBD {
	public static void main(String[] args) {
		InterfaceBD ibd = null;
		ibd = new BDMysql();
		ibd = new BDOracle();
		ibd = new BDPostgres();

		ibd.conectar();
		ibd.executarComando("Select * from tb_produto");
		ibd.desconectar();

	}
}
