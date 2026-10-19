import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] num = new int[n];

        for(int i = 0 ; i < n ; i++ ){
            num[i] = sc.nextInt();
        }
        int index = sc.nextInt();
        int value = sc.nextInt();


        int [] snap = new int[n];
        for (int i = 0 ; i < n ; i ++){
            snap[i] = num[i];
        }

        num[index] = value;
        System.out.print("Snapshot: ");
        for(int i = 0 ; i < n ; i ++){
            System.out.print(snap[i] +" ");
        }
        System.out.println();

        System.out.print("Updated: ");
        for(int i = 0 ;i < n ;  i ++){
            System.out.print(num[i] +" ");
        }
        System.out.println();

    }
}