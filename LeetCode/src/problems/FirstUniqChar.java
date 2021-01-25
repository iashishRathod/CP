package problems;


public class FirstUniqChar {

	public static void main(String[] args) {

		String s = "loveleetcode";
		
		/*if(s.length() == 0)
			System.out.println(-1);

		else{
			int index = 0;

			Map<String, Integer> map = new LinkedHashMap<>();

			for (int i = 0; i < s.length(); i++) {

				Integer count = map.get(String.valueOf(s.charAt(i)));

				if(count == null)
					count =1;
				else 
					count++;

				map.put(String.valueOf(s.charAt(i)),count);

			}

			for (char a : s.toCharArray()) {

				if(map.get(String.valueOf(a)) == 1){

					index = s.indexOf(a);
					break;
				}
			}
			
			System.out.println(index);
			
			
		}*/
	
	optimized(s);
	}

	private static void optimized(String s) {

		Integer res = Integer.MAX_VALUE;

		for(char c = 'a'; c <= 'z'; c++){
			int index = s.indexOf(c);

			if(index != -1 && index == s.lastIndexOf(c))
				res = Math.min(res, index);
		}

		System.out.println(res == Integer.MAX_VALUE ? -1 : res);

	}
}
