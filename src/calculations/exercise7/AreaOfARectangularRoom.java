package calculations.exercise7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaOfARectangularRoom {

	public static void main(String[] args) {

		RechnungenF�rEx7 rechnungen = new RechnungenF�rEx7() {
		};
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Gib die L�nge des Raums in Fu� an --> ");
			rechnungen.setRoomLength(sc.nextDouble());

			System.out.print("Gib die Breite des Raums in Fu� an --> ");
			rechnungen.setRoomWidth(sc.nextDouble());
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException-Fehler aufgetreten!");
			System.exit(0);
		}

		System.out.println(rechnungen);

		sc.close();

	}
}
