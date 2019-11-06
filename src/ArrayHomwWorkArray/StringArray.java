package ArrayHomwWorkArray;

public class StringArray {

	public static void main(String[] args) {
		/*
		 * Create an array of cars : american, german, korean, italian. Then retrieve
		 * all values from that array
		 * 
		 * Create an array of countries: north america countries, south america
		 * countries, europe countries, asian countries, african countries. Then print
		 * all values from that array.
		 * 
		 * Create a 2D array that first row will contain 4 names and second row will
		 * contain grades. Then you program should print name of the students that has
		 * as an A and B grade
		 * 
		 */

		String[] a = { "american", "german", "korean", "italian" };
		String[][] b = { { "ford, GMC, dooge" }, { "VW, BMW, Mersedes" }, { "mazda, hundai, isuzu" },
				{ "ferrari, fiat, alfaromeo" } };
		
		int num=0;
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" cars are ");
			System.out.print(b[num][0]);
			num++;
			System.out.println();
			
			}
		
		
		
	}
}
