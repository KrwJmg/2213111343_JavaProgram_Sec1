import java.util.*;

public class Lab_Example603 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] number = new int[5];
		for (int i = 0; i < number.length; i++) {
			System.out.print("Input number " + (i + 1) + " : ");
			number[i] = scan.nextInt();
		}
		int sumofNumber = sumOfPos(number);
		System.out.println();
		System.out.println("Summation of positive number is "+sumofNumber);

	}

	public static int sumOfPos(int[] nums) {
		int sum =0;
		for(int i =0 ;i<nums.length;i++) {
			sum += nums[i];
		}
		return sum;
	}

}
