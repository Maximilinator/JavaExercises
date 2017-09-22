package calculations.exercise8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PizzaParty {

	public static void main(String[] args) {

		RechnungenFürEx8 rechnungen = new RechnungenFürEx8() {
		};

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Anzahl Personen --> ");
			rechnungen.setAnzahlPersonen(sc.nextInt());

			System.out.print("Anzahl Pizzen --> ");
			rechnungen.setAnzahlPizzen(sc.nextInt());
		} catch (InputMismatchException e) {
			System.out.println("Ein InputMismatchException-Fehler ist aufgetreten!");
			System.out.println("Starten Sie das Programm neu!");
			System.exit(0);
		}
		sc.close();

		System.out.println(rechnungen);
	}

}
