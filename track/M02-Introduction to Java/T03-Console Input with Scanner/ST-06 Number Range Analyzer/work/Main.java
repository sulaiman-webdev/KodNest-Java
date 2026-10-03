import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read income and expenses
        // Calculate and display the budget details
        double income = scanner.nextDouble();
        double rent = scanner.nextDouble();
        double food = scanner.nextDouble();
        double travel = scanner.nextDouble();

        double total = rent + food + travel ;

        double remaining = income - total ;

        String status;

        if (remaining >= 0){
            status = "Within budget";
        }
        else{
            status ="Over budget";
        }

        System.out.println("Total expense: "+ total);
        System.out.println("Remaining: "+ remaining);
        System.out.println("Status: "+ status);

        scanner.close();
    }
}