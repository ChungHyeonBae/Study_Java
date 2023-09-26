package pack03.exarray2;

public class Ex02_Array {
	public static void main(String[] args) {
		//정방형 2차원 배열 : 1차원 배열의 열의 개수가 동일함(크기가 같은 1차원배열이 여러개 있음)
		//비정방형 2차원 배열 : 1차원 배열의 열의 개수가 각각 다를수있음
		//[0][1]
		//[1][1] ] int[2][2]
//		int[][] arr = new int[9][0];
//		int[] elementArr1 = new int[2]; //2(0,1)
//		int[] elementArr2 = new int[3]; //4(0,1,2,3)
//		arr[0] = elementArr1;
//		arr[1] = elementArr2;
//		arr[2] = new int[4];
//		System.out.println();
		int[][] arr = {{0}, {1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
	}
}
}
