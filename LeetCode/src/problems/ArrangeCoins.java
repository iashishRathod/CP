package problems;

public class ArrangeCoins {

	public static void main(String[] args) {

		System.out.println(arrangeCoins(5)); //BinerySearch - Time complexity :O(logN). space complexity - O(1)
		System.out.println(arrangeCoinsMath(5)); //Math - Time complexity :O(1). space complexity - O(1)
	}

	private static int arrangeCoins(int n) {
		if(n==0) return 0;
		long start =0,end =n;
		while(start <= end) {
			long mid = (start) + (end-start)/2;
			long count = ((mid*(mid+1))/2);
			if(count == n) return (int) mid;
			else if(count > n) end = mid-1;
			else start = mid+1; 
		}
		return (int) (start-1);
	}
	
	
	private static int arrangeCoinsMath(int n) {
		 return (int)(Math.sqrt(2 * n + 0.25) - 0.5);
	}

}
