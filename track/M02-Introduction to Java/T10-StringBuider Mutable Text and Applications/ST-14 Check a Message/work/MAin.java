import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        // Build the greeting and compare it to "Hello Java".
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" ");
        sb.append(word);
        System.out.println(sb.toString().equals("Hello Java"));
    }
}