import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String f = sc.nextLine();
        String s = sc.nextLine();

        // Check their lengths, count letters and compare.
        int l1 = f.length();
        int l2 = s.length();
        int count = 0 ;
        for(int i =0 ; i < l1 ; i ++){
            char w = f.charAt(i);
            for (int j = 0 ; j < l2 ; j ++){
                char  w2 = s.charAt(j);
                if(w == w2){
                    count ++;
                }
            }
        }
        if (count == l1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}