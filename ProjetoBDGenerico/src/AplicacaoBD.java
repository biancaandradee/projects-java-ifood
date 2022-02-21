import java.util.Scanner;

public class AplicacaoBD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String database;

		InterfaceBD ibd = null;
		ibd = new BDMysql();
		ibd = new BDOracle();
		ibd = new BDPostgres();

		System.out.println("Digite Mysql | Oracle | Postgres: ");
		database = sc.nextLine();
//		
//		switch (database) {
//		case "Mysql":
//			ibd = new BDMysql();
//			break;
//		case "Oracle":
//			ibd = new BDOracle();
//			break;
//		case "Postgres":
//			ibd = new BDPostgres();
//			break;
//		}

		

		try {
			String nomeDaClasse = "BD" + database;
			ibd = (InterfaceBD)Class.forName(nomeDaClasse).getDeclaredConstructor().newInstance(null);
		} catch (Exception ex) {
			System.err.println("Erro a criar classe");
			ex.printStackTrace();
		}
		
		ibd.conectar();
		ibd.executarComando("Select * from tb_produto");
		ibd.desconectar();
		
		
		sc.close();
		
	}
}
