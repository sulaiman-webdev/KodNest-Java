import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read and join three codes using one StringBuilder.
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        StringBuilder str = new StringBuilder(s+", "+s1+", "+s2);
        System.out.println(str);

    }
}