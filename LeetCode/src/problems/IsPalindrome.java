package problems;


public class IsPalindrome {

	public static void main(String[] args) {
		int x = 121;
		System.out.print(isPalindrome(x));
	}

	private static boolean isPalindrome(int x) {
		
		if(x < 0 || (x %10 == 0 && x!=0 ))
			return false;
        int reversed = 0;
		while(x!=0){
			reversed *= 10;
			reversed += x%10;
			x /= 10;
		}
		 return reversed == x || x == reversed/10;
	}

}
