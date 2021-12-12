package lesson03;

import java.util.Scanner;

public class LiveOrDead {
    public static int enterLiveOrDeadNumber(){
        Scanner scanner = new Scanner(System.in);
        int liveOrDead;
        while (true) {
            System.out.println("Enter number 0 or 1: ");
            String input = scanner.next();
            try {
                liveOrDead = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not number enter!");
            }
        }
        return liveOrDead;
    }
}
