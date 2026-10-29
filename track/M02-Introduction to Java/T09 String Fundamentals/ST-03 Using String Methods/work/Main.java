import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String label = sc.nextLine();

        // Clean the label, check the keyword and print the prefix.
        String res = label.trim();
        res = res.toLowerCase();
        System.out.println(res);
        if(res.contains("backend")){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        String sub = res.substring(0,4);
        System.out.println(sub);
    }
}