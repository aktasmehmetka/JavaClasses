package Array;

public class LargestSmallest {

	public static void main(String[] args) {
		
		int[] arr= {40,12,34,65,87,90,99,43,21,67,87};
		
		int largest=arr[0];
		int smallest=arr[0];
		
		for(int i=0; i<=10; i++) {
			
			if (arr[i]>largest) {
				largest =arr[i];
			}else if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println("\nThe largest in array is: "+largest);
		System.out.println("\nThe smallest in array is: "+smallest);
	}
}
