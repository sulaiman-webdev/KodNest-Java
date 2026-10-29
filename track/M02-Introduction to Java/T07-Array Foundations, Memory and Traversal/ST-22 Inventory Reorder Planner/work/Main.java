import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] stock = new int[n];

        for (int index = 0; index < n; index++) {
            stock[index] = scanner.nextInt();
        }

        int reorderLevel = scanner.nextInt();
        int count = 0;
        // Count values that are less than or equal to reorderLevel.
        for (int i : stock){
            if ( i <= reorderLevel){
                count = count + 1;
            }
        }

        // Print the result.
        System.out.println("Items to reorder: "+ count );

        scanner.close();
    }
}