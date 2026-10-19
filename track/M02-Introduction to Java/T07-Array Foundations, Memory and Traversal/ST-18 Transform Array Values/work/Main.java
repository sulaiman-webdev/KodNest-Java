import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] values = new int[n];

        for (int index = 0; index < n; index++) {
            values[index] = scanner.nextInt();
        }

        int bonus = scanner.nextInt();

        for(int i = 0 ; i < values.length;  i++){
            values[i] = values[i] + bonus;
        }

        // Add bonus to every element.

        // Print the updated array.
        System.out.print("Updated values: ");
        for(int i = 0 ;i < values.length; i++){
            System.out.print(values[i]+" ");
        }

        scanner.close();
    }
}