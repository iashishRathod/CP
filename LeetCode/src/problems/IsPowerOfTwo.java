package problems;

public class IsPowerOfTwo {

	public static void main(String[] args) {
		
		int n = -16;
	
		System.out.println(isPowerOfTwo(n));

	}

	private static boolean isPowerOfTwo(int n) {
		
		 if(n<=0) return false;
	     return (n&(-n)) == n;
		
	}

}
