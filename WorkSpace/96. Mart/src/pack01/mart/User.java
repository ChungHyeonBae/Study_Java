package pack01.mart;
class User {
    String username;
    double balance;

    public User(String username, double balance) {
        this.username = username;
        this.balance = balance;
    }

    public void purchaseProduct(Product product, int quantity) {
        if (product.quantity >= quantity) {
            double totalCost = product.price * quantity;
            if (balance >= totalCost) {
                balance -= totalCost;
                product.quantity -= quantity;
                System.out.println("구입이 완료되었습니다.");
            } else {
                System.out.println("잔액이 부족합니다.");
            }
        } else {
            System.out.println("상품 재고가 부족합니다.");
        }
    }

    public void sellProduct(Product product, int quantity) {
        if (quantity > 0) {
            double totalRevenue = product.price * quantity;
            balance += totalRevenue;
            product.quantity += quantity;
            System.out.println("판매가 완료되었습니다.");
        } else {
            System.out.println("잘못된 수량입니다.");
        }
    }
}