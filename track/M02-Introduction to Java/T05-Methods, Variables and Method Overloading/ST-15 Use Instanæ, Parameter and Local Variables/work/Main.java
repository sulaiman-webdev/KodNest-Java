import java.util.Scanner;

class Student {
    int mark;

    void showFinalMark(int bonus) {
        // Create finalMark
        int finalmark ;
        // Calculate mark + bonus
        finalmark = mark + bonus;
        // Print mark
        System.out.println(mark);
        // Print finalMark
        System.out.println(finalmark);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        student.mark = scanner.nextInt();
        int bonus = scanner.nextInt();

        student.showFinalMark(bonus);

        scanner.close();
    }
}