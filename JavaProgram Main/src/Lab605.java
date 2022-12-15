import javax.swing.JOptionPane;

public class Lab605 {

	public static void main(String[] args) {
		int[] number = new int[5];
		for (int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number " + (i + 1) + " :"));
		}
		
		showEven(number);
		showOdd(number);
	}

	public static void showEven(int[] nums) {
		String listEven = "";
		for ( int _num : nums) {
			if ( _num % 2 == 0) {
				listEven += _num +" ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number :"+"\n"+listEven);
	}

	public static void showOdd(int[] nums) {
		String listEven = "";
		for ( int _num : nums) {
			if ( _num % 2 != 0) {
				listEven += _num +" ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of odd number :"+"\n"+listEven);
	}
}
