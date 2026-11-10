import java.util.Scanner;
class Product {
    private int price;

    Product(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        Product product = new Product(value);

        // Correct this invalid getter call.
        System.out.println(product.getPrice());
    }
}