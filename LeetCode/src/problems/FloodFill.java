package problems;


public class FloodFill {

	static boolean visited[][];

	public static void main(String[] args) {

		int[][] image = {
				{0,0,0},
				{0,1,1}};

		int sr =1,sc=1;
		int newcolor = 1;
		visited = new boolean[image.length][image[0].length];

		changeColor(sr,sc,newcolor,image,image[sr][sc]);
	}

	private static void changeColor(int i, int j, int newcolor,int[][] image, int oldColor) {

		if(i<0 || i >=image.length || j<0 || j >=image[i].length || oldColor != image[i][j] || visited[i][j])
			return;

		visited[i][j] = true;

		image[i][j] = newcolor;

		changeColor(i+1, j, newcolor, image,oldColor);
		changeColor(i-1, j, newcolor, image,oldColor);
		changeColor(i, j+1, newcolor, image,oldColor);
		changeColor(i, j-1, newcolor, image,oldColor);

	}
}
