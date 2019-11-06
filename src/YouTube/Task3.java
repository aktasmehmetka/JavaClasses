package YouTube;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
		 * "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other,
		 * respectively. Use (a) a "nested-if" statement; (b) a "switch-case-default"
		 * statement.
		 */

		int number = 5;
		String word;
		switch (number) {
		case 1:
			word = "ONE";
			break;
		case 2:
			word = "two";
			break;
		case 3:
			word = "three";
			break;
		case 4:
			word = "four";
			break;
		case 5:
			word = "five";
			break;
		default:
			word = "invalid";
			break;
		}
		System.out.println(word);

	}

}
