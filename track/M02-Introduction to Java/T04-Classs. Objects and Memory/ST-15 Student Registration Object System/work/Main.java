import java.util.Scanner;

class Student {
    // Declare registrationId, name and attendancePercentage
    int regid ;
    String name ;
    double per ;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create and populate firstStudent

        // Create and populate secondStudent

        // Read the selected ID and new attendance

        Student st1 = new Student();
        Student st2 = new Student();

        st1.regid = sc.nextInt();
        st1.name = sc.next();
        st1.per = sc.nextDouble();


        st2.regid = sc.nextInt();
        st2.name = sc.next();
        st2.per = sc.nextDouble();

        int selid = sc.nextInt();
        double  newper = sc.nextDouble();

        Student selst = null;

        if (selid == st1.regid ){
            selst = st1;
        }

        else if (selid == st2.regid) {
            selst = st2;
        }

        if (selst!= null){
            selst.per = newper;
            System.out.println("Selected Student: "+ selst.name);
        }
        else{
            System.out.println("Student not found.");
        }

        System.out.println(st1.regid +" - "+ st1.name +" - "+ st1.per+"%");
        System.out.println(st2.regid +" - "+ st2.name +" - "+ st2.per+"%");

        // Make selectedStudent refer to the matching existing object

        // Update through selectedStudent when a match exists

        // Display both records
    }
}