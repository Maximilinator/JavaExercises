package utilities;

import java.util.Scanner;

public class InputOutput {
	
	public static String eingabeString(Scanner sc, String frage) {
		System.out.print(frage);
		return sc.nextLine();
	}

	public static double eingabeDouble(Scanner sc, String frage) {
		System.out.print(frage);
		double result = sc.nextDouble();
		sc.nextLine();
		return result;
	}

	public static int eingabeInteger(Scanner sc, String frage) {
		System.out.print(frage);
		int result = sc.nextInt();
		sc.nextLine();
		return result;
	}

}
