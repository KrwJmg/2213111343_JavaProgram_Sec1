import java.util.*;
import java.text.DecimalFormat;

public class StockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product[] stProduct = new Product[4];
		DecimalFormat db = new DecimalFormat("#,###.00");
		for (int i = 0; i < stProduct.length; i++) {
			stProduct[i] = new Product();
			System.out.print("Input product Id    : ");
			stProduct[i].setId(scan.next());
			System.out.print("Input product Unit  : ");
			stProduct[i].setUnit(scan.nextInt());
			System.out.print("Input product Price : ");	
			stProduct[i].setPrice(scan.nextDouble());
			System.out.println("");
		}
		
		System.out.println("----------------------------------------------------");
		double totalCount = 0;	
		for(int i = 0 ;i < stProduct.length;i++) {
			System.out.println("Product ID : "+stProduct[i].getId()+", Total price = "+db.format(stProduct[i].calculate())+" baht.");
			totalCount += stProduct[i].calculate();
		}
		System.out.println("----------------------------------------------------");
		System.out.println("Total price of all product is "+db.format(totalCount)+" baht.");

	}

}
