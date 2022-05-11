package CM.bussines;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DAO{
	
	public String inserirPlaca(String placa) throws IOException {
		
		try {
			
			if ( placa.isEmpty() || placa.isBlank()) {
				
				System.out.println("Campo nulo ou vazio.");
			} 
			else {
			Connection conexao = Conexao.getConexao();
			String sql ="INSERT INTO veiculos (placa) VALUES ('"+placa+"')";
			
			PreparedStatement pstmt = conexao.prepareStatement(sql);
			pstmt.execute();
			conexao.close();
			} 
		}
			catch (Exception e) {
			System.out.println("Erro ao inserir");
		}
		return placa;
	};

	public void  inserirModelo(String modelo) {
		
		try {
		Connection conexao = Conexao.getConexao();
		
		String sql ="INSERT INTO veiculos (modelo) VALUES ('"+modelo+"')";
		PreparedStatement pstmt = conexao.prepareStatement(sql);
		pstmt.execute();
		conexao.close();
		} 
		catch (Exception e) {
			System.out.println("Erro ao inserir");
		}
		
	};
	
}
