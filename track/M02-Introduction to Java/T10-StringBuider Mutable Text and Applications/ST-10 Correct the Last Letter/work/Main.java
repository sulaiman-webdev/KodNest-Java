import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        char replacement = sc.nextLine().charAt(0);

        // Change the last character using StringBuilder.
        StringBuilder str = new StringBuilder(word);
        int len = str.length();
        str.setCharAt(len -1 , replacement);
        System.out.println(str);
    }
}