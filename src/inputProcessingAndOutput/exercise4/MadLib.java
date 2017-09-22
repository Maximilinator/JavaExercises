package inputProcessingAndOutput.exercise4;

import java.util.Scanner;

public class MadLib {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a noun --> ");
		String eingabeNomen = sc.nextLine();
		
		System.out.print("Enter a verb --> ");
		String eingabeVerb = sc.nextLine();
		
		System.out.print("Enter an adjective --> ");
		String eingabeAdjektiv = sc.nextLine();
		
		System.out.print("Enter an adverb --> ");
		String eingabeAdverb = sc.nextLine();
		
		System.out.println("Do you " + eingabeVerb + " your " + eingabeAdjektiv + " " + eingabeNomen + " " + eingabeAdverb + "? - That's hilarious! xD");
		
		
		sc.close();
	}

}
