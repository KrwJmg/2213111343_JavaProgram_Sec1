import java.util.*;

public class ShapeDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Array = 5;
		double[] radius = new double[Array];
		double[] height = new double[Array];
		for (int i = 0; i < Array; i++) {
			System.out.print("Input radius : ");
			radius[i] = scan.nextDouble();
			System.out.print("Input height : ");
			height[i] = scan.nextDouble();
		}
		System.out.println();
		for(int z =0 ;z<Array;z++) {
			Cylinder cyl = new Cylinder(radius[z],height[z]);
			System.out.println("Cylinder "+(z+1)+", "+cyl.getVolume());
			
		}
	}

}
