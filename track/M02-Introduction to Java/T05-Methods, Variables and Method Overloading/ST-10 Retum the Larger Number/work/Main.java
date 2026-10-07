import java.util.Scanner;

class NumberUtility {
    int getLarger(int first, int second) {
        // Return larger number
        int big;

        if (first < second){
            big = second ;
        }
        else{
            big = first;
        }
        return big;

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create object
        // Call method
        // Print result

        NumberUtility n = new NumberUtility();

        int res = n.getLarger(first,second);

        System.out.println(res);


    }
}