import java.util.Scanner;

class NumberUtility {
    int getValue(int number) {
        // Return number
        int num= number;
        return num;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        // Create object
        // Pass number to the method
        // Print returned value

        NumberUtility ob = new NumberUtility();

       int  res = ob.getValue(number);

        System.out.println(res);
    }
}