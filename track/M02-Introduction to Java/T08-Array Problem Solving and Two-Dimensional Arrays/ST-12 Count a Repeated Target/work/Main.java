import java.util.*;
class Main{
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    for(int i =0; i < n ; i ++){
        arr[i] = sc.nextInt();
    }
    int tar = sc.nextInt();
    int count = 0;

    for(int i = 0; i < n ;i ++){
        if(arr[i] == tar ){
            count ++;
        }
    }
    System.out.println(count);
}}