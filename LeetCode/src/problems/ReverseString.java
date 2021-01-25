package problems;

public class ReverseString {

	public static void main(String[] args) {
		
		char[] s = {'H','a','n','n','a','h'}; 	
		
		reverseString(s);

	}

	private static void reverseString(char[] s) {

		int left = 0 , right = s.length-1;

		while(left < right){

			if(s[right] != s[left]){

				char temp = s[right];
				s[right]  = s[left];
				s[left]	  = temp;	
			}
			left++;
			right--;
		}

		System.out.print(s.toString());

	}

}
