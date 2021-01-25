package contest;

import java.util.Arrays;

public class MaximumUnitsOnTruck {

	public static void main(String[] args) {
		
		System.out.println(maximumUnits(new int[][] {
			{1,3},
			{2,2},
			{3,1}
		} , 4));

	}

	private static int maximumUnits(int[][] boxTypes, int truckSize) {

		if(truckSize == 0) return 0;

		Arrays.sort(boxTypes, (a,b) -> a[1] == b[1] ? b[0] - a[0] : b[1] - a[1]);

		int units = 0;

		for(int index = 0 ; index < boxTypes.length ; index++) {

			if(boxTypes[index][0] <= truckSize){
				units +=(boxTypes[index][0]*boxTypes[index][1]);
				truckSize-=boxTypes[index][0];
			}
			else {
				units += truckSize*boxTypes[index][1];
				break;
			}
		}

		return units;
	}

}
