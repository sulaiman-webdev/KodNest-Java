import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int index = sc.nextInt();

        // Remove the character at the index and print the text.
        StringBuilder str = new StringBuilder(word);
        str.deleteCharAt(index);
        System.out.println(str);
    }
}