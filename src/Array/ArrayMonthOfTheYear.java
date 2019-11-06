package Array;

public class ArrayMonthOfTheYear {

	public static void main(String[] args) {
		
		int [][] arr=new int[12][2];
		
		arr[0][0]=1;
		arr[1][0]=2 ;
		arr[2][0]= 3;
		arr[3][0]=4;
		arr[4][0]=5;
		arr[5][0]=6;
		arr[6][0]=7;
		arr[7][0]=8;
		arr[8][0]=9;
		arr[9][0]=10;
		arr[10][0]=11;
		arr[11][0]=12;
		
		arr[0][1]=15;
		arr[1][1]=245;
		arr[2][1]=35;
		arr[3][1]=44;
		arr[4][1]=56;
		arr[5][1]=67;
		arr[6][1]=77;
		arr[7][1]=83;
		arr[8][1]=97;
		arr[9][1]=104;
		arr[10][1]=110;
		arr[11][1]=123;
		
		
		for(int i=0; i<12; i++) {
			
			//for(int j=0; j<2; j++) {
				
				System.out.println(arr[i][0]+"= "+arr[i][1]);
	   //}
		}
		//System.out.println();

	}

}
