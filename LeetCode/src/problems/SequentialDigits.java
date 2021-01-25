package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SequentialDigits {
	
	static List<Integer> result;
	
	public static void genrateSequentialDigits() {
		result = new ArrayList<>();
		for (int i = 1; i <= 9 ; i++) {
			for (int j = i+1; j <=9; j++) {
				if(j == i + 1) result.add((i*10)+j);
				else result.add(result.get(result.size()-1)*10+j);
			}
		}
	}

	public static void main(String[] args) {
		genrateSequentialDigits();
		System.out.println(sequentialDigits(10,300));
		
	}

	private static List<Integer> sequentialDigits(int low, int high) {
		return result.stream().filter(a -> a >= low && a <= high).sorted().collect(Collectors.toList());
	}

}
