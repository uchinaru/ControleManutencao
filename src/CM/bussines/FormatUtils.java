package CM.bussines;

public class FormatUtils {

	String formataKm(String km) {

		String[] parte;

		if (km.length() == 4 && !km.contains(".")) {

			parte = km.split("(?<=\\G.{1})");

			String parte1 = parte[0].concat(".");
			String parte2 = parte[1];
			String parte3 = parte[2];
			String parte4 = parte[3];

			km = parte1 + parte2 + parte3 + parte4;

			return km;
		} else if (km.length() == 5 && !km.contains(".")) {

			parte = km.split("(?<=\\G.{1})");

			String parte6 = parte[0];
			String parte7 = parte[1].concat(".");
			String parte8 = parte[2];
			String parte9 = parte[3];
			String parte10 = parte[4];

			km = parte6 + parte7 + parte8 + parte9 + parte10;
			return km;
		} else if (km.length() == 6 && !km.contains(".")) {
			parte = km.split("(?<=\\G.{1})");

			String parte11 = parte[0];
			String parte12 = parte[1];
			String parte13 = parte[2].concat(".");
			String parte14 = parte[3];
			String parte15 = parte[4];
			String parte16 = parte[5];

			km = parte11 + parte12 + parte13 + parte14 + parte15 + parte16;
			return km;
		}
		return km;
	}
}
