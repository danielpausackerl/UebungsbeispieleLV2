
public class WinterreifenpflichtDemo {

	public static void main(String[] args) {

		int temperatur = 9;
		boolean rutschigeFahrbahn = true;

		/*
		 * diese Variablen müssen in der Methode unten nicht gleich heißen aber
		 * bei dem if hier unten muss ich zuerst (genau wie unten) den int und
		 * dann den boolean Namen nennen
		 */

		if (isWinterreifenPflicht(temperatur, rutschigeFahrbahn)) {
			System.out.println("Bitte Winterreifen verwenden");
		} else {
			System.out.println("Winterreifen sind nicht nötig");
		}
	}

	public static boolean isWinterreifenPflicht(int temperatur, boolean rutschigeFahrbahn) {

		/*
		 * "void" würde uns keine Ausgabe liefern
		 * 
		 * !!!TIPP: Rechtsklick - Refactor - Rename = alle gleichen Variablen
		 * werden umbenannt!!!
		 */

		/*
		 * boolean result = (temperatur < 10 && rutschigeFahrbahn) || temperatur
		 * < 4;
		 * 
		 * //&& bindet stärker als || also ich bräuchte die Klammern nicht!
		 * eigentlich brauche ich result gar nicht sondern kann gleich return
		 * nehmen
		 * 
		 * return result;
		 */

		return (temperatur < 10 && rutschigeFahrbahn) || temperatur < 4;

	}
}
