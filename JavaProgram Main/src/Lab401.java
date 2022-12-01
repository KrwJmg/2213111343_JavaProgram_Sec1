import java.util.*;

public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full name: ");
		String fullName = scan.nextLine();
		String firstName = ""; 
		String lastName ="";
		int space = fullName.indexOf(' ');
		if(space == -1) {
			System.out.print("Incorrect Name");
		}
		else {
			firstName = fullName.substring(0,space);
			lastName = fullName.substring(space+1);
			System.out.print("First Name: "+firstName.toUpperCase());
			System.out.print("\nLast Name: "+lastName.toLowerCase());
			
		}
	}

}
