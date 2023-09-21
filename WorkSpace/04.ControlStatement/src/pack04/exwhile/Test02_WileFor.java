package pack04.exwhile;

public class Test02_WileFor {
	public static void main(String[] args) {
		for(int i = 2; i <10; i++ ) {
			System.out.println(i + "단");
			int j = 1;
			while(j<10) {
				System.out.print(i + "x" + j + "=" + (i*j));
				j++;
			}
			
		}
	}

}
