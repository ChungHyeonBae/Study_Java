package pack01.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex01_ArrayList {
	public static void main(String[] args) {
		String[] arr = new String[5];
		String[] arr2 = { "A", "B", "C", "D", "E" };
		arr[0] = "A";
		arr[1] = "B";
		arr[2] = "C";
		arr[3] = "D";
		arr[4] = "E";
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " : " + arr2[i]);
		}
		String[] tempArr = new String[arr.length+1];
		for(int i =0; i <arr.length; i++) {
			tempArr[i] = arr[i];
		}
		tempArr[tempArr.length-1] = "F";
		System.out.println(Arrays.toString(tempArr));
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("F");
		System.out.println("리스트 크기" + list.size());
		System.out.println("리스트 [0] : "+list.get(1));
		for ( int i =0; i<list.size(); i++) {
			System.out.println(list.get(i) + " : "+arr2[i]);
		}
	}
	
}
