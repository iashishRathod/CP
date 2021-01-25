package problems;

public class Reverse {

	public static void main(String[] args) {

		int x = 1534236469;
		System.out.print(reverse(x));

	}

	private static int reverse(int x) {

		Long newNum = 0l;

		while(x !=0){
			if((newNum*10) > Integer.MAX_VALUE || (newNum*10) < Integer.MIN_VALUE)
				return 0;
			newNum = newNum*10 + (x%10);
			x /= 10;
		}

		return newNum.intValue();
	}
}
