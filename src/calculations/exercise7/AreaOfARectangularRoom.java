package calculations.exercise7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaOfARectangularRoom {

	public static void main(String[] args) {

		RechnungenFürEx7 rechnungen = new RechnungenFürEx7() {
		};
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Gib die Länge des Raums in Fuß an --> ");
			rechnungen.setRoomLength(sc.nextDouble());

			System.out.print("Gib die Breite des Raums in Fuß an --> ");
			rechnungen.setRoomWidth(sc.nextDouble());
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException-Fehler aufgetreten!");
			System.exit(0);
		}

		System.out.println(rechnungen);

		sc.close();

	}
}
