package ManyMethodsAndInstances;

import java.util.Scanner;

public class Apples {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		tuna tunaObject=new tuna();
		
		System.out.println("Enter your first boy fiend ");
		String name=scan.nextLine();
		
		tunaObject.SetName(name);
		tunaObject.saying();
		//tunaObject.getName();
	}

}
