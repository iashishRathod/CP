package problems;

import java.util.Scanner;

public class TomAndJerry {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		while(testCase-- > 0) {
			
			String tom = sc.next();
			String jerry = sc.next();
			
			if(tom.length() == 0 || jerry.length() == 0) {
				System.out.println("NO");
				continue;
			}
			
			if(tom.equals(jerry)) {
				System.out.println("YES");
				continue;
			}
			
			boolean exit = false;
			
			for(int index = 0; index < jerry.length() ; index++) {
				
				int curr = tom.indexOf(jerry.charAt(index));
				
				if(curr < 0) {
					System.out.println("NO");
					exit = true;
					break;
				}
				else {
					tom = tom.substring(curr + 1);
				}
			}
			
			if (!exit) System.out.println("YES");
		}
		
		sc.close();
	}
}
