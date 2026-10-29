import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();

        // Combine the names using StringBuilder.
        StringBuilder str = new StringBuilder ("Participants: "+first+", "+second);
        System.out.println(str);

    }
}