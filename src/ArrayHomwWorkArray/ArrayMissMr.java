package ArrayHomwWorkArray;

public class ArrayMissMr {

	public static void main(String[] args) {

		/*
		 * Create a 2D array where you will store the following values: Mr, Mrs, Ms,
		 * Miss and Smith, Jordan, Jackson, Obama. After storing values print the
		 * following: Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		 */
		
		String [][] arr= {
				{"Mr","Mrs","Ms","Miss"},
				{"Smith","Jordan","Jackson","Obama"}
		};
		
		for (int  i= 0; i < arr.length; i++) {
			 for(int j=0; j<4; j++) {
			//System.out.print(arr[0][i]+" ");
			//System.out.print(arr[1][i]);
			//System.out.println();
			System.out.println(arr[i][j] + " "+ arr[i+1][j]);
			 }
		}
		
	}
}
