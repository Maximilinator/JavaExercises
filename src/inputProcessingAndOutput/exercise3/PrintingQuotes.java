package inputProcessingAndOutput.exercise3;

import java.util.Scanner;

public class PrintingQuotes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nenne mir eine bekannte Filmzeile! --> ");
		String eingabePhrase = sc.nextLine();
		
		System.out.print("Wer hat das gesagt? --> ");
		String eingabePerson = sc.nextLine();
		
		System.out.println(eingabePerson + " sagt: " + "'" + eingabePhrase + "'");
		
		sc.close();
	}

}
