package CM.bussines;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) throws IOException, SQLException {
		DAO dao = new DAO();
		validate validate = new validate();
		FormatUtils FormatUtils = new FormatUtils();

		// Scanner para entrada dos dados temporariamente até a evoluçao do projeto.
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a placa do veiculo.");
		String placaVeiculo = sc.nextLine().toUpperCase();

		System.out.println("Digite o tipo de veiculo.");
		String tipoVeiculo = sc.nextLine().toUpperCase();

		System.out.println("Digite o modelo do veiculo.");
		String modeloVeiculo = sc.nextLine().toUpperCase();

		System.out.println("Digite o fabricante do veiculo.");
		String fabricanteVeiculo = sc.nextLine().toUpperCase();

		System.out.println("Digite a quilometragem atual do veiculo.");
		String kmAtualVeiculo = sc.nextLine();

		// Validando alguns dados do cadastro.
		if (validate.validaPlaca(placaVeiculo) == true) {

			System.out.println("Placa já cadastrada");

		}
		if (!validate.validaTipoVeiculo(tipoVeiculo) == true) {

			System.out.println("Modelo de veiculo invalido.");
		}
		if (validate.validaKmAtual(kmAtualVeiculo) == false) {

			System.out.println("Preencha o campo da quilometragem ou insira valores validos.");
		} else {

			kmAtualVeiculo = FormatUtils.formataKm(kmAtualVeiculo);

			float kmProximaManut = 0;
			if (!"MOTO".equalsIgnoreCase(tipoVeiculo)) {
				kmProximaManut += Float.parseFloat(kmAtualVeiculo);
				kmProximaManut += (float) 10.000;

				dao.novoCadastro(placaVeiculo, tipoVeiculo, modeloVeiculo, fabricanteVeiculo, kmAtualVeiculo,
						kmProximaManut);
			} else {
				kmProximaManut += Float.parseFloat(kmAtualVeiculo);
				kmProximaManut += (float) 1.000;

				dao.novoCadastro(placaVeiculo, tipoVeiculo, modeloVeiculo, fabricanteVeiculo, kmAtualVeiculo,
						kmProximaManut);
			}
		}
		sc.close();
	}

}
