import java.util.Scanner;

class Student {
    int id;
    String name;
    int score;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create and populate the first Student object

        // Create and populate the second Student object

        // Display both records

        // Compare both scores and print one result

        Student st = new Student();
        Student st2 = new Student();

        st.id = sc.nextInt();
        st.name = sc.next();
        st.score = sc.nextInt();


        st2.id = sc.nextInt();
        st2.name = sc.next();
        st2.score = sc.nextInt();

        System.out.println(st.id+" - "+ st.name+" - "+ st.score);
        System.out.println(st2.id+" - "+st2.name+" - "+st2.score);
        String res ;
        if(st.score > st2.score){
            res = st.name;
            System.out.println(res +" has the higher Java score.");
        }

        else if (st.score < st2.score) {
            res = st2.name;
            System.out.println(res +" has the higher Java score.");
        }
        else {
            System.out.println("Both students have the same Java score.");
        }

    }
}