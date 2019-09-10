import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score, sum = 0;
        double avg = 0;
        int numScore = 0;
        String reply;

        for (int i = 0; i <= numScore; i++) {
            System.out.println("Enter a score");
            score = sc.nextInt();
            sum = sum + score;
            sc.nextLine();

            System.out.println("Enter 'quit' to exit or press any other key to continue?");
            reply = sc.nextLine();
            if (reply.equalsIgnoreCase("Quit"))
                break;
        }
        avg = sum / numScore;
        System.out.println("The average score is " + avg);
        System.out.println("Goodbye!");
    }
}


