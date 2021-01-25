package problems;


public class Merge {

	public static void main(String[] args) {
		
		int[] nums1 = {1,3,0}; 
		int[] nums2 = {2};
		int m = 2, n = 1;
		merge(nums1,nums2,m,n);
		
		for (int i : nums1) {
			System.out.print(i);
		}

	}

	private static void merge(int[] nums1, int[] nums2, int m, int n) {
		
		int range1 = m-1,range2 = n-1,end = m+n-1;
		
		while(range1>=0 && range2 >=0) nums1[end--] = (nums1[range1] > nums2[range2]) ? nums1[range1--] :nums2[range2--]; 
		
		while(range2>=0) nums1[end--] = nums2[range2--];
	}
}
