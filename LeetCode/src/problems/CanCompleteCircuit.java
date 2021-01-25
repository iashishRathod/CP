package problems;

public class CanCompleteCircuit {

	public static void main(String[] args) {

		int gas[] = {1,2,3,4,5};
		int cost[] = {3,4,5,1,2};

		System.out.println(canCompleteCircuit(gas,cost));
	}

	private static int canCompleteCircuit(int[] gas, int[] cost) {
		int sumGas = 0,sumCost = 0,start = 0,tank = 0;
		for(int i = 0;i<gas.length;i++){
			sumGas += gas[i];
			sumCost += cost[i];
			tank += gas[i] - cost[i];
			if(tank < 0) {
				start = i+1;
				tank = 0;
			}
		} 
		return sumGas < sumCost ? -1 : start;
	}

}
