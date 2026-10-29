import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int arrres = 0;
    for(int i = 0; i < n ;i ++){
        a[i] = sc.nextInt();
        arrres += a[i];
    }
    int r = sc.nextInt();
    int c = sc.nextInt();
    int arr_res = 0;
    int arr[][] = new int [r][c];
    for(int i = 0; i < r ; i ++){
        for(int j =0 ; j< c ; j++){
            arr[i][j] = sc.nextInt();
            arr_res += arr[i][j];
        }
    }
    System.out.println("Array total: "+ arrres);
    System.out.println("Matrix total: "+ arr_res);


    }
}