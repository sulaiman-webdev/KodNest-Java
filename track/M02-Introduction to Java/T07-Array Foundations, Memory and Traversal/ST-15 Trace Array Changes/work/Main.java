import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] num = new int[n];
        for (int i = 0 ; i < n ;i++){
            num[i] = sc.nextInt();
        }

        int index = sc.nextInt();
        int value = sc.nextInt();
        int req = sc.nextInt();

        int[] snapshot = new int[num.length];
        // Copy every element into snapshot.
        for(int i = 0 ;i < n ; i++){
            snapshot[i] = num[i];
        }

        int[] live = num;
        // Update through liveView.
        if (index >= 0 && index < num.length){
            live[index]= value;
        }


        System.out.print("Original: ");
        for(int i = 0 ;i< num.length ; i++){
            System.out.print(num[i] +" ");
        }
        System.out.println();

        System.out.print("Snapshot: ");
        for(int i = 0 ; i < snapshot.length ; i++){
            System.out.print(snapshot[i] +" ");
        }
        System.out.println();

        System.out.println("Same object: "+ (num == live));

        if (req >= 0 && req < num.length){
            System.out.println("Requested value: "+ num[req]);
        }
        else{
            System.out.println("Requested value: Invalid index");
        }

    }
}