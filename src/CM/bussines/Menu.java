package CM.bussines;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) throws IOException, SQLException {
		DAO dao = new DAO();
		validate validate = new validate();
		
		//Scanner para entrada dos dados temporariamente até a evoluçao do projeto.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a placa do veiculo.");
		String placa = sc.nextLine();
		
		System.out.println("Digite o tipo de veiculo.");
		String modelo = sc.nextLine();
		
		//Placa
		if (validate.validaPlaca(placa) == true) {
			System.out.println("Valor nulo ou duplicado.");
		} else {
			dao.inserirPlaca(placa,modelo);
		}
		
		//Modelo
		if (validate.tipoVeiculo(modelo) == false) {
			System.out.println("Modelo invalido.");
		} else {
			dao.inserirTipoVeiculo(modelo);
		}
		
		sc.close();
	}

}
