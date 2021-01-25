package problems;

public class FirstBadVersion {

	public static void main(String[] args) {
		
		int n = 5;

		int left = 1;
		int right = n;

		while(left < right){

			int mid = left +(right-left)/2;

			if(isBadVersion(mid)){

				right = mid;

			}else{
				left = mid +1;
			}  
		} 

		System.out.println(left);

	}

	private static boolean isBadVersion(int mid) {
		
		if(mid == 3)
			return true;
		return false;
	}
}
