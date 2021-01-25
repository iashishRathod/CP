package problems;

import java.util.LinkedList;

public class AsteroidCollision {

	public static void main(String[] args) {
		
		System.out.println(asteroidCollision(new int[] {5,10,-5}));

	}

	private static int[] asteroidCollision(int[] asteroids) {
		
		if(asteroids.length <= 1) return asteroids;
		
		LinkedList<Integer> list = new LinkedList<>();
		
		for (int i = 0; i < asteroids.length; i++) {
			
			if(asteroids[i] > 0 || list.isEmpty() || list.getLast() < 0) list.add(asteroids[i]);

			else if(list.getLast() <= -asteroids[i]) {
				if(list.pollLast() < -asteroids[i]) i--;
			}
		}
		return list.stream().mapToInt(i -> i).toArray();
	}

}
