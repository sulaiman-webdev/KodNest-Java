import java.util.Scanner;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        // Store both values
        this.name = name ;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the product name and price
        // Create one Product object
        // Call display()
        String pro = sc.nextLine();
        double pri = sc.nextDouble();

        Product prod = new Product(pro,pri);
        prod.display();

    }
}