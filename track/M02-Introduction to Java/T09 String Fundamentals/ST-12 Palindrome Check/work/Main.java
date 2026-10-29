import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int n = word.length();
        StringBuilder word1 = new StringBuilder();
        // Reverse the word and print whether the contents match.
        n= n -1 ;
        for(int i = n ; i >= 0 ;i --){
            word1.append(word.charAt(i));
        }
        String word2 = word1.toString();

        if(word.equals(word2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}