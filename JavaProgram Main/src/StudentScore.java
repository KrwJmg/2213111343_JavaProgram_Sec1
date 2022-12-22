import java.util.*;

public class StudentScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many student in classroom : ");
		int size = scan.nextInt();
		Student[] std = new Student[size];
		System.out.println();
		for (int i = 0; i < std.length; i++) {
			std[i] = new Student();
			// System.out.println("How many student in classroom : ");
			// std[i] = scan.nextInt();
			System.out.print("Input student name : ");
			std[i].setName(scan.next());
			System.out.print("Input student score : ");
			std[i].setScore(scan.nextInt());
			
			while (!std[i].checkScore()) {
				System.out.print("Input student score, again : ");
				std[i].setScore(scan.nextInt());
				
			}
			System.out.println("--------------------------------");
		}
		System.out.println("LIST OF PASS SUTDENT (>=50) ");
		System.out.println("--------------------------------");
		/*
		 * for(int i =0 ;i<std.length;i++) { if(std[i].isPass()) {
		 * System.out.println(">> "+std[i].getName()+" "+" ("+std[i].findGrade+") "); }
		 * } }
		 */

		for (Student list : std) {
			if (list.isPass()) {
				System.out.println(">> " + list.getName() + " get grade " + list.findGrade(list.getScore()));
			}
		}
	}
}
