import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] numbers = new int[size];

        // read array
        // read target
        // search

        for(int i = 0 ; i < size ; i++){
            numbers[i] = sc.nextInt();
        }

        int ser = sc.nextInt();
        for(int i =0 ; i < size ; i ++){
            if (numbers[i]== ser){
                System.out.println("Found");
                return ;
            }
        }
        System.out.println("Not Found ");

        sc.close();
    }
}