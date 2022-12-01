import javax.swing.*;
import java.util.*;

public class Example_403 {

	public static void main(String[] args) {
		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.print("Input a sentence : "); String sentence = scan.nextLine();
		 * while (!sentence.endsWith(".")) {
		 * System.out.print("Input a sentence, agian : "); sentence = scan.nextLine(); }
		 * System.out.println(); int countofSpace = 0; for (int i = 0; i <
		 * sentence.length(); i++) { if (sentence.charAt(i) == ' ') { countofSpace++; }
		 * } System.out.println("This sentence has " + countofSpace + " spacebar.");
		 * System.out.println("/nThis sentence has " + (countofSpace+1) + " spacebar.");
		 */
		String sentence = JOptionPane.showInputDialog("Input a sentence: ");
		while (!sentence.endsWith(".")) {
			System.out.print("Input a sentence, agian : ");
		}
		System.out.println();
		int countofSpace = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == ' ') {
				countofSpace++;
			}
			
		}
		JOptionPane.showMessageDialog(null, "This sentence has " + countofSpace + " spacebar."
				+ "\nThis sentence has " + (countofSpace + 1) + " word.");
	}
}
