import java.util.Scanner;

class Learner {
    static int count = 0;

    Learner() {
        // Increase the shared counter.
        count ++;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Create n Learner objects and print Learner.count.
        for(int i = 1 ; i <= n ;i ++){
        Learner l = new Learner();
        }
        System.out.println(Learner.count);
    }
}