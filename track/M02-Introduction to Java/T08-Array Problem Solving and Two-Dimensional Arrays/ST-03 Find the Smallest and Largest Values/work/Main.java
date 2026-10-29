import java.util.*;
class Main{
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int min = 0 ;
        int max = 0 ;
        for(int i = 0 ; i < n ; i++ ){
            arr[i] = sc.nextInt();
            if(i == 0){
                max = arr[i];
                min = arr[i];
            }
            if (arr[i] < max){
                min = arr[i];
            }
            else if (arr[i]> max){
                max = arr[i];
            }

        }
        System.out.println(min +" "+ max);
    }
}