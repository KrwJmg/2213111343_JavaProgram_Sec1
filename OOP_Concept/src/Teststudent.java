
public class Teststudent {

	public static void main(String[] args) {
		Student anupap = new Student("Anupap Jaising","Happy Ave");
		System.out.println(anupap);
		
		anupap.setAddress("25 Pattanakran");
		System.out.println(anupap);
		System.out.println(anupap.getName());
		System.out.println(anupap.getAddress());
		
		anupap.addCourseGrade("INT107",87);
		anupap.addCourseGrade("INT108",81);
		anupap.addCourseGrade("INT202",92);
		anupap.printGrade();
		
		System.out.printf("The average grade is %.2f%n",anupap.getAverageGrade());
	}

}
