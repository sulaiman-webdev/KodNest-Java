import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[3];

        // read and store values
        // print values
        for (int i = 0 ; i < 3; i++){
            numbers[i] = sc.nextInt();
        }

        for(int i = 0; i < 3 ;i ++){
            System.out.print(numbers[i]+" ");
        }
        sc.close();
    }
}