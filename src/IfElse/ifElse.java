package IfElse;

public class ifElse {

	public static void main(String[] args) {

		/*
		 * Write a program called CheckPassFail which prints "PASS" if the int variable
		 * "mark" is more than or equal to 50; or prints "FAIL" otherwise. The program
		 * shall always print “DONE” before exiting.
		 * 
		 */

		int mark=50;
		
		if(mark>=50) {
			System.out.println("The mark is "+mark);
		}else{
			System.out.println("Done");
		}
		System.out.println();
		
	}

}
