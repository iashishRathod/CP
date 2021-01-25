package problems;

public class ReplaceElements {

	public static void main(String[] args) {

		int arr[] = {57010,40840,69871,14425,70605};
		replaceElements(arr);
	}

	private static int[] replaceElements(int[] arr) {
		search(arr,arr.length-1,-1);
		return arr;
	}

	private static void search(int[] arr, int i, int val) {
		
		int temp = arr[i];
		arr[i] = val;
		
		if(i==0)return;
		
		search(arr, --i, Math.max(temp, val));
	}

}
