class Main {
    public static void main(String[] args) {
        String first = "Java";
        String second = "Java";

        System.out.println(first == second);

        String third = new String("Java");

        System.out.println(first == third);
        System.out.println(first.equals(third));

        String message = "Hi";
        String original = message;

        message = message + " Java";

        System.out.println(message);
        System.out.println(original);
    }
}