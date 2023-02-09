import java.util.Scanner;

import javax.swing.*;

public class ShapeDemo3 {
	public static void main(String[] args) {
		int Array = 5;
		double[] radius = new double[Array];
		double[] height = new double[Array];
		double[] volume = new double[Array];
		for (int i = 0; i < Array; i++) {
			String data = JOptionPane.showInputDialog("Input radius and height : ");
			radius[i] = Double.parseDouble(data.split(" ")[0]);
			height[i] = Double.parseDouble(data.split(" ")[1]);
		}
		System.out.println();
		for (int z = 0; z < Array; z++) {
			Cylinder cyl = new Cylinder(radius[z], height[z]);
			volume[z] = cyl.getVolume();
		}
		JOptionPane.showMessageDialog(null, "Cylinder 1, volume=" + volume[0] + "\nCylinder 2, volume=" + volume[1] + "\nCylinder 3, volume="
				+ volume[2] + "\nCylinder 4, volume=" + volume[3] + "\nCylinder 5, volume=" + volume[4]);
	}

}
