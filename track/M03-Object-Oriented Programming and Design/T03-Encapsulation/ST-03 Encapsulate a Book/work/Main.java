import java.util.Scanner;
class Book {
    private String title;
    // Add setTitle() and getTitle().
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        Book book = new Book();
        // Use the setter and getter to print the title.
        book.setTitle(title);
        System.out.println("Book: "+ book.getTitle());
    }
}