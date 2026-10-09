import java.util.Scanner;

class Student {
    String name;

    void setName(String name) {
        // Store the parameter in the instance variable
        this.name = name;
    }

    void displayName() {
        // Print the stored name
        System.out.println("Student Name: "+ name);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the name
        // Create one Student object
        // Call setName() and displayName()
        String name = sc.nextLine();
        Student st = new Student();

        st.setName(name);
        st.displayName();

    }
}