import java.util.Scanner;

class Student {
    String name;

    void setName(String name) {
        // Store the parameter in the instance variable
        this.name = name ;
    }

    void showName() {
        // Print the stored name
        System.out.println("Student Name: "+ name);
    }

    void showScore(int first) {
        // Print the first score
        System.out.println("First Score: "+ first);
    }

    void showScore(int first, int second) {
        // Print the total of two scores
        int sum = first + second;
        System.out.println("Two-Score Total: "+sum);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the full name and two scores
        // Create one Student object
        // (reconstructed from here)
        String name = sc.nextLine();
        int first = sc.nextInt();
        int second = sc.nextInt();

        Student s = new Student();
        s.setName(name);
        s.showName();
        s.showScore(first);
        s.showScore(first, second);
    }
}