package lesson02;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        System.out.print("Enter width: ");
        int width = enterNumber();
        System.out.print("Enter height: ");
        int height = enterNumber();
        for (int i = 0; i<height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print('O');
            }
            System.out.print('\n');
        }
    }

    private static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        int enteredNumber;
        while (true) {
            String input = scanner.next();
            try {
                enteredNumber = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
            }
        }
        return enteredNumber;
    }
}
