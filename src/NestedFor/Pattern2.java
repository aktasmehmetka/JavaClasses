package NestedFor;

public class Pattern2 {

	public static void main(String[] args) {
	  /* $$$$
		$    $
		$    $
	     $$$$
	     
	   */
		
		int c=4;
	    for (int a=1;a<=c;a++) {
	        for(int b=1;b<=c;b++) {
	        if (a==1 ||b==1||a==c||b==c) {
	            System.out.print("$");    
	            }else
	            {
	                System.out.print(" ");
	            }
	        }
	    System.out.println();

	}
	}
}
