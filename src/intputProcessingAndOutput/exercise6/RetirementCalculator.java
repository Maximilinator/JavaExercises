package intputProcessingAndOutput.exercise6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RetirementCalculator {

	public static void main(String[] args) {

		RechnungenFürEx6 rechnungen = new RechnungenFürEx6() {
		};
		try {
			Scanner sc = new Scanner(System.in);

			System.out.print("Wie alt sind Sie momentan? --> ");
			rechnungen.setAlter(sc.nextInt());

			System.out.print("Wann möchten Sie in Rente gehen? --> ");
			rechnungen.setAbWannRente(sc.nextInt());

			sc.close();

		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException-Fehler aufgetreten!");
			System.exit(0);
			System.out.println("Bitte starten Sie das Programm neu!");
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException-Fehler aufgetreten!");
			System.out.println("Bitte starten Sie das Programm neu!");
			System.exit(0);
		}
			System.out.println(rechnungen);
	}
}
