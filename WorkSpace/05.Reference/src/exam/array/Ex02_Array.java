package exam.array;

import java.util.Arrays;

public class Ex02_Array {
	public static void main(String[] args) {
		int[] array = { 3, 5, 7, 9, 1, 2, 4, 10 };
		for (int i =0; i<array.length; i++) {
		for(int j=0; j<i; j++) {
			if(array[i]<array[j]) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				
				
			}
		}
		}
		System.out.println(Arrays.toString(array));
	}
}
