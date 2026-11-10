import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = sc.nextInt();

        // Use Math.max() to print the largest of three integers.
        int res = Math.max(a,b);
        res = Math.max(res,d);
        System.out.println(res);
    }
}