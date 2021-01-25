package problems;

public class NumberOfLines {

	public static void main(String[] args) {
		
		int widths[] = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		String s = "bbbcccdddaaa";
		
		int[] result= numberOfLines(widths,s);
		
		System.out.print(result[0]+" "+result[1]);
	}

	private static int[] numberOfLines(int[] widths, String s) {
		if(widths.length == 0 || s.length() == 0) return new int[] {1,0};
		int result = 0;
		int lines = 1;

		for (char i : s.toCharArray()) {

			int count = widths[i-97];

			if(result + count > 100) {
				lines++;
				result = count;
			}else {
				result += count;
			}
		}
		return new int[]{lines,result};
	}
}
