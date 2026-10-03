import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of days
        // Calculate the total and display the progress status
        int practice = scanner.nextInt();
        int total = 0;
        for(int i = 1 ; i <= practice ; i++){
            total += scanner.nextInt();
        }
        String status;
        if (total>= 20 ){
            status = "Strong progress";
        }
        else if (total >=10 && total <= 19){
            status = "Keep improving ";
        }
        else{
            status = "Needs more practice";
        }

        System.out.println("Total solved: "+ total);
        System.out.println("Status: "+ status);

        scanner.close();
    }
}