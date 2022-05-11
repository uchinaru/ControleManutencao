package CM.bussines;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

public static Connection getConexao() throws IOException{
	
	try {
		String url ="jdbc:mysql://localhost:3306/manutencao";
		String user="root";
		String senha="40593413";
		
		// O driveMenager exponhe uma excessao checada entao nao e obrigatorio tratar ou com throws ou try catch.
		Connection conexao = DriverManager.getConnection(url, user, senha);
		
		return conexao;
		
	} catch (SQLException e) {
		// lancando a exception e apresentando a mensagem original em 'e'
		throw new RuntimeException(e);
	}
}

}
