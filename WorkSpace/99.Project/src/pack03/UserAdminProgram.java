package pack03;

import java.util.Scanner;

public class UserAdminProgram {
	private static final int MAX_FOODS = 5;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isAdmin = false;
		int balance = 50000;

		System.out.println("환영합니다!");

		System.out.println("1. 사용자 2. 관리자 3. 프로그램 종료");
		int choice = scanner.nextInt();

		if (choice == 1) {
			System.out.print("사용자 이름: ");
			String username = scanner.next();
			System.out.print("비밀번호: ");
			String password = scanner.next();

			if (userLogin(username, password)) {
				System.out.println("사용자로 로그인되었습니다.");
			} else {
				System.out.println("잘못된 사용자 이름 또는 비밀번호입니다. 프로그램을 종료합니다.");
				System.exit(1);
			}
		} else if (choice == 2) {
			System.out.print("관리자 이름: ");
			String adminName = scanner.next();
			System.out.print("비밀번호: ");
			String adminPassword = scanner.next();

			if (adminLogin(adminName, adminPassword)) {
				isAdmin = true;
				System.out.println("관리자로 로그인되었습니다.");
			} else {
				System.out.println("잘못된 관리자 이름 또는 비밀번호입니다. 프로그램을 종료합니다.");
				System.exit(1);
			}
		} else if (choice == 3) {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		} else {
			System.out.println("잘못된 선택입니다. 프로그램을 종료합니다.");
			System.exit(1);
		}

		if (isAdmin) {
			adminMode(scanner);
		} else {
			userMode(scanner, balance);
		}

		scanner.close();
	}

	private static void displayFoodMenu() {
		Food[] foods = FoodDAO.getFoods();
		for (int i = 0; i < foods.length; i++) {
			System.out.println((i + 1) + ". " + foods[i].getName() + " - " + foods[i].getPrice() + "원");
		}
	}

	private static boolean userLogin(String username, String password) {

		return username.equals("user") && password.equals("user123");
	}

	private static boolean adminLogin(String adminName, String adminPassword) {

		return adminName.equals("admin") && adminPassword.equals("admin123");
	}

	private static void userMode(Scanner scanner, int balance) {
		System.out.println("현재 잔액: " + balance + "원");
		System.out.println("음식을 선택해주세요:");
		displayFoodMenu();

		for (int i = 0; i < 5; i++) {
			System.out.print("음식 번호를 입력하세요 (1부터 5까지): ");
			int foodChoice = scanner.nextInt();

			if (foodChoice < 1 || foodChoice > 5) {
				System.out.println("잘못된 음식 번호입니다. 프로그램을 종료합니다.");
				System.exit(1);
			}

			Food selectedFood = FoodDAO.getFoods()[foodChoice - 1];
			int selectedFoodPrice = selectedFood.getPrice();

			if (selectedFoodPrice > balance) {
				System.out.println("잔액이 부족합니다. 프로그램을 종료합니다.");
				System.exit(1);
			}

			System.out.println(selectedFood.getName() + "을(를) 선택하셨습니다. 가격: " + selectedFoodPrice + "원");
			balance -= selectedFoodPrice;

			System.out.println("남은 잔액: " + balance + "원");

			if (i < 4) {
				System.out.println("계속해서 음식을 선택해주세요.");
			}
		}

		System.out.println("다섯 가지 음식을 모두 선택하셨습니다. 프로그램을 종료합니다.");
	}

	private static void adminMode(Scanner scanner) {
		int adminChoice;
		while (true) {
			System.out.println("1. 음식 추가");
			System.out.println("2. 음식 수정");
			System.out.println("3. 음식 삭제");
			System.out.println("4. 로그아웃");

			System.out.print("원하는 작업을 선택하세요: ");
			adminChoice = scanner.nextInt();

			switch (adminChoice) {
			case 1:
				if (addFood(scanner)) {
					System.out.println("음식이 추가되었습니다.");
				} else {
					System.out.println("음식 추가에 실패했습니다.");
				}
				break;
			case 2:
				if (modifyFood(scanner)) {
					System.out.println("음식이 수정되었습니다.");
				} else {
					System.out.println("음식 수정에 실패했습니다.");
				}
				break;
			case 3:
				if (deleteFood(scanner)) {
					System.out.println("음식이 삭제되었습니다.");
				} else {
					System.out.println("음식 삭제에 실패했습니다.");
				}

				break;
			case 4:
				System.out.println("로그아웃합니다.");

				return;
			default:

				System.out.println("잘못된 선택입니다. 다시 선택하세요.");
			}
		}

	}

	private static boolean addFood(Scanner scanner) {
		System.out.print("추가할 음식 이름: ");

		String name = scanner.next();
		System.out.print("추가할 음식 가격: ");
		int price = scanner.nextInt();

		return FoodDAO.addFood(name, price);
	}

	private static boolean modifyFood(Scanner scanner) {
		System.out.print("수정할 음식 번호를 입력하세요 (1부터 5까지): ");
		int foodIndex = scanner.nextInt() - 1;

		if (foodIndex >= 0 && foodIndex < MAX_FOODS) {
			System.out.print("새 음식 이름: ");
			String name = scanner.next();
			System.out.print("새 음식 가격: ");
			int price = scanner.nextInt();

			return FoodDAO.modifyFood(foodIndex, name, price);
		}

		else {
			System.out.println("잘못된 음식 번호입니다.");

			return false;
		}
	}

	private static boolean deleteFood(Scanner scanner) {
		System.out.print("삭제할 음식 번호를 입력하세요 (1부터 5까지): ");

		int foodIndex = scanner.nextInt() - 1;

		if (foodIndex >= 0 && foodIndex < MAX_FOODS) {

			return FoodDAO.deleteFood(foodIndex);
		}

		else {
			System.out.println("잘못된 음식 번호입니다.");
			return false;
		}
	}
}