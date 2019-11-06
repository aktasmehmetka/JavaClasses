package ArrayDemo;

public class Ornek2D {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4};
		int[] b= {4,5,6,7};
		int[] c= {5,6,7,8};
		
		int[][] d= {a,b,c};
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
	}

}
