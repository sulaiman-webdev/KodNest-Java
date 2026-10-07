import java.util.Scanner;

class MethodPractice {
    void showTitle() {
        System.out.println("Method Practice");
    }

    void showName(String name) {
        System.out.println("Name: "+ name);
    }

    int getPassingMark() {
        int mark = 40 ;
        return mark;
    }

    int calculateTotal(int first, int second) {
        int add = first + second;

        return add;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create object and call all methods
        MethodPractice mp = new MethodPractice();

        mp.showTitle();
        mp.showName(name );
        int mark = mp.getPassingMark();
        System.out.println("Passing Mark: "+ mark);
        int res = mp.calculateTotal(first,second);
        System.out.println("Total: "+ res);
    }
}