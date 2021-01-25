package problems;

public class AddBinary {

	public static void main(String[] args) {

		System.out.print(addNumber("1010","1011")); //10101
	}

	private static String addNumber(String a, String b) {

		StringBuilder sb = new StringBuilder();
		char a1,b1,result;
		boolean isGlobalcarry = false,carry;

		for (int i = 1; i <= Math.max(a.length(), b.length()) ; i++) {

			a1 = b1 = '0';
			carry = false;

			if(a.length() - i >= 0) a1 = a.charAt(a.length() - i);

			if(b.length() - i >= 0) b1 = b.charAt(b.length() - i);

			if(a1 == b1) {
				result = '0';
				if(a1 =='1') carry = true;
			}
			else  result = '1';

			if(isGlobalcarry) {
				if(result == '1') {
					result = '0';
					carry = true;
				}
				else  result = '1';
			}

			if(carry)  isGlobalcarry = true;
			else isGlobalcarry = false;

			sb.append(result);

		}

		if(isGlobalcarry) sb.append('1');

		return sb.reverse().toString();
	}
}
