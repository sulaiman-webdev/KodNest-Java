import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int index = sc.nextInt();
        char replacement = sc.next().charAt(0);

        // Create a builder and change only the given character.
        StringBuilder str = new StringBuilder(word);
        String st = replacement +"";
        str.replace(index,index+1,st);
        System.out.println(str);
    }
}