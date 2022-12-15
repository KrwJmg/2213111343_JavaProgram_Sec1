import javax.swing.JOptionPane;

public class Lab_606 {

	public static void main(String[] args) {
		int nums[] = {25, 78, 41, 22, 36, 85,37};
		int indexArray = Integer.parseInt(JOptionPane.showInputDialog("Input index of array : "));
		checkIndex(nums,indexArray);
		while (checkIndex(nums, indexArray) == false) {
			indexArray = Integer.parseInt(JOptionPane.showInputDialog("Input index of array,again : "));
		}
		currentData(nums,indexArray);
		prevData(nums,indexArray);
		nextData(nums,indexArray);
		String dataPrev = prevData(nums,indexArray) !=-1?"Previous data,nums["+(indexArray-1)+"] is "+prevData(nums,indexArray):"No previous data";
		String dataNext = nextData(nums,indexArray) !=-1?"Next data,nums["+(indexArray+1)+"] is "+nextData(nums,indexArray):"No next data";
		JOptionPane.showMessageDialog(null, "Current data, nums["
		       +indexArray+"] is "+nums[indexArray]+"\n"+dataPrev+"\n"+dataNext);

	}

	public static boolean checkIndex(int[] nums, int index) {
		return (index > nums.length) ? false : true;
	}

	public static int currentData(int[] nums, int index) {
		return nums[index];

	}

	public static int prevData(int[] nums, int index) {
		return index == 0 ? -1 :nums[index-1];
	}

	public static int nextData(int[] nums, int index) {
		return index == nums.length-1? -1:nums[index+1];
	}
}
