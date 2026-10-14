import java.util.Scanner;

class Printer {
    void show(int number) {
        // Print the number
        System.out.println("Number: "+ number);
    }

    void show(String word) {
        // Print the word
        System.out.println("Word: "+ word);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read one number and one word
        // Create one Printer object
        // Call both show() methods
        int a = sc.nextInt();
        sc.nextLine();
        String b = sc.next();

        Printer p = new Printer();
        p.show(a);
        p.show(b);

    }
}