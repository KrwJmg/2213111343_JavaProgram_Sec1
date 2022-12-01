import java.util.*;

public class Lab402 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String sentence = scan.nextLine();
		String output = "";
		while (!sentence.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			sentence = scan.nextLine();
		}
		int nextWord = 0;
		String formatsentence = sentence.replace('.', ' ');
		System.out.println();
		for (int i = 0; i < sentence.length(); i++) {
			if (formatsentence.charAt(i) == ' ') {
				System.out.println(formatsentence.substring(nextWord, i).trim());
				nextWord = i ;
			}
		}
	}

}
