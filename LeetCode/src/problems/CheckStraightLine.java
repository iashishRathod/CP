package problems;

public class CheckStraightLine {

	public static void main(String[] args) {
		
		boolean straightLine = true;

		int[][] coordinates = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};

		int[] point1 = coordinates[1];
		int[] point2 = coordinates[0];
		float Pslop = getSlop(point1,point2);

		for(int i =1 ;i <coordinates.length;i++){

			int[] p1 = coordinates[i];
			int[] p2 = coordinates[0];

			float slop = getSlop(p1,p2);

			if(Pslop != slop)straightLine =  false;

		} 
		System.out.println(straightLine);
	}
	  
	  public static float getSlop(int[] p1,int[] p2){
	    
	    if((p1[0] - p2[0]) == 0)return 0;
	    
	    return (float)(p2[1]-p1[1])/(p2[0]-p1[0]);
	  }

	}
