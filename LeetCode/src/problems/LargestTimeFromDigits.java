package problems;

public class LargestTimeFromDigits {

	public static void main(String[] args) {
		
		int arr[] = {8,7,1,9};
		
		System.out.println(largestTimeFromDigits(arr));
		

	}

	private static String largestTimeFromDigits(int[] A) {

		boolean isValid = (helper(2, 0, A) && (A[0] == 2 ? helper(3, 1, A) : helper(9, 1, A)) && helper(5, 2, A) && helper(9, 3, A)) 
				|| (helper(1, 0, A) && helper(9, 1, A) && helper(5, 2, A) && helper(9, 3, A));


		return isValid ? new StringBuilder().append(A[0]).append(A[1]).append(":").append(A[2]).append(A[3]).toString() : "";
	}

	private static boolean helper(int maxValue, int index, int[] A) {
		int max = -1;
        for(int i = index; i < A.length; i++) {
            if(A[i] <= maxValue && (max == -1 || A[i] > A[max])) max = i;
        }
        if(max == -1) return false;
        int temp = A[max];
        A[max] = A[index];
        A[index] = temp;
        return true;
	}

}
