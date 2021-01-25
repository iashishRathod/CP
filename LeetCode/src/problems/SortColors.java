package problems;

public class SortColors {

	public static void main(String[] args) {

		int[] nums ={2,0,2,1,1,0};
		
		 sort(nums,0,nums.length-1);
		 
		 for (int i : nums) {
			System.out.println(i);
		}
	}

	private static void sort(int[] nums, int start, int end) {

		if(start < end){

			int pi = partition(nums,start,end);

			sort(nums, start, pi -1);
			sort(nums, pi +1, end);
		}
	}

	private static int partition(int[] nums, int start, int end) {

		int pivot = nums[end];
		int i = start-1;

		for (int j = start; j < end; j++) {

			if(nums[j] < pivot){

				int temp = nums[++i];
				nums[i] = nums[j];
				nums[j] = temp;
			}

		}

		int temp = nums[i+1]; 
		nums[i+1] = nums[end]; 
		nums[end] = temp; 

		return  i +1;
	}
}
