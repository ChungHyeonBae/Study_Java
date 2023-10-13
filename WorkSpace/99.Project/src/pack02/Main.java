package pack02;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String username;
		String password;
		double balance = 100.0;

		System.out.print("사용자 이름: ");
		username = scanner.nextLine();
		System.out.print("비밀번호: ");
		password = scanner.nextLine();

		if (username.equals("admin") && password.equals("1234")) {
			System.out.println("로그인 성공!");

			int choice;

			FoodDAO foodDAO = new FoodDAO();
			List<FoodDTO> foodList = foodDAO.getAllFoods();

			do{
				System.out.println("음식을 선택하세요:");
				for (FoodDTO food : foodList) {
				System.out.println(food.getId() + ". " + food.getName() + " - $" + food.getPrice());
				}
				System.out.println(foodList.size() + 1 + ". 로그아웃");

				choice = scanner.nextInt();

				if (choice >= 1 && choice <= foodList.size()) {
					FoodDTO selectedFood = foodList.get(choice - 1);
					double price = selectedFood.getPrice();

					if (balance >= price) {
						balance -= price;
						System.out.println(selectedFood.getName() + "를 선택하셨습니다. 구매 완료! 남은 잔액: $" + balance);
					} else {
						System.out.println("잔액이 부족합니다.");
					}
				} else if (choice == foodList.size() + 1) {
					System.out.println("로그아웃합니다.");
				} else {
					System.out.println("유효하지 않은 선택입니다. 다시 선택하세요.");
				}
			} while (choice != foodList.size() + 1);
		} else {
			System.out.println("로그인 실패. 올바른 사용자 이름과 비밀번호를 입력하세요.");
		}

		scanner.close();
	}
}