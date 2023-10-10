package exam01.class_const;

public class CarMain {
	public static void main(String[] args) {
		Car car = new Car("14가1234");
		car.name = "자동차 이름";
		
		System.out.println(car.name + car.price + car.number);
	}
}
