package contest;

public class EatenApples {

	public static void main(String[] args) {
		
		System.out.println(eatenApples(new int[] {1,2,3,5,2} , new int [] {3,2,1,4,2}));
	//	System.out.println(eatenApples(new int[] {3,0,0,0,0,2} , new int [] {3,0,0,0,0,2}));
		
		/*
		 * [
		 * [1,  1, 1, -1, -1],
		 * [1,  1, 1, -1, -1],
		 * [-1,-1,-1,  1,  1],
		 * [ 1, 1, 1,  1, -1],
		 * [-1,-1,-1, -1, -1]
		 * ]
		 */

	}

	private static int eatenApples(int[] apples, int[] days) {
	int[] decompose = new int[40001];
    int currentApples = 0;    // current fresh apples we have
    int eatenApples = 0;      // apples already eat
    int unassignedApples = 0; // already eat, but not know gains which day, not a good name
    for (int i = 0; i < apples.length || (i < decompose.length && currentApples > 0); i++) {
        // decompose, if we have to
        if (decompose[i] > 0) {
            // decompose more than unassignedApples, we loss apples
            if (decompose[i] > unassignedApples) {
                currentApples -= decompose[i] - unassignedApples;
            }
            // min(decompose[i], unassignedApples) apples assigned
            unassignedApples -= Integer.min(decompose[i], unassignedApples);
        }
        // gains, if there are
        if (i < apples.length && apples[i] > 0) {
            currentApples += apples[i];
            decompose[i+days[i]] += apples[i];
        }
        // eat, if we have
        if (currentApples > 0) {
            currentApples--;
            eatenApples++;
            unassignedApples++;
        }
    }
    return eatenApples;}

}
