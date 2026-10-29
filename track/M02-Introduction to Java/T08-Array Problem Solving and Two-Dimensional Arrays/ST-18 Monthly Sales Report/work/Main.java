import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int ar[][] = new int[a][b];
    for(int i =0 ; i < a ;i ++){
        for(int j =0 ; j <b ;j ++){
            ar[i][j] = sc.nextInt();
        }
    }

    for (int i =0 ; i < a ; i ++){
        int res = 0 ;
        for(int j =0 ; j <b ; j ++ ){
            res += ar[i][j];
        }
        int pr = i+1;
    System.out.println("Product "+ pr +" total: "+ res);
    }
    }
}