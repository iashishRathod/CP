package problems;

public class ValidMountainArray {

	public static void main(String[] args) {
		
		int[] arr = {14,82,89,84,79,70,70,68,67,66,63,60,58,54,44,43,32,28,26,25,22,15,13,12,10,8,7,5,4,3};
		
		System.out.print(validMountainArray(arr));

	}

	private static boolean validMountainArray(int[] arr) {
		if(arr.length < 3) return false;
		boolean high = false,low = false,equal = false;
		for (int i = 0; i + 1 < arr.length; i++) {
			if(arr[i] < arr[i + 1]) {
				high = true;
                if(!low) return false;
			}
			else if(arr[i] > arr[i + 1]){
				low = true;
			}
			else equal = true;
		}
		return !high || !low || equal ? false : true;
	}
}
