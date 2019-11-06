package NestedFor;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program to print out the pattern:
		 * 
		 * 1
		  22
		 333 
		4444
	   55555
		 * 
		 * 
		 */

		for (int i = 0; i <= 5; i++) {
			for (int j = 5 - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int z = 0; z < i; z++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
