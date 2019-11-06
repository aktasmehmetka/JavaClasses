package TwoDimentionalArray;

public class TwoDimnArray {

	public static void main(String[] args) {
		
		int [] x= {43,34,56,7};
		int [] y= {23,12,14,56};
		int [] z= {19,93,36,26};

		int[][] p= {
				{43,34,56,7},
				{23,12,14,56},
				{19,93,36,26}
		};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(p[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("====================");
		// 2 way with Enhanced 
		
		for(int[] i:p) {
			for(int j:i){
				System.out.print(j+" ");
				
			}
			System.out.println(" ");
		}
	}

}
