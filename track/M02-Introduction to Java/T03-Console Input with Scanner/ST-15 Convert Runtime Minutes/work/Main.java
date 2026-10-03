import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read total minutes
        // Calculate hours and remaining minutes
        // Print both results

        int time = scanner.nextInt();

        int hours = time / 60;
        int min = time % 60;

        System.out.println("Hours: "+ hours);
        System.out.println("Minutes: "+ min);

        scanner.close();
    }
}