package CM.bussines;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.fabric.xmlrpc.base.Value;

public class validate {

	public boolean validaPlaca(String Placa) throws IOException, SQLException {

		boolean validador = false;
		if (Placa.isEmpty() || Placa.isBlank()) {
			System.out.println("Preencha o campo da placa.");
			validador = false;
		}

		else {

			Connection conexao = Conexao.getConexao();

			String query = "SELECT * FROM veiculos where (placa) ='" + Placa + "'";
			PreparedStatement stmt = conexao.prepareStatement(query);
			ResultSet sr = stmt.executeQuery(query);

			List<String> placaVeiculo = new ArrayList<String>();

			while (sr.next()) {

				placaVeiculo.add(query);
			}

			for (String string : placaVeiculo) {
				string.contains(Placa);
				validador = true;
			}
		}
		return validador;
	}

	public boolean validaTipoVeiculo(String Modelo) {
		boolean validador = true;

		// Futuramente irei migrar estes dados dos veiculos para uma nova tabela no
		// banco de dados.
		if ("CARRO".equalsIgnoreCase(Modelo) || "MOTO".equalsIgnoreCase(Modelo) || "CAMINHAO".equalsIgnoreCase(Modelo)
				|| "VAN".equalsIgnoreCase(Modelo)) {
			validador = true;
		} else {
			validador = false;
		}
		return validador;
	};

	public boolean validaKmAtual(String km) {

		if (km.isEmpty() || km.isBlank() || km.length() > 7) {

			return false;
		} else {

			return true;
		}

	}
}
