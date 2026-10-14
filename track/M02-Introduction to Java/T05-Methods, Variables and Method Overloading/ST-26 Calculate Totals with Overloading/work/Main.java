import java.util.Scanner;

class ResultCalculator {
    int getTotal(int first, int second) {
        // Return the total of two marks
        int sum = first + second ;
        return sum;
    }

    int getTotal(int first, int second, int third) {
        // Return the total of three marks
        int sum = first + second +third;
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read three marks
        // Create one ResultCalculator object
        // Call both overloaded methods and print both totals
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();
        ResultCalculator rc = new ResultCalculator();
        int res1 = rc.getTotal(mark1,mark2);
        int res2 = rc.getTotal(mark1,mark2,mark3);
        System.out.println("Two-Mark Total: "+res1);
        System.out.println("Three-Mark Total: "+ res2);
    }
}