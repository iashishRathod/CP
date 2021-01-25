package problems;

public class HIndex2 {

	public static void main(String[] args) {
		
		int[] citations = {0,0};
		
		System.out.println(hIndex2(citations));

	}

	private static int hIndex2(int[] citations) {
		int left = 0,right = citations.length-1;
		while(left <= right) {
			int mid  = left + (right-left)/2;
			if(citations[mid] < citations.length - mid) left = mid+1;
			else right = mid -1;
		}
		return citations.length-left;
	}
}
