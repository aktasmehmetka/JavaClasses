package NestedFor;

public class NestedForLoop {

	public static void main(String[] args) {
		/*
		 * Write a Java program by using two for loops to produce the output shown below
		 * 
		 */
		
		for(int i=0; i<=6; i++) {
			for(int j=1; j<=7-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
