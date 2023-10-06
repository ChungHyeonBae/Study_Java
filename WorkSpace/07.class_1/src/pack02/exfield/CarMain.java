package pack02.exfield;

public class CarMain {
	public static void main(String[] args) {
		Car carh = new Car(null , "기아");
		Car cark = new Car(null, "");
		Car cara = new Car(null ,"");
		Car carb = new Car(null, "");
		carh.company = "기아";
		cark.type = "Suv";
		cara.color = "led";
		carb.name = "기아빨강";
		carh.maxSpeed = 200;
		System.out.println(carh.company);
		System.out.println(cark.type);
		System.out.println(cara.color);
		System.out.println(carb.name);
		System.out.println("최대속도 : " + carh.maxSpeed);
	}
	
}
