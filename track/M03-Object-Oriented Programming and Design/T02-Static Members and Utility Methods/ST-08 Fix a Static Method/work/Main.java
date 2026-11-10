import java.util.Scanner;

class NumberUtils {
    static int doubleNumber(int n) {
        return n * 2;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Fix the incorrect method call below.
        System.out.println(NumberUtils.doubleNumber(number));
    }
}