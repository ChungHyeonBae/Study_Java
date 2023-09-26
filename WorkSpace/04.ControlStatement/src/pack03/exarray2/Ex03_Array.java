package pack03.exarray2;

public class Ex03_Array {
	public static void main(String[] args) {
		// int[] arr = new int[3] x3=> int[][] arr = new int [3][3];
		int[] arr = { 2 , 4 , 6 , 8 , 10 , 12 , 14 , 16 ,18 } ;
		System.out.println(arr.length);
		arr = new int[]{ 3,4 };
		int[][] arr2 = {
				{0,0},{0,0},{0,0}
		};
		System.out.println();
		arr2[0] = new int[3];
		arr2[1] = new int[] {0,0,0};
		
	}

}
