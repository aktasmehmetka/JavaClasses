package ArrayDemo;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
         int[] arr=new int[5];
		Scanner scan=new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			
			int input;
			switch (arr[i]) {
			case 0:
				input=5;
				break;
			case 1:
				input=4;
				break;
			case 2:
				input=3;
				break;
			case 3:
				input=2;
				break;
			case 4:
				input=1;
				break;
			}
		}
	}

}
