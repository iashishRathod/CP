package problems;

public class KthFactor {

	public static void main(String[] args) {
		
		System.out.println(kthFactor(12,3));
		System.out.println(kthFactor(7,2));
		System.out.println(kthFactor(4,4 ));
		System.out.println(kthFactor(1,1));
		System.out.println(kthFactor(1000,3));

	}

	private static int kthFactor(int n, int k) {
		
		if(k == 1) return 1;
		
		int num = 1;
		int factor = -1;
		
		while(k != 0  && num <= n) {
			
			if(n % num == 0) {
				k--;
				factor = num;
			}
			num++;
		}
		
		return k == 0 ? factor : -1;
	}

}
