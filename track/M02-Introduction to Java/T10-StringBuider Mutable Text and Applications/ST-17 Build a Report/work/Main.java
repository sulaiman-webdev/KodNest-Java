import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String course = sc.nextLine();
        String status = sc.nextLine();

        // Build the three-line report using StringBuilder.
        StringBuilder str = new StringBuilder("Student: ");
        StringBuilder str2 = new StringBuilder("Course: ");
        StringBuilder str3 = new StringBuilder("Status: ");

        str.append(name);
        str2.append(course);
        str3.append(status);

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);

    }
}