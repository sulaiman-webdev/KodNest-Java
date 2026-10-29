import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int arr[][] = new int[a][b];
    for (int  i = 0 ; i < a ; i ++){
        for(int j = 0 ; j < b; j ++){
            arr[i][j] = sc.nextInt();
        }
    }

    for(int i = 0 ; i < a ; i ++){
        int res =0 ;
        for(int j = 0 ; j < b ; j++){
            res += arr[i][j];
        }
        int row = i+1;
        System.out.println("Row "+row+" total: "+ res);
    }

    }
}