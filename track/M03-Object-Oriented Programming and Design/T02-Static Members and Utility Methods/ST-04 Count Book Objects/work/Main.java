import java.util.Scanner;

class Book {
    static int count = 0;

    Book() {
        // Update the shared count.
        count ++;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        // Create n Book objects and print Book.count.
        for(int i = 0 ; i < n ; i ++){
            new Book();
        }
        System.out.println(Book.count);
    }
}