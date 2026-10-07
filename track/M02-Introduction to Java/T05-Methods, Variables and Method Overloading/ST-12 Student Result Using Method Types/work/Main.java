import java.util.Scanner;

class StudentResult {
    void showTitle() {
        System.out.println("Student Result");
    }

    void displayName(String name) {
        System.out.println("Name: "+ name);
    }

    int getPassingMark() {
        int mark = 40 ;
        return mark;
    }

    int calculateAverage(int first, int second) {
        int res = (first + second) / 2;
        return res;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create object
        // Call methods
        // Print returned values

        StudentResult st = new StudentResult();
        st.showTitle();
        st.displayName(name);

        System.out.println("Passing Mark: "+ st.getPassingMark());
        System.out.println("Average: "+ st.calculateAverage(first,second));
    }
}