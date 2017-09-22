package inputProcessingAndOutput.exercise2;

import java.util.Scanner;

public class CountingTheNumberOfCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nenne mir irgendein Wort! --> ");
		String eingabe = sc.nextLine();
		while (eingabe.trim().length() == 0) {
			System.out.print("Du musst schon ein Wort angeben: ");
			eingabe = sc.nextLine();
		}
		System.out.println("'" + eingabe.trim() + "'" + " hat " + eingabe.trim().length() + " Buchstaben!");
		
		sc.close();
	}

}
