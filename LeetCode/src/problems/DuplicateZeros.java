package problems;

import java.util.Arrays;

public class DuplicateZeros {

	public static void main(String[] args) {
		
		int arr[] = {1,0,2,3,0,4,5,0};

		duplicateZeros(arr);
	}

	private static void duplicateZeros(int[] arr) {
		if(arr.length == 0)return;
		int[] copyArray = Arrays.copyOf(arr, arr.length);
		Arrays.fill(arr, 0);
		int i = 0;
		int j = 0;
		while(i <= arr.length-1) {
			arr[i] = copyArray[j];
			if(copyArray[j] ==0 && i+1 != arr.length) {
				arr[i+1] = 0;
				i++;
			}
			i++;
			j++;
		}
	}
}
