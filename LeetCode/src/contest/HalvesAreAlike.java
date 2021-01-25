package contest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HalvesAreAlike {

	public static void main(String[] args) {
		
		System.out.println(halvesAreAlike("book"));
		System.out.println(halvesAreAlike("textbook"));
		System.out.println(halvesAreAlike("MerryChristmas"));
		System.out.println(halvesAreAlike("AbCdEfGh"));
		System.out.println(halvesAreAlike("tkPAdxpMfJiltOerItiv"));

	}

	private static boolean halvesAreAlike(String s) {
		if(s.length() == 0) return false;
		Set<Integer>  set = new HashSet<>(Arrays.asList(65,69,73,79,85,97,101,105,111,117));
		
		int i = 0,j = s.length() - 1,count = 0;
		
		while(i < j){
			
			if(set.contains(((int)s.charAt(i++)))) {
				count++;
			}
			if(set.contains((int)s.charAt(j--))) {
				count--;
			}
		}
		
		return count == 0;
	}

}
