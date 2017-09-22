package calculations.exercise8;

import java.util.InputMismatchException;
import java.util.Scanner;

import static utilities.InputOutput.eingabeInteger;

public class PizzaParty {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			int anzahlPersonen = eingabeInteger(sc, "Anzahl Personen --> ");
			int anzahlPizzen = eingabeInteger(sc, "Anzahl Pizzen --> ");

			PizzaEssen pizzaBestellung = new PizzaEssen(anzahlPersonen, anzahlPizzen);
			printPizzaBestellung(pizzaBestellung);
		} catch (InputMismatchException e) {
			System.out.println("Ein InputMismatchException-Fehler ist aufgetreten!");
			System.out.println("Starten Sie das Programm neu!");
			System.exit(0);
		}

		sc.close();

	}

	private static void printPizzaBestellung(PizzaEssen pizzaBestellung) {
		System.out.println(pizzaBestellung.anzahlPizzen + " Pizzen für " + pizzaBestellung.anzahlPersonen
				+ " Personen. Von " + pizzaBestellung.stueckePizzaGesamt() + " Stücken Pizza bekommt jeder "
				+ pizzaBestellung.stueckePizzaProPerson() + "Stück. Rest: " + pizzaBestellung.rest());
	}
}
