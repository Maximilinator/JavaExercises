package inputProcessingAndOutput.exercise1;

import java.util.Scanner;

public class SayHello {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Wie lautet dein Name? --> ");
		System.out.println("Hallo " + sc.nextLine() + ", nett dich kennenzulernen! :)");
		
		sc.close();
	}
}
