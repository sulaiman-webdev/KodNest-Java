import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str2 = sc.next();

        int num = str.length();
        int num2 = str2.length();
        int count = 0;

        if (num2 == num) {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    if (str.charAt(i) == str2.charAt(j)) {
                        count++;
                        break;
                    }
                }
            }

            if (count == num) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}