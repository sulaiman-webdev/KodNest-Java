import java.util.Scanner;
class Student {
    private int age = 18;

    public void setAge(int value) {
        // Update age only for valid
        if( value >= 5 && value <= 100){
            age = value;
        }
    }

    public int getAge() {
        return age;
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int proposed = sc.nextInt();
        Student student = new Student();
        student.setAge(proposed);
        System.out.println("Age: " + student.getAge());
    }
}