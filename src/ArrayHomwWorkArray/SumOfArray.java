
package ArrayHomwWorkArray;

public class SumOfArray {

	public static void main(String[] args) {
		/*
		 * Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
		 * Print the sum of all numbers. 
		 * 
		 * .
		 */
		int [][] arr= {
				{4,7,23},
				{6,65,43},
				{1,4,8}
		};
		
		int sum=0; 
		for(int [] a:arr) {
			for(int b:a) {
				sum=sum+b;
			}
		}
		System.out.println(sum);
		
		System.out.println("===========================");
		// Create a 2D array of integer type with 3 rows
		 // and 4 columns and print all values of the whole array
		
		int [][] arr1= {
				{4,7,9,2},
				{5,7,9,23},
				{23,54,2,4}
		};
		for(int[] a:arr1) {
			for(int b:a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
		
	}
}
