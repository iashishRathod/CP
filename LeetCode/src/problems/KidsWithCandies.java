package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies {

	public static void main(String[] args) {
		
		System.out.println(kidsWithCandies(new int[] {2,3,5,1,3} , 3).toString());
		System.out.println(kidsWithCandies(new int[] {4,2,1,1,2} , 1).toString());
		System.out.println(kidsWithCandies(new int[] {12,1,12} , 10).toString());

	}

	private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		
		List<Boolean> res = new ArrayList<>();
		
		int max = Arrays.stream(candies).max().getAsInt();
		
		for(int i = 0 ; i < candies.length ; i++) {
			
			if(candies[i] + extraCandies >= max) res.add(true);
			else res.add(false);
		}
		
		return res;
	}

}
