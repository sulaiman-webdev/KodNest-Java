import java.util.Scanner;
class Rewards {
    private int points;

    Rewards(int initial) {
        points = initial;
    }

    public void addPoints(int bonus) {
        // Reject zero or negative additions.
        if(bonus > 0){
            points += bonus;
        }
    }

    public int getPoints() {
        return points;
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int bonus = sc.nextInt();

        Rewards rewards = new Rewards(start);
        rewards.addPoints(bonus);
        System.out.println("Points: " + rewards.getPoints());
    }
}