package problems;

import java.util.ArrayList;
import java.util.List;

public class CheckIfExist {

	public static void main(String[] args) {
		
		int[] arr = {3,1,7,11};
		
		System.out.print(checkIfExist(arr));

	}

	private static boolean checkIfExist(int[] arr) {
		if(arr.length==0) return false;
		List<Integer> num = new ArrayList<>();
		for (Integer i : arr) {
			if(num.contains(i*2) || (i%2 == 0 && num.contains(i/2)))return true;
			num.add(i);
		}
		return false;
	}

}
