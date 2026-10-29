import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        // Read n names and join them using StringBuilder.
        StringBuilder str = new StringBuilder();
        for(int i =0 ; i < n ;i ++){
            String a = sc.nextLine();
            str.append(a);
            if(i !=n-1){
                str.append(", ");
            }
        }
        System.out.println(str);
    }
}