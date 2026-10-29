import java.util.*;

class student{
    String name;
}
class Main{
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);

        student s[]= new student[2];
        s[0] = new student();
        s[1] = new student();
        s[0].name = sc.nextLine();
        s[1].name = sc.nextLine();

        System.out.println(s[0].name);
        System.out.println(s[1].name);
    }
}