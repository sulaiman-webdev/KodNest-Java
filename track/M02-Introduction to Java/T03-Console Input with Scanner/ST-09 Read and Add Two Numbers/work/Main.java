import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Read the first integer
        // Read the second integer
        // Calculate and print the sum
        int a = sc.nextInt();
        int b = sc.nextInt();

        int add = a + b;
        System.out.println("Sum: "+ add);

        sc.close();
    }
}