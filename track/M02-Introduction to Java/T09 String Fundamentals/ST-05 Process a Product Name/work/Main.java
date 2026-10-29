import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        // Clean the product name and print its first three characters.
        StringBuilder str = new StringBuilder(name.toLowerCase());
        int len = str.length();
        System.out.println(str);

        str.delete(3,len);
        System.out.println(str);
    }
}