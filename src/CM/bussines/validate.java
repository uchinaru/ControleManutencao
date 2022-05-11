package CM.bussines;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class validate {
	
	public boolean validaPlaca(String placa) throws IOException, SQLException {
		boolean validador = false;
		
		Connection conexao = Conexao.getConexao();
		String query = "SELECT * FROM veiculos where (placa) ='"+placa+"'";
		PreparedStatement stmt = conexao.prepareStatement(query);
		ResultSet sr = stmt.executeQuery(query);
		
		List<String> placaVeiculo = new ArrayList<String>();
		
		while (sr.next()) {
			
			placaVeiculo.add(query);
		}
		
		for (String string : placaVeiculo) {
			string.contains(placa);
			validador=true;
			}
		return validador;
		}
	
	
	public boolean validaModelo() {
		
		
		return true;
	};

}
