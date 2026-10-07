import java.util.Scanner;

class Calculator {
    int add(int first, int second) {
        int sum = first + second;

        // Return sum
        return  sum ;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create object
        // Call add()
        // Print returned sum
        Calculator c = new Calculator();
        int res = c.add(first,second);
        System.out.println(res);
    }
}