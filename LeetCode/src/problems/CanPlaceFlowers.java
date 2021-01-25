package problems;

public class CanPlaceFlowers {

	public static void main(String[] args) {

	
		System.out.println(canPlaceFlowers(new int[] {1,0,0,0,1},1));
	}

	private static boolean canPlaceFlowers(int[] flowerbed, int n) {
		
		if(flowerbed.length == 0) return false;
		
		for(int index = 0 ; index < flowerbed.length && n > 0; index ++) {
			
			if(flowerbed[index] == 0) {
				
				int next = index == flowerbed.length -1 ? 0 : flowerbed[index + 1];
				int prev = index == 0 ? 0 : flowerbed[index - 1];
				
				if(prev == 0 && next == 0) {
					flowerbed[index] = 1;
					n--;
				}
			}
		}
		
		return n == 0;
	}

}
