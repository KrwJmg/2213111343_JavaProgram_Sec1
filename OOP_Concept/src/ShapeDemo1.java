import java.util.*;
public class ShapeDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input radius : ");
		double radius = scan.nextDouble();
		System.out.print("Input height : ");
		double height = scan.nextDouble();
		
		Circle cir = new Circle(radius,null);
		
		System.out.println();
		System.out.println("Circle["+cir+"]");
		System.out.println("Circle[area="+cir.getArea()+"]");
		
		Cylinder cyl = new Cylinder(radius,height);
		
		System.out.println();
		System.out.println("Cylinder["+cyl+"]");
		System.out.println("Cylinder[area="+cyl.getArea()+"]");
		System.out.println("Cylinder[volume="+cyl.getVolume()+"]");
		
		


	}

}
