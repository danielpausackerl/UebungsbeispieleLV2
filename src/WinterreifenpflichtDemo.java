
public class WinterreifenpflichtDemo {

	public static void main(String[] args) {

		int temperatur = 9;
		boolean rutschigeFahrbahn = true;

		/*
		 * diese Variablen m�ssen in der Methode unten nicht gleich hei�en aber
		 * bei dem if hier unten muss ich zuerst (genau wie unten) den int und
		 * dann den boolean Namen nennen
		 */

		if (isWinterreifenPflicht(temperatur, rutschigeFahrbahn)) {
			System.out.println("Bitte Winterreifen verwenden");
		} else {
			System.out.println("Winterreifen sind nicht n�tig");
		}
	}

	public static boolean isWinterreifenPflicht(int temperatur, boolean rutschigeFahrbahn) {

		/*
		 * "void" w�rde uns keine Ausgabe liefern
		 * 
		 * !!!TIPP: Rechtsklick - Refactor - Rename = alle gleichen Variablen
		 * werden umbenannt!!!
		 */

		/*
		 * boolean result = (temperatur < 10 && rutschigeFahrbahn) || temperatur
		 * < 4;
		 * 
		 * //&& bindet st�rker als || also ich br�uchte die Klammern nicht!
		 * eigentlich brauche ich result gar nicht sondern kann gleich return
		 * nehmen
		 * 
		 * return result;
		 */

		return (temperatur < 10 && rutschigeFahrbahn) || temperatur < 4;

	}
}
