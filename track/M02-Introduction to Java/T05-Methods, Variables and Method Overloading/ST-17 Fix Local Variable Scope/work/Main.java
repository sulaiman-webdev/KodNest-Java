import java.util.Scanner;

class Result {
    void show(int mark) {
        // Declare message in the correct place
        String mes ;
        if (mark >= 60) {
            // Store "Eligible"
            mes = "Eligible";
        } else {
            // Store "Keep Practising"
            mes = "Keep Practising";
        }

        // Print message
        System.out.println(mes);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mark = scanner.nextInt();

        Result result = new Result();
        result.show(mark);

        scanner.close();
    }
}