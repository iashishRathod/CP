package problems;

public class FindNumbers {

	public static void main(String[] args) {
		int nums[] = {555,901,482,1771};
		System.out.print(findNumbers(nums));
	}

	private static int findNumbers(int[] nums) {
		if(nums.length == 0) return 0;
		int count = 0;
		for (int i : nums) if((i > 9 && i < 100) || (i> 999 && i < 10000) || i == 100000) count++;
		return count;
	}

}
