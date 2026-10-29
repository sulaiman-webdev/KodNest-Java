import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0 ;
        int num = sc.nextInt();
        int [] arr = new int[num];
        for (int i = 0 ; i < num; i++){
            arr[i] = sc.nextInt();
        }

        int tar = sc.nextInt();

        for(int i = 0 ;i < num ;i ++){
            if( arr[i] == tar){
                count ++;
            }
        }
        System.out.println("Frequency of "+ tar +": "+ count );


    }
}