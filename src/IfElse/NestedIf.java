package IfElse;

public class NestedIf {

	public static void main(String[] args) {
		/*
		 * Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
		 * "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other,
		 * respectively. Use (a) a "nested-if" statement; (b) a "switch-case-default"
		 * statement.
		 * 
		 */

		int a = 20;

		if (a == 1) {
			System.out.println("One");
		} else if (a == 2) {
			System.out.println("two");
		} else if (a == 3) {
			System.out.println("three");
		} else if (a == 4) {
			System.out.println("four");
		} else if (a == 5) {
			System.out.println("five");
		} else if (a == 6) {
			System.out.println("six");
		} else if (a == 7) {
			System.out.println("seven");
		} else if (a == 8) {
			System.out.println("eight");
		} else if (a == 9) {
			System.out.println("nine");
		} else  {
			System.out.println("unknown");
		}

	}

}
