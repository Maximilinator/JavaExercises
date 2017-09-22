package calculations.exercise10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static utilities.InputOutput.*;

public class SelfCheckout {

	public static void main(String[] args) {

		ArrayList<Rechnungsposition> rechnungspositionen = new ArrayList<>(10);

		Scanner sc = new Scanner(System.in);

		String eingabe = eingabeString(sc, "Möchten Sie einen Artikel einstellen? --> ");
		try {
			while (!"Nein".equalsIgnoreCase(eingabe)) {
				double eingabeArtikel = eingabeDouble(sc, "Wieviel kostet der Artikel? --> ");
				int eingabeAnzahl = eingabeInteger(sc, "Wie oft haben sie ihn gekauft? --> ");

				rechnungspositionen.add(new Rechnungsposition("Artikel", eingabeArtikel, eingabeAnzahl));

				eingabe = eingabeString(sc, "Möchten Sie einen weiteren Artikel einstellen? --> ");
			}
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException-Fehler aufgetreten!");
			System.out.println("Bitte starten Sie das Programm neu!");
			System.exit(0);
		}

		sc.close();

		double summe = 0;
		for (int i = 0; i < rechnungspositionen.size(); i++) {
			Rechnungsposition position = rechnungspositionen.get(i);
			System.out.println(position.bezeichnung + ": " + position.positionsBruttowert() + " Euro inkl. MwSt");
			summe += position.positionsBruttowert();
		}
		System.out.println("======================================================");
		System.out.println("Die Gesamtsumme ihres Einkaufs beläuft sich auf: " + summe + " Euro.");

		if (rechnungspositionen.size() == 0) {
			System.out.println("Nagut, vielleicht nächstes Mal... :C");
		}
	}
}
