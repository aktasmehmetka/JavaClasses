package YouTube;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Write a program called CheckOddEven which prints "Odd Number" if the int
		 * variable “number” is odd, or “Even Number” otherwise. The program shall
		 * always print “bye!” before exiting.
		 */

		int number = 25;
		System.out.println("The number is " + number);
		if (number % 2 == 0) {
			System.out.println("even number");
		} else {
			System.out.println("odd mumber");
		}

		System.out.println("“bye!");

	}

}
