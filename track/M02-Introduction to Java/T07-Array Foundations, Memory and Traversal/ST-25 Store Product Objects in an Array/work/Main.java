import java.util.*;
class product{
    String name ;
    void put(String name){
        this.name = name;

    }
    void print(){
        System.out.println(name);
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String p1 = sc.nextLine();
        String p2 = sc.nextLine();

        product p[] = new product[3];
        p[0] = new product();
        p[1] = new product();

        p[0].put(p1);
        p[1].put(p2);

        p[0].print();
        p[1].print();

    }
}