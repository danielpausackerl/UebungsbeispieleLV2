
public class TurmDemo {

	public static void main(String[] args) {

		int startZahl = 2;
		int counter = 2;

		while (counter <= 9) {
			System.out.println(startZahl + " * " + counter + " = " + (startZahl * counter));
			startZahl = startZahl * counter;

			/*
			 * startZahl *= counter; wäre die kürzere Schreibweise
			 * 
			 * startZahl *= counter++; wäre die kürzeste Schreibweise, dann
			 * brauche ich die nächste untere Zeile nicht mehr geht dann gleich
			 * bei der zweiten while Schleife!!
			 */

			counter = counter + 1;
			// counter++; wäre die kürzere Schreibweise
		}

		counter = 2;

		while (counter <= 9) {
			System.out.println(startZahl + " / " + counter + " = " + (startZahl / counter));
			startZahl = startZahl / counter;
			counter++;

			// startZahl /= counter++; wäre die kürzere Schreibweise

		}
	}
}