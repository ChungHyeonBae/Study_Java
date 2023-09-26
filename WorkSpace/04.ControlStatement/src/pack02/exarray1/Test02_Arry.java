package pack02.exarray1;

public class Test02_Arry {
	public static void main(String[] args) {
		
		int b =2;
		for(int a = 2; a<=9; a++) {
			System.out.println(a * b);
		}
		for (int i = 0; i <5; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
}
