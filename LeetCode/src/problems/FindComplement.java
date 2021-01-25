package problems;

public class FindComplement {

	public static void main(String[] args) {

		int num = 22;

		int number_of_bits =  (int)(Math.floor(Math.log(num) / Math.log(2))) + 1; 

		System.out.println(((1 << number_of_bits) - 1) - num);

	}

}
