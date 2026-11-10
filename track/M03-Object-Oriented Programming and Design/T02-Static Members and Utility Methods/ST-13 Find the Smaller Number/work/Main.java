import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Print the smaller number using Math.min().
        int res = Math.min(a,b);
        System.out.println(res);
    }
}