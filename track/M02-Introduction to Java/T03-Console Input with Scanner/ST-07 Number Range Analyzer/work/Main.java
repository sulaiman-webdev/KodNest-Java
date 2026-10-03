import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the range and analyze its numbers
        int num = scanner.nextInt();
        int num2 = scanner.nextInt();

        int even= 0 ;
        int odd = 0 ;
        for (int i = num ; i <= num2 ; i ++ ){

            if (i % 2 == 0){
                even += i;
            }
            else{
                odd += i ;
            }
        }

        System.out.println("Even sum: "+ even);
        System.out.println("Odd count: "+ odd);

        scanner.close();
    }
}