import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String replacement = sc.nextLine();

        // Use StringBuilder to replace the first character.
        StringBuilder str = new StringBuilder(word);
        str.replace(0,1,replacement);
        System.out.println(str);
    }
}