import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int days = sc.nextInt();
        int add = 0;
        int count;

        for (int i = 1 ; i <= days ; i++){
            count = sc.nextInt();
            add = add + count;
        }
        double average = add / days;

        String range ;

        if(average >= 5.0){
            range = "Consistent";
        }
        else {
            range = "Needs consistency";
        }

        System.out.println("Learner: "+ name);
        System.out.println("Total solved: "+ add);
        System.out.println("Daily average: "+ average );
        System.out.println("Status: "+ range );

        sc.close();
    }
}