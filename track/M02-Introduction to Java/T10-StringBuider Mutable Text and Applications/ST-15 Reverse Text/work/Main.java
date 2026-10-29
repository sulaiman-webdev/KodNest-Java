import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        // Reverse the text using StringBuilder and print the String result.
        StringBuilder str = new StringBuilder(text);
        str.reverse();
        System.out.println(str);
    }
}