import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        // Use StringBuilder.reverse() to print the reversed name.
        StringBuilder str = new StringBuilder(name);
        str.reverse();
        System.out.println(str);

    }
}