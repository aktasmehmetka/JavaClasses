package ManyMethodsAndInstances;

import java.util.Scanner;

public class KaraToprak {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Kara karaObjeck = new Kara();

		System.out.println("please netr your age ");
		
		int age = scan.nextInt();
		karaObjeck.karaOrnek(age);

	}

}
