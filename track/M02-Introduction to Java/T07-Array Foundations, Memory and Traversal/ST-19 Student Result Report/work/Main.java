import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];

        for (int index = 0; index < marks.length; index++) {
            marks[index] = scanner.nextInt();
        }
        int sum = 0;
        // Calculate total.
        for(int i = 0 ; i< marks.length ; i++){
            sum = sum + marks[i];
        }

        // Calculate average.
        double avg = sum / marks.length;

        // Print total and average.
        System.out.println("Total: "+ sum);
        System.out.println("Average: "+ avg);

        scanner.close();
    }
}