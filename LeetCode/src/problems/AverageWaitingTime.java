package problems;

public class AverageWaitingTime {

	public static void main(String[] args) {
		
		System.out.println(averageWaitingTime(new int [][] {
			{5,2},
			{5,4},
			{10,3},
			{20,1}
		}));
		System.out.println(averageWaitingTime(new int [][] {
			{1,2},
			{2,5},
			{4,3}
		}));
		
	

	}
	
	

	private static double averageWaitingTime(int[][] customers) {
		
		if(customers.length == 0 ) return  0d;
		
		int totalTime = 0;
		int waitingTime = 0;
		
		for(int[] cust : customers) {
			
			if(totalTime < cust[0]) totalTime = cust[0];
			totalTime = totalTime == 0 ?  cust[1] + cust[0] : totalTime + cust[1];
			waitingTime += totalTime - cust[0];
		}
		
		return (double) waitingTime/customers.length;
	}

}