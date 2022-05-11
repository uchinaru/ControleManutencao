package CM.bussines;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) throws IOException, SQLException {
		DAO dao = new DAO();
		validate validate = new validate();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a placa do veiculo.");
		String placa = sc.nextLine();
		
		
		if (validate.validaPlaca(placa) == true) {
			System.out.println("Placa duplicada");
		} else {
			dao.inserirPlaca(placa);
			System.out.println("Dados inseridos com sucesso");
		}
		
		sc.close();
	}

}
