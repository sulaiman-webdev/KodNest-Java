import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();

        // Print the first three characters.
        StringBuilder str = new StringBuilder(code);
        int len = str.length();
        str.delete(3,len);
        System.out.println(str);
    }
}