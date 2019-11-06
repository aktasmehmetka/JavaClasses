package YouTube;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumOdd = 0;
		int sumEven = 0;
		for (int i = 1; i <= 20; i++) {
			// sumOdd=sumOdd+i;
			// sumEven=sumEven+i;
			if (i % 2 == 0) {
				sumEven = i;
			} else {
				sumOdd = i;
			}
		}
		System.out.println(sumOdd);
		System.out.println(sumEven);


	}

}
