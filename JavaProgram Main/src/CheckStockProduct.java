import java.text.DecimalFormat;
import java.util.Scanner;

public class CheckStockProduct {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many product list in stock : ");
		int inputPro = scan.nextInt();
		System.out.println("");
		Product[] stProduct = new Product[inputPro];
		DecimalFormat db = new DecimalFormat("#,###.00");
		for (int i = 0; i < stProduct.length; i++) {
			stProduct[i] = new Product();
			System.out.print("Input product Id    : ");
			stProduct[i].setId(scan.next());
			System.out.print("Input product Unit  : ");
			stProduct[i].setUnit(scan.nextInt());
			System.out.println("");
		}
		System.out.println("-----------------------------------------------------");
		System.out.println("List of product in '"+"LOW"+"' status.");
		System.out.println("-----------------------------------------------------");
		for(Product pro : stProduct) {
			if(pro.checkUnit(inputPro).equals("LOW")) {
				System.out.println(">> "+pro.getId()+" has "+pro.getUnit()+" units");
			}
		}
		System.out.println("-----------------------------------------------------");
		System.out.println("List of product in '"+"NORMAL"+"' status.");
		System.out.println("-----------------------------------------------------");
		for(Product pro : stProduct) {
			if(pro.checkUnit(inputPro).equals("NORMAL")) {
				System.out.println(">> "+pro.getId()+" has "+pro.getUnit()+" units");
			}
		}
		System.out.println("-----------------------------------------------------");
		System.out.println("List of product in '"+"HIGH"+"' status.");
		System.out.println("-----------------------------------------------------");
		for(Product pro : stProduct) {
			if(pro.checkUnit(inputPro).equals("HIGH")) {
				System.out.println(">> "+pro.getId()+" has "+pro.getUnit()+" units");
			}
		}
	}

}
