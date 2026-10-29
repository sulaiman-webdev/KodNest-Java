import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();

        // Check whether the two words are anagrams.
        int count = 0;
        for(int i = 0 ; i < first.length(); i ++){
            char f = first.charAt(i);
            for(int j = 0 ; j < second.length() ;j ++){
                char s = second.charAt(j);
                if (f == s ){
                    count ++;
                    break;
                }
            }
        }

        System.out.println(first.length() == count);
    }
}