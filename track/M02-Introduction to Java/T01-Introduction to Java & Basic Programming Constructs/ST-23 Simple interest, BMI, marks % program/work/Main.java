public class Main {
    public static void main(String[] args) {

        double principal = 10000.0;
        double rate = 6.5;
        double time = 2.0;

        double weight = 72.0;
        double height = 1.8;

        int m1 = 78;
        int m2 = 84;
        int m3 = 69;
        int m4 = 81;
        int m5 = 88;

        int totalmark = m1 + m2 + m3 + m4 + m5;

        double simpleinterest = principal * rate * time / 100.0;

        double totalamount = principal + simpleinterest;

        double bmi = weight / (height * height);

        double percentage = (double) totalmark * 100.0 / 500;

        System.out.println("Simple Interest: " + simpleinterest);
        System.out.println("Total Amount: " + totalamount);
        System.out.println("BMI: " + bmi);
        System.out.println("Total Marks: " + totalmark);
        System.out.println("Percentage: " + percentage);
    }
}