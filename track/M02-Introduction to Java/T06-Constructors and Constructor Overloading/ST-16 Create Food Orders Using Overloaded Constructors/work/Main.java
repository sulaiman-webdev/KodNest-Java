import java.util.Scanner;

class FoodOrder {
    String item;
    int quantity;

    FoodOrder(String item) {
        // Store the item and set quantity to 1
        this.item = item;
        quantity = 1;

    }

    FoodOrder(String item, int quantity) {
        // Store both values
        this.item = item;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Order: " + item + ", Quantity: " + quantity);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Read the item and quantity
        // Create one order with the first constructor
        // Create one order with the second constructor
        // Display both orders
        String items = sc.nextLine();
        int num = sc.nextInt();

        FoodOrder  fo = new FoodOrder(items);
        fo.display();
        FoodOrder fo1 = new FoodOrder(items , num);
        fo1.display();



    }
}