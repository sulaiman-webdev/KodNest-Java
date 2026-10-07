import java.util.Scanner;

class Rectangle {
    int calculateArea(int length, int breadth) {
        // Return area
        int  area = length * breadth ;

        return area;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int breadth = scanner.nextInt();

        // Create object
        // Call calculateArea()
        // Print area

        Rectangle rec = new Rectangle();
        int res = rec.calculateArea(length, breadth);

        System.out.println("Area: "+ res);

    }
}