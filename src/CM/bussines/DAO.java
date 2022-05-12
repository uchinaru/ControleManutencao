package CM.bussines;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DAO{
	
	public void inserirPlaca(String Placa, String Tipo){
		
		try {
			
			Connection conexao = Conexao.getConexao();
			String sql ="INSERT INTO veiculos (placa,tipoVeiculo) VALUES ('"+Placa+"', '"+Tipo+"')";
			
			PreparedStatement pstmt = conexao.prepareStatement(sql);
			pstmt.execute();
			conexao.close();
			}
		
			catch (Exception e) {
			System.out.println("Erro ao inserir");
		}
	};

	public void inserirTipoVeiculo(String Tipo) {
		
		try {
		Connection conexao = Conexao.getConexao();
		String sql ="INSERT INTO veiculos (tipoVeiculo) VALUES ('"+Tipo+"')";
		
		PreparedStatement pstmt = conexao.prepareStatement(sql);
		pstmt.executeUpdate(sql);
		conexao.close();
		} 
		
		catch (Exception e) {
			System.out.println("Erro ao inserir");
		}
	};
	
}
