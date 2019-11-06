package NestedFor;

public class Task {

	public static void main(String[] args) {
		/*
		 * Write a Java program by using three for loops to print the following pattern:
		 * 
		 * 1******
		 * 
		 * 12*****
		 * 
		 * 123****
		 * 
		 */

		int i, j, k;

		for (i = 1; i <= 9; i++)
		{
		  for (j = 1; j <= i; ++j)
		      System.out.print(j);

		  for (k = 9 - i; k >= 1; k--)
		     System.out.print("*");

		  System.out.println("");
		}

	}

}
