import java.util.Scanner;

class MobilePlan {
    String planName;
    int price;

    MobilePlan() {
        // Set Basic and 199
        planName = "Basic";
        price = 199;

    }

    MobilePlan(String planName, int price) {
        // Store both received values
        this.planName = planName;
        this.price = price;

    }

    void display() {
        System.out.println("Plan: " + planName + ", Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the selected plan name and price
        // Create the default plan
        // Create the selected plan
        // Display both plans
        String plan = sc.nextLine();
        int price = sc.nextInt();
        MobilePlan mp = new MobilePlan();
        mp.display();

        MobilePlan mp1 = new MobilePlan(plan,price );
        mp1.display();

    }
}