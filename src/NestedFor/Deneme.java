package NestedFor;

import java.util.Scanner;

public class Deneme {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		String[] day={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		 
		for(int i=1; i<=7; i++){
		    
			 System.out.println("Please enter day "+i+" of the week");
			 if (day[i].equals("1")) {
					System.out.println("Sunday");
				} else if (day[i].equals("2")) {
					System.out.println("Capital is DC");
				} else if (day[i].equals("3")) {
					System.out.println("Capital is Berlin");
				} else if (day[i].equals("4")) {
					System.out.println("Capital is Rome");
				} else if (day[i].equals("5")) {
					System.out.println("Capital is Paris");
				}
		  }

	}

}
