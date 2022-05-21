package CM.bussines;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DAO{
	
	public void novoCadastro(String placa, String tipo, String modelo, String fabricante, String kmAtual, float kmProximaManut){
		
		try {
			
			Connection conexao = Conexao.getConexao();
			String sql ="INSERT INTO veiculos (placa,tipoVeiculo,modeloMarca,fabricante,kmAtual,kmProximaManutencao) VALUES (?,?,?,?,?,?)";
			
			PreparedStatement pstmt = conexao.prepareStatement(sql);
			pstmt.setString(1, placa);
			pstmt.setString(2, tipo);
			pstmt.setString(3, modelo);
			pstmt.setString(4, fabricante);
			pstmt.setString(5, kmAtual);
			pstmt.setFloat(6, kmProximaManut);
			pstmt.executeUpdate();
			conexao.close();
			}
		
			catch (Exception e) {
			System.out.println("Erro ao inserir");
		}
	};

	
}
