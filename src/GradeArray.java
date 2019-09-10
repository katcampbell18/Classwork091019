import java.util.Scanner;

public class GradeArray {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        String reply;
        int numStu = 3;
        int sum = 0;
        double avg = 0;
        int[] grades = new int[numStu];

        for (int i =0; i < grades.length; i++){
            System.out.println("Enter a grade");
            grades[i] = sc.nextInt();
            sum = sum + grades[i];
            // or use a combo of the lines
            // sum +=sc.nextInt();

            System.out.println("Enter 'q' to exit or press any other key to continue?");
            reply = sc.nextLine();
            if (reply.equalsIgnoreCase("Q"))
                break;
        }
        avg = sum/numStu;
        System.out.println("The average score is " + avg);
        System.out.println("Goodbye!");
        }
    }


