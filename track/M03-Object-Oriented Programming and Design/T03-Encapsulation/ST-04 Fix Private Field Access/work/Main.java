import java.util.Scanner;
class Student {
    private int marks;

    public void setMarks(int value) {
        marks = value;
    }

    public int getMarks() {
        return marks;
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        Student student = new Student();
        student.setMarks(value);

        // Fix the invalid private-field access below.
        System.out.println("Marks: " + student.getMarks());
    }
}