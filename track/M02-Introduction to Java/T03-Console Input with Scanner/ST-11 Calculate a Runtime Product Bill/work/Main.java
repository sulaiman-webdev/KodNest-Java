import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read product name
        // Read price
        // Read quantity
        // Calculate and print the total

        String product = scanner.next();
        double price = scanner.nextDouble();
        int quantity = scanner.nextInt();

        double total = price * quantity;

        System.out.println("Product: "+ product);
        System.out.println("Total: "+ total);

        scanner.close();
    }
}