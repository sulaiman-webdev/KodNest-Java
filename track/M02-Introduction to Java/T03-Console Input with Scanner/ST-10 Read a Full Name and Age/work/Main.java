import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int age = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        // Consume the pending newline
        // Read the complete name
        // Print the name and age
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);

        sc.close();
    }
}