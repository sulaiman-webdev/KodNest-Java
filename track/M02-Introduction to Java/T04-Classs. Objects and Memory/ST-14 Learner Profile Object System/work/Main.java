import java.util.Scanner;

class Learner {
    // Declare id, name and javaScore
    int id;
    String name ;
    int mark;

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create and populate the first Learner object

        // Create and populate the second Learner object

        // Read the new score

        // Display both records before the update

        // Update only the first object

        // Display both records after the update

        Learner st1 = new Learner();
        Learner st2 = new Learner();

        st1.id = sc.nextInt();
        st1.name = sc.next();
        st1.mark = sc.nextInt();

        st2.id = sc.nextInt();
        st2.name = sc.next();
        st2.mark = sc.nextInt();

        int i = sc.nextInt();

        System.out.println("Before Update");
        System.out.println(st1.id +" - "+ st1.name +" - "+ st1.mark);
        System.out.println(st2.id +" - "+ st2.name +" - "+ st2.mark);

        st1.mark = i ;
        System.out.println("After Update");
        System.out.println(st1.id +" - "+ st1.name +" - "+ st1.mark);
        System.out.println(st2.id +" - "+ st2.name +" - "+ st2.mark);
    }

}