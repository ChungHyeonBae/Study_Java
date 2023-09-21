package pack04.exwhile;

public class Test01_While {
	public static void main(String[] args) {
//		int i = 1;
//		while (i < 10) {
//
//			System.out.println(i * 2);
//			i++;
//	}

		int i=2;
		int j=1;

		while(i<10) {
			j=1;
			System.out.print(i+"단 시작 : ");
			while(j<10) {
			  System.out.print(i + "x" + j + "=" + (i*j) + "\t");
		      j++;
			}
			System.out.println();
			i++;

	}
	}
	}
