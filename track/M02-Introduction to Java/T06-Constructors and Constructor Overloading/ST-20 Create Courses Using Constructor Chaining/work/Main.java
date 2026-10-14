import java.util.*;
class student{
    String course;
    int num;
    student(){
        this("Java",30);
    }
    student(String course, int num){
        this.course = course;
        this.num = num;

    }
    void display(){
        System.out.println(course+" "+num);

    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int num = sc.nextInt();

        student st = new student();
        st.display();
        student st2 = new student(name,num);
        st2.display();
    }
}