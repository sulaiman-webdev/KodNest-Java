public class Main {
    public static void main(String[] args) {
        int number = -8;

        String res = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        System.out.println(res);
    }
}