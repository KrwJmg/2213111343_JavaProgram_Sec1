import java.util.Scanner;

public final class Lab504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space."+"\n:");
		String inputfullName = scan.nextLine();
		abbreviatName(inputfullName);
		System.out.println(abbreviatName(inputfullName));
	}

	public static String abbreviatName(String fullName) {
		String string = fullName ;
		String[] parts = string.split(" ");
        return parts[1].substring(0,1).toUpperCase()+
        		"."+parts[2].substring(0,1).toUpperCase()+
        		"."+parts[0].substring(0,1).toUpperCase()+
        		parts[0].substring(1);
	}
}
