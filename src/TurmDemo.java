
public class TurmDemo {

	public static void main(String[] args) {

		int startZahl = 2;
		int counter = 2;

		while (counter <= 9) {
			System.out.println(startZahl + " * " + counter + " = " + (startZahl * counter));
			startZahl = startZahl * counter;

			/*
			 * startZahl *= counter; w�re die k�rzere Schreibweise
			 * 
			 * startZahl *= counter++; w�re die k�rzeste Schreibweise, dann
			 * brauche ich die n�chste untere Zeile nicht mehr geht dann gleich
			 * bei der zweiten while Schleife!!
			 */

			counter = counter + 1;
			// counter++; w�re die k�rzere Schreibweise
		}

		counter = 2;

		while (counter <= 9) {
			System.out.println(startZahl + " / " + counter + " = " + (startZahl / counter));
			startZahl = startZahl / counter;
			counter++;

			// startZahl /= counter++; w�re die k�rzere Schreibweise

		}
	}
}