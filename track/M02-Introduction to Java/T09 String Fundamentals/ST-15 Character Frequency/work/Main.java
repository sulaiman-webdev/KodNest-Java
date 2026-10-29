import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        // Count each letter and print its frequency.

        int []fre = new int[26];
        for(int i = 0; i < word.length() ; i ++){
            char c = word.charAt(i);
            fre [c - 'a']++;
        }
        for(int i =0 ; i < fre.length ;i ++){
            if(fre[i] >= 1){
                System.out.println((char) ('a' + i)+ " "+fre[i]);
            }
        }
    }
}