import java.util.*;
class Main{
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][][] = new int[l][r][c];

        for(int i = 0 ; i < l ; i ++){
            int res = 0 ;
            for (int j = 0 ; j < r ; j ++){
                for (int k =0 ; k < c ; k++){
                    a[i][j][k] = sc.nextInt();
                    res += a[i][j][k] ;
                }

            }
            System.out.println(res);
        }

    }
}