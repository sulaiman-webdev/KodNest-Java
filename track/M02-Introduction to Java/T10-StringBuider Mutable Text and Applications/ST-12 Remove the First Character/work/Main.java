import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();

        // Remove the first character using StringBuilder.
        StringBuilder str = new StringBuilder(code);
        str.deleteCharAt(0);
        System.out.println(str);
    }
}