package problems;


public class RemoveKdigits {

	public static void main(String[] args) {
		
		String num = "1234567890";
		int k =9;
		
		if(num.length() == k)
			System.out.println(0);
		
		int count = 0;
		while(k > 0){
			count = (count > 0) ? (count-1) : 0;
			while(count < num.length() -1 && num.charAt(count) <=num.charAt(count+1))
				count++;
			num = num.substring(0, count) + num.substring(count+1);
			k--;
		}
		
		count = 0;
		
		while(count < num.length() && num.charAt(count) == '0'){
			count++;
		}
		
		if(count >0)
			num = num.substring(count,num.length());
		
		if(num.length() == 0)
			System.out.print(0);
		
		System.out.print(num);
	}
}
