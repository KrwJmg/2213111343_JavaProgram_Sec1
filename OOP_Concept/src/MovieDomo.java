import java.util.*;

public class MovieDomo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input movie id    : ");
		String id = scan.nextLine();
		System.out.print("Input movie name  : ");
		String name = scan.nextLine();
		System.out.println();
		System.out.print("Input director name   : ");
		String dName = scan.nextLine();
		System.out.print("Input director e-mail : ");
		String dEmail = scan.nextLine();
		System.out.print("Input director gender : ");
		String dGender = scan.next();
		System.out.println();
		while (!(dGender.equalsIgnoreCase("m") || dGender.equalsIgnoreCase("f"))) {
			System.out.print("Input director gender, again  : ");
			dGender = scan.next();
		}
		System.out.print("Input movie theater no. : ");
		int Tno = scan.nextInt();
		while(!(Tno>=1 && Tno<=15)) {
			System.out.print("Plese input 1 - 15 only : ");
			Tno = scan.nextInt();
		}
		System.out.println();
		Theater th1 = new Theater(id,name,new Director (dName,dEmail,dGender.charAt(0)),Tno);
		
		System.out.print(th1);

	}

}
