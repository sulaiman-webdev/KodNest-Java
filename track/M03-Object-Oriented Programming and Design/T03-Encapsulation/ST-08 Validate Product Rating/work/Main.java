import java.util.Scanner;
class Rating {
    private int value = 3;

    public void setRating(int proposed) {
        // Accept only ratings between 1 and 5.
        if(proposed >=1 && proposed <=5){
            value = proposed;
        }
    }

    public int getRating() {
        return value;
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Rating rating = new Rating();
        rating.setRating(number);
        System.out.println("Rating: " + rating.getRating());
    }
}