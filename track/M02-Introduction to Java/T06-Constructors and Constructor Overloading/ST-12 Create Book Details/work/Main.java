import java.util.Scanner;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        // Store the title and author
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the book title and author
        // Create one Book object
        // Call display()
        String ti = scanner.nextLine();
        String na = scanner.nextLine();
        Book b = new Book(ti,na);
        b.display();

    }
}