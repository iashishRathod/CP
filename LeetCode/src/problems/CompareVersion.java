package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class CompareVersion {

	public static void main(String[] args) {
		
		System.out.println(compareVersion("1.2","1.10"));
		System.out.println(compareVersion("1.0.1","1"));
		System.out.println(compareVersion("7.5.2.4","7.5.3"));
		System.out.println(compareVersion("1.01","1.001"));
		System.out.println(compareVersion("1.0","1.0.0"));
		System.out.println(compareVersion("01","1"));
		System.out.println(compareVersion("1.10","1.2"));

	}

	private static int compareVersion(String version1, String version2) {
		Function<String, List<Integer>> test = s -> {
			int j = -1;
			List<Integer> res = new ArrayList<>();
			for (int i = 0; i < s.length(); i++) {
				
				if(s.charAt(i) == '.') {
					res.add(Integer.valueOf(s.substring(j+1, i)));
					j = i;
				}
			}
			
			if(j < s.length()) res.add(Integer.valueOf(s.substring(j+1)));
			
			return res;
		};
		List<Integer> v1 = test.apply(version1);
		List<Integer> v2 = test.apply(version2);
		
		for (int i = 0; i < Math.max(v1.size(), v2.size()); i++) {
			
			int v3 = v1.size() > i ? v1.get(i): 0;
			int v4 = v2.size() > i ? v2.get(i): 0;
			
			if(v3 > v4)
				return  1;
			else if(v4 > v3 )
				return  -1;
			
		}
		return 0;
	}

}
