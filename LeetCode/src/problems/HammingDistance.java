package problems;

public class HammingDistance {

	public static void main(String[] args) {
		
		System.out.print(hammingDistance(1,4));
		System.out.print(optimized(1,4));

	}

	private static int hammingDistance(int x, int y) {

		String xBinary = Integer.toBinaryString(x);
		String yBinary = Integer.toBinaryString(y);
		
		int xLength = xBinary.length()-1;
		int yLength = yBinary.length()-1;
		int result = 0;

		while(xLength >=0 || yLength>=0) {
			
			if(xLength >=0 && yLength>=0) {
				if(xBinary.charAt(xLength) != yBinary.charAt(yLength)) {
					result++;
				}
			}
			else if(xLength >=0) {
				
				if(xBinary.charAt(xLength) == '1') result++;
				
			}
			else {
				if(yBinary.charAt(yLength) == '1') result++;
			}
			
			xLength--;
			yLength--;

		}

		return result;
	}
	
	private static int optimized(int x, int y) {
		
		int xor = x^y;
		int result = 0;
		
		while(xor > 0) {
			if((xor&1) ==1) result++;
			xor = xor >> 1;
		}
		
		return result;
	}

}
