package problems;

public class SearchMatrix {

	public static void main(String[] args) {
		
		int matrix[][] = {{1,3,5,7},
						  {10,11,16,20},
						  {23,30,34,50}};
		
		
		System.out.println(searchMatrix(3,matrix));
		System.out.println(searchMatrix(13,matrix));
		System.out.println(searchMatrix(0,new int[][] {}));

	}

	private static boolean searchMatrix(int target, int[][] matrix) {
		
		if(matrix.length == 0 ) return false;
		int length;
		for (int[] curr : matrix) {
			length = curr.length;
			if(curr[0] <= target && target <=curr[length-1]) {
				int left = 0,right = length -1,mid;
				while(left <= right) {
					mid = left + (right - left)/2;
					if(curr[mid] == target) return true;
					else if(target < curr[mid]) right = mid -1;
					else left = mid + 1;
				}
				break;
			}
		}
		return false;
	}

}
