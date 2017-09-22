package inputProcessingAndOutput.exercise5;

import java.util.Scanner;

public class SimpleMath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Rechnungen rechnungen = new Rechnungen() {
		};

		System.out.print("Wie lautet die erste Zahl? --> ");
		double eingabeNumber1 = sc.nextDouble();
		while (eingabeNumber1 <= 0) {
			System.out.print("Es sind nur positive Zahlen gültig! --> ");
			eingabeNumber1 = sc.nextDouble();
		}
		rechnungen.setNumber1(eingabeNumber1);
		
		System.out.print("Wie lautet die zweite Zahl --> ");
		double eingabeNumber2 = sc.nextDouble();
		while (eingabeNumber2 <= 0) {
			System.out.print("Es sind nur positive Zahlen gültig! --> ");
			eingabeNumber2 = sc.nextDouble();
		}
		rechnungen.setNumber2(eingabeNumber2);

		System.out.println(rechnungen);

		sc.close();
	}

}
