import java.util.Scanner;

class Student {
    String name;

    Student(String name) {
        // Store the parameter in the instance variable
        this.name = name ;
    }

    void display() {
        System.out.println("Student Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the full name
        // Create one Student object
        // Call display()
        String n = sc.nextLine();
        Student st = new Student(n);
        st.display();


    }
}