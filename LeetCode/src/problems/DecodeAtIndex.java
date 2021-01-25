package problems;

public class DecodeAtIndex {

	public static void main(String[] args) {

		System.out.println(decodeAtIndex("leet2code3", 10));
		System.out.println(decodeAtIndex("ha22", 5));
		System.out.println(decodeAtIndex("a2345678999999999999999", 1));
	}

	private static String decodeAtIndex(String s, int k) {

		long size = 0;
		int i;
		
		for(i = 0 ; i < s.length(); i++) {
			
			if(Character.isDigit(s.charAt(i))) {
				size *= Integer.parseInt(s.charAt(i)+""); 
			}
			else {
				size++;
			}
		}
		
		for (i = s.length() - 1 ; i >= 0 ; i--) {
			
			char c = s.charAt(i);
			
			k %= size; 
			
			if(k == 0 && !Character.isDigit(c)) {
				return c+"";
			}
			
			if(Character.isDigit(c)) {
				size /= Integer.parseInt(c+""); 
			}
			else {
				size--;
			}
			
		}

		return "";
	}

}
