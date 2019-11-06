package Array;

public class ArrayExample {

	public static void main(String[] args) {

		// Create an array with 100 element that will hold integer element.

		int[] arr = new int[100];

		//int i;

		for (int i = 0; i <= 99; i++) {

			arr[i] =i*i;
			
			for(int j=0; j<=99; j++) {
				System.out.println("The number of "+j+" is "+arr[j]);
			}
		}
	}
}
