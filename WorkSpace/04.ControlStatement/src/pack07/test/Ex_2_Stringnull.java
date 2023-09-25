package pack07.test;

import java.util.Scanner;

public class Ex_2_Stringnull {
	public static void main(String[] args) {
		
		Scanner sc = null;
		String str1 = new String("A");
		String str2 = new String("B");
		if(str1 == str2) {
			System.out.println("같음");
		}else{
			System.out.println("다름");
		}
		
		
		
	}

}
