import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();

        // Build two StringBuilder objects and compare their text.
        StringBuilder str = new StringBuilder(first);
        StringBuilder str2 = new StringBuilder(second);
        System.out.println(str.toString().equals(str2.toString()));
    }
}