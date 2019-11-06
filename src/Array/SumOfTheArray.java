
package Array;

public class SumOfTheArray {

	public static void main(String[] args) {

		int[][] a = {
			{1,1,2}, //sum = 4
			{3,1,2}, //sum = 6
			{3,5,3}, //sum = 11
			{0,1,2}  //sum = 3
		};
		
		int sum = 0, sum1=0; int  sum2=0; int  sum3=0;
		for(int i=0; i<a.length; i++) {
			
			sum+=a[1][0];
			//sum1+=a[1][]
		}
		System.out.println(sum);
	}
}
