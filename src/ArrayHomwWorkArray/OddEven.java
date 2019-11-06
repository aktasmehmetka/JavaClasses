package ArrayHomwWorkArray;

public class OddEven {

	public static void main(String[] args) {

		/*
		 * Create a 2D array or integer type where you will store odd and even numbers
		 * in 3 rows and 4 columns. Develop a program which will identify/print the even
		 * numbers only.
		 * 
		 */
		
		int [][] arr={
				{2,5,89,6,12},
				{8,3,6,14},
				{3,7,23,14,43}
		};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(arr[i][j]%2!=0) {
				System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("============================");
		// 2 way 
		
		for(int [] a:arr) {
			for(int b:a) {
				if(b%2!=0) {
					System.out.print(b+" ");
					}
			}
			System.out.println();
		}
		
		
	}
}
