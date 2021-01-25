package problems;


public class JewelsAndStones {

	public static void main(String[] args) {

		String J = "z", S = "ZZ";
		
		int count = 0;

		for(int i =0;i<S.length();i++){
			
			if(J.contains(String.valueOf(S.charAt(i))))
				count++;
		}
		
		System.out.println(count);
		
		optimized(J,S,count);
		
	}

	private static void optimized(String j, String s, int count) {

		char[] schar= s.toCharArray();

		for(int i=0;i<schar.length;i++)
		{
			if(j.indexOf(schar[i])>=0)
				count++;
		}

	}
}
