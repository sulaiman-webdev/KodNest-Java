import java.util.Scanner;

class NumberUtility {
    int getNextNumber(int number) {
        // Return next number
        int res = number;
        return res + 1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        // Create object
        // Call method
        // Print result

        NumberUtility n = new NumberUtility();
        int num = n.getNextNumber(number);
        System.out.println(num);


    }
}