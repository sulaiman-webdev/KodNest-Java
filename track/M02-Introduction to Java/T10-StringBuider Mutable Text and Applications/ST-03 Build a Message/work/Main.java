import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String course = sc.nextLine();

        // Use StringBuilder to build and print the welcome message.
        StringBuilder str = new StringBuilder("Welcome, ");
        str.append(name);
        str.append("!");
        str.append(" You joined ");
        str.append(course + ".");
        System.out.println(str);
    }
}