import java.util.Scanner;

class Student {
    int id;
    String name;
    String course;
    double score;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read and store all values in the object

        // Display the values stored in the object
        Student st = new Student();

        st.id = sc.nextInt();
        sc.nextLine();
        st.name = sc.nextLine();
        st.course = sc.nextLine();
        st.score = sc.nextDouble();

        System.out.println("Student Profile");
        System.out.println("ID: " + st.id);
        System.out.println("Name: " + st.name);
        System.out.println("Course: " + st.course);
        System.out.println("Java Score: " + st.score);
        sc.close();
    }
}