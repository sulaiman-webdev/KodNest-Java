import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String item = sc.nextLine();
        String price = sc.nextLine();

        // Create the label using StringBuilder.
        System.out.println("Item: "+ item +" | Price: "+ price);
    }
}