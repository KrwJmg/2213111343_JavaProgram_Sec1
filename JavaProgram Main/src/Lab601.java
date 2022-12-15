import java.util.*;

public class Lab601 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] positivenumber = new int[7];
		int evenCount = 0;
		for (int i = 0; i < positivenumber.length; i++) {
			System.out.print("Input number " + (i + 1) + " : ");
			positivenumber[i] = scan.nextInt();
			if (positivenumber[i] % 2 != 0) {
				evenCount++;
			}
		}

		System.out.println();
		System.out.println("There are " + evenCount + " 0f odd number");
		for (int _posNum : positivenumber) {
			if (_posNum % 2 != 0) {
				System.out.print(_posNum + " ");
			}
		}
	}
}
