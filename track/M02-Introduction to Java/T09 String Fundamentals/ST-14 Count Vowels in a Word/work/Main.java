import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        // Count the vowels in the word.\
        int len = word.length();
        int count = 0 ;
        for(int i =0 ; i < len ; i ++ ){
            char ch = word.charAt(i);
            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                count++;
            }
        }
        System.out.println(count);
    }
}