import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();

        // Find the space and print the first name.
        String [] res = fullName.split(" ");
        System.out.println(res[0]);
    }
}