package NestedFor;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=8; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		for(int i=9; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}

}
