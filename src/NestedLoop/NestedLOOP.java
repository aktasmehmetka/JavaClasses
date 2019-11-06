package NestedLoop;

public class NestedLOOP {

	public static void main(String[] args) {

		/*
		 * Write a program called SquarePattern that prompts user for the size (a
		 * non-negative integer in int); and prints the following square pattern using
		 * two nested for-loops.
		 * 
		 * Enter the size: 5 
		 * # # # # # 
		 * # # # # # 
		 * # # # # #
		 * # # # # #
		 * # # # # #
		 */
		
		for(int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
