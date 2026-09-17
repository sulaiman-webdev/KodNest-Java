public class Main {
    public static void main(String[] args) {

        int completed_topic = 17;
        int total_topic = 20;
        int daily_learning = 3;
        int day_learn = 5;

        int remaining = total_topic - completed_topic;

        int weekly = daily_learning * day_learn;

        double progress = (double) completed_topic * 100 / total_topic;

        System.out.println("Completed Topics: " + completed_topic);
        System.out.println("Remaining Topics: " + remaining);
        System.out.println("Weekly Learning Hours: " + weekly);
        System.out.println("Progress Percentage: " + progress);
    }
}