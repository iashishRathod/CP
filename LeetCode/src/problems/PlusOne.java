package problems;

public class PlusOne {

	public static void main(String[] args) {
		
		int[] digits = {9,9,9};
		
		plusOne(digits);
	}

	private static int[] plusOne(int[] digits) {
		
		int carry = 1;
		
		for (int i = digits.length-1; i >=0; i--) {
			
			int sum = digits[i] + carry;
			
			if(sum > 9) {
				carry = 1;
				sum = sum% 10;
			}
			else carry = 0;
			
			digits[i] = sum; 
		}
		
		if(carry == 1) {
			
			digits = new int[digits.length+1];
			
			digits[0] = carry;
			
		}
		
		return digits;
	}

}
