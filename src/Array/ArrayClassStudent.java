package Array;

public class ArrayClassStudent {

	public static void main(String[] args) {

		int[] student = new int[5];
		
		student[0] = 8;
		student[1] = 10;
		student[2] = 12;
		student[3] = 14;
		student[4] = 15;
		

		for (int i = 0; i <= student.length; i++)
			System.out.println(student[i]);
	}

}
