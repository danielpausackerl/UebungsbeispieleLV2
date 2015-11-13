
public class NotenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int punkte = 66;

		System.out.println("Punkte = " + punkte + " => Note = " + getNotentext(punkte));

	}

	public static String getNotentext(int punkte) {

		String note = ""; //Leerstring

		if (punkte >= 90) {
			note = "Sehr gut";
		} else if (punkte >= 78) {
			note = "Gut";
		} else if (punkte >= 65) {
			note = "Befriedigend";
		} else if (punkte >= 51) {
			note = "Genügend";
		} else {
			note = "Ungenügend";
		}

		return note;
	}

}

/*Übungsbeispiel Notenermittlung anders herum 
		int punkte = 75;

		System.out.println("Punkte = " + punkte + " => Note = " + getNotentext(punkte));

	}

	public static String getNotentext(int punkte) {

		String note = "";

		if (punkte < 51) {
			note = "Ungenügend";
		} else if (punkte < 65) {
			note = "Genügend";
		} else if (punkte < 78) {
			note = "Befriedigend";
		} else if (punkte < 90) {
			note = "Gut";
		} else {
			note = "Sehr Gut";
		}

		return note;
	}
*/


/* 90 <= Sehr Gut <= 100      if(punkte <= 100 && punkte >= 90)
   78<= Gut < 90              else if(punkte >= 65 && punkte < 78)
   65<= Befriedigend < 78
   51<= Genügend < 65
   0<= Nicht Genügend < 51 */
