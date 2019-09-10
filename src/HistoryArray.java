import java.util.Scanner;

public class HistoryArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];
        String reply;

        System.out.println("Please enter names:");
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }
        System.out.println("Type 'history' to see the list");
        reply = sc.nextLine();
        if (reply.equalsIgnoreCase("History")) {
            for (int i = names.length - 1; i >= 0; i--)
                System.out.println(names[i] + "\t");
        }
    }
}
