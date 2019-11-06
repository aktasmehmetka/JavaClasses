package NestedFor;

public class DescisionLoop {
	public static void main(String[] args) {

		/*
		 * Write a program called Product1ToN to compute the product of integers from 1
		 * to 10 (i.e., 1󫎿�...�10), as an int. Take note that It is the same as
		 * factorial of N.
		 * 
		 */
		
		int prod=1;
		
		for(int i=1; i<=10; i++) {
			prod *= i;
			
		}System.out.println(prod);
	}
}
