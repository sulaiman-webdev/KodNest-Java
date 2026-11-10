import java.util.Scanner;

class Launch {
    static int count = 0;

    static {
        System.out.println("Initialized");
    }

    Launch() {
        count++;
        System.out.println("Object created");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Main begins");
        new Launch();

        for (int i = 1; i < n; i++) {
        new Launch();
        }

        System.out.println("Total: " + Launch.count);
    }
}