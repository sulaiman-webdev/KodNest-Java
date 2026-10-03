import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the student name and two marks
        // Calculate and print the total
        String name = scanner.next();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int total = a + b;
        System.out.println("Student: "+ name);
        System.out.println("Total: "+ total);


        scanner.close();
    }
}