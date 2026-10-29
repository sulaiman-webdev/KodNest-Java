import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        // Read the word and build its reverse using a backward loop.
        for(int i = word.length()-1 ; i >= 0; i--){
            System.out.print(word.charAt(i));
        }
    }
}