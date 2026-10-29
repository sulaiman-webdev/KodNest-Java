import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char tar = sc.nextLine().charAt(0);
        int count = 0;

        // Count the target character.
        int len = word.length();
        for(int i =0 ; i < len ; i++){
            char w = word.charAt(i);
            if (tar ==  w ){
                count ++;
            }
        }
        System.out.println(count);
        }
}