package pack01.mart;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<User> users = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. 회원 등록");
            System.out.println("2. 로그인");
            System.out.println("3. 상품 등록");
            System.out.println("4. 상품 제거");
            System.out.println("5. 상품 목록");
            System.out.println("6. 구입");
            System.out.println("7. 판매");
            System.out.println("8. 잔돈 출력");
            System.out.println("9. 종료");
            System.out.print("선택: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("사용자 이름: ");
                    String username = scanner.nextLine();
                    System.out.print("초기 잔액: ");
                    double balance = scanner.nextDouble();
                    users.add(new User(username, balance));
                    System.out.println("사용자 등록이 완료되었습니다.");
                    break;

                case 2:
                    System.out.print("사용자 이름: ");
                    String loginUsername = scanner.nextLine();
                    User currentUser = null;
                    for (User user : users) {
                        if (user.username.equals(loginUsername)) {
                            currentUser = user;
                            break;
                        }
                    }
                    if (currentUser != null) {
                        System.out.println("로그인되었습니다.");
                    } else {
                        System.out.println("사용자를 찾을 수 없습니다.");
                    }
                    break;

                case 3:
                    System.out.print("상품 이름: ");
                    String productName = scanner.nextLine();
                    System.out.print("상품 가격: ");
                    double productPrice = scanner.nextDouble();
                    System.out.print("상품 재고 수량: ");
                    int productQuantity = scanner.nextInt();
                    products.add(new Product(productName, productPrice, productQuantity));
                    System.out.println("상품 등록이 완료되었습니다.");
                    break;

                case 4:
                    System.out.print("제거할 상품 이름: ");
                    String removeProductName = scanner.nextLine();
                    for (Product product : products) {
                        if (product.name.equals(removeProductName)) {
                            products.remove(product);
                            System.out.println("상품이 제거되었습니다.");
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("상품 목록:");
                    for (Product product : products) {
                        System.out.println(product.name + " - 가격: " + product.price + "원, 재고: " + product.quantity);
                    }
                    break;

                case 6:
                    if (currentUser != null) {
                        System.out.print("구입할 상품 이름: ");
                        String purchaseProductName = scanner.nextLine();
                        System.out.print("구입할 수량: ");
                        int purchaseQuantity = scanner.nextInt();
                        for (Product product : products) {
                            if (product.name.equals(purchaseProductName)) {
                                currentUser.purchaseProduct(product, purchaseQuantity);
                                break;
                            }
                        }
                    } else {
                        System.out.println("먼저 로그인해야 합니다.");
                    }
                    break;

                case 7:
                    if (currentUser != null) {
                        System.out.print("판매할 상품 이름: ");
                        String sellProductName = scanner.nextLine();
                        System.out.print("판매할 수량: ");
                        int sellQuantity = scanner.nextInt();
                        for (Product product : products) {
                            if (product.name.equals(sellProductName)) {
                                currentUser.sellProduct(product, sellQuantity);
                                break;
                            }
                        }
                    } else {
                        System.out.println("먼저 로그인해야 합니다.");
                    }
                    break;

                case 8:
                    if (currentUser != null) {
                        System.out.println("현재 잔액: " + currentUser.balance + "원");
                    } else {
                        System.out.println("먼저 로그인해야 합니다.");
                    }
                    break;

                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("잘못된 선택입니다. 다시 선택하세요.");
                    break;
            }
        }
    }
}