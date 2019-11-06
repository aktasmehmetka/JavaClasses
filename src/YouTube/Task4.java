package YouTube;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * Write a program called SumAverageRunningInt to produce the sum of 1, 2, 3,
		 * ..., to 100. Store 1 and 100 in variables lowerbound and upperbound, so that
		 * we can change their values easily. Also compute and display the average. The
		 * output shall look like:
		 * 
		 */

			int sum = 0;
		// double ava=sum/2;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		double ava = sum / 100;
		System.out.println("The sum of 1 to 100 is " + sum);
		System.out.println("The average is " + ava);

		// 2 way
		System.out.println("===============================");

		double avar = sum / 100;
		int sum1 = 0;
		int number = 1;
		while (number <= 100) {

			sum1 += number;
			number++;
		}
		System.out.println("The sum of 1 to 100 is " + sum1);
		System.out.println("The average is " + avar);

		// 3 way
		System.out.println("===============================");

		int number1 = 1;
		int sum2 = 0;
		double ava1 = sum2 / 100;

		do {

			sum2 += number1;
			++number1;

		} while (number1 <= 100);

		System.out.println("The sum of 1 to 100 is " + sum2);
		System.out.println("The average is " + ava1);

	}

}
