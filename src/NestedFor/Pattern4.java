package NestedFor;

public class Pattern4 {

	public static void main(String[] args) {
		// 1234
		// 2341
		// 3412
		// 4123

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				int k = i + j - 1;
				if (k > 4)
					System.out.print(k - 4 + " ");
				else
					System.out.print(k + " ");
			}
			System.out.println();
		}

	}

}