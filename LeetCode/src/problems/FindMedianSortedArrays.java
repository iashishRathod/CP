package problems;

import java.util.Arrays;

public class FindMedianSortedArrays {

	public static void main(String[] args) {
		
		long start;
		System.out.println(start = System.currentTimeMillis());
		System.out.println(findMedianSortedArrays(new int[] {2},new int[]{}));//Time Complexity = O(m+n) ,Space Complexity = O(m+n)
		System.out.println(System.currentTimeMillis()-start);
		
		System.out.println(start = System.currentTimeMillis());
		System.out.println(optimized(new int[] {1,3},new int[]{2}));//Time Complexity =O(log(min(m,n))) ,Space Complexity = O(1)
		System.out.println(System.currentTimeMillis()-start);

	}

	private static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int[] array = Arrays.copyOf(nums1, nums1.length + nums2.length);
		
		int range1 = nums1.length-1,range2 = nums2.length-1,end = nums1.length + range2 ;

		while(range1>=0 && range2 >=0) array[end--] = (array[range1] > nums2[range2]) ? array[range1--] :nums2[range2--]; 

		while(range2>=0) array[end--] = nums2[range2--];

		return (array.length % 2 == 0 ? ((double)array[(array.length/2) -1] + array[array.length/2])/2 : (double)array[array.length/2]);
	}
	
	
	private static double optimized(int[] A, int[] B) {
		int m = A.length;
        int n = B.length;
        if (m > n) { // to ensure m<=n
            int[] temp = A; A = B; B = temp;
            int tmp = m; m = n; n = tmp;
        }
        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;
            if (i < iMax && B[j-1] > A[i]){
                iMin = i + 1; // i is too small
            }
            else if (i > iMin && A[i-1] > B[j]) {
                iMax = i - 1; // i is too big
            }
            else { // i is perfect
                int maxLeft = 0;
                if (i == 0) { maxLeft = B[j-1]; }
                else if (j == 0) { maxLeft = A[i-1]; }
                else { maxLeft = Math.max(A[i-1], B[j-1]); }
                if ( (m + n) % 2 == 1 ) { return maxLeft; }

                int minRight = 0;
                if (i == m) { minRight = B[j]; }
                else if (j == n) { minRight = A[i]; }
                else { minRight = Math.min(B[j], A[i]); }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
	}

}
