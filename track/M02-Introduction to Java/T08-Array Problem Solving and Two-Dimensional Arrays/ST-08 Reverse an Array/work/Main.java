import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] arr = new int[num];
        for(int i = 0 ;i < num ; i++){
            arr[i] = sc.nextInt();
        }
        int l =0;
        int r = num -1;

        while(l<r){
            int temp = 0 ;
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp ;
            l++;
            r--;
        }
        for(int i = 0 ;i < num ; i ++)
        {
            System.out.print(arr[i] +" ");
        }
    }
}