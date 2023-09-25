package pack07.test;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = "kym";
		String str2 = "kym";
		String str3 = sc.nextLine();
		System.out.println("str1 : " + System.identityHashCode(str1));
		System.out.println("str2 : " + System.identityHashCode(str2));
		System.out.println("str3 : " + System.identityHashCode(str3));
		if(str1 == str2) {
			System.out.println("같음");
		}else{
			System.out.println("다름");
		}
		if(str1.equals(str3)) {
			System.out.println("값 같음");
		}else {
			System.out.println("값 다름");
		}
		System.out.println("==는 stack메모리 참조번지수를 비교한다.");
	}

}
